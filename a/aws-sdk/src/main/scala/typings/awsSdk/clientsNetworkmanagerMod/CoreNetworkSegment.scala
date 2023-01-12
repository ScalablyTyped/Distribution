package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreNetworkSegment extends StObject {
  
  /**
    * The Regions where the edges are located.
    */
  var EdgeLocations: js.UndefOr[ExternalRegionCodeList] = js.undefined
  
  /**
    * The name of a core network segment.
    */
  var Name: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The shared segments of a core network.
    */
  var SharedSegments: js.UndefOr[ConstrainedStringList] = js.undefined
}
object CoreNetworkSegment {
  
  inline def apply(): CoreNetworkSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreNetworkSegment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoreNetworkSegment] (val x: Self) extends AnyVal {
    
    inline def setEdgeLocations(value: ExternalRegionCodeList): Self = StObject.set(x, "EdgeLocations", value.asInstanceOf[js.Any])
    
    inline def setEdgeLocationsUndefined: Self = StObject.set(x, "EdgeLocations", js.undefined)
    
    inline def setEdgeLocationsVarargs(value: ExternalRegionCode*): Self = StObject.set(x, "EdgeLocations", js.Array(value*))
    
    inline def setName(value: ConstrainedString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSharedSegments(value: ConstrainedStringList): Self = StObject.set(x, "SharedSegments", value.asInstanceOf[js.Any])
    
    inline def setSharedSegmentsUndefined: Self = StObject.set(x, "SharedSegments", js.undefined)
    
    inline def setSharedSegmentsVarargs(value: ConstrainedString*): Self = StObject.set(x, "SharedSegments", js.Array(value*))
  }
}
