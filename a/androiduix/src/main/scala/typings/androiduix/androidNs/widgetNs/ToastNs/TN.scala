package typings.androiduix.androidNs.widgetNs.ToastNs

import typings.androiduix.androidNs.osNs.Handler
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.Window
import typings.androiduix.androidNs.viewNs.WindowManager
import typings.androiduix.javaNs.langNs.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.Toast.TN")
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

