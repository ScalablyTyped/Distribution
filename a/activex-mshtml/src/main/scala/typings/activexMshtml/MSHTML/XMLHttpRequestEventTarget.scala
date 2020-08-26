package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLHttpRequestEventTarget extends js.Object {
  @JSName("MSHTML.XMLHttpRequestEventTarget_typekey")
  var MSHTMLDotXMLHttpRequestEventTarget_typekey: XMLHttpRequestEventTarget = js.native
  def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  def dispatchEvent(evt: IDOMEvent): Boolean = js.native
  def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
}

object XMLHttpRequestEventTarget {
  @scala.inline
  def apply(
    MSHTMLDotXMLHttpRequestEventTarget_typekey: XMLHttpRequestEventTarget,
    addEventListener: (String, js.Any, Boolean) => Unit,
    dispatchEvent: IDOMEvent => Boolean,
    removeEventListener: (String, js.Any, Boolean) => Unit
  ): XMLHttpRequestEventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.updateDynamic("MSHTML.XMLHttpRequestEventTarget_typekey")(MSHTMLDotXMLHttpRequestEventTarget_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventTarget]
  }
  @scala.inline
  implicit class XMLHttpRequestEventTargetOps[Self <: XMLHttpRequestEventTarget] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotXMLHttpRequestEventTarget_typekey(value: XMLHttpRequestEventTarget): Self = this.set("MSHTML.XMLHttpRequestEventTarget_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddEventListener(value: (String, js.Any, Boolean) => Unit): Self = this.set("addEventListener", js.Any.fromFunction3(value))
    @scala.inline
    def setDispatchEvent(value: IDOMEvent => Boolean): Self = this.set("dispatchEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveEventListener(value: (String, js.Any, Boolean) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction3(value))
  }
  
}

