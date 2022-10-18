package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreNetworkSegmentEdgeIdentifier extends StObject {
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkId] = js.undefined
  
  /**
    * The Region where the segment edge is located.
    */
  var EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined
  
  /**
    * The name of the segment edge.
    */
  var SegmentName: js.UndefOr[ConstrainedString] = js.undefined
}
object CoreNetworkSegmentEdgeIdentifier {
  
  inline def apply(): CoreNetworkSegmentEdgeIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreNetworkSegmentEdgeIdentifier]
  }
  
  extension [Self <: CoreNetworkSegmentEdgeIdentifier](x: Self) {
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkIdUndefined: Self = StObject.set(x, "CoreNetworkId", js.undefined)
    
    inline def setEdgeLocation(value: ExternalRegionCode): Self = StObject.set(x, "EdgeLocation", value.asInstanceOf[js.Any])
    
    inline def setEdgeLocationUndefined: Self = StObject.set(x, "EdgeLocation", js.undefined)
    
    inline def setSegmentName(value: ConstrainedString): Self = StObject.set(x, "SegmentName", value.asInstanceOf[js.Any])
    
    inline def setSegmentNameUndefined: Self = StObject.set(x, "SegmentName", js.undefined)
  }
}
