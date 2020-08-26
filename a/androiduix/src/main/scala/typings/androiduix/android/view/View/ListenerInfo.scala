package typings.androiduix.android.view.View

import typings.androiduix.java_.lang.util.concurrent.CopyOnWriteArrayList
import typings.androiduix.java_.util.ArrayList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerInfo extends js.Object {
  var mOnAttachStateChangeListeners: CopyOnWriteArrayList[OnAttachStateChangeListener] = js.native
  var mOnClickListener: OnClickListener = js.native
  var mOnFocusChangeListener: OnFocusChangeListener = js.native
  var mOnGenericMotionListener: OnGenericMotionListener = js.native
  var mOnKeyListener: OnKeyListener = js.native
  var mOnLayoutChangeListeners: ArrayList[OnLayoutChangeListener] = js.native
  var mOnLongClickListener: OnLongClickListener = js.native
  var mOnTouchListener: OnTouchListener = js.native
}

object ListenerInfo {
  @scala.inline
  def apply(
    mOnAttachStateChangeListeners: CopyOnWriteArrayList[OnAttachStateChangeListener],
    mOnClickListener: OnClickListener,
    mOnFocusChangeListener: OnFocusChangeListener,
    mOnGenericMotionListener: OnGenericMotionListener,
    mOnKeyListener: OnKeyListener,
    mOnLayoutChangeListeners: ArrayList[OnLayoutChangeListener],
    mOnLongClickListener: OnLongClickListener,
    mOnTouchListener: OnTouchListener
  ): ListenerInfo = {
    val __obj = js.Dynamic.literal(mOnAttachStateChangeListeners = mOnAttachStateChangeListeners.asInstanceOf[js.Any], mOnClickListener = mOnClickListener.asInstanceOf[js.Any], mOnFocusChangeListener = mOnFocusChangeListener.asInstanceOf[js.Any], mOnGenericMotionListener = mOnGenericMotionListener.asInstanceOf[js.Any], mOnKeyListener = mOnKeyListener.asInstanceOf[js.Any], mOnLayoutChangeListeners = mOnLayoutChangeListeners.asInstanceOf[js.Any], mOnLongClickListener = mOnLongClickListener.asInstanceOf[js.Any], mOnTouchListener = mOnTouchListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerInfo]
  }
  @scala.inline
  implicit class ListenerInfoOps[Self <: ListenerInfo] (val x: Self) extends AnyVal {
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
    def setMOnAttachStateChangeListeners(value: CopyOnWriteArrayList[OnAttachStateChangeListener]): Self = this.set("mOnAttachStateChangeListeners", value.asInstanceOf[js.Any])
    @scala.inline
    def setMOnClickListener(value: OnClickListener): Self = this.set("mOnClickListener", value.asInstanceOf[js.Any])
    @scala.inline
    def setMOnFocusChangeListener(value: OnFocusChangeListener): Self = this.set("mOnFocusChangeListener", value.asInstanceOf[js.Any])
    @scala.inline
    def setMOnGenericMotionListener(value: OnGenericMotionListener): Self = this.set("mOnGenericMotionListener", value.asInstanceOf[js.Any])
    @scala.inline
    def setMOnKeyListener(value: OnKeyListener): Self = this.set("mOnKeyListener", value.asInstanceOf[js.Any])
    @scala.inline
    def setMOnLayoutChangeListeners(value: ArrayList[OnLayoutChangeListener]): Self = this.set("mOnLayoutChangeListeners", value.asInstanceOf[js.Any])
    @scala.inline
    def setMOnLongClickListener(value: OnLongClickListener): Self = this.set("mOnLongClickListener", value.asInstanceOf[js.Any])
    @scala.inline
    def setMOnTouchListener(value: OnTouchListener): Self = this.set("mOnTouchListener", value.asInstanceOf[js.Any])
  }
  
}

