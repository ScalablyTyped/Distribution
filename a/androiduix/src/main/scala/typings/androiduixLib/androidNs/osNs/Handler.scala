package typings
package androiduixLib.androidNs.osNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.os.Handler")
@js.native
class Handler () extends js.Object {
  def this(callback: androiduixLib.androidNs.osNs.HandlerNs.Callback) = this()
  var mCallback: androiduixLib.androidNs.osNs.HandlerNs.Callback = js.native
  def dispatchMessage(msg: Message): scala.Unit = js.native
  def handleMessage(msg: Message): scala.Unit = js.native
  def hasMessages(what: scala.Double): scala.Boolean = js.native
  def hasMessages(what: scala.Double, `object`: js.Any): scala.Boolean = js.native
  def obtainMessage(): Message = js.native
  def obtainMessage(what: scala.Double): Message = js.native
  def obtainMessage(what: scala.Double, arg1: scala.Double, arg2: scala.Double): Message = js.native
  def obtainMessage(what: scala.Double, arg1: scala.Double, arg2: scala.Double, obj: js.Any): Message = js.native
  def obtainMessage(what: scala.Double, obj: js.Any): Message = js.native
  def post(r: androiduixLib.javaNs.langNs.Runnable): scala.Boolean = js.native
  /* protected */ def postAsTraversal(r: androiduixLib.javaNs.langNs.Runnable): scala.Boolean = js.native
  def postAtFrontOfQueue(r: androiduixLib.javaNs.langNs.Runnable): scala.Boolean = js.native
  def postAtTime(r: androiduixLib.javaNs.langNs.Runnable, token: js.Any, uptimeMillis: scala.Double): scala.Boolean = js.native
  def postAtTime(r: androiduixLib.javaNs.langNs.Runnable, uptimeMillis: scala.Double): scala.Boolean = js.native
  def postDelayed(r: androiduixLib.javaNs.langNs.Runnable, delayMillis: scala.Double): scala.Boolean = js.native
  def removeCallbacks(r: androiduixLib.javaNs.langNs.Runnable): scala.Unit = js.native
  def removeCallbacks(r: androiduixLib.javaNs.langNs.Runnable, token: js.Any): scala.Unit = js.native
  def removeCallbacksAndMessages(): scala.Unit = js.native
  def removeCallbacksAndMessages(token: js.Any): scala.Unit = js.native
  def removeMessages(what: scala.Double): scala.Unit = js.native
  def removeMessages(what: scala.Double, `object`: js.Any): scala.Unit = js.native
  def sendEmptyMessage(what: scala.Double): scala.Boolean = js.native
  def sendEmptyMessageAtTime(what: scala.Double, uptimeMillis: scala.Double): scala.Boolean = js.native
  def sendEmptyMessageDelayed(what: scala.Double, delayMillis: scala.Double): scala.Boolean = js.native
  def sendMessage(msg: Message): scala.Boolean = js.native
  def sendMessageAtFrontOfQueue(msg: Message): scala.Boolean = js.native
  def sendMessageAtTime(msg: Message, uptimeMillis: scala.Double): scala.Boolean = js.native
  def sendMessageDelayed(msg: Message, delayMillis: scala.Double): scala.Boolean = js.native
}

@JSGlobal("android.os.Handler")
@js.native
object Handler extends js.Object {
  /* private */ def getPostMessage(r: js.Any): js.Any = js.native
  /* private */ def getPostMessage(r: js.Any, token: js.Any): js.Any = js.native
}

