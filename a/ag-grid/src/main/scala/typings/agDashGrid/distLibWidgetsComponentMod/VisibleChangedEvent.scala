package typings.agDashGrid.distLibWidgetsComponentMod

import typings.agDashGrid.distLibEventsMod.AgEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibleChangedEvent extends AgEvent {
  var visible: Boolean
}

object VisibleChangedEvent {
  @scala.inline
  def apply(`type`: String, visible: Boolean): VisibleChangedEvent = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibleChangedEvent]
  }
}

