package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaneItemObservedEvent extends StObject {
  
  var index: Double = js.native
  
  var item: js.Object = js.native
  
  var pane: Pane = js.native
}
object PaneItemObservedEvent {
  
  @scala.inline
  def apply(index: Double, item: js.Object, pane: Pane): PaneItemObservedEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneItemObservedEvent]
  }
  
  @scala.inline
  implicit class PaneItemObservedEventMutableBuilder[Self <: PaneItemObservedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPane(value: Pane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
  }
}
