package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindMarkerOptions extends js.Object {
  
  /** Only include markers that contain the given Point, inclusive. */
  var containsPoint: js.UndefOr[PointCompatible] = js.native
  
  /** Only include markers that contain the given Range, inclusive. */
  var containsRange: js.UndefOr[RangeCompatible] = js.native
  
  /** Only include markers that end at the given Point. */
  var endPosition: js.UndefOr[PointCompatible] = js.native
  
  /** Only include markers that end at the given row number. */
  var endRow: js.UndefOr[Double] = js.native
  
  /** Only include markers that end inside the given Range. */
  var endsInRange: js.UndefOr[RangeCompatible] = js.native
  
  /** Only include markers that intersect the given row number. */
  var intersectsRow: js.UndefOr[Double] = js.native
  
  /** Only include markers that start at the given Point. */
  var startPosition: js.UndefOr[PointCompatible] = js.native
  
  /** Only include markers that start at the given row number. */
  var startRow: js.UndefOr[Double] = js.native
  
  /** Only include markers that start inside the given Range. */
  var startsInRange: js.UndefOr[RangeCompatible] = js.native
}
object FindMarkerOptions {
  
  @scala.inline
  def apply(): FindMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindMarkerOptions]
  }
  
  @scala.inline
  implicit class FindMarkerOptionsOps[Self <: FindMarkerOptions] (val x: Self) extends AnyVal {
    
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
    def setContainsPoint(value: PointCompatible): Self = this.set("containsPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainsPoint: Self = this.set("containsPoint", js.undefined)
    
    @scala.inline
    def setContainsRange(value: RangeCompatible): Self = this.set("containsRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainsRange: Self = this.set("containsRange", js.undefined)
    
    @scala.inline
    def setEndPosition(value: PointCompatible): Self = this.set("endPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndPosition: Self = this.set("endPosition", js.undefined)
    
    @scala.inline
    def setEndRow(value: Double): Self = this.set("endRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndRow: Self = this.set("endRow", js.undefined)
    
    @scala.inline
    def setEndsInRange(value: RangeCompatible): Self = this.set("endsInRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndsInRange: Self = this.set("endsInRange", js.undefined)
    
    @scala.inline
    def setIntersectsRow(value: Double): Self = this.set("intersectsRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntersectsRow: Self = this.set("intersectsRow", js.undefined)
    
    @scala.inline
    def setStartPosition(value: PointCompatible): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPosition: Self = this.set("startPosition", js.undefined)
    
    @scala.inline
    def setStartRow(value: Double): Self = this.set("startRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartRow: Self = this.set("startRow", js.undefined)
    
    @scala.inline
    def setStartsInRange(value: RangeCompatible): Self = this.set("startsInRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartsInRange: Self = this.set("startsInRange", js.undefined)
  }
}
