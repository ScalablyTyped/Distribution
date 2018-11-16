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

