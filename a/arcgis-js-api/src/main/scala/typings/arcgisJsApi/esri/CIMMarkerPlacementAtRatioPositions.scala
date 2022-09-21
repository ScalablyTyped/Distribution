package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementAtRatioPositions
  extends StObject
     with Object
     with MarkerPlacement {
  
  /**
    * A value indicating whether to angle the marker to the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAtRatioPositions)
    */
  var angleToLine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The distance from the beginning of a line that the marker will be placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAtRatioPositions)
    */
  var beginPosition: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance from the end of a line that the marker will be placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAtRatioPositions)
    */
  var endPosition: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether only the first marker will be rotated 180 degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAtRatioPositions)
    */
  var flipFirst: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAtRatioPositions)
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether to consider individual geometry parts or the whole geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAtRatioPositions)
    */
  var placePerPart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The array of positions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAtRatioPositions)
    */
  var positionArray: js.Array[Double]
  
  /**
    * The primitive name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAtRatioPositions)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtRatioPositions
}
object CIMMarkerPlacementAtRatioPositions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    positionArray: js.Array[Double],
    propertyIsEnumerable: PropertyKey => Boolean
  ): CIMMarkerPlacementAtRatioPositions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), positionArray = positionArray.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMMarkerPlacementAtRatioPositions")
    __obj.asInstanceOf[CIMMarkerPlacementAtRatioPositions]
  }
  
  extension [Self <: CIMMarkerPlacementAtRatioPositions](x: Self) {
    
    inline def setAngleToLine(value: Boolean): Self = StObject.set(x, "angleToLine", value.asInstanceOf[js.Any])
    
    inline def setAngleToLineUndefined: Self = StObject.set(x, "angleToLine", js.undefined)
    
    inline def setBeginPosition(value: Double): Self = StObject.set(x, "beginPosition", value.asInstanceOf[js.Any])
    
    inline def setBeginPositionUndefined: Self = StObject.set(x, "beginPosition", js.undefined)
    
    inline def setEndPosition(value: Double): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    inline def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    inline def setFlipFirst(value: Boolean): Self = StObject.set(x, "flipFirst", value.asInstanceOf[js.Any])
    
    inline def setFlipFirstUndefined: Self = StObject.set(x, "flipFirst", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPlacePerPart(value: Boolean): Self = StObject.set(x, "placePerPart", value.asInstanceOf[js.Any])
    
    inline def setPlacePerPartUndefined: Self = StObject.set(x, "placePerPart", js.undefined)
    
    inline def setPositionArray(value: js.Array[Double]): Self = StObject.set(x, "positionArray", value.asInstanceOf[js.Any])
    
    inline def setPositionArrayVarargs(value: Double*): Self = StObject.set(x, "positionArray", js.Array(value*))
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtRatioPositions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
