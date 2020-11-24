package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerPlacementAtRatioPositions
  extends CIMMarkerStrokePlacement
     with CIMMarkerPlacementType {
  
  /**
    * The distance from the beginning of a line that the marker will be placed.
    */
  var beginPosition: js.UndefOr[Double] = js.native
  
  /**
    * The distance from the end of a line that the marker will be placed. The ending of a line is determined by the direction in which the line was digitized.
    */
  var endPosition: js.UndefOr[Double] = js.native
  
  /**
    * A value indicating whether only the first marker will be rotated 180 degrees.
    */
  var flipFirst: js.UndefOr[Boolean] = js.native
  
  /**
    * The array of positions.
    */
  var positionArray: js.UndefOr[js.Array[Double]] = js.native
  
  @JSName("type")
  var type_CIMMarkerPlacementAtRatioPositions: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtRatioPositions = js.native
}
object CIMMarkerPlacementAtRatioPositions {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtRatioPositions): CIMMarkerPlacementAtRatioPositions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerPlacementAtRatioPositions]
  }
  
  @scala.inline
  implicit class CIMMarkerPlacementAtRatioPositionsOps[Self <: CIMMarkerPlacementAtRatioPositions] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtRatioPositions): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginPosition(value: Double): Self = this.set("beginPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeginPosition: Self = this.set("beginPosition", js.undefined)
    
    @scala.inline
    def setEndPosition(value: Double): Self = this.set("endPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndPosition: Self = this.set("endPosition", js.undefined)
    
    @scala.inline
    def setFlipFirst(value: Boolean): Self = this.set("flipFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlipFirst: Self = this.set("flipFirst", js.undefined)
    
    @scala.inline
    def setPositionArrayVarargs(value: Double*): Self = this.set("positionArray", js.Array(value :_*))
    
    @scala.inline
    def setPositionArray(value: js.Array[Double]): Self = this.set("positionArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionArray: Self = this.set("positionArray", js.undefined)
  }
}
