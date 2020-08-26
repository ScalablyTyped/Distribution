package typings.atlassianConnectJs.AP.dialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogButton extends js.Object {
  /**
    * Sets the button state to disabled. A disabled button cannot be clicked and emits no events.
    */
  def disable(): Unit = js.native
  /**
    * Sets the button state to enabled
    */
  def enable(): Unit = js.native
  /**
    * Sets the button state to hidden
    */
  def hide(): Unit = js.native
  /**
    * Query a button for its current state.
    * @param callback function to receive the button state.
    */
  def isEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit = js.native
  /**
    * Query a button for its current hidden/visible state.
    * @param callback function to receive the button state.
    */
  def isHidden(callback: js.Function1[/* hidden */ Boolean, Unit]): Unit = js.native
  /**
    * Sets the button state to visible
    */
  def show(): Unit = js.native
  /**
    * Toggle the button state between enabled and disabled.
    */
  def toggle(): Unit = js.native
  /**
    * Trigger a callback bound to a button.
    */
  def trigger(): Unit = js.native
}

object DialogButton {
  @scala.inline
  def apply(
    disable: () => Unit,
    enable: () => Unit,
    hide: () => Unit,
    isEnabled: js.Function1[/* enabled */ Boolean, Unit] => Unit,
    isHidden: js.Function1[/* hidden */ Boolean, Unit] => Unit,
    show: () => Unit,
    toggle: () => Unit,
    trigger: () => Unit
  ): DialogButton = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), hide = js.Any.fromFunction0(hide), isEnabled = js.Any.fromFunction1(isEnabled), isHidden = js.Any.fromFunction1(isHidden), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle), trigger = js.Any.fromFunction0(trigger))
    __obj.asInstanceOf[DialogButton]
  }
  @scala.inline
  implicit class DialogButtonOps[Self <: DialogButton] (val x: Self) extends AnyVal {
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
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setIsEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Unit): Self = this.set("isEnabled", js.Any.fromFunction1(value))
    @scala.inline
    def setIsHidden(value: js.Function1[/* hidden */ Boolean, Unit] => Unit): Self = this.set("isHidden", js.Any.fromFunction1(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    @scala.inline
    def setTrigger(value: () => Unit): Self = this.set("trigger", js.Any.fromFunction0(value))
  }
  
}

