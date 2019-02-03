package typings
package androiduixLib.androidNs.widgetNs.AbsListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.AbsListView.FlingRunnable")
@js.native
class FlingRunnable protected ()
  extends androiduixLib.javaNs.langNs.Runnable {
  def this(arg: androiduixLib.androidNs.widgetNs.AbsListView) = this()
  var _AbsListView_this: androiduixLib.androidNs.widgetNs.AbsListView = js.native
  var mCheckFlywheel: js.Any = js.native
  var mLastFlingY: js.Any = js.native
  var mScroller: androiduixLib.androidNs.widgetNs.OverScroller = js.native
  /* private */ def edgeReached(delta: js.Any): js.Any = js.native
  def endFling(): scala.Unit = js.native
  def flywheelTouch(): scala.Unit = js.native
  /* CompleteClass */
  override def run(): js.Any = js.native
  def start(initialVelocity: scala.Double): scala.Unit = js.native
  def startOverfling(initialVelocity: scala.Double): scala.Unit = js.native
  def startScroll(distance: scala.Double, duration: scala.Double, linear: scala.Boolean): scala.Unit = js.native
  def startSpringback(): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.widget.AbsListView.FlingRunnable")
@js.native
object FlingRunnable extends js.Object {
  var FLYWHEEL_TIMEOUT: scala.Double = js.native
}

