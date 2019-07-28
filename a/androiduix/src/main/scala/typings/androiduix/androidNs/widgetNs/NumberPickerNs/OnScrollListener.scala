package typings.androiduix.androidNs.widgetNs.NumberPickerNs

import typings.androiduix.androidNs.widgetNs.NumberPicker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScrollListener extends js.Object {
  def onScrollStateChange(view: NumberPicker, scrollState: Double): Unit
}

object OnScrollListener {
  @scala.inline
  def apply(onScrollStateChange: (NumberPicker, Double) => Unit): OnScrollListener = {
    val __obj = js.Dynamic.literal(onScrollStateChange = js.Any.fromFunction2(onScrollStateChange))
  
    __obj.asInstanceOf[OnScrollListener]
  }
}

