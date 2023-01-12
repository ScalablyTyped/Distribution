package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreNetworkEdge extends StObject {
  
  /**
    * The ASN of a core network edge.
    */
  var Asn: js.UndefOr[Long] = js.undefined
  
  /**
    * The Region where a core network edge is located.
    */
  var EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined
  
  /**
    * The inside IP addresses used for core network edges.
    */
  var InsideCidrBlocks: js.UndefOr[ConstrainedStringList] = js.undefined
}
object CoreNetworkEdge {
  
  inline def apply(): CoreNetworkEdge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreNetworkEdge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoreNetworkEdge] (val x: Self) extends AnyVal {
    
    inline def setAsn(value: Long): Self = StObject.set(x, "Asn", value.asInstanceOf[js.Any])
    
    inline def setAsnUndefined: Self = StObject.set(x, "Asn", js.undefined)
    
    inline def setEdgeLocation(value: ExternalRegionCode): Self = StObject.set(x, "EdgeLocation", value.asInstanceOf[js.Any])
    
    inline def setEdgeLocationUndefined: Self = StObject.set(x, "EdgeLocation", js.undefined)
    
    inline def setInsideCidrBlocks(value: ConstrainedStringList): Self = StObject.set(x, "InsideCidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setInsideCidrBlocksUndefined: Self = StObject.set(x, "InsideCidrBlocks", js.undefined)
    
    inline def setInsideCidrBlocksVarargs(value: ConstrainedString*): Self = StObject.set(x, "InsideCidrBlocks", js.Array(value*))
  }
}
