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
  def apply(ReservedConcurrentExecutions: js.UndefOr[ReservedConcurrentExecutions] = js.undefined): Concurrency = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ReservedConcurrentExecutions)) __obj.updateDynamic("ReservedConcurrentExecutions")(ReservedConcurrentExecutions)
    __obj.asInstanceOf[Concurrency]
  }
}

