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
    onProgressChanged: js.Function3[androiduixLib.androidNs.widgetNs.SeekBar, scala.Double, scala.Boolean, scala.Unit],
    onStartTrackingTouch: js.Function1[androiduixLib.androidNs.widgetNs.SeekBar, scala.Unit],
    onStopTrackingTouch: js.Function1[androiduixLib.androidNs.widgetNs.SeekBar, scala.Unit]
  ): OnSeekBarChangeListener = {
    val __obj = js.Dynamic.literal(onProgressChanged = onProgressChanged, onStartTrackingTouch = onStartTrackingTouch, onStopTrackingTouch = onStopTrackingTouch)
  
    __obj.asInstanceOf[OnSeekBarChangeListener]
  }
}

