package typings
package androiduixLib.androidNs.textNs.LayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.Layout.TabStops")
@js.native
class TabStops protected () extends js.Object {
  def this(increment: scala.Double, spans: js.Array[_]) = this()
  var mIncrement: js.Any = js.native
  var mNumStops: js.Any = js.native
  var mStops: js.Any = js.native
  def nextTab(h: scala.Double): scala.Double = js.native
  def reset(increment: scala.Double, spans: js.Array[_]): scala.Unit = js.native
}

@JSGlobal("android.text.Layout.TabStops")
@js.native
object TabStops extends js.Object {
  def nextDefaultStop(h: scala.Double, inc: scala.Double): scala.Double = js.native
}

