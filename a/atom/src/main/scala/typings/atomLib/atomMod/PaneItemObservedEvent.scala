package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneItemObservedEvent extends js.Object {
  var index: scala.Double
  var item: js.Object
  var pane: Pane
}

object PaneItemObservedEvent {
  @scala.inline
  def apply(index: scala.Double, item: js.Object, pane: Pane): PaneItemObservedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("pane")(pane)
    __obj.asInstanceOf[PaneItemObservedEvent]
  }
}

