package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayLogging extends js.Object {
  
  /**
    * The access log configuration.
    */
  var accessLog: js.UndefOr[VirtualGatewayAccessLog] = js.native
}
object VirtualGatewayLogging {
  
  @scala.inline
  def apply(): VirtualGatewayLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayLogging]
  }
  
  @scala.inline
  implicit class VirtualGatewayLoggingOps[Self <: VirtualGatewayLogging] (val x: Self) extends AnyVal {
    
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
    def setAccessLog(value: VirtualGatewayAccessLog): Self = this.set("accessLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessLog: Self = this.set("accessLog", js.undefined)
  }
}
