package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayPortMapping extends StObject {
  
  /**
    * The port used for the port mapping. Specify one protocol.
    */
  var port: PortNumber
  
  /**
    * The protocol used for the port mapping.
    */
  var protocol: VirtualGatewayPortProtocol
}
object VirtualGatewayPortMapping {
  
  inline def apply(port: PortNumber, protocol: VirtualGatewayPortProtocol): VirtualGatewayPortMapping = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayPortMapping]
  }
  
  extension [Self <: VirtualGatewayPortMapping](x: Self) {
    
    inline def setPort(value: PortNumber): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: VirtualGatewayPortProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
