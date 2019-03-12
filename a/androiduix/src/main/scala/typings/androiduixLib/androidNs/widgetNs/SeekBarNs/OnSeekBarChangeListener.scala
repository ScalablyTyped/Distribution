package typings
package androiduixLib.androidNs.widgetNs.SeekBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSeekBarChangeListener extends js.Object {
  def onProgressChanged(seekBar: androiduixLib.androidNs.widgetNs.SeekBar, progress: scala.Double, fromUser: scala.Boolean): scala.Unit
  def onStartTrackingTouch(seekBar: androiduixLib.androidNs.widgetNs.SeekBar): scala.Unit
  def onStopTrackingTouch(seekBar: androiduixLib.androidNs.widgetNs.SeekBar): scala.Unit
}

object OnSeekBarChangeListener {
  @scala.inline
  def apply(
    onProgressChanged: (androiduixLib.androidNs.widgetNs.SeekBar, scala.Double, scala.Boolean) => scala.Unit,
    onStartTrackingTouch: androiduixLib.androidNs.widgetNs.SeekBar => scala.Unit,
    onStopTrackingTouch: androiduixLib.androidNs.widgetNs.SeekBar => scala.Unit
  ): OnSeekBarChangeListener = {
    val __obj = js.Dynamic.literal(onProgressChanged = js.Any.fromFunction3(onProgressChanged), onStartTrackingTouch = js.Any.fromFunction1(onStartTrackingTouch), onStopTrackingTouch = js.Any.fromFunction1(onStopTrackingTouch))
  
    __obj.asInstanceOf[OnSeekBarChangeListener]
  }
}

