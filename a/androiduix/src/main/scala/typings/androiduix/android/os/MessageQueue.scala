package typings.androiduix.android.os

import typings.androiduix.java.lang.Runnable
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.os.MessageQueue")
@js.native
class MessageQueue () extends js.Object

/* static members */
@JSGlobal("android.os.MessageQueue")
@js.native
object MessageQueue extends js.Object {
  var _loopActive: js.Any = js.native
  var messages: Set[Message] = js.native
  /* private */ def checkLoop(): js.Any = js.native
  /* private */ def dispatchMessage(msg: js.Any): js.Any = js.native
  def enqueueMessage(msg: Message, when: Double): Boolean = js.native
  def getMessages(h: Handler, r: Runnable, `object`: js.Any): js.Array[Message] = js.native
  def getMessages(h: Handler, what: Double, `object`: js.Any): js.Array[Message] = js.native
  def hasMessages(h: Handler, r: Runnable, `object`: js.Any): Boolean = js.native
  def hasMessages(h: Handler, what: Double, `object`: js.Any): Boolean = js.native
  /* private */ def loop(): js.Any = js.native
  def recycleMessage(handler: Handler, message: Message): Unit = js.native
  def removeCallbacksAndMessages(h: Handler, `object`: js.Any): Unit = js.native
  def removeMessages(h: Handler, r: Runnable, `object`: js.Any): js.Any = js.native
  def removeMessages(h: Handler, what: Double, `object`: js.Any): js.Any = js.native
  /* private */ def requestNextLoop(): js.Any = js.native
}

