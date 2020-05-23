package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLHttpRequestEventTarget extends js.Object {
  @JSName("MSHTML.XMLHttpRequestEventTarget_typekey")
  var MSHTMLDotXMLHttpRequestEventTarget_typekey: XMLHttpRequestEventTarget
  def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit
  def dispatchEvent(evt: IDOMEvent): Boolean
  def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit
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
}

