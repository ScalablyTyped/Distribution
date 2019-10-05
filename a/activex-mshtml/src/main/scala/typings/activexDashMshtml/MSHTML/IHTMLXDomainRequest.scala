package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLXDomainRequest")
@js.native
class IHTMLXDomainRequest protected () extends js.Object {
  var `MSHTML.IHTMLXDomainRequest_typekey`: IHTMLXDomainRequest = js.native
  val contentType: String = js.native
  var onerror: js.Any = js.native
  var onload: js.Any = js.native
  var onprogress: js.Any = js.native
  var ontimeout: js.Any = js.native
  val responseText: String = js.native
  var timeout: Double = js.native
  def abort(): Unit = js.native
  def open(bstrMethod: String, bstrURL: String): Unit = js.native
  def send(): Unit = js.native
  def send(varBody: js.Any): Unit = js.native
}

