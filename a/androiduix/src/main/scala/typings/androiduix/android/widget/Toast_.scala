package typings.androiduix.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.view.View
import typings.androiduix.android.widget.Toast.TN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toast_ extends js.Object {
  var mContext: Context = js.native
  var mDelayHide: js.Any = js.native
  var mDuration: Double = js.native
  var mHandler: js.Any = js.native
  var mNextView: View = js.native
  var mTN: TN = js.native
  def cancel(): Unit = js.native
  def getDuration(): Double = js.native
  def getGravity(): Double = js.native
  def getView(): View = js.native
  def getXOffset(): Double = js.native
  def getYOffset(): Double = js.native
  def setDuration(duration: Double): Unit = js.native
  def setGravity(gravity: Double, xOffset: Double, yOffset: Double): Unit = js.native
  def setText(s: String): Unit = js.native
  def setView(view: View): Unit = js.native
  def show(): Unit = js.native
}

object Toast_ {
  @scala.inline
  def apply(
    cancel: () => Unit,
    getDuration: () => Double,
    getGravity: () => Double,
    getView: () => View,
    getXOffset: () => Double,
    getYOffset: () => Double,
    mContext: Context,
    mDelayHide: js.Any,
    mDuration: Double,
    mHandler: js.Any,
    mNextView: View,
    mTN: TN,
    setDuration: Double => Unit,
    setGravity: (Double, Double, Double) => Unit,
    setText: String => Unit,
    setView: View => Unit,
    show: () => Unit
  ): Toast_ = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), getDuration = js.Any.fromFunction0(getDuration), getGravity = js.Any.fromFunction0(getGravity), getView = js.Any.fromFunction0(getView), getXOffset = js.Any.fromFunction0(getXOffset), getYOffset = js.Any.fromFunction0(getYOffset), mContext = mContext.asInstanceOf[js.Any], mDelayHide = mDelayHide.asInstanceOf[js.Any], mDuration = mDuration.asInstanceOf[js.Any], mHandler = mHandler.asInstanceOf[js.Any], mNextView = mNextView.asInstanceOf[js.Any], mTN = mTN.asInstanceOf[js.Any], setDuration = js.Any.fromFunction1(setDuration), setGravity = js.Any.fromFunction3(setGravity), setText = js.Any.fromFunction1(setText), setView = js.Any.fromFunction1(setView), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Toast_]
  }
  @scala.inline
  implicit class Toast_Ops[Self <: Toast_] (val x: Self) extends AnyVal {
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDuration(value: () => Double): Self = this.set("getDuration", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGravity(value: () => Double): Self = this.set("getGravity", js.Any.fromFunction0(value))
    @scala.inline
    def setGetView(value: () => View): Self = this.set("getView", js.Any.fromFunction0(value))
    @scala.inline
    def setGetXOffset(value: () => Double): Self = this.set("getXOffset", js.Any.fromFunction0(value))
    @scala.inline
    def setGetYOffset(value: () => Double): Self = this.set("getYOffset", js.Any.fromFunction0(value))
    @scala.inline
    def setMContext(value: Context): Self = this.set("mContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDelayHide(value: js.Any): Self = this.set("mDelayHide", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDuration(value: Double): Self = this.set("mDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setMHandler(value: js.Any): Self = this.set("mHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def setMNextView(value: View): Self = this.set("mNextView", value.asInstanceOf[js.Any])
    @scala.inline
    def setMTN(value: TN): Self = this.set("mTN", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetDuration(value: Double => Unit): Self = this.set("setDuration", js.Any.fromFunction1(value))
    @scala.inline
    def setSetGravity(value: (Double, Double, Double) => Unit): Self = this.set("setGravity", js.Any.fromFunction3(value))
    @scala.inline
    def setSetText(value: String => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
    @scala.inline
    def setSetView(value: View => Unit): Self = this.set("setView", js.Any.fromFunction1(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
  
}

