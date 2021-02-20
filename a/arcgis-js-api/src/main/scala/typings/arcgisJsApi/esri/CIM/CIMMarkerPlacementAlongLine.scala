package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
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
  implicit class CIMMarkerPlacementAlongLineMutableBuilder[Self <: CIMMarkerPlacementAlongLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlPointPlacement(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementEndings * / any */ String
    ): Self = StObject.set(x, "controlPointPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlPointPlacementUndefined: Self = StObject.set(x, "controlPointPlacement", js.undefined)
    
    @scala.inline
    def setCustomEndingOffset(value: Double): Self = StObject.set(x, "customEndingOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomEndingOffsetUndefined: Self = StObject.set(x, "customEndingOffset", js.undefined)
    
    @scala.inline
    def setEndings(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementEndings * / any */ String
    ): Self = StObject.set(x, "endings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndingsUndefined: Self = StObject.set(x, "endings", js.undefined)
    
    @scala.inline
    def setOffsetAlongLine(value: Double): Self = StObject.set(x, "offsetAlongLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetAlongLineUndefined: Self = StObject.set(x, "offsetAlongLine", js.undefined)
    
    @scala.inline
    def setPlacementTemplate(value: js.Array[Double]): Self = StObject.set(x, "placementTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementTemplateUndefined: Self = StObject.set(x, "placementTemplate", js.undefined)
    
    @scala.inline
    def setPlacementTemplateVarargs(value: Double*): Self = StObject.set(x, "placementTemplate", js.Array(value :_*))
  }
}
