package typings.androiduix.android.view.View

import typings.androiduix.android.view.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGenericMotionListener extends js.Object {
  def onGenericMotion(v: typings.androiduix.android.view.View, event: MotionEvent): js.Any
}

@JSGlobal("android.view.View.OnGenericMotionListener")
@js.native
object OnGenericMotionListener extends js.Object {
  def fromFunction(func: js.Function2[/* v */ typings.androiduix.android.view.View, /* event */ MotionEvent, Unit]): OnGenericMotionListener = js.native
}

