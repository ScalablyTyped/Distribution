package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerPlacementAlongLine extends CIMMarkerStrokePlacement {
  
  /**
    * How markers are placed at control points.
    */
  var controlPointPlacement: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementEndings * / any */ String
  ] = js.native
  
  /**
    * Where the pattern should end relative to the ending point of the geometry. The entire pattern is shifted along the line for the specified distance. Negative numbers shift to the left and positive numbers shift to the right. This is only applied if the Endings property is set to Custom.
    */
  var customEndingOffset: js.UndefOr[Double] = js.native
  
  /**
    * How markers are placed at the end points of a line.
    */
  var endings: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementEndings * / any */ String
  ] = js.native
  
  /**
    * Where the pattern should begin relative to the starting point of the geometry. The entire pattern is shifted along the line for the specified distance. Negative numbers shift to the left and positive numbers shift to the right. This is only applied if the Endings property is set to No Constraint or Custom.
    */
  var offsetAlongLine: js.UndefOr[Double] = js.native
  
  /**
    * The numeric pattern that defines the sequence of placed markers and the length of space between them.
    */
  var placementTemplate: js.UndefOr[js.Array[Double]] = js.native
}
object CIMMarkerPlacementAlongLine {
  
  @scala.inline
  def apply(`type`: String): CIMMarkerPlacementAlongLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerPlacementAlongLine]
  }
  
  @scala.inline
  implicit class CIMMarkerPlacementAlongLineOps[Self <: CIMMarkerPlacementAlongLine] (val x: Self) extends AnyVal {
    
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
    def setControlPointPlacement(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementEndings * / any */ String
    ): Self = this.set("controlPointPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlPointPlacement: Self = this.set("controlPointPlacement", js.undefined)
    
    @scala.inline
    def setCustomEndingOffset(value: Double): Self = this.set("customEndingOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEndingOffset: Self = this.set("customEndingOffset", js.undefined)
    
    @scala.inline
    def setEndings(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementEndings * / any */ String
    ): Self = this.set("endings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndings: Self = this.set("endings", js.undefined)
    
    @scala.inline
    def setOffsetAlongLine(value: Double): Self = this.set("offsetAlongLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetAlongLine: Self = this.set("offsetAlongLine", js.undefined)
    
    @scala.inline
    def setPlacementTemplateVarargs(value: Double*): Self = this.set("placementTemplate", js.Array(value :_*))
    
    @scala.inline
    def setPlacementTemplate(value: js.Array[Double]): Self = this.set("placementTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementTemplate: Self = this.set("placementTemplate", js.undefined)
  }
}
