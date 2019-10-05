package typings.androiduix.android.view.View

import typings.androiduix.android.view.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnTouchListener extends js.Object {
  def onTouch(v: typings.androiduix.android.view.View, event: MotionEvent): Unit
}

@JSGlobal("android.view.View.OnTouchListener")
@js.native
object OnTouchListener extends js.Object {
  def fromFunction(func: js.Function2[/* v */ typings.androiduix.android.view.View, /* event */ MotionEvent, Unit]): OnTouchListener = js.native
}

