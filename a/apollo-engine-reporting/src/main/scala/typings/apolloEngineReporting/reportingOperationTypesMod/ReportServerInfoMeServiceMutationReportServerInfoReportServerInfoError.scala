package typings.apolloEngineReporting.reportingOperationTypesMod

import typings.apolloEngineReporting.apolloEngineReportingStrings.ReportServerInfoError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoError extends ReportServerInfoMeServiceMutationReportServerInfo {
  var __typename: ReportServerInfoError = js.native
  var code: ReportServerInfoErrorCode = js.native
  var message: String = js.native
}

object ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoError {
  @scala.inline
  def apply(__typename: ReportServerInfoError, code: ReportServerInfoErrorCode, message: String): ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoError = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoError]
  }
  @scala.inline
  implicit class ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoErrorOps[Self <: ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set__typename(value: ReportServerInfoError): Self = this.set("__typename", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: ReportServerInfoErrorCode): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

