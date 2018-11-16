package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLXDomainRequest")
@js.native
class IHTMLXDomainRequest protected () extends js.Object {
  var `MSHTML.IHTMLXDomainRequest_typekey`: IHTMLXDomainRequest = js.native
  val contentType: java.lang.String = js.native
  var onerror: js.Any = js.native
  var onload: js.Any = js.native
  var onprogress: js.Any = js.native
  var ontimeout: js.Any = js.native
  val responseText: java.lang.String = js.native
  var timeout: scala.Double = js.native
  def abort(): scala.Unit = js.native
  def open(bstrMethod: java.lang.String, bstrURL: java.lang.String): scala.Unit = js.native
  def send(): scala.Unit = js.native
  def send(varBody: js.Any): scala.Unit = js.native
}

