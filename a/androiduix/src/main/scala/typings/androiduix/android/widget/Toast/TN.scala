package typings.androiduix.android.widget.Toast

import typings.androiduix.android.os.Handler
import typings.androiduix.android.view.View
import typings.androiduix.android.view.Window
import typings.androiduix.android.view.WindowManager
import typings.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TN extends js.Object {
  var mGravity: Double = js.native
  var mHandler: Handler = js.native
  var mHide: Runnable = js.native
  var mNextView: View = js.native
  var mShow: Runnable = js.native
  var mView: View = js.native
  var mWM: WindowManager = js.native
  var mWindow: Window = js.native
  var mX: Double = js.native
  var mY: Double = js.native
  def handleHide(): Unit = js.native
  def handleShow(): Unit = js.native
  def hide(): Unit = js.native
  def show(): Unit = js.native
}

object TN {
  @scala.inline
  def apply(
    handleHide: () => Unit,
    handleShow: () => Unit,
    hide: () => Unit,
    mGravity: Double,
    mHandler: Handler,
    mHide: Runnable,
    mNextView: View,
    mShow: Runnable,
    mView: View,
    mWM: WindowManager,
    mWindow: Window,
    mX: Double,
    mY: Double,
    show: () => Unit
  ): TN = {
    val __obj = js.Dynamic.literal(handleHide = js.Any.fromFunction0(handleHide), handleShow = js.Any.fromFunction0(handleShow), hide = js.Any.fromFunction0(hide), mGravity = mGravity.asInstanceOf[js.Any], mHandler = mHandler.asInstanceOf[js.Any], mHide = mHide.asInstanceOf[js.Any], mNextView = mNextView.asInstanceOf[js.Any], mShow = mShow.asInstanceOf[js.Any], mView = mView.asInstanceOf[js.Any], mWM = mWM.asInstanceOf[js.Any], mWindow = mWindow.asInstanceOf[js.Any], mX = mX.asInstanceOf[js.Any], mY = mY.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[TN]
  }
  @scala.inline
  implicit class TNOps[Self <: TN] (val x: Self) extends AnyVal {
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
    def setHandleHide(value: () => Unit): Self = this.set("handleHide", js.Any.fromFunction0(value))
    @scala.inline
    def setHandleShow(value: () => Unit): Self = this.set("handleShow", js.Any.fromFunction0(value))
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setMGravity(value: Double): Self = this.set("mGravity", value.asInstanceOf[js.Any])
    @scala.inline
    def setMHandler(value: Handler): Self = this.set("mHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def setMHide(value: Runnable): Self = this.set("mHide", value.asInstanceOf[js.Any])
    @scala.inline
    def setMNextView(value: View): Self = this.set("mNextView", value.asInstanceOf[js.Any])
    @scala.inline
    def setMShow(value: Runnable): Self = this.set("mShow", value.asInstanceOf[js.Any])
    @scala.inline
    def setMView(value: View): Self = this.set("mView", value.asInstanceOf[js.Any])
    @scala.inline
    def setMWM(value: WindowManager): Self = this.set("mWM", value.asInstanceOf[js.Any])
    @scala.inline
    def setMWindow(value: Window): Self = this.set("mWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setMX(value: Double): Self = this.set("mX", value.asInstanceOf[js.Any])
    @scala.inline
    def setMY(value: Double): Self = this.set("mY", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
  
}

