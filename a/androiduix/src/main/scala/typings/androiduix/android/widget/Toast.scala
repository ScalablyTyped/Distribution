package typings.androiduix.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.os.Handler
import typings.androiduix.android.view.View
import typings.androiduix.android.view.Window
import typings.androiduix.android.view.WindowManager
import typings.androiduix.android.widget.Toast.TN
import typings.androiduix.java.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.Toast")
@js.native
class Toast protected () extends js.Object {
  def this(context: Context) = this()
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

/* static members */
@JSGlobal("android.widget.Toast")
@js.native
object Toast extends js.Object {
  @js.native
  class TN () extends js.Object {
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
  
  var LENGTH_LONG: Double = js.native
  var LENGTH_SHORT: Double = js.native
  var TAG: String = js.native
  var localLOGV: Boolean = js.native
  def makeText(context: Context, text: String, duration: Double): Toast = js.native
}

