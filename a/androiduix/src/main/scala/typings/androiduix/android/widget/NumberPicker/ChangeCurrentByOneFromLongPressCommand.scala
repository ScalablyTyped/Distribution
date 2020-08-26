package typings.androiduix.android.widget.NumberPicker

import typings.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeCurrentByOneFromLongPressCommand extends Runnable {
  var _NumberPicker_this: typings.androiduix.android.widget.NumberPicker = js.native
  var mIncrement: js.Any = js.native
  def setStep(increment: Boolean): Unit = js.native
}

object ChangeCurrentByOneFromLongPressCommand {
  @scala.inline
  def apply(
    _NumberPicker_this: typings.androiduix.android.widget.NumberPicker,
    mIncrement: js.Any,
    run: () => js.Any,
    setStep: Boolean => Unit
  ): ChangeCurrentByOneFromLongPressCommand = {
    val __obj = js.Dynamic.literal(_NumberPicker_this = _NumberPicker_this.asInstanceOf[js.Any], mIncrement = mIncrement.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), setStep = js.Any.fromFunction1(setStep))
    __obj.asInstanceOf[ChangeCurrentByOneFromLongPressCommand]
  }
  @scala.inline
  implicit class ChangeCurrentByOneFromLongPressCommandOps[Self <: ChangeCurrentByOneFromLongPressCommand] (val x: Self) extends AnyVal {
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
    def set_NumberPicker_this(value: typings.androiduix.android.widget.NumberPicker): Self = this.set("_NumberPicker_this", value.asInstanceOf[js.Any])
    @scala.inline
    def setMIncrement(value: js.Any): Self = this.set("mIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetStep(value: Boolean => Unit): Self = this.set("setStep", js.Any.fromFunction1(value))
  }
  
}

