package typings
package agDashGridLib.distLibWidgetsComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibleChangedEvent
  extends agDashGridLib.distLibEventsMod.AgEvent {
  var visible: scala.Boolean
}

object VisibleChangedEvent {
  @scala.inline
  def apply(`type`: java.lang.String, visible: scala.Boolean): VisibleChangedEvent = {
    val __obj = js.Dynamic.literal(visible = visible)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VisibleChangedEvent]
  }
}

