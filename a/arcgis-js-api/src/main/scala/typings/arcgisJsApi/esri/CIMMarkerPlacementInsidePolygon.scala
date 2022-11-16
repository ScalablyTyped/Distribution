package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.ClipAtBoundary
import typings.arcgisJsApi.arcgisJsApiStrings.Fixed
import typings.arcgisJsApi.arcgisJsApiStrings.Random
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementInsidePolygon
  extends StObject
     with MarkerPlacement {
  
  /**
    * The clipping option which specifies how markers should be clipped at the polygon boundary.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementInsidePolygon)
    */
  var clipping: js.UndefOr[ClipAtBoundary] = js.undefined
  
  /**
    * The orientation angle that the markers are placed on within the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementInsidePolygon)
    */
  var gridAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * The grid type which defines how markers are placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementInsidePolygon)
    */
  var gridType: js.UndefOr[Fixed | Random] = js.undefined
  
  /**
    * The marker row offset horizontally.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementInsidePolygon)
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * The marker row offset vertically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementInsidePolygon)
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether to consider individual geometry parts or the whole geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementInsidePolygon)
    */
  var placePerPart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The primitive name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementInsidePolygon)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  /**
    * _Since 4.24_ A percentage that determines the randomness of markers within the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementInsidePolygon)
    */
  var randomness: js.UndefOr[Double] = js.undefined
  
  /**
    * _Since 4.24_ The starting value for generating a random pattern.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementInsidePolygon)
    */
  var seed: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether every other row of markers should be shifted to create an offset grid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementInsidePolygon)
    */
  var shiftOddRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The distance between each marker on the X-axis of the grid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementInsidePolygon)
    */
  var stepX: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance between each marker on the Y-axis of the grid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementInsidePolygon)
    */
  var stepY: js.UndefOr[Double] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementInsidePolygon
}
object CIMMarkerPlacementInsidePolygon {
  
  inline def apply(): CIMMarkerPlacementInsidePolygon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMarkerPlacementInsidePolygon")
    __obj.asInstanceOf[CIMMarkerPlacementInsidePolygon]
  }
  
  extension [Self <: CIMMarkerPlacementInsidePolygon](x: Self) {
    
    inline def setClipping(value: ClipAtBoundary): Self = StObject.set(x, "clipping", value.asInstanceOf[js.Any])
    
    inline def setClippingUndefined: Self = StObject.set(x, "clipping", js.undefined)
    
    inline def setGridAngle(value: Double): Self = StObject.set(x, "gridAngle", value.asInstanceOf[js.Any])
    
    inline def setGridAngleUndefined: Self = StObject.set(x, "gridAngle", js.undefined)
    
    inline def setGridType(value: Fixed | Random): Self = StObject.set(x, "gridType", value.asInstanceOf[js.Any])
    
    inline def setGridTypeUndefined: Self = StObject.set(x, "gridType", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPlacePerPart(value: Boolean): Self = StObject.set(x, "placePerPart", value.asInstanceOf[js.Any])
    
    inline def setPlacePerPartUndefined: Self = StObject.set(x, "placePerPart", js.undefined)
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setRandomness(value: Double): Self = StObject.set(x, "randomness", value.asInstanceOf[js.Any])
    
    inline def setRandomnessUndefined: Self = StObject.set(x, "randomness", js.undefined)
    
    inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    inline def setShiftOddRows(value: Boolean): Self = StObject.set(x, "shiftOddRows", value.asInstanceOf[js.Any])
    
    inline def setShiftOddRowsUndefined: Self = StObject.set(x, "shiftOddRows", js.undefined)
    
    inline def setStepX(value: Double): Self = StObject.set(x, "stepX", value.asInstanceOf[js.Any])
    
    inline def setStepXUndefined: Self = StObject.set(x, "stepX", js.undefined)
    
    inline def setStepY(value: Double): Self = StObject.set(x, "stepY", value.asInstanceOf[js.Any])
    
    inline def setStepYUndefined: Self = StObject.set(x, "stepY", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementInsidePolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
