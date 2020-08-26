package typings.apolloEngineReporting.reportingOperationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeServerInfo extends js.Object {
  var bootId: String = js.native
  var executableSchemaId: String = js.native
  var graphVariant: String = js.native
  var libraryVersion: js.UndefOr[String | Null] = js.native
  var platform: js.UndefOr[String | Null] = js.native
  var runtimeVersion: js.UndefOr[String | Null] = js.native
  var serverId: js.UndefOr[String | Null] = js.native
  var userVersion: js.UndefOr[String | Null] = js.native
}

object EdgeServerInfo {
  @scala.inline
  def apply(bootId: String, executableSchemaId: String, graphVariant: String): EdgeServerInfo = {
    val __obj = js.Dynamic.literal(bootId = bootId.asInstanceOf[js.Any], executableSchemaId = executableSchemaId.asInstanceOf[js.Any], graphVariant = graphVariant.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeServerInfo]
  }
  @scala.inline
  implicit class EdgeServerInfoOps[Self <: EdgeServerInfo] (val x: Self) extends AnyVal {
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
    def setBootId(value: String): Self = this.set("bootId", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutableSchemaId(value: String): Self = this.set("executableSchemaId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGraphVariant(value: String): Self = this.set("graphVariant", value.asInstanceOf[js.Any])
    @scala.inline
    def setLibraryVersion(value: String): Self = this.set("libraryVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLibraryVersion: Self = this.set("libraryVersion", js.undefined)
    @scala.inline
    def setLibraryVersionNull: Self = this.set("libraryVersion", null)
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setPlatformNull: Self = this.set("platform", null)
    @scala.inline
    def setRuntimeVersion(value: String): Self = this.set("runtimeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeVersion: Self = this.set("runtimeVersion", js.undefined)
    @scala.inline
    def setRuntimeVersionNull: Self = this.set("runtimeVersion", null)
    @scala.inline
    def setServerId(value: String): Self = this.set("serverId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerId: Self = this.set("serverId", js.undefined)
    @scala.inline
    def setServerIdNull: Self = this.set("serverId", null)
    @scala.inline
    def setUserVersion(value: String): Self = this.set("userVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserVersion: Self = this.set("userVersion", js.undefined)
    @scala.inline
    def setUserVersionNull: Self = this.set("userVersion", null)
  }
  
}

