package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.XMLHttpRequestEventTarget")
@js.native
class XMLHttpRequestEventTarget protected () extends js.Object {
  @JSName("MSHTML.XMLHttpRequestEventTarget_typekey")
  var MSHTMLDotXMLHttpRequestEventTarget_typekey: XMLHttpRequestEventTarget = js.native
  def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  def dispatchEvent(evt: IDOMEvent): Boolean = js.native
  def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
}

