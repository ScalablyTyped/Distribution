package typings.androiduix.android.widget.AbsListView

import typings.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionScroller extends Runnable {
  
  var _AbsListView_this: typings.androiduix.android.widget.AbsListView = js.native
  
  /* private */ def _start_1(position: js.Any): js.Any = js.native
  
  /* private */ def _start_2(position: js.Any, boundPosition: js.Any): js.Any = js.native
  
  var mBoundPos: js.Any = js.native
  
  var mExtraScroll: js.Any = js.native
  
  var mLastSeenPos: js.Any = js.native
  
  var mMode: js.Any = js.native
  
  var mOffsetFromTop: js.Any = js.native
  
  var mScrollDuration: js.Any = js.native
  
  var mTargetPos: js.Any = js.native
  
  /* private */ def scrollToVisible(targetPos: js.Any, boundPos: js.Any, duration: js.Any): js.Any = js.native
  
  def start(position: Double): Unit = js.native
  def start(position: Double, boundPosition: Double): Unit = js.native
  
  def startWithOffset(position: Double, offset: Double): Unit = js.native
  def startWithOffset(position: Double, offset: Double, duration: Double): Unit = js.native
  
  def stop(): Unit = js.native
}
