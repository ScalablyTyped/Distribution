package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisPacketHeader extends StObject {
  
  /**
    * The destination addresses.
    */
  var DestinationAddresses: js.UndefOr[IpAddressList] = js.undefined
  
  /**
    * The destination port ranges.
    */
  var DestinationPortRanges: js.UndefOr[PortRangeList] = js.undefined
  
  /**
    * The protocol.
    */
  var Protocol: js.UndefOr[String] = js.undefined
  
  /**
    * The source addresses.
    */
  var SourceAddresses: js.UndefOr[IpAddressList] = js.undefined
  
  /**
    * The source port ranges.
    */
  var SourcePortRanges: js.UndefOr[PortRangeList] = js.undefined
}
object AnalysisPacketHeader {
  
  inline def apply(): AnalysisPacketHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisPacketHeader]
  }
  
  extension [Self <: AnalysisPacketHeader](x: Self) {
    
    inline def setDestinationAddresses(value: IpAddressList): Self = StObject.set(x, "DestinationAddresses", value.asInstanceOf[js.Any])
    
    inline def setDestinationAddressesUndefined: Self = StObject.set(x, "DestinationAddresses", js.undefined)
    
    inline def setDestinationAddressesVarargs(value: IpAddress*): Self = StObject.set(x, "DestinationAddresses", js.Array(value*))
    
    inline def setDestinationPortRanges(value: PortRangeList): Self = StObject.set(x, "DestinationPortRanges", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortRangesUndefined: Self = StObject.set(x, "DestinationPortRanges", js.undefined)
    
    inline def setDestinationPortRangesVarargs(value: PortRange*): Self = StObject.set(x, "DestinationPortRanges", js.Array(value*))
    
    inline def setProtocol(value: String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setSourceAddresses(value: IpAddressList): Self = StObject.set(x, "SourceAddresses", value.asInstanceOf[js.Any])
    
    inline def setSourceAddressesUndefined: Self = StObject.set(x, "SourceAddresses", js.undefined)
    
    inline def setSourceAddressesVarargs(value: IpAddress*): Self = StObject.set(x, "SourceAddresses", js.Array(value*))
    
    inline def setSourcePortRanges(value: PortRangeList): Self = StObject.set(x, "SourcePortRanges", value.asInstanceOf[js.Any])
    
    inline def setSourcePortRangesUndefined: Self = StObject.set(x, "SourcePortRanges", js.undefined)
    
    inline def setSourcePortRangesVarargs(value: PortRange*): Self = StObject.set(x, "SourcePortRanges", js.Array(value*))
  }
}
