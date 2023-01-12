package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementOnVertices
  extends StObject
     with CIMMarkerStrokePlacement
     with CIMMarkerPlacementType {
  
  /**
    * A value indicating whether a marker will be placed on the control points of the line.
    */
  var placeOnControlPoints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value indicating whether a marker will be placed on the endpoints of the line.
    */
  var placeOnEndPoints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value indicating whether a marker will be placed on the vertices of the line.
    */
  var placeOnRegularVertices: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_CIMMarkerPlacementOnVertices: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnVertices
}
object CIMMarkerPlacementOnVertices {
  
  inline def apply(): CIMMarkerPlacementOnVertices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMarkerPlacementOnVertices")
    __obj.asInstanceOf[CIMMarkerPlacementOnVertices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMMarkerPlacementOnVertices] (val x: Self) extends AnyVal {
    
    inline def setPlaceOnControlPoints(value: Boolean): Self = StObject.set(x, "placeOnControlPoints", value.asInstanceOf[js.Any])
    
    inline def setPlaceOnControlPointsUndefined: Self = StObject.set(x, "placeOnControlPoints", js.undefined)
    
    inline def setPlaceOnEndPoints(value: Boolean): Self = StObject.set(x, "placeOnEndPoints", value.asInstanceOf[js.Any])
    
    inline def setPlaceOnEndPointsUndefined: Self = StObject.set(x, "placeOnEndPoints", js.undefined)
    
    inline def setPlaceOnRegularVertices(value: Boolean): Self = StObject.set(x, "placeOnRegularVertices", value.asInstanceOf[js.Any])
    
    inline def setPlaceOnRegularVerticesUndefined: Self = StObject.set(x, "placeOnRegularVertices", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnVertices): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
