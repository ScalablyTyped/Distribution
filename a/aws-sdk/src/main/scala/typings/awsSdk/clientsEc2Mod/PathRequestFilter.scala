package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRequestFilter extends StObject {
  
  /**
    * The destination IPv4 address.
    */
  var DestinationAddress: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The destination port range.
    */
  var DestinationPortRange: js.UndefOr[RequestFilterPortRange] = js.undefined
  
  /**
    * The source IPv4 address.
    */
  var SourceAddress: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The source port range.
    */
  var SourcePortRange: js.UndefOr[RequestFilterPortRange] = js.undefined
}
object PathRequestFilter {
  
  inline def apply(): PathRequestFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathRequestFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRequestFilter] (val x: Self) extends AnyVal {
    
    inline def setDestinationAddress(value: IpAddress): Self = StObject.set(x, "DestinationAddress", value.asInstanceOf[js.Any])
    
    inline def setDestinationAddressUndefined: Self = StObject.set(x, "DestinationAddress", js.undefined)
    
    inline def setDestinationPortRange(value: RequestFilterPortRange): Self = StObject.set(x, "DestinationPortRange", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortRangeUndefined: Self = StObject.set(x, "DestinationPortRange", js.undefined)
    
    inline def setSourceAddress(value: IpAddress): Self = StObject.set(x, "SourceAddress", value.asInstanceOf[js.Any])
    
    inline def setSourceAddressUndefined: Self = StObject.set(x, "SourceAddress", js.undefined)
    
    inline def setSourcePortRange(value: RequestFilterPortRange): Self = StObject.set(x, "SourcePortRange", value.asInstanceOf[js.Any])
    
    inline def setSourcePortRangeUndefined: Self = StObject.set(x, "SourcePortRange", js.undefined)
  }
}
