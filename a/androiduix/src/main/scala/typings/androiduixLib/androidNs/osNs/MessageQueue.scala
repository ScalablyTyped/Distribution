package typings
package androiduixLib.androidNs.osNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.os.MessageQueue")
@js.native
class MessageQueue () extends js.Object

@JSGlobal("android.os.MessageQueue")
@js.native
object MessageQueue extends js.Object {
  var _loopActive: js.Any = js.native
  var messages: stdLib.Set[androiduixLib.androidNs.osNs.Message] = js.native
  /* private */ def checkLoop(): js.Any = js.native
  /* private */ def dispatchMessage(msg: js.Any): js.Any = js.native
  def enqueueMessage(msg: androiduixLib.androidNs.osNs.Message, when: scala.Double): scala.Boolean = js.native
  def getMessages(h: androiduixLib.androidNs.osNs.Handler, r: androiduixLib.javaNs.langNs.Runnable, `object`: js.Any): js.Array[androiduixLib.androidNs.osNs.Message] = js.native
  def getMessages(h: androiduixLib.androidNs.osNs.Handler, what: scala.Double, `object`: js.Any): js.Array[androiduixLib.androidNs.osNs.Message] = js.native
  def hasMessages(h: androiduixLib.androidNs.osNs.Handler, r: androiduixLib.javaNs.langNs.Runnable, `object`: js.Any): scala.Boolean = js.native
  def hasMessages(h: androiduixLib.androidNs.osNs.Handler, what: scala.Double, `object`: js.Any): scala.Boolean = js.native
  /* private */ def loop(): js.Any = js.native
  def recycleMessage(handler: androiduixLib.androidNs.osNs.Handler, message: androiduixLib.androidNs.osNs.Message): scala.Unit = js.native
  def removeCallbacksAndMessages(h: androiduixLib.androidNs.osNs.Handler, `object`: js.Any): scala.Unit = js.native
  def removeMessages(h: androiduixLib.androidNs.osNs.Handler, r: androiduixLib.javaNs.langNs.Runnable, `object`: js.Any): js.Any = js.native
  def removeMessages(h: androiduixLib.androidNs.osNs.Handler, what: scala.Double, `object`: js.Any): js.Any = js.native
  /* private */ def requestNextLoop(): js.Any = js.native
}

