package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerPlacementInsidePolygon
  extends CIMMarkerPlacementBase
     with CIMMarkerPlacementType {
  
  /**
    * The clipping option which specifies how markers should be clipped at the polygon boundary.
    */
  var clipping: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementClip * / any */ String
  ] = js.native
  
  /**
    * The orientation angle that the markers are placed on within the polygon.
    */
  var gridAngle: js.UndefOr[Double] = js.native
  
  /**
    * The grid type which defines how markers are placed.
    */
  var gridType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementGridType * / any */ String
  ] = js.native
  
  /**
    * The marker row offset horizontally.
    */
  var offsetX: js.UndefOr[Double] = js.native
  
  /**
    * The marker row offset vertically.
    */
  var offsetY: js.UndefOr[Double] = js.native
  
  /**
    * The randomness of the pattern when markers are placed randomly in a polygon.
    */
  var randomness: js.UndefOr[Double] = js.native
  
  /**
    * The starting value for generating a random pattern.
    */
  var seed: js.UndefOr[Double] = js.native
  
  /**
    * A value indicating whether every other row of markers should be shifted to create an offset grid.
    */
  var shiftOddRows: js.UndefOr[Boolean] = js.native
  
  /**
    * The distance between each marker on the X-axis of the grid.
    */
  var stepX: js.UndefOr[Double] = js.native
  
  /**
    * The distance between each marker on the Y-axis of the grid.
    */
  var stepY: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMMarkerPlacementInsidePolygon: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementInsidePolygon = js.native
}
object CIMMarkerPlacementInsidePolygon {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementInsidePolygon): CIMMarkerPlacementInsidePolygon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerPlacementInsidePolygon]
  }
  
  @scala.inline
  implicit class CIMMarkerPlacementInsidePolygonMutableBuilder[Self <: CIMMarkerPlacementInsidePolygon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipping(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementClip * / any */ String
    ): Self = StObject.set(x, "clipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippingUndefined: Self = StObject.set(x, "clipping", js.undefined)
    
    @scala.inline
    def setGridAngle(value: Double): Self = StObject.set(x, "gridAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridAngleUndefined: Self = StObject.set(x, "gridAngle", js.undefined)
    
    @scala.inline
    def setGridType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementGridType * / any */ String
    ): Self = StObject.set(x, "gridType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridTypeUndefined: Self = StObject.set(x, "gridType", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setRandomness(value: Double): Self = StObject.set(x, "randomness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomnessUndefined: Self = StObject.set(x, "randomness", js.undefined)
    
    @scala.inline
    def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    @scala.inline
    def setShiftOddRows(value: Boolean): Self = StObject.set(x, "shiftOddRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftOddRowsUndefined: Self = StObject.set(x, "shiftOddRows", js.undefined)
    
    @scala.inline
    def setStepX(value: Double): Self = StObject.set(x, "stepX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepXUndefined: Self = StObject.set(x, "stepX", js.undefined)
    
    @scala.inline
    def setStepY(value: Double): Self = StObject.set(x, "stepY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepYUndefined: Self = StObject.set(x, "stepY", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementInsidePolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
