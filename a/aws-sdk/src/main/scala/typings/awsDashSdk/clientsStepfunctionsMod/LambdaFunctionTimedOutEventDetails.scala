package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaFunctionTimedOutEventDetails extends js.Object {
  /**
    * A more detailed explanation of the cause of the timeout.
    */
  var cause: js.UndefOr[SensitiveCause] = js.native
  /**
    * The error code of the failure.
    */
  var error: js.UndefOr[SensitiveError] = js.native
}

object LambdaFunctionTimedOutEventDetails {
  @scala.inline
  def apply(cause: SensitiveCause = null, error: SensitiveError = null): LambdaFunctionTimedOutEventDetails = {
    val __obj = js.Dynamic.literal()
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionTimedOutEventDetails]
  }
}

