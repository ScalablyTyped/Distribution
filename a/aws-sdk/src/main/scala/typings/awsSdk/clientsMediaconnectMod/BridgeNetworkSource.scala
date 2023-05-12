package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BridgeNetworkSource extends StObject {
  
  /**
    * The network source multicast IP.
    */
  var MulticastIp: string
  
  /**
    * The name of the network source.
    */
  var Name: string
  
  /**
    * The network source's gateway network name.
    */
  var NetworkName: string
  
  /**
    * The network source port.
    */
  var Port: integer
  
  /**
    * The network source protocol.
    */
  var Protocol: typings.awsSdk.clientsMediaconnectMod.Protocol
}
object BridgeNetworkSource {
  
  inline def apply(MulticastIp: string, Name: string, NetworkName: string, Port: integer, Protocol: Protocol): BridgeNetworkSource = {
    val __obj = js.Dynamic.literal(MulticastIp = MulticastIp.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NetworkName = NetworkName.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeNetworkSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BridgeNetworkSource] (val x: Self) extends AnyVal {
    
    inline def setMulticastIp(value: string): Self = StObject.set(x, "MulticastIp", value.asInstanceOf[js.Any])
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNetworkName(value: string): Self = StObject.set(x, "NetworkName", value.asInstanceOf[js.Any])
    
    inline def setPort(value: integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
  }
}
