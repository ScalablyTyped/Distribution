package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindMarkerOptions extends StObject {
  
  /** Only include markers that contain the given Point, inclusive. */
  var containsPoint: js.UndefOr[PointCompatible] = js.undefined
  
  /** Only include markers that contain the given Range, inclusive. */
  var containsRange: js.UndefOr[RangeCompatible] = js.undefined
  
  /** Only include markers that end at the given Point. */
  var endPosition: js.UndefOr[PointCompatible] = js.undefined
  
  /** Only include markers that end at the given row number. */
  var endRow: js.UndefOr[Double] = js.undefined
  
  /** Only include markers that end inside the given Range. */
  var endsInRange: js.UndefOr[RangeCompatible] = js.undefined
  
  /** Only include markers that intersect the given row number. */
  var intersectsRow: js.UndefOr[Double] = js.undefined
  
  /** Only include markers that start at the given Point. */
  var startPosition: js.UndefOr[PointCompatible] = js.undefined
  
  /** Only include markers that start at the given row number. */
  var startRow: js.UndefOr[Double] = js.undefined
  
  /** Only include markers that start inside the given Range. */
  var startsInRange: js.UndefOr[RangeCompatible] = js.undefined
}
object FindMarkerOptions {
  
  inline def apply(): FindMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindMarkerOptions]
  }
  
  extension [Self <: FindMarkerOptions](x: Self) {
    
    inline def setContainsPoint(value: PointCompatible): Self = StObject.set(x, "containsPoint", value.asInstanceOf[js.Any])
    
    inline def setContainsPointUndefined: Self = StObject.set(x, "containsPoint", js.undefined)
    
    inline def setContainsRange(value: RangeCompatible): Self = StObject.set(x, "containsRange", value.asInstanceOf[js.Any])
    
    inline def setContainsRangeUndefined: Self = StObject.set(x, "containsRange", js.undefined)
    
    inline def setEndPosition(value: PointCompatible): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    inline def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    inline def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
    
    inline def setEndRowUndefined: Self = StObject.set(x, "endRow", js.undefined)
    
    inline def setEndsInRange(value: RangeCompatible): Self = StObject.set(x, "endsInRange", value.asInstanceOf[js.Any])
    
    inline def setEndsInRangeUndefined: Self = StObject.set(x, "endsInRange", js.undefined)
    
    inline def setIntersectsRow(value: Double): Self = StObject.set(x, "intersectsRow", value.asInstanceOf[js.Any])
    
    inline def setIntersectsRowUndefined: Self = StObject.set(x, "intersectsRow", js.undefined)
    
    inline def setStartPosition(value: PointCompatible): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
    
    inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    
    inline def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
    
    inline def setStartsInRange(value: RangeCompatible): Self = StObject.set(x, "startsInRange", value.asInstanceOf[js.Any])
    
    inline def setStartsInRangeUndefined: Self = StObject.set(x, "startsInRange", js.undefined)
  }
}
