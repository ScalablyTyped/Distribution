package typings.androiduix.androidNs.widgetNs.AbsListViewNs

import typings.androiduix.androidNs.widgetNs.AbsListView
import typings.androiduix.androidNs.widgetNs.OverScroller
import typings.androiduix.javaNs.langNs.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.AbsListView.FlingRunnable")
@js.native
class FlingRunnable protected () extends Runnable {
  def this(arg: AbsListView) = this()
  var _AbsListView_this: AbsListView = js.native
  var mCheckFlywheel: js.Any = js.native
  var mLastFlingY: js.Any = js.native
  var mScroller: OverScroller = js.native
  /* private */ def edgeReached(delta: js.Any): js.Any = js.native
  def endFling(): Unit = js.native
  def flywheelTouch(): Unit = js.native
  /* CompleteClass */
  override def run(): js.Any = js.native
  def start(initialVelocity: Double): Unit = js.native
  def startOverfling(initialVelocity: Double): Unit = js.native
  def startScroll(distance: Double, duration: Double, linear: Boolean): Unit = js.native
  def startSpringback(): Unit = js.native
}

/* static members */
@JSGlobal("android.widget.AbsListView.FlingRunnable")
@js.native
object FlingRunnable extends js.Object {
  var FLYWHEEL_TIMEOUT: Double = js.native
}

