package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationConfigurationRequest extends StObject {
  
  /**
    * The IP address where you want MediaConnect to send contents of the media stream.
    */
  var DestinationIp: string
  
  /**
    * The port that you want MediaConnect to use when it distributes the media stream to the output.
    */
  var DestinationPort: integer
  
  /**
    * The VPC interface that you want to use for the media stream associated with the output.
    */
  var Interface: InterfaceRequest
}
object DestinationConfigurationRequest {
  
  inline def apply(DestinationIp: string, DestinationPort: integer, Interface: InterfaceRequest): DestinationConfigurationRequest = {
    val __obj = js.Dynamic.literal(DestinationIp = DestinationIp.asInstanceOf[js.Any], DestinationPort = DestinationPort.asInstanceOf[js.Any], Interface = Interface.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DestinationConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setDestinationIp(value: string): Self = StObject.set(x, "DestinationIp", value.asInstanceOf[js.Any])
    
    inline def setDestinationPort(value: integer): Self = StObject.set(x, "DestinationPort", value.asInstanceOf[js.Any])
    
    inline def setInterface(value: InterfaceRequest): Self = StObject.set(x, "Interface", value.asInstanceOf[js.Any])
  }
}
