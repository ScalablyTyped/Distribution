package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLXMLHttpRequest")
@js.native
class IHTMLXMLHttpRequest protected () extends js.Object {
  var `MSHTML.IHTMLXMLHttpRequest_typekey`: IHTMLXMLHttpRequest = js.native
  var onreadystatechange: js.Any = js.native
  val readyState: scala.Double = js.native
  val responseBody: js.Any = js.native
  val responseText: java.lang.String = js.native
  val responseXML: js.Any = js.native
  val status: scala.Double = js.native
  val statusText: java.lang.String = js.native
  def abort(): scala.Unit = js.native
  def getAllResponseHeaders(): java.lang.String = js.native
  def getResponseHeader(bstrHeader: java.lang.String): java.lang.String = js.native
  def open(bstrMethod: java.lang.String, bstrURL: java.lang.String, varAsync: js.Any): scala.Unit = js.native
  def open(bstrMethod: java.lang.String, bstrURL: java.lang.String, varAsync: js.Any, varUser: js.Any): scala.Unit = js.native
  def open(
    bstrMethod: java.lang.String,
    bstrURL: java.lang.String,
    varAsync: js.Any,
    varUser: js.Any,
    varPassword: js.Any
  ): scala.Unit = js.native
  def send(): scala.Unit = js.native
  def send(varBody: js.Any): scala.Unit = js.native
  def setRequestHeader(bstrHeader: java.lang.String, bstrValue: java.lang.String): scala.Unit = js.native
}

