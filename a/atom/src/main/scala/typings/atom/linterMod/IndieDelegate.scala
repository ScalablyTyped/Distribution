package typings.atom.linterMod

import typings.atom.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndieDelegate extends js.Object {
  var name: String
  def clearMessages(): Unit
  def dispose(): Unit
  def getMessages(): js.Array[Message]
  def onDidDestroy(callback: js.Function0[Unit]): Disposable
  def onDidUpdate(callback: js.Function0[Unit]): Disposable
  def setAllMessages(messages: js.Array[Message]): Unit
  def setMessages(filePath: String, messages: js.Array[Message]): Unit
}

object IndieDelegate {
  @scala.inline
  def apply(
    clearMessages: () => Unit,
    dispose: () => Unit,
    getMessages: () => js.Array[Message],
    name: String,
    onDidDestroy: js.Function0[Unit] => Disposable,
    onDidUpdate: js.Function0[Unit] => Disposable,
    setAllMessages: js.Array[Message] => Unit,
    setMessages: (String, js.Array[Message]) => Unit
  ): IndieDelegate = {
    val __obj = js.Dynamic.literal(clearMessages = js.Any.fromFunction0(clearMessages), dispose = js.Any.fromFunction0(dispose), getMessages = js.Any.fromFunction0(getMessages), name = name.asInstanceOf[js.Any], onDidDestroy = js.Any.fromFunction1(onDidDestroy), onDidUpdate = js.Any.fromFunction1(onDidUpdate), setAllMessages = js.Any.fromFunction1(setAllMessages), setMessages = js.Any.fromFunction2(setMessages))
    __obj.asInstanceOf[IndieDelegate]
  }
}

