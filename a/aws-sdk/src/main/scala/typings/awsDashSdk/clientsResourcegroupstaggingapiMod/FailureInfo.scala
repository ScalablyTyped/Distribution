package typings.awsDashSdk.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailureInfo extends js.Object {
  /**
    * The code of the common error. Valid values include InternalServiceException, InvalidParameterException, and any valid error code returned by the AWS service that hosts the resource that you want to tag.
    */
  var ErrorCode: js.UndefOr[typings.awsDashSdk.clientsResourcegroupstaggingapiMod.ErrorCode] = js.native
  /**
    * The message of the common error.
    */
  var ErrorMessage: js.UndefOr[typings.awsDashSdk.clientsResourcegroupstaggingapiMod.ErrorMessage] = js.native
  /**
    * The HTTP status code of the common error.
    */
  var StatusCode: js.UndefOr[typings.awsDashSdk.clientsResourcegroupstaggingapiMod.StatusCode] = js.native
}

object FailureInfo {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, ErrorMessage: ErrorMessage = null, StatusCode: Int | Double = null): FailureInfo = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (StatusCode != null) __obj.updateDynamic("StatusCode")(StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailureInfo]
  }
}

