package typings.androiduix.android.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchDelegate extends js.Object {
  var mBounds: js.Any = js.native
  var mDelegateTargeted: js.Any = js.native
  var mDelegateView: js.Any = js.native
  var mSlop: js.Any = js.native
  var mSlopBounds: js.Any = js.native
  def onTouchEvent(event: MotionEvent): Boolean = js.native
}

object TouchDelegate {
  @scala.inline
  def apply(
    mBounds: js.Any,
    mDelegateTargeted: js.Any,
    mDelegateView: js.Any,
    mSlop: js.Any,
    mSlopBounds: js.Any,
    onTouchEvent: MotionEvent => Boolean
  ): TouchDelegate = {
    val __obj = js.Dynamic.literal(mBounds = mBounds.asInstanceOf[js.Any], mDelegateTargeted = mDelegateTargeted.asInstanceOf[js.Any], mDelegateView = mDelegateView.asInstanceOf[js.Any], mSlop = mSlop.asInstanceOf[js.Any], mSlopBounds = mSlopBounds.asInstanceOf[js.Any], onTouchEvent = js.Any.fromFunction1(onTouchEvent))
    __obj.asInstanceOf[TouchDelegate]
  }
  @scala.inline
  implicit class TouchDelegateOps[Self <: TouchDelegate] (val x: Self) extends AnyVal {
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
    def setMBounds(value: js.Any): Self = this.set("mBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDelegateTargeted(value: js.Any): Self = this.set("mDelegateTargeted", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDelegateView(value: js.Any): Self = this.set("mDelegateView", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSlop(value: js.Any): Self = this.set("mSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSlopBounds(value: js.Any): Self = this.set("mSlopBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTouchEvent(value: MotionEvent => Boolean): Self = this.set("onTouchEvent", js.Any.fromFunction1(value))
  }
  
}

