package typings.androiduix.android.widget.NumberPicker

import typings.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeginSoftInputOnLongPressCommand extends Runnable {
  var _NumberPicker_this: typings.androiduix.android.widget.NumberPicker = js.native
}

object BeginSoftInputOnLongPressCommand {
  @scala.inline
  def apply(_NumberPicker_this: typings.androiduix.android.widget.NumberPicker, run: () => js.Any): BeginSoftInputOnLongPressCommand = {
    val __obj = js.Dynamic.literal(_NumberPicker_this = _NumberPicker_this.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[BeginSoftInputOnLongPressCommand]
  }
  @scala.inline
  implicit class BeginSoftInputOnLongPressCommandOps[Self <: BeginSoftInputOnLongPressCommand] (val x: Self) extends AnyVal {
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
  }
  
}

