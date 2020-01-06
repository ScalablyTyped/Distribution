package typings.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorReason extends js.Object {
  /**
    * Service Quotas returns the following error values.   DEPENDENCY_ACCESS_DENIED_ERROR is returned when the caller does not have permission to call the service or service quota. To resolve the error, you need permission to access the service or service quota.  DEPENDENCY_THROTTLING_ERROR is returned when the service being called is throttling Service Quotas.  DEPENDENCY_SERVICE_ERROR is returned when the service being called has availability issues.  SERVICE_QUOTA_NOT_AVAILABLE_ERROR is returned when there was an error in Service Quotas.
    */
  var ErrorCode: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.ErrorCode] = js.native
  /**
    * The error message that provides more detail.
    */
  var ErrorMessage: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.ErrorMessage] = js.native
}

object ErrorReason {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, ErrorMessage: ErrorMessage = null): ErrorReason = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorReason]
  }
}

