package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaneItemMovedEvent extends StObject {
  
  /** The removed pane item. */
  var item: js.Object = js.native
  
  /** A number indicating where the item is now located. */
  var newIndex: Double = js.native
  
  /** A number indicating where the item was located. */
  var oldIndex: Double = js.native
}
object PaneItemMovedEvent {
  
  @scala.inline
  def apply(item: js.Object, newIndex: Double, oldIndex: Double): PaneItemMovedEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneItemMovedEvent]
  }
  
  @scala.inline
  implicit class PaneItemMovedEventMutableBuilder[Self <: PaneItemMovedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
  }
}
