package typings.apolloEngineReporting.reportingOperationTypesMod

import typings.apolloEngineReporting.apolloEngineReportingStrings.UserMutation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportServerInfoMeUserMutation extends ReportServerInfoMe {
  var __typename: UserMutation = js.native
}

object ReportServerInfoMeUserMutation {
  @scala.inline
  def apply(__typename: UserMutation): ReportServerInfoMeUserMutation = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportServerInfoMeUserMutation]
  }
  @scala.inline
  implicit class ReportServerInfoMeUserMutationOps[Self <: ReportServerInfoMeUserMutation] (val x: Self) extends AnyVal {
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
    def set__typename(value: UserMutation): Self = this.set("__typename", value.asInstanceOf[js.Any])
  }
  
}

