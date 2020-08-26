package typings.apolloEngineReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReportHeader extends js.Object {
  /** ReportHeader agentVersion */
  var agentVersion: js.UndefOr[String | Null] = js.native
  /** ReportHeader executableSchemaId */
  var executableSchemaId: js.UndefOr[String | Null] = js.native
  /** ReportHeader hostname */
  var hostname: js.UndefOr[String | Null] = js.native
  /** ReportHeader runtimeVersion */
  var runtimeVersion: js.UndefOr[String | Null] = js.native
  /** ReportHeader schemaTag */
  var schemaTag: js.UndefOr[String | Null] = js.native
  /** ReportHeader serviceVersion */
  var serviceVersion: js.UndefOr[String | Null] = js.native
  /** ReportHeader uname */
  var uname: js.UndefOr[String | Null] = js.native
}

object IReportHeader {
  @scala.inline
  def apply(): IReportHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReportHeader]
  }
  @scala.inline
  implicit class IReportHeaderOps[Self <: IReportHeader] (val x: Self) extends AnyVal {
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
    def setAgentVersion(value: String): Self = this.set("agentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgentVersion: Self = this.set("agentVersion", js.undefined)
    @scala.inline
    def setAgentVersionNull: Self = this.set("agentVersion", null)
    @scala.inline
    def setExecutableSchemaId(value: String): Self = this.set("executableSchemaId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutableSchemaId: Self = this.set("executableSchemaId", js.undefined)
    @scala.inline
    def setExecutableSchemaIdNull: Self = this.set("executableSchemaId", null)
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setHostnameNull: Self = this.set("hostname", null)
    @scala.inline
    def setRuntimeVersion(value: String): Self = this.set("runtimeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeVersion: Self = this.set("runtimeVersion", js.undefined)
    @scala.inline
    def setRuntimeVersionNull: Self = this.set("runtimeVersion", null)
    @scala.inline
    def setSchemaTag(value: String): Self = this.set("schemaTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaTag: Self = this.set("schemaTag", js.undefined)
    @scala.inline
    def setSchemaTagNull: Self = this.set("schemaTag", null)
    @scala.inline
    def setServiceVersion(value: String): Self = this.set("serviceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceVersion: Self = this.set("serviceVersion", js.undefined)
    @scala.inline
    def setServiceVersionNull: Self = this.set("serviceVersion", null)
    @scala.inline
    def setUname(value: String): Self = this.set("uname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUname: Self = this.set("uname", js.undefined)
    @scala.inline
    def setUnameNull: Self = this.set("uname", null)
  }
  
}

