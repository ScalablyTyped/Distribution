package typings.apolloEngineReporting.reportingOperationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportServerInfo extends js.Object {
  var me: ReportServerInfoMe | Null = js.native
}

object ReportServerInfo {
  @scala.inline
  def apply(): ReportServerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportServerInfo]
  }
  @scala.inline
  implicit class ReportServerInfoOps[Self <: ReportServerInfo] (val x: Self) extends AnyVal {
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
    def setMe(value: ReportServerInfoMe): Self = this.set("me", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeNull: Self = this.set("me", null)
  }
  
}

