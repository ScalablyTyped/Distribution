package typings.atom.linterMod

import typings.atom.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndieDelegate extends js.Object {
  var name: String = js.native
  def clearMessages(): Unit = js.native
  def dispose(): Unit = js.native
  def getMessages(): js.Array[Message] = js.native
  def onDidDestroy(callback: js.Function0[Unit]): Disposable = js.native
  def onDidUpdate(callback: js.Function0[Unit]): Disposable = js.native
  def setAllMessages(messages: js.Array[Message]): Unit = js.native
  def setMessages(filePath: String, messages: js.Array[Message]): Unit = js.native
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
  @scala.inline
  implicit class IndieDelegateOps[Self <: IndieDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClearMessages(value: () => Unit): Self = this.set("clearMessages", js.Any.fromFunction0(value))
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMessages(value: () => js.Array[Message]): Self = this.set("getMessages", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDidDestroy(value: js.Function0[Unit] => Disposable): Self = this.set("onDidDestroy", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDidUpdate(value: js.Function0[Unit] => Disposable): Self = this.set("onDidUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAllMessages(value: js.Array[Message] => Unit): Self = this.set("setAllMessages", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMessages(value: (String, js.Array[Message]) => Unit): Self = this.set("setMessages", js.Any.fromFunction2(value))
  }
  
}

