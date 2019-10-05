package typings.androiduix.android.widget.NumberPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScrollListener extends js.Object {
  def onScrollStateChange(view: typings.androiduix.android.widget.NumberPicker, scrollState: Double): Unit
}

@JSGlobal("android.widget.NumberPicker.OnScrollListener")
@js.native
object OnScrollListener extends js.Object {
  var SCROLL_STATE_FLING: Double = js.native
  var SCROLL_STATE_IDLE: Double = js.native
  var SCROLL_STATE_TOUCH_SCROLL: Double = js.native
}

