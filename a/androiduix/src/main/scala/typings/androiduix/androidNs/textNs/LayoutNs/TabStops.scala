package typings.androiduix.androidNs.textNs.LayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.Layout.TabStops")
@js.native
class TabStops protected () extends js.Object {
  def this(increment: Double, spans: js.Array[_]) = this()
  var mIncrement: js.Any = js.native
  var mNumStops: js.Any = js.native
  var mStops: js.Any = js.native
  def nextTab(h: Double): Double = js.native
  def reset(increment: Double, spans: js.Array[_]): Unit = js.native
}

/* static members */
@JSGlobal("android.text.Layout.TabStops")
@js.native
object TabStops extends js.Object {
  def nextDefaultStop(h: Double, inc: Double): Double = js.native
}

