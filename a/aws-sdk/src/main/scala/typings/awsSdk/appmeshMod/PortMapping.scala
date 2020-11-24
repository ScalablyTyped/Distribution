package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortMapping extends js.Object {
  
  /**
    * The port used for the port mapping.
    */
  var port: PortNumber = js.native
  
  /**
    * The protocol used for the port mapping. Specify one protocol.
    */
  var protocol: PortProtocol = js.native
}
object PortMapping {
  
  @scala.inline
  def apply(port: PortNumber, protocol: PortProtocol): PortMapping = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortMapping]
  }
  
  @scala.inline
  implicit class PortMappingOps[Self <: PortMapping] (val x: Self) extends AnyVal {
    
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
    def setPort(value: PortNumber): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: PortProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
  }
}
