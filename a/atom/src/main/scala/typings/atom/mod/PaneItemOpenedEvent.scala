package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneItemOpenedEvent extends PaneItemObservedEvent {
  var uri: String
}

object PaneItemOpenedEvent {
  @scala.inline
  def apply(index: Double, item: js.Object, pane: Pane, uri: String): PaneItemOpenedEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaneItemOpenedEvent]
  }
}

