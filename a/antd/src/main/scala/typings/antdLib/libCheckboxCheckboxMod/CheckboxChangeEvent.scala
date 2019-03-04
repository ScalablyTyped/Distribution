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
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent, preventDefault = preventDefault, stopPropagation = stopPropagation, target = target)
  
    __obj.asInstanceOf[CheckboxChangeEvent]
  }
}

