package typings.arcgisJsApi.esri.CIM

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
  implicit class CIMMarkerPlacementInsidePolygonOps[Self <: CIMMarkerPlacementInsidePolygon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementInsidePolygon): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipping(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementClip * / any */ String
    ): Self = this.set("clipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipping: Self = this.set("clipping", js.undefined)
    
    @scala.inline
    def setGridAngle(value: Double): Self = this.set("gridAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridAngle: Self = this.set("gridAngle", js.undefined)
    
    @scala.inline
    def setGridType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementGridType * / any */ String
    ): Self = this.set("gridType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridType: Self = this.set("gridType", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    
    @scala.inline
    def setRandomness(value: Double): Self = this.set("randomness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRandomness: Self = this.set("randomness", js.undefined)
    
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    
    @scala.inline
    def setShiftOddRows(value: Boolean): Self = this.set("shiftOddRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShiftOddRows: Self = this.set("shiftOddRows", js.undefined)
    
    @scala.inline
    def setStepX(value: Double): Self = this.set("stepX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepX: Self = this.set("stepX", js.undefined)
    
    @scala.inline
    def setStepY(value: Double): Self = this.set("stepY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepY: Self = this.set("stepY", js.undefined)
  }
}
