package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualGatewayAccessLog extends js.Object {
  /**
    * The file object to send virtual gateway access logs to.
    */
  var file: js.UndefOr[VirtualGatewayFileAccessLog] = js.native
}

object VirtualGatewayAccessLog {
  @scala.inline
  def apply(): VirtualGatewayAccessLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayAccessLog]
  }
  @scala.inline
  implicit class VirtualGatewayAccessLogOps[Self <: VirtualGatewayAccessLog] (val x: Self) extends AnyVal {
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
    def setFile(value: VirtualGatewayFileAccessLog): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
  }
  
}

