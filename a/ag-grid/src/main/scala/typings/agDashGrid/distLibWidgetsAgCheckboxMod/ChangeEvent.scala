package typings.agDashGrid.distLibWidgetsAgCheckboxMod

import typings.agDashGrid.distLibEventsMod.AgEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEvent extends AgEvent {
  var selected: Boolean
}

object ChangeEvent {
  @scala.inline
  def apply(selected: Boolean, `type`: String): ChangeEvent = {
    val __obj = js.Dynamic.literal(selected = selected)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChangeEvent]
  }
}

