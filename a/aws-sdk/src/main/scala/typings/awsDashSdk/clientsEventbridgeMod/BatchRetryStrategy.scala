package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchRetryStrategy extends js.Object {
  /**
    * The number of times to attempt to retry, if the job fails. Valid values are 1–10.
    */
  var Attempts: js.UndefOr[Integer] = js.undefined
}

object BatchRetryStrategy {
  @scala.inline
  def apply(Attempts: js.UndefOr[Integer] = js.undefined): BatchRetryStrategy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Attempts)) __obj.updateDynamic("Attempts")(Attempts)
    __obj.asInstanceOf[BatchRetryStrategy]
  }
}

