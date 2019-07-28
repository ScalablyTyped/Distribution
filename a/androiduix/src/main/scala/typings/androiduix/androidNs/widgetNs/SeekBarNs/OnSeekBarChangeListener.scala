package typings.androiduix.androidNs.widgetNs.SeekBarNs

import typings.androiduix.androidNs.widgetNs.SeekBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSeekBarChangeListener extends js.Object {
  def onProgressChanged(seekBar: SeekBar, progress: Double, fromUser: Boolean): Unit
  def onStartTrackingTouch(seekBar: SeekBar): Unit
  def onStopTrackingTouch(seekBar: SeekBar): Unit
}

object OnSeekBarChangeListener {
  @scala.inline
  def apply(
    onProgressChanged: (SeekBar, Double, Boolean) => Unit,
    onStartTrackingTouch: SeekBar => Unit,
    onStopTrackingTouch: SeekBar => Unit
  ): OnSeekBarChangeListener = {
    val __obj = js.Dynamic.literal(onProgressChanged = js.Any.fromFunction3(onProgressChanged), onStartTrackingTouch = js.Any.fromFunction1(onStartTrackingTouch), onStopTrackingTouch = js.Any.fromFunction1(onStopTrackingTouch))
  
    __obj.asInstanceOf[OnSeekBarChangeListener]
  }
}

