package typings.androiduix.androidNs.viewNs.ViewNs

import typings.androiduix.javaNs.langNs.utilNs.concurrentNs.CopyOnWriteArrayList
import typings.androiduix.javaNs.utilNs.ArrayList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.View.ListenerInfo")
@js.native
class ListenerInfo () extends js.Object {
  var mOnAttachStateChangeListeners: CopyOnWriteArrayList[OnAttachStateChangeListener] = js.native
  var mOnClickListener: OnClickListener = js.native
  var mOnFocusChangeListener: OnFocusChangeListener = js.native
  var mOnGenericMotionListener: OnGenericMotionListener = js.native
  var mOnKeyListener: OnKeyListener = js.native
  var mOnLayoutChangeListeners: ArrayList[OnLayoutChangeListener] = js.native
  var mOnLongClickListener: OnLongClickListener = js.native
  var mOnTouchListener: OnTouchListener = js.native
}

