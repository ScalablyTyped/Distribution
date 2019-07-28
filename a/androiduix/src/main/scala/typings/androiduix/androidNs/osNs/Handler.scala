package typings.androiduix.androidNs.osNs

import typings.androiduix.androidNs.osNs.HandlerNs.Callback
import typings.androiduix.javaNs.langNs.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.os.Handler")
@js.native
class Handler () extends js.Object {
  def this(callback: Callback) = this()
  var mCallback: Callback = js.native
  def dispatchMessage(msg: Message): Unit = js.native
  def handleMessage(msg: Message): Unit = js.native
  def hasMessages(what: Double): Boolean = js.native
  def hasMessages(what: Double, `object`: js.Any): Boolean = js.native
  def obtainMessage(): Message = js.native
  def obtainMessage(what: Double): Message = js.native
  def obtainMessage(what: Double, arg1: Double, arg2: Double): Message = js.native
  def obtainMessage(what: Double, arg1: Double, arg2: Double, obj: js.Any): Message = js.native
  def obtainMessage(what: Double, obj: js.Any): Message = js.native
  def post(r: Runnable): Boolean = js.native
  /* protected */ def postAsTraversal(r: Runnable): Boolean = js.native
  def postAtFrontOfQueue(r: Runnable): Boolean = js.native
  def postAtTime(r: Runnable, token: js.Any, uptimeMillis: Double): Boolean = js.native
  def postAtTime(r: Runnable, uptimeMillis: Double): Boolean = js.native
  def postDelayed(r: Runnable, delayMillis: Double): Boolean = js.native
  def removeCallbacks(r: Runnable): Unit = js.native
  def removeCallbacks(r: Runnable, token: js.Any): Unit = js.native
  def removeCallbacksAndMessages(): Unit = js.native
  def removeCallbacksAndMessages(token: js.Any): Unit = js.native
  def removeMessages(what: Double): Unit = js.native
  def removeMessages(what: Double, `object`: js.Any): Unit = js.native
  def sendEmptyMessage(what: Double): Boolean = js.native
  def sendEmptyMessageAtTime(what: Double, uptimeMillis: Double): Boolean = js.native
  def sendEmptyMessageDelayed(what: Double, delayMillis: Double): Boolean = js.native
  def sendMessage(msg: Message): Boolean = js.native
  def sendMessageAtFrontOfQueue(msg: Message): Boolean = js.native
  def sendMessageAtTime(msg: Message, uptimeMillis: Double): Boolean = js.native
  def sendMessageDelayed(msg: Message, delayMillis: Double): Boolean = js.native
}

/* static members */
@JSGlobal("android.os.Handler")
@js.native
object Handler extends js.Object {
  /* private */ def getPostMessage(r: js.Any): js.Any = js.native
  /* private */ def getPostMessage(r: js.Any, token: js.Any): js.Any = js.native
}

