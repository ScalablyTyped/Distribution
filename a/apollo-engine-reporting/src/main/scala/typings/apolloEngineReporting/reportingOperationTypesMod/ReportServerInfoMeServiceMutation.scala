package typings.apolloEngineReporting.reportingOperationTypesMod

import typings.apolloEngineReporting.apolloEngineReportingStrings.ServiceMutation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportServerInfoMeServiceMutation extends ReportServerInfoMe {
  var __typename: ServiceMutation = js.native
  var reportServerInfo: ReportServerInfoMeServiceMutationReportServerInfo | Null = js.native
}

object ReportServerInfoMeServiceMutation {
  @scala.inline
  def apply(__typename: ServiceMutation): ReportServerInfoMeServiceMutation = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportServerInfoMeServiceMutation]
  }
  @scala.inline
  implicit class ReportServerInfoMeServiceMutationOps[Self <: ReportServerInfoMeServiceMutation] (val x: Self) extends AnyVal {
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
    def set__typename(value: ServiceMutation): Self = this.set("__typename", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportServerInfo(value: ReportServerInfoMeServiceMutationReportServerInfo): Self = this.set("reportServerInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportServerInfoNull: Self = this.set("reportServerInfo", null)
  }
  
}

