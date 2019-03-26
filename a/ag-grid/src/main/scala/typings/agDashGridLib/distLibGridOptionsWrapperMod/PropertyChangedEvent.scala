package typings
package agDashGridLib.distLibGridOptionsWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyChangedEvent
  extends agDashGridLib.distLibEventsMod.AgEvent {
  var currentValue: js.Any
  var previousValue: js.Any
}

object PropertyChangedEvent {
  @scala.inline
  def apply(currentValue: js.Any, previousValue: js.Any, `type`: java.lang.String): PropertyChangedEvent = {
    val __obj = js.Dynamic.literal(currentValue = currentValue, previousValue = previousValue)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PropertyChangedEvent]
  }
}

