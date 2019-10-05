package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Concurrency extends js.Object {
  /**
    * The number of concurrent executions that are reserved for this function. For more information, see Managing Concurrency.
    */
  var ReservedConcurrentExecutions: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.ReservedConcurrentExecutions] = js.undefined
}

object Concurrency {
  @scala.inline
  def apply(ReservedConcurrentExecutions: Int | Double = null): Concurrency = {
    val __obj = js.Dynamic.literal()
    if (ReservedConcurrentExecutions != null) __obj.updateDynamic("ReservedConcurrentExecutions")(ReservedConcurrentExecutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Concurrency]
  }
}

