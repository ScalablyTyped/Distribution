package typings.atom.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneItemOpenedEvent extends PaneItemObservedEvent {
  var uri: String
}

object PaneItemOpenedEvent {
  @scala.inline
  def apply(index: Double, item: js.Object, pane: Pane, uri: String): PaneItemOpenedEvent = {
    val __obj = js.Dynamic.literal(index = index, item = item, pane = pane, uri = uri)
  
    __obj.asInstanceOf[PaneItemOpenedEvent]
  }
}

