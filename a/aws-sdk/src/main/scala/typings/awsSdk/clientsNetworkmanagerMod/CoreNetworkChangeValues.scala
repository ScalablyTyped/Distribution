package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreNetworkChangeValues extends StObject {
  
  /**
    * The ASN of a core network.
    */
  var Asn: js.UndefOr[Long] = js.undefined
  
  /**
    * The IP addresses used for a core network.
    */
  var Cidr: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ID of the destination.
    */
  var DestinationIdentifier: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The Regions where edges are located in a core network. 
    */
  var EdgeLocations: js.UndefOr[ExternalRegionCodeList] = js.undefined
  
  /**
    * The inside IP addresses used for core network change values.
    */
  var InsideCidrBlocks: js.UndefOr[ConstrainedStringList] = js.undefined
  
  /**
    * The names of the segments in a core network.
    */
  var SegmentName: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The shared segments for a core network change value. 
    */
  var SharedSegments: js.UndefOr[ConstrainedStringList] = js.undefined
}
object CoreNetworkChangeValues {
  
  inline def apply(): CoreNetworkChangeValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreNetworkChangeValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoreNetworkChangeValues] (val x: Self) extends AnyVal {
    
    inline def setAsn(value: Long): Self = StObject.set(x, "Asn", value.asInstanceOf[js.Any])
    
    inline def setAsnUndefined: Self = StObject.set(x, "Asn", js.undefined)
    
    inline def setCidr(value: ConstrainedString): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    inline def setDestinationIdentifier(value: ConstrainedString): Self = StObject.set(x, "DestinationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDestinationIdentifierUndefined: Self = StObject.set(x, "DestinationIdentifier", js.undefined)
    
    inline def setEdgeLocations(value: ExternalRegionCodeList): Self = StObject.set(x, "EdgeLocations", value.asInstanceOf[js.Any])
    
    inline def setEdgeLocationsUndefined: Self = StObject.set(x, "EdgeLocations", js.undefined)
    
    inline def setEdgeLocationsVarargs(value: ExternalRegionCode*): Self = StObject.set(x, "EdgeLocations", js.Array(value*))
    
    inline def setInsideCidrBlocks(value: ConstrainedStringList): Self = StObject.set(x, "InsideCidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setInsideCidrBlocksUndefined: Self = StObject.set(x, "InsideCidrBlocks", js.undefined)
    
    inline def setInsideCidrBlocksVarargs(value: ConstrainedString*): Self = StObject.set(x, "InsideCidrBlocks", js.Array(value*))
    
    inline def setSegmentName(value: ConstrainedString): Self = StObject.set(x, "SegmentName", value.asInstanceOf[js.Any])
    
    inline def setSegmentNameUndefined: Self = StObject.set(x, "SegmentName", js.undefined)
    
    inline def setSharedSegments(value: ConstrainedStringList): Self = StObject.set(x, "SharedSegments", value.asInstanceOf[js.Any])
    
    inline def setSharedSegmentsUndefined: Self = StObject.set(x, "SharedSegments", js.undefined)
    
    inline def setSharedSegmentsVarargs(value: ConstrainedString*): Self = StObject.set(x, "SharedSegments", js.Array(value*))
  }
}
