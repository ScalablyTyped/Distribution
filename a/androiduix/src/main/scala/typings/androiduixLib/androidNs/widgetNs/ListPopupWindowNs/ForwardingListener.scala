package typings
package androiduixLib.androidNs.widgetNs.ListPopupWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ListPopupWindow.ForwardingListener")
@js.native
abstract class ForwardingListener protected ()
  extends androiduixLib.androidNs.viewNs.ViewNs.OnTouchListener
     with androiduixLib.androidNs.viewNs.ViewNs.OnAttachStateChangeListener {
  def this(src: androiduixLib.androidNs.viewNs.View) = this()
  var mActivePointerId: js.Any = js.native
  var mDisallowIntercept: js.Any = js.native
  var mForwarding: js.Any = js.native
  var mScaledTouchSlop: js.Any = js.native
  var mSrc: js.Any = js.native
  var mTapTimeout: js.Any = js.native
  def getPopup(): androiduixLib.androidNs.widgetNs.ListPopupWindow = js.native
  /* protected */ def onForwardingStarted(): scala.Boolean = js.native
  /* protected */ def onForwardingStopped(): scala.Boolean = js.native
  /* CompleteClass */
  override def onTouch(v: androiduixLib.androidNs.viewNs.View, event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Unit = js.native
  /* private */ def onTouchForwarded(srcEvent: js.Any): js.Any = js.native
  /* private */ def onTouchObserved(srcEvent: js.Any): js.Any = js.native
  /* CompleteClass */
  override def onViewAttachedToWindow(v: androiduixLib.androidNs.viewNs.View): js.Any = js.native
  /* CompleteClass */
  override def onViewDetachedFromWindow(v: androiduixLib.androidNs.viewNs.View): js.Any = js.native
}

