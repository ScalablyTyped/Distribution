package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindDisplayMarkerOptions extends StObject {
  
  /** Only include markers contained in this Range in buffer coordinates. */
  var containedInBufferRange: js.UndefOr[RangeCompatible] = js.native
  
  /** Only include markers contained in this Range in screen coordinates. */
  var containedInScreenRange: js.UndefOr[RangeCompatible] = js.native
  
  /** Only include markers containing this Point in buffer coordinates. */
  var containsBufferPosition: js.UndefOr[PointCompatible] = js.native
  
  /** Only include markers containing this Range in buffer coordinates. */
  var containsBufferRange: js.UndefOr[RangeCompatible] = js.native
  
  /** Only include markers ending at this Point in buffer coordinates. */
  var endBufferPosition: js.UndefOr[PointCompatible] = js.native
  
  /** Only include markers ending at this row in buffer coordinates. */
  var endBufferRow: js.UndefOr[Double] = js.native
  
  /** Only include markers ending at this Point in screen coordinates. */
  var endScreenPosition: js.UndefOr[PointCompatible] = js.native
  
  /** Only include markers ending at this row in screen coordinates. */
  var endScreenRow: js.UndefOr[Double] = js.native
  
  /** Only include markers ending inside this Range in buffer coordinates. */
  var endsInBufferRange: js.UndefOr[RangeCompatible] = js.native
  
  /** Only include markers ending inside this Range in screen coordinates. */
  var endsInScreenRange: js.UndefOr[RangeCompatible] = js.native
  
  /** Only include markers intersecting this Range in buffer coordinates. */
  var intersectsBufferRange: js.UndefOr[RangeCompatible] = js.native
  
  /**
    *  Only include markers intersecting this Array of [startRow, endRow] in
    *  buffer coordinates.
    */
  var intersectsBufferRowRange: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  /** Only include markers intersecting this Range in screen coordinates. */
  var intersectsScreenRange: js.UndefOr[RangeCompatible] = js.native
  
  /**
    *  Only include markers intersecting this Array of [startRow, endRow] in
    *  screen coordinates.
    */
  var intersectsScreenRowRange: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  /** Only include markers starting at this Point in buffer coordinates. */
  var startBufferPosition: js.UndefOr[PointCompatible] = js.native
  
  /** Only include markers starting at this row in buffer coordinates. */
  var startBufferRow: js.UndefOr[Double] = js.native
  
  /** Only include markers starting at this Point in screen coordinates. */
  var startScreenPosition: js.UndefOr[PointCompatible] = js.native
  
  /** Only include markers starting at this row in screen coordinates. */
  var startScreenRow: js.UndefOr[Double] = js.native
  
  /** Only include markers starting inside this Range in buffer coordinates. */
  var startsInBufferRange: js.UndefOr[RangeCompatible] = js.native
  
  /** Only include markers starting inside this Range in screen coordinates. */
  var startsInScreenRange: js.UndefOr[RangeCompatible] = js.native
}
object FindDisplayMarkerOptions {
  
  @scala.inline
  def apply(): FindDisplayMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindDisplayMarkerOptions]
  }
  
  @scala.inline
  implicit class FindDisplayMarkerOptionsMutableBuilder[Self <: FindDisplayMarkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainedInBufferRange(value: RangeCompatible): Self = StObject.set(x, "containedInBufferRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainedInBufferRangeUndefined: Self = StObject.set(x, "containedInBufferRange", js.undefined)
    
    @scala.inline
    def setContainedInScreenRange(value: RangeCompatible): Self = StObject.set(x, "containedInScreenRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainedInScreenRangeUndefined: Self = StObject.set(x, "containedInScreenRange", js.undefined)
    
    @scala.inline
    def setContainsBufferPosition(value: PointCompatible): Self = StObject.set(x, "containsBufferPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsBufferPositionUndefined: Self = StObject.set(x, "containsBufferPosition", js.undefined)
    
    @scala.inline
    def setContainsBufferRange(value: RangeCompatible): Self = StObject.set(x, "containsBufferRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsBufferRangeUndefined: Self = StObject.set(x, "containsBufferRange", js.undefined)
    
    @scala.inline
    def setEndBufferPosition(value: PointCompatible): Self = StObject.set(x, "endBufferPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndBufferPositionUndefined: Self = StObject.set(x, "endBufferPosition", js.undefined)
    
    @scala.inline
    def setEndBufferRow(value: Double): Self = StObject.set(x, "endBufferRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndBufferRowUndefined: Self = StObject.set(x, "endBufferRow", js.undefined)
    
    @scala.inline
    def setEndScreenPosition(value: PointCompatible): Self = StObject.set(x, "endScreenPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndScreenPositionUndefined: Self = StObject.set(x, "endScreenPosition", js.undefined)
    
    @scala.inline
    def setEndScreenRow(value: Double): Self = StObject.set(x, "endScreenRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndScreenRowUndefined: Self = StObject.set(x, "endScreenRow", js.undefined)
    
    @scala.inline
    def setEndsInBufferRange(value: RangeCompatible): Self = StObject.set(x, "endsInBufferRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndsInBufferRangeUndefined: Self = StObject.set(x, "endsInBufferRange", js.undefined)
    
    @scala.inline
    def setEndsInScreenRange(value: RangeCompatible): Self = StObject.set(x, "endsInScreenRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndsInScreenRangeUndefined: Self = StObject.set(x, "endsInScreenRange", js.undefined)
    
    @scala.inline
    def setIntersectsBufferRange(value: RangeCompatible): Self = StObject.set(x, "intersectsBufferRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectsBufferRangeUndefined: Self = StObject.set(x, "intersectsBufferRange", js.undefined)
    
    @scala.inline
    def setIntersectsBufferRowRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "intersectsBufferRowRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectsBufferRowRangeUndefined: Self = StObject.set(x, "intersectsBufferRowRange", js.undefined)
    
    @scala.inline
    def setIntersectsScreenRange(value: RangeCompatible): Self = StObject.set(x, "intersectsScreenRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectsScreenRangeUndefined: Self = StObject.set(x, "intersectsScreenRange", js.undefined)
    
    @scala.inline
    def setIntersectsScreenRowRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "intersectsScreenRowRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectsScreenRowRangeUndefined: Self = StObject.set(x, "intersectsScreenRowRange", js.undefined)
    
    @scala.inline
    def setStartBufferPosition(value: PointCompatible): Self = StObject.set(x, "startBufferPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartBufferPositionUndefined: Self = StObject.set(x, "startBufferPosition", js.undefined)
    
    @scala.inline
    def setStartBufferRow(value: Double): Self = StObject.set(x, "startBufferRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartBufferRowUndefined: Self = StObject.set(x, "startBufferRow", js.undefined)
    
    @scala.inline
    def setStartScreenPosition(value: PointCompatible): Self = StObject.set(x, "startScreenPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartScreenPositionUndefined: Self = StObject.set(x, "startScreenPosition", js.undefined)
    
    @scala.inline
    def setStartScreenRow(value: Double): Self = StObject.set(x, "startScreenRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartScreenRowUndefined: Self = StObject.set(x, "startScreenRow", js.undefined)
    
    @scala.inline
    def setStartsInBufferRange(value: RangeCompatible): Self = StObject.set(x, "startsInBufferRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartsInBufferRangeUndefined: Self = StObject.set(x, "startsInBufferRange", js.undefined)
    
    @scala.inline
    def setStartsInScreenRange(value: RangeCompatible): Self = StObject.set(x, "startsInScreenRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartsInScreenRangeUndefined: Self = StObject.set(x, "startsInScreenRange", js.undefined)
  }
}
