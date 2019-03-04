package typings
package androiduixLib.androidNs.widgetNs.NumberPickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScrollListener extends js.Object {
  def onScrollStateChange(view: androiduixLib.androidNs.widgetNs.NumberPicker, scrollState: scala.Double): scala.Unit
}

object OnScrollListener {
  @scala.inline
  def apply(
    onScrollStateChange: js.Function2[androiduixLib.androidNs.widgetNs.NumberPicker, scala.Double, scala.Unit]
  ): OnScrollListener = {
    val __obj = js.Dynamic.literal(onScrollStateChange = onScrollStateChange)
  
    __obj.asInstanceOf[OnScrollListener]
  }
}

