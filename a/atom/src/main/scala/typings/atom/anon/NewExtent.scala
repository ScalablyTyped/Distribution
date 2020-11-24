package typings.atom.anon

import typings.atom.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewExtent extends js.Object {
  
  /** A Point representing the replacement extent. */
  var newExtent: Point = js.native
  
  /** A String representing the replacement text. */
  var newText: String = js.native
  
  /** A Point representing the replaced extent. */
  var oldExtent: Point = js.native
  
  /** A Point representing where the change started. */
  var start: Point = js.native
}
object NewExtent {
  
  @scala.inline
  def apply(newExtent: Point, newText: String, oldExtent: Point, start: Point): NewExtent = {
    val __obj = js.Dynamic.literal(newExtent = newExtent.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldExtent = oldExtent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewExtent]
  }
  
  @scala.inline
  implicit class NewExtentOps[Self <: NewExtent] (val x: Self) extends AnyVal {
    
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
    def setNewExtent(value: Point): Self = this.set("newExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewText(value: String): Self = this.set("newText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldExtent(value: Point): Self = this.set("oldExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Point): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
