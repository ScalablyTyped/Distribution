package typings.apolloEngineReporting.reportingOperationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportServerInfoVariables extends js.Object {
  var executableSchema: js.UndefOr[String | Null] = js.native
  var info: EdgeServerInfo = js.native
}

object ReportServerInfoVariables {
  @scala.inline
  def apply(info: EdgeServerInfo): ReportServerInfoVariables = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportServerInfoVariables]
  }
  @scala.inline
  implicit class ReportServerInfoVariablesOps[Self <: ReportServerInfoVariables] (val x: Self) extends AnyVal {
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
    def setInfo(value: EdgeServerInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutableSchema(value: String): Self = this.set("executableSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutableSchema: Self = this.set("executableSchema", js.undefined)
    @scala.inline
    def setExecutableSchemaNull: Self = this.set("executableSchema", null)
  }
  
}

