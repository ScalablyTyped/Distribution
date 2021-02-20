package typings.atom.anon

import typings.atom.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewExtent extends StObject {
  
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
  implicit class NewExtentMutableBuilder[Self <: NewExtent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewExtent(value: Point): Self = StObject.set(x, "newExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldExtent(value: Point): Self = StObject.set(x, "oldExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
