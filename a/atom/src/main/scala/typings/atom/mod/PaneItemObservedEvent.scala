package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneItemObservedEvent extends js.Object {
  var index: Double
  var item: js.Object
  var pane: Pane
}

object PaneItemObservedEvent {
  @scala.inline
  def apply(index: Double, item: js.Object, pane: Pane): PaneItemObservedEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaneItemObservedEvent]
  }
}

