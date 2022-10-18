package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRoutingDestinationConfiguration extends StObject {
  
  /**
    * The first port, inclusive, in the range of ports for the endpoint group that is associated with a custom routing accelerator.
    */
  var FromPort: PortNumber
  
  /**
    * The protocol for the endpoint group that is associated with a custom routing accelerator. The protocol can be either TCP or UDP.
    */
  var Protocols: CustomRoutingProtocols
  
  /**
    * The last port, inclusive, in the range of ports for the endpoint group that is associated with a custom routing accelerator.
    */
  var ToPort: PortNumber
}
object CustomRoutingDestinationConfiguration {
  
  inline def apply(FromPort: PortNumber, Protocols: CustomRoutingProtocols, ToPort: PortNumber): CustomRoutingDestinationConfiguration = {
    val __obj = js.Dynamic.literal(FromPort = FromPort.asInstanceOf[js.Any], Protocols = Protocols.asInstanceOf[js.Any], ToPort = ToPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomRoutingDestinationConfiguration]
  }
  
  extension [Self <: CustomRoutingDestinationConfiguration](x: Self) {
    
    inline def setFromPort(value: PortNumber): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    inline def setProtocols(value: CustomRoutingProtocols): Self = StObject.set(x, "Protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsVarargs(value: CustomRoutingProtocol*): Self = StObject.set(x, "Protocols", js.Array(value*))
    
    inline def setToPort(value: PortNumber): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
  }
}
