package typings.androiduix.android.widget.SeekBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSeekBarChangeListener extends js.Object {
  def onProgressChanged(seekBar: typings.androiduix.android.widget.SeekBar, progress: Double, fromUser: Boolean): Unit
  def onStartTrackingTouch(seekBar: typings.androiduix.android.widget.SeekBar): Unit
  def onStopTrackingTouch(seekBar: typings.androiduix.android.widget.SeekBar): Unit
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
}

