package typings.agGrid.gridOptionsWrapperMod

import typings.agGrid.eventsMod.AgEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyChangedEvent extends AgEvent {
  var currentValue: js.Any
  var previousValue: js.Any
}

object PropertyChangedEvent {
  @scala.inline
  def apply(currentValue: js.Any, previousValue: js.Any, `type`: String): PropertyChangedEvent = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyChangedEvent]
  }
}

