package typings.androiduix.android.widget.SeekBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSeekBarChangeListener extends js.Object {
  def onProgressChanged(seekBar: typings.androiduix.android.widget.SeekBar, progress: Double, fromUser: Boolean): Unit = js.native
  def onStartTrackingTouch(seekBar: typings.androiduix.android.widget.SeekBar): Unit = js.native
  def onStopTrackingTouch(seekBar: typings.androiduix.android.widget.SeekBar): Unit = js.native
}

object OnSeekBarChangeListener {
  @scala.inline
  def apply(
    onProgressChanged: (typings.androiduix.android.widget.SeekBar, Double, Boolean) => Unit,
    onStartTrackingTouch: typings.androiduix.android.widget.SeekBar => Unit,
    onStopTrackingTouch: typings.androiduix.android.widget.SeekBar => Unit
  ): OnSeekBarChangeListener = {
    val __obj = js.Dynamic.literal(onProgressChanged = js.Any.fromFunction3(onProgressChanged), onStartTrackingTouch = js.Any.fromFunction1(onStartTrackingTouch), onStopTrackingTouch = js.Any.fromFunction1(onStopTrackingTouch))
    __obj.asInstanceOf[OnSeekBarChangeListener]
  }
  @scala.inline
  implicit class OnSeekBarChangeListenerOps[Self <: OnSeekBarChangeListener] (val x: Self) extends AnyVal {
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
    def setOnProgressChanged(value: (typings.androiduix.android.widget.SeekBar, Double, Boolean) => Unit): Self = this.set("onProgressChanged", js.Any.fromFunction3(value))
    @scala.inline
    def setOnStartTrackingTouch(value: typings.androiduix.android.widget.SeekBar => Unit): Self = this.set("onStartTrackingTouch", js.Any.fromFunction1(value))
    @scala.inline
    def setOnStopTrackingTouch(value: typings.androiduix.android.widget.SeekBar => Unit): Self = this.set("onStopTrackingTouch", js.Any.fromFunction1(value))
  }
  
}

