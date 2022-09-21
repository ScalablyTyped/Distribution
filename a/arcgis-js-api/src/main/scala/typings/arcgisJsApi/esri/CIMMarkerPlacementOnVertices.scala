package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementOnVertices
  extends StObject
     with Object
     with MarkerPlacement {
  
  /**
    * A value indicating whether to angle the marker to the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementOnVertices)
    */
  var angleToLine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementOnVertices)
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether a marker will be placed on the control points of the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementOnVertices)
    */
  var placeOnControlPoints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value indicating whether a marker will be placed on the endpoints of the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementOnVertices)
    */
  var placeOnEndPoints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value indicating whether a marker will be placed on the vertices of the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementOnVertices)
    */
  var placeOnRegularVertices: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value indicating whether to consider individual geometry parts or the whole geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementOnVertices)
    */
  var placePerPart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The primitive name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementOnVertices)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnVertices
}
object CIMMarkerPlacementOnVertices {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): CIMMarkerPlacementOnVertices = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMMarkerPlacementOnVertices")
    __obj.asInstanceOf[CIMMarkerPlacementOnVertices]
  }
  
  extension [Self <: CIMMarkerPlacementOnVertices](x: Self) {
    
    inline def setAngleToLine(value: Boolean): Self = StObject.set(x, "angleToLine", value.asInstanceOf[js.Any])
    
    inline def setAngleToLineUndefined: Self = StObject.set(x, "angleToLine", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPlaceOnControlPoints(value: Boolean): Self = StObject.set(x, "placeOnControlPoints", value.asInstanceOf[js.Any])
    
    inline def setPlaceOnControlPointsUndefined: Self = StObject.set(x, "placeOnControlPoints", js.undefined)
    
    inline def setPlaceOnEndPoints(value: Boolean): Self = StObject.set(x, "placeOnEndPoints", value.asInstanceOf[js.Any])
    
    inline def setPlaceOnEndPointsUndefined: Self = StObject.set(x, "placeOnEndPoints", js.undefined)
    
    inline def setPlaceOnRegularVertices(value: Boolean): Self = StObject.set(x, "placeOnRegularVertices", value.asInstanceOf[js.Any])
    
    inline def setPlaceOnRegularVerticesUndefined: Self = StObject.set(x, "placeOnRegularVertices", js.undefined)
    
    inline def setPlacePerPart(value: Boolean): Self = StObject.set(x, "placePerPart", value.asInstanceOf[js.Any])
    
    inline def setPlacePerPartUndefined: Self = StObject.set(x, "placePerPart", js.undefined)
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnVertices): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
