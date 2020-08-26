package typings.androiduix.android.widget.NumberPicker

import typings.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PressedStateHelper extends Runnable {
  var MODE_PRESS: js.Any = js.native
  var MODE_TAPPED: js.Any = js.native
  var _NumberPicker_this: typings.androiduix.android.widget.NumberPicker = js.native
  var mManagedButton: js.Any = js.native
  var mMode: js.Any = js.native
  def buttonPressDelayed(button: Double): Unit = js.native
  def buttonTapped(button: Double): Unit = js.native
  def cancel(): Unit = js.native
}

object PressedStateHelper {
  @scala.inline
  def apply(
    MODE_PRESS: js.Any,
    MODE_TAPPED: js.Any,
    _NumberPicker_this: typings.androiduix.android.widget.NumberPicker,
    buttonPressDelayed: Double => Unit,
    buttonTapped: Double => Unit,
    cancel: () => Unit,
    mManagedButton: js.Any,
    mMode: js.Any,
    run: () => js.Any
  ): PressedStateHelper = {
    val __obj = js.Dynamic.literal(MODE_PRESS = MODE_PRESS.asInstanceOf[js.Any], MODE_TAPPED = MODE_TAPPED.asInstanceOf[js.Any], _NumberPicker_this = _NumberPicker_this.asInstanceOf[js.Any], buttonPressDelayed = js.Any.fromFunction1(buttonPressDelayed), buttonTapped = js.Any.fromFunction1(buttonTapped), cancel = js.Any.fromFunction0(cancel), mManagedButton = mManagedButton.asInstanceOf[js.Any], mMode = mMode.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[PressedStateHelper]
  }
  @scala.inline
  implicit class PressedStateHelperOps[Self <: PressedStateHelper] (val x: Self) extends AnyVal {
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
    def setMODE_PRESS(value: js.Any): Self = this.set("MODE_PRESS", value.asInstanceOf[js.Any])
    @scala.inline
    def setMODE_TAPPED(value: js.Any): Self = this.set("MODE_TAPPED", value.asInstanceOf[js.Any])
    @scala.inline
    def set_NumberPicker_this(value: typings.androiduix.android.widget.NumberPicker): Self = this.set("_NumberPicker_this", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonPressDelayed(value: Double => Unit): Self = this.set("buttonPressDelayed", js.Any.fromFunction1(value))
    @scala.inline
    def setButtonTapped(value: Double => Unit): Self = this.set("buttonTapped", js.Any.fromFunction1(value))
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setMManagedButton(value: js.Any): Self = this.set("mManagedButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setMMode(value: js.Any): Self = this.set("mMode", value.asInstanceOf[js.Any])
  }
  
}

