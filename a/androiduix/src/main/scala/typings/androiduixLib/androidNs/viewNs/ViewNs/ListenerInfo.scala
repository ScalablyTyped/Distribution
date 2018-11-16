package typings
package androiduixLib.androidNs.viewNs.ViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.View.ListenerInfo")
@js.native
class ListenerInfo () extends js.Object {
  var mOnAttachStateChangeListeners: androiduixLib.javaNs.langNs.utilNs.concurrentNs.CopyOnWriteArrayList[OnAttachStateChangeListener] = js.native
  var mOnClickListener: OnClickListener = js.native
  var mOnFocusChangeListener: OnFocusChangeListener = js.native
  var mOnGenericMotionListener: OnGenericMotionListener = js.native
  var mOnKeyListener: OnKeyListener = js.native
  var mOnLayoutChangeListeners: androiduixLib.javaNs.utilNs.ArrayList[OnLayoutChangeListener] = js.native
  var mOnLongClickListener: OnLongClickListener = js.native
  var mOnTouchListener: OnTouchListener = js.native
}

