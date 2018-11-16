package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IEventTarget")
@js.native
class IEventTarget protected () extends js.Object {
  var `MSHTML.IEventTarget_typekey`: IEventTarget = js.native
  def addEventListener(`type`: java.lang.String, listener: js.Any, useCapture: scala.Boolean): scala.Unit = js.native
  def dispatchEvent(evt: IDOMEvent): scala.Boolean = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Any, useCapture: scala.Boolean): scala.Unit = js.native
}

