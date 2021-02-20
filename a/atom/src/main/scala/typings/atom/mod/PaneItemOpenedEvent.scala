package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaneItemOpenedEvent extends PaneItemObservedEvent {
  
  var uri: String = js.native
}
object PaneItemOpenedEvent {
  
  @scala.inline
  def apply(index: Double, item: js.Object, pane: Pane, uri: String): PaneItemOpenedEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneItemOpenedEvent]
  }
  
  @scala.inline
  implicit class PaneItemOpenedEventMutableBuilder[Self <: PaneItemOpenedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
