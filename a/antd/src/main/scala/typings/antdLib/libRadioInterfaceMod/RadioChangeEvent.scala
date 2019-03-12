package typings
package antdLib.libRadioInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioChangeEvent extends js.Object {
  var nativeEvent: stdLib.MouseEvent
  var target: RadioChangeEventTarget
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}

object RadioChangeEvent {
  @scala.inline
  def apply(
    nativeEvent: stdLib.MouseEvent,
    preventDefault: () => scala.Unit,
    stopPropagation: () => scala.Unit,
    target: RadioChangeEventTarget
  ): RadioChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent, preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target)
  
    __obj.asInstanceOf[RadioChangeEvent]
  }
}

