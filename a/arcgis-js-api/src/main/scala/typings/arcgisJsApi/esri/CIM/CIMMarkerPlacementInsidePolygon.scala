package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementInsidePolygon
  extends StObject
     with CIMMarkerPlacementBase
     with CIMMarkerPlacementType {
  
  /**
  			 * The clipping option which specifies how markers should be clipped at the polygon boundary.
  			 */
  var clipping: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementClip * / any */ String
  ] = js.undefined
  
  /**
  			 * The orientation angle that the markers are placed on within the polygon.
  			 */
  var gridAngle: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The grid type which defines how markers are placed.
  			 */
  var gridType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementGridType * / any */ String
  ] = js.undefined
  
  /**
  			 * The marker row offset horizontally.
  			 */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The marker row offset vertically.
  			 */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The randomness of the pattern when markers are placed randomly in a polygon.
  			 */
  var randomness: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The starting value for generating a random pattern.
  			 */
  var seed: js.UndefOr[Double] = js.undefined
  
  /**
  			 * A value indicating whether every other row of markers should be shifted to create an offset grid.
  			 */
  var shiftOddRows: js.UndefOr[Boolean] = js.undefined
  
  /**
  			 * The distance between each marker on the X-axis of the grid.
  			 */
  var stepX: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The distance between each marker on the Y-axis of the grid.
  			 */
  var stepY: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMMarkerPlacementInsidePolygon: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementInsidePolygon
}
object CIMMarkerPlacementInsidePolygon {
  
  inline def apply(): CIMMarkerPlacementInsidePolygon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMarkerPlacementInsidePolygon")
    __obj.asInstanceOf[CIMMarkerPlacementInsidePolygon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMMarkerPlacementInsidePolygon] (val x: Self) extends AnyVal {
    
    inline def setClipping(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementClip * / any */ String
    ): Self = StObject.set(x, "clipping", value.asInstanceOf[js.Any])
    
    inline def setClippingUndefined: Self = StObject.set(x, "clipping", js.undefined)
    
    inline def setGridAngle(value: Double): Self = StObject.set(x, "gridAngle", value.asInstanceOf[js.Any])
    
    inline def setGridAngleUndefined: Self = StObject.set(x, "gridAngle", js.undefined)
    
    inline def setGridType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementGridType * / any */ String
    ): Self = StObject.set(x, "gridType", value.asInstanceOf[js.Any])
    
    inline def setGridTypeUndefined: Self = StObject.set(x, "gridType", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
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
