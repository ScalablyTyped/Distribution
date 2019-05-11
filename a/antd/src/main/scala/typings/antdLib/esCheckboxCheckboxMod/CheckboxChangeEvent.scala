package typings
package antdLib.esCheckboxCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxChangeEvent extends js.Object {
  var nativeEvent: stdLib.MouseEvent
  var target: CheckboxChangeEventTarget
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}

object CheckboxChangeEvent {
  @scala.inline
  def apply(
    nativeEvent: stdLib.MouseEvent,
    preventDefault: () => scala.Unit,
    stopPropagation: () => scala.Unit,
    target: CheckboxChangeEventTarget
  ): CheckboxChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent, preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target)
  
    __obj.asInstanceOf[CheckboxChangeEvent]
  }
}

