package typings
package agDashGridLib.distLibWidgetsAgCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEvent
  extends agDashGridLib.distLibEventsMod.AgEvent {
  var selected: scala.Boolean
}

object ChangeEvent {
  @scala.inline
  def apply(selected: scala.Boolean, `type`: java.lang.String): ChangeEvent = {
    val __obj = js.Dynamic.literal(selected = selected)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChangeEvent]
  }
}

