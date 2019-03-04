package typings
package antdLib.libRadioInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioChangeEvent extends js.Object {
  var nativeEvent: reactLib.MouseEvent
  var target: RadioChangeEventTarget
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}

object RadioChangeEvent {
  @scala.inline
  def apply(
    nativeEvent: reactLib.MouseEvent,
    preventDefault: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: RadioChangeEventTarget
  ): RadioChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent, preventDefault = preventDefault, stopPropagation = stopPropagation, target = target)
  
    __obj.asInstanceOf[RadioChangeEvent]
  }
}

