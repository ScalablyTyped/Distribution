package typings.androiduix.androidNs.widgetNs.ListPopupWindowNs

import typings.androiduix.androidNs.viewNs.MotionEvent
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.ViewNs.OnAttachStateChangeListener
import typings.androiduix.androidNs.viewNs.ViewNs.OnTouchListener
import typings.androiduix.androidNs.widgetNs.ListPopupWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ListPopupWindow.ForwardingListener")
@js.native
abstract class ForwardingListener protected ()
  extends OnTouchListener
     with OnAttachStateChangeListener {
  def this(src: View) = this()
  var mActivePointerId: js.Any = js.native
  var mDisallowIntercept: js.Any = js.native
  var mForwarding: js.Any = js.native
  var mScaledTouchSlop: js.Any = js.native
  var mSrc: js.Any = js.native
  var mTapTimeout: js.Any = js.native
  def getPopup(): ListPopupWindow = js.native
  /* protected */ def onForwardingStarted(): Boolean = js.native
  /* protected */ def onForwardingStopped(): Boolean = js.native
  /* CompleteClass */
  override def onTouch(v: View, event: MotionEvent): Unit = js.native
  /* private */ def onTouchForwarded(srcEvent: js.Any): js.Any = js.native
  /* private */ def onTouchObserved(srcEvent: js.Any): js.Any = js.native
  /* CompleteClass */
  override def onViewAttachedToWindow(v: View): js.Any = js.native
  /* CompleteClass */
  override def onViewDetachedFromWindow(v: View): js.Any = js.native
}

