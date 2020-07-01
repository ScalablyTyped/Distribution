package typings.atlassianConnectJs.AP.dialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogButton extends js.Object {
  /**
    * Sets the button state to disabled. A disabled button cannot be clicked and emits no events.
    */
  def disable(): Unit
  /**
    * Sets the button state to enabled
    */
  def enable(): Unit
  /**
    * Sets the button state to hidden
    */
  def hide(): Unit
  /**
    * Query a button for its current state.
    * @param callback function to receive the button state.
    */
  def isEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit
  /**
    * Query a button for its current hidden/visible state.
    * @param callback function to receive the button state.
    */
  def isHidden(callback: js.Function1[/* hidden */ Boolean, Unit]): Unit
  /**
    * Sets the button state to visible
    */
  def show(): Unit
  /**
    * Toggle the button state between enabled and disabled.
    */
  def toggle(): Unit
  /**
    * Trigger a callback bound to a button.
    */
  def trigger(): Unit
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
}

