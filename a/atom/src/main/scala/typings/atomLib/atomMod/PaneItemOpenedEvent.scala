package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneItemOpenedEvent extends PaneItemObservedEvent {
  var uri: java.lang.String
}

object PaneItemOpenedEvent {
  @scala.inline
  def apply(index: scala.Double, item: js.Object, pane: Pane, uri: java.lang.String): PaneItemOpenedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("pane")(pane)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[PaneItemOpenedEvent]
  }
}

