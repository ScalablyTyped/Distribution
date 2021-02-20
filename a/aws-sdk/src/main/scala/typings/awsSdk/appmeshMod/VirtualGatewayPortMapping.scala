package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayPortMapping extends StObject {
  
  /**
    * The port used for the port mapping. Specify one protocol.
    */
  var port: PortNumber = js.native
  
  /**
    * The protocol used for the port mapping.
    */
  var protocol: VirtualGatewayPortProtocol = js.native
}
object VirtualGatewayPortMapping {
  
  @scala.inline
  def apply(port: PortNumber, protocol: VirtualGatewayPortProtocol): VirtualGatewayPortMapping = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayPortMapping]
  }
  
  @scala.inline
  implicit class VirtualGatewayPortMappingMutableBuilder[Self <: VirtualGatewayPortMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPort(value: PortNumber): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: VirtualGatewayPortProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
