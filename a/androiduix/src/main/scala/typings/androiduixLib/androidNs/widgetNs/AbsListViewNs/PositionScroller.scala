package typings
package androiduixLib.androidNs.widgetNs.AbsListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.AbsListView.PositionScroller")
@js.native
class PositionScroller protected ()
  extends androiduixLib.javaNs.langNs.Runnable {
  def this(arg: androiduixLib.androidNs.widgetNs.AbsListView) = this()
  var _AbsListView_this: androiduixLib.androidNs.widgetNs.AbsListView = js.native
  var mBoundPos: js.Any = js.native
  var mExtraScroll: js.Any = js.native
  var mLastSeenPos: js.Any = js.native
  var mMode: js.Any = js.native
  var mOffsetFromTop: js.Any = js.native
  var mScrollDuration: js.Any = js.native
  var mTargetPos: js.Any = js.native
  /* private */ def _start_1(position: js.Any): js.Any = js.native
  /* private */ def _start_2(position: js.Any, boundPosition: js.Any): js.Any = js.native
  /* CompleteClass */
  override def run(): js.Any = js.native
  /* private */ def scrollToVisible(targetPos: js.Any, boundPos: js.Any, duration: js.Any): js.Any = js.native
  def start(position: scala.Double): scala.Unit = js.native
  def start(position: scala.Double, boundPosition: scala.Double): scala.Unit = js.native
  def startWithOffset(position: scala.Double, offset: scala.Double): scala.Unit = js.native
  def startWithOffset(position: scala.Double, offset: scala.Double, duration: scala.Double): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.widget.AbsListView.PositionScroller")
@js.native
object PositionScroller extends js.Object {
  var MOVE_DOWN_BOUND: js.Any = js.native
  var MOVE_DOWN_POS: js.Any = js.native
  var MOVE_OFFSET: js.Any = js.native
  var MOVE_UP_BOUND: js.Any = js.native
  var MOVE_UP_POS: js.Any = js.native
  var SCROLL_DURATION: js.Any = js.native
}

