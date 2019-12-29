package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IEventTarget")
@js.native
class IEventTarget protected () extends js.Object {
  @JSName("MSHTML.IEventTarget_typekey")
  var MSHTMLDotIEventTarget_typekey: IEventTarget = js.native
  def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  def dispatchEvent(evt: IDOMEvent): Boolean = js.native
  def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
}

