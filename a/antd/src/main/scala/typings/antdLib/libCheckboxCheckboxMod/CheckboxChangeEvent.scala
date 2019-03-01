package typings
package antdLib.libCheckboxCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxChangeEvent extends js.Object {
  var nativeEvent: reactLib.MouseEvent
  var target: CheckboxChangeEventTarget
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}

object CheckboxChangeEvent {
  @scala.inline
  def apply(
    nativeEvent: reactLib.MouseEvent,
    preventDefault: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: CheckboxChangeEventTarget
  ): CheckboxChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nativeEvent")(nativeEvent)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[CheckboxChangeEvent]
  }
}

