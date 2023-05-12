package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddBridgeNetworkOutputRequest extends StObject {
  
  /**
    * The network output IP Address.
    */
  var IpAddress: string
  
  /**
    * The network output name. This name is used to reference the output and must be unique among outputs in this bridge.
    */
  var Name: string
  
  /**
    * The network output's gateway network name.
    */
  var NetworkName: string
  
  /**
    * The network output port.
    */
  var Port: integer
  
  /**
    * The network output protocol.
    */
  var Protocol: typings.awsSdk.clientsMediaconnectMod.Protocol
  
  /**
    * The network output TTL.
    */
  var Ttl: integer
}
object AddBridgeNetworkOutputRequest {
  
  inline def apply(
    IpAddress: string,
    Name: string,
    NetworkName: string,
    Port: integer,
    Protocol: Protocol,
    Ttl: integer
  ): AddBridgeNetworkOutputRequest = {
    val __obj = js.Dynamic.literal(IpAddress = IpAddress.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NetworkName = NetworkName.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], Ttl = Ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddBridgeNetworkOutputRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddBridgeNetworkOutputRequest] (val x: Self) extends AnyVal {
    
    inline def setIpAddress(value: string): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNetworkName(value: string): Self = StObject.set(x, "NetworkName", value.asInstanceOf[js.Any])
    
    inline def setPort(value: integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: integer): Self = StObject.set(x, "Ttl", value.asInstanceOf[js.Any])
  }
}
