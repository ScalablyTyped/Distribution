package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementAlongLine
  extends StObject
     with CIMMarkerStrokePlacement {
  
  /**
  			 * How markers are placed at control points.
  			 */
  var controlPointPlacement: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementEndings * / any */ String
  ] = js.undefined
  
  /**
  			 * Where the pattern should end relative to the ending point of the geometry. The entire pattern is shifted along the line for the specified distance. Negative numbers shift to the left and positive numbers shift to the right. This is only applied if the Endings property is set to Custom.
  			 */
  var customEndingOffset: js.UndefOr[Double] = js.undefined
  
  /**
  			 * How markers are placed at the end points of a line.
  			 */
  var endings: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementEndings * / any */ String
  ] = js.undefined
  
  /**
  			 * Where the pattern should begin relative to the starting point of the geometry. The entire pattern is shifted along the line for the specified distance. Negative numbers shift to the left and positive numbers shift to the right. This is only applied if the Endings property is set to No Constraint or Custom.
  			 */
  var offsetAlongLine: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The numeric pattern that defines the sequence of placed markers and the length of space between them.
  			 */
  var placementTemplate: js.UndefOr[js.Array[Double]] = js.undefined
}
object CIMMarkerPlacementAlongLine {
  
  inline def apply(`type`: String): CIMMarkerPlacementAlongLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerPlacementAlongLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMMarkerPlacementAlongLine] (val x: Self) extends AnyVal {
    
    inline def setControlPointPlacement(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementEndings * / any */ String
    ): Self = StObject.set(x, "controlPointPlacement", value.asInstanceOf[js.Any])
    
    inline def setControlPointPlacementUndefined: Self = StObject.set(x, "controlPointPlacement", js.undefined)
    
    inline def setCustomEndingOffset(value: Double): Self = StObject.set(x, "customEndingOffset", value.asInstanceOf[js.Any])
    
    inline def setCustomEndingOffsetUndefined: Self = StObject.set(x, "customEndingOffset", js.undefined)
    
    inline def setEndings(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementEndings * / any */ String
    ): Self = StObject.set(x, "endings", value.asInstanceOf[js.Any])
    
    inline def setEndingsUndefined: Self = StObject.set(x, "endings", js.undefined)
    
    inline def setOffsetAlongLine(value: Double): Self = StObject.set(x, "offsetAlongLine", value.asInstanceOf[js.Any])
    
    inline def setOffsetAlongLineUndefined: Self = StObject.set(x, "offsetAlongLine", js.undefined)
    
    inline def setPlacementTemplate(value: js.Array[Double]): Self = StObject.set(x, "placementTemplate", value.asInstanceOf[js.Any])
    
    inline def setPlacementTemplateUndefined: Self = StObject.set(x, "placementTemplate", js.undefined)
    
    inline def setPlacementTemplateVarargs(value: Double*): Self = StObject.set(x, "placementTemplate", js.Array(value*))
  }
}
