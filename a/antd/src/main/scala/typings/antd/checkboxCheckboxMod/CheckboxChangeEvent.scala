package typings.antd.checkboxCheckboxMod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxChangeEvent extends js.Object {
  var nativeEvent: MouseEvent = js.native
  var target: CheckboxChangeEventTarget = js.native
  def preventDefault(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

object CheckboxChangeEvent {
  @scala.inline
  def apply(
    nativeEvent: MouseEvent,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: CheckboxChangeEventTarget
  ): CheckboxChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxChangeEvent]
  }
  @scala.inline
  implicit class CheckboxChangeEventOps[Self <: CheckboxChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNativeEvent(value: MouseEvent): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
    @scala.inline
    def setTarget(value: CheckboxChangeEventTarget): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

