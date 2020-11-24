package typings.androiduix.android.widget.AbsListView

import typings.androiduix.android.graphics.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionBoundsAdjuster extends js.Object {
  
  def adjustListItemSelectionBounds(bounds: Rect): Unit = js.native
}
object SelectionBoundsAdjuster {
  
  @scala.inline
  def apply(adjustListItemSelectionBounds: Rect => Unit): SelectionBoundsAdjuster = {
    val __obj = js.Dynamic.literal(adjustListItemSelectionBounds = js.Any.fromFunction1(adjustListItemSelectionBounds))
    __obj.asInstanceOf[SelectionBoundsAdjuster]
  }
  
  @scala.inline
  implicit class SelectionBoundsAdjusterOps[Self <: SelectionBoundsAdjuster] (val x: Self) extends AnyVal {
    
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
    def setAdjustListItemSelectionBounds(value: Rect => Unit): Self = this.set("adjustListItemSelectionBounds", js.Any.fromFunction1(value))
  }
}
