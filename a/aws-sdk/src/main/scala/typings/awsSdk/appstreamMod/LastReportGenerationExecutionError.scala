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
  def apply(): LastReportGenerationExecutionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastReportGenerationExecutionError]
  }
  @scala.inline
  implicit class LastReportGenerationExecutionErrorOps[Self <: LastReportGenerationExecutionError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorCode(value: UsageReportExecutionErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
  }
  
}

