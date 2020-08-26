package typings.androiduix.android.widget.AbsListView

import typings.androiduix.android.widget.OverScroller
import typings.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlingRunnable extends Runnable {
  var _AbsListView_this: typings.androiduix.android.widget.AbsListView = js.native
  var mCheckFlywheel: js.Any = js.native
  var mLastFlingY: js.Any = js.native
  var mScroller: OverScroller = js.native
  /* private */ def edgeReached(delta: js.Any): js.Any = js.native
  def endFling(): Unit = js.native
  def flywheelTouch(): Unit = js.native
  def start(initialVelocity: Double): Unit = js.native
  def startOverfling(initialVelocity: Double): Unit = js.native
  def startScroll(distance: Double, duration: Double, linear: Boolean): Unit = js.native
  def startSpringback(): Unit = js.native
}

object FlingRunnable {
  @scala.inline
  def apply(
    _AbsListView_this: typings.androiduix.android.widget.AbsListView,
    edgeReached: js.Any => js.Any,
    endFling: () => Unit,
    flywheelTouch: () => Unit,
    mCheckFlywheel: js.Any,
    mLastFlingY: js.Any,
    mScroller: OverScroller,
    run: () => js.Any,
    start: Double => Unit,
    startOverfling: Double => Unit,
    startScroll: (Double, Double, Boolean) => Unit,
    startSpringback: () => Unit
  ): FlingRunnable = {
    val __obj = js.Dynamic.literal(_AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], edgeReached = js.Any.fromFunction1(edgeReached), endFling = js.Any.fromFunction0(endFling), flywheelTouch = js.Any.fromFunction0(flywheelTouch), mCheckFlywheel = mCheckFlywheel.asInstanceOf[js.Any], mLastFlingY = mLastFlingY.asInstanceOf[js.Any], mScroller = mScroller.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), start = js.Any.fromFunction1(start), startOverfling = js.Any.fromFunction1(startOverfling), startScroll = js.Any.fromFunction3(startScroll), startSpringback = js.Any.fromFunction0(startSpringback))
    __obj.asInstanceOf[FlingRunnable]
  }
  @scala.inline
  implicit class FlingRunnableOps[Self <: FlingRunnable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_AbsListView_this(value: typings.androiduix.android.widget.AbsListView): Self = this.set("_AbsListView_this", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdgeReached(value: js.Any => js.Any): Self = this.set("edgeReached", js.Any.fromFunction1(value))
    @scala.inline
    def setEndFling(value: () => Unit): Self = this.set("endFling", js.Any.fromFunction0(value))
    @scala.inline
    def setFlywheelTouch(value: () => Unit): Self = this.set("flywheelTouch", js.Any.fromFunction0(value))
    @scala.inline
    def setMCheckFlywheel(value: js.Any): Self = this.set("mCheckFlywheel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMLastFlingY(value: js.Any): Self = this.set("mLastFlingY", value.asInstanceOf[js.Any])
    @scala.inline
    def setMScroller(value: OverScroller): Self = this.set("mScroller", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def setStartOverfling(value: Double => Unit): Self = this.set("startOverfling", js.Any.fromFunction1(value))
    @scala.inline
    def setStartScroll(value: (Double, Double, Boolean) => Unit): Self = this.set("startScroll", js.Any.fromFunction3(value))
    @scala.inline
    def setStartSpringback(value: () => Unit): Self = this.set("startSpringback", js.Any.fromFunction0(value))
  }
  
}

