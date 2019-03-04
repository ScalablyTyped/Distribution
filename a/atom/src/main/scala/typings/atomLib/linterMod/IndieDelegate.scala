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
    clearMessages: js.Function0[scala.Unit],
    dispose: js.Function0[scala.Unit],
    getMessages: js.Function0[js.Array[Message]],
    name: java.lang.String,
    onDidDestroy: js.Function1[js.Function0[scala.Unit], atomLib.atomMod.Disposable],
    onDidUpdate: js.Function1[js.Function0[scala.Unit], atomLib.atomMod.Disposable],
    setAllMessages: js.Function1[js.Array[Message], scala.Unit],
    setMessages: js.Function2[java.lang.String, js.Array[Message], scala.Unit]
  ): IndieDelegate = {
    val __obj = js.Dynamic.literal(clearMessages = clearMessages, dispose = dispose, getMessages = getMessages, name = name, onDidDestroy = onDidDestroy, onDidUpdate = onDidUpdate, setAllMessages = setAllMessages, setMessages = setMessages)
  
    __obj.asInstanceOf[IndieDelegate]
  }
}

