package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastReportGenerationExecutionError extends js.Object {
  /**
    * The error code for the error that is returned when a usage report can't be generated.
    */
  var ErrorCode: js.UndefOr[UsageReportExecutionErrorCode] = js.native
  /**
    * The error message for the error that is returned when a usage report can't be generated.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
}

object LastReportGenerationExecutionError {
  @scala.inline
  def apply(ErrorCode: UsageReportExecutionErrorCode = null, ErrorMessage: String = null): LastReportGenerationExecutionError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastReportGenerationExecutionError]
  }
}

