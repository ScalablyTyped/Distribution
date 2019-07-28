package typings.androiduix.androidNs.osNs

import typings.androiduix.javaNs.langNs.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.os.Message")
@js.native
class Message () extends js.Object {
  var arg1: Double = js.native
  var arg2: Double = js.native
  var callback: Runnable = js.native
  var mType: js.Any = js.native
  var obj: js.Any = js.native
  var target: Handler = js.native
  var what: Double = js.native
  var when: Double = js.native
  /* protected */ def clearForRecycle(): Unit = js.native
  def copyFrom(o: Message): Unit = js.native
  def getTarget(): Handler = js.native
  def recycle(): Unit = js.native
  def sendToTarget(): Unit = js.native
  def setTarget(target: Handler): Unit = js.native
  def toString(now: Double): String = js.native
}

/* static members */
@JSGlobal("android.os.Message")
@js.native
object Message extends js.Object {
  var Type_Normal: Double = js.native
  var Type_Traversal: Double = js.native
  var sPool: js.Any = js.native
  def obtain(): Message = js.native
  def obtain(h: Handler): Message = js.native
  def obtain(h: Handler, callback: Runnable): Message = js.native
  def obtain(h: Handler, what: Double): Message = js.native
  def obtain(h: Handler, what: Double, arg1: Double, arg2: Double): Message = js.native
  def obtain(h: Handler, what: Double, arg1: Double, arg2: Double, obj: js.Any): Message = js.native
  def obtain(h: Handler, what: Double, obj: js.Any): Message = js.native
  def obtain(orig: Message): Message = js.native
}

