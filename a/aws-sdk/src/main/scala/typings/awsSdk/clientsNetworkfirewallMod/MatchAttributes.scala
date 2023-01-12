package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchAttributes extends StObject {
  
  /**
    * The destination ports to inspect for. If not specified, this matches with any destination port. This setting is only used for protocols 6 (TCP) and 17 (UDP).  You can specify individual ports, for example 1994 and you can specify port ranges, for example 1990:1994. 
    */
  var DestinationPorts: js.UndefOr[PortRanges] = js.undefined
  
  /**
    * The destination IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this matches with any destination address. 
    */
  var Destinations: js.UndefOr[Addresses] = js.undefined
  
  /**
    * The protocols to inspect for, specified using each protocol's assigned internet protocol number (IANA). If not specified, this matches with any protocol. 
    */
  var Protocols: js.UndefOr[ProtocolNumbers] = js.undefined
  
  /**
    * The source ports to inspect for. If not specified, this matches with any source port. This setting is only used for protocols 6 (TCP) and 17 (UDP).  You can specify individual ports, for example 1994 and you can specify port ranges, for example 1990:1994. 
    */
  var SourcePorts: js.UndefOr[PortRanges] = js.undefined
  
  /**
    * The source IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this matches with any source address. 
    */
  var Sources: js.UndefOr[Addresses] = js.undefined
  
  /**
    * The TCP flags and masks to inspect for. If not specified, this matches with any settings. This setting is only used for protocol 6 (TCP).
    */
  var TCPFlags: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.TCPFlags] = js.undefined
}
object MatchAttributes {
  
  inline def apply(): MatchAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatchAttributes] (val x: Self) extends AnyVal {
    
    inline def setDestinationPorts(value: PortRanges): Self = StObject.set(x, "DestinationPorts", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortsUndefined: Self = StObject.set(x, "DestinationPorts", js.undefined)
    
    inline def setDestinationPortsVarargs(value: PortRange*): Self = StObject.set(x, "DestinationPorts", js.Array(value*))
    
    inline def setDestinations(value: Addresses): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: Address*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setProtocols(value: ProtocolNumbers): Self = StObject.set(x, "Protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "Protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: ProtocolNumber*): Self = StObject.set(x, "Protocols", js.Array(value*))
    
    inline def setSourcePorts(value: PortRanges): Self = StObject.set(x, "SourcePorts", value.asInstanceOf[js.Any])
    
    inline def setSourcePortsUndefined: Self = StObject.set(x, "SourcePorts", js.undefined)
    
    inline def setSourcePortsVarargs(value: PortRange*): Self = StObject.set(x, "SourcePorts", js.Array(value*))
    
    inline def setSources(value: Addresses): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    inline def setSourcesVarargs(value: Address*): Self = StObject.set(x, "Sources", js.Array(value*))
    
    inline def setTCPFlags(value: TCPFlags): Self = StObject.set(x, "TCPFlags", value.asInstanceOf[js.Any])
    
    inline def setTCPFlagsUndefined: Self = StObject.set(x, "TCPFlags", js.undefined)
    
    inline def setTCPFlagsVarargs(value: TCPFlagField*): Self = StObject.set(x, "TCPFlags", js.Array(value*))
  }
}
