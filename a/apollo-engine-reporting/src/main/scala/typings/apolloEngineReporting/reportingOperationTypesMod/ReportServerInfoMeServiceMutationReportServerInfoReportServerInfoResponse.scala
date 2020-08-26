package typings.apolloEngineReporting.reportingOperationTypesMod

import typings.apolloEngineReporting.apolloEngineReportingStrings.ReportServerInfoResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoResponse extends ReportServerInfoMeServiceMutationReportServerInfo {
  var __typename: ReportServerInfoResponse = js.native
  var inSeconds: Double = js.native
  var withExecutableSchema: Boolean = js.native
}

object ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoResponse {
  @scala.inline
  def apply(__typename: ReportServerInfoResponse, inSeconds: Double, withExecutableSchema: Boolean): ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoResponse = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], inSeconds = inSeconds.asInstanceOf[js.Any], withExecutableSchema = withExecutableSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoResponse]
  }
  @scala.inline
  implicit class ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoResponseOps[Self <: ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoResponse] (val x: Self) extends AnyVal {
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
    def set__typename(value: ReportServerInfoResponse): Self = this.set("__typename", value.asInstanceOf[js.Any])
    @scala.inline
    def setInSeconds(value: Double): Self = this.set("inSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setWithExecutableSchema(value: Boolean): Self = this.set("withExecutableSchema", value.asInstanceOf[js.Any])
  }
  
}

