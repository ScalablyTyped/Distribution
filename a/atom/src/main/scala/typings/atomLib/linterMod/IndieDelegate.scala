package typings
package atomLib.linterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndieDelegate extends js.Object {
  var name: java.lang.String
  def clearMessages(): scala.Unit
  def dispose(): scala.Unit
  def getMessages(): js.Array[Message]
  def onDidDestroy(callback: js.Function0[scala.Unit]): atomLib.atomMod.Disposable
  def onDidUpdate(callback: js.Function0[scala.Unit]): atomLib.atomMod.Disposable
  def setAllMessages(messages: js.Array[Message]): scala.Unit
  def setMessages(filePath: java.lang.String, messages: js.Array[Message]): scala.Unit
}

object IndieDelegate {
  @scala.inline
  def apply(
    clearMessages: () => scala.Unit,
    dispose: () => scala.Unit,
    getMessages: () => js.Array[Message],
    name: java.lang.String,
    onDidDestroy: js.Function0[scala.Unit] => atomLib.atomMod.Disposable,
    onDidUpdate: js.Function0[scala.Unit] => atomLib.atomMod.Disposable,
    setAllMessages: js.Array[Message] => scala.Unit,
    setMessages: (java.lang.String, js.Array[Message]) => scala.Unit
  ): IndieDelegate = {
    val __obj = js.Dynamic.literal(clearMessages = js.Any.fromFunction0(clearMessages), dispose = js.Any.fromFunction0(dispose), getMessages = js.Any.fromFunction0(getMessages), name = name, onDidDestroy = js.Any.fromFunction1(onDidDestroy), onDidUpdate = js.Any.fromFunction1(onDidUpdate), setAllMessages = js.Any.fromFunction1(setAllMessages), setMessages = js.Any.fromFunction2(setMessages))
  
    __obj.asInstanceOf[IndieDelegate]
  }
}

