package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortMapping extends StObject {
  
  /**
    * The port used for the port mapping.
    */
  var port: PortNumber
  
  /**
    * The protocol used for the port mapping. Specify one protocol.
    */
  var protocol: PortProtocol
}
object PortMapping {
  
  inline def apply(port: PortNumber, protocol: PortProtocol): PortMapping = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortMapping]
  }
  
  extension [Self <: PortMapping](x: Self) {
    
    inline def setPort(value: PortNumber): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: PortProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
