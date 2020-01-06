package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityFailedEventDetails extends js.Object {
  /**
    * A more detailed explanation of the cause of the failure.
    */
  var cause: js.UndefOr[SensitiveCause] = js.native
  /**
    * The error code of the failure.
    */
  var error: js.UndefOr[SensitiveError] = js.native
}

object ActivityFailedEventDetails {
  @scala.inline
  def apply(cause: SensitiveCause = null, error: SensitiveError = null): ActivityFailedEventDetails = {
    val __obj = js.Dynamic.literal()
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityFailedEventDetails]
  }
}

