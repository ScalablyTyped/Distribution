package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsteriskInfo extends js.Object {
  /**
    * Info about how Asterisk was built.
    */
  var build: js.UndefOr[BuildInfo] = js.native
  /**
    * Info about Asterisk configuration.
    */
  var config: js.UndefOr[ConfigInfo] = js.native
  /**
    * Info about Asterisk status.
    */
  var status: js.UndefOr[StatusInfo] = js.native
  /**
    * Info about the system running Asterisk.
    */
  var system: js.UndefOr[SystemInfo] = js.native
}

object AsteriskInfo {
  @scala.inline
  def apply(): AsteriskInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsteriskInfo]
  }
  @scala.inline
  implicit class AsteriskInfoOps[Self <: AsteriskInfo] (val x: Self) extends AnyVal {
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
    def setBuild(value: BuildInfo): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
    @scala.inline
    def setConfig(value: ConfigInfo): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setStatus(value: StatusInfo): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSystem(value: SystemInfo): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
  }
  
}

