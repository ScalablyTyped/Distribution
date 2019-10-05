package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.HTMLXMLHttpRequest")
@js.native
class HTMLXMLHttpRequest protected () extends js.Object {
  var `MSHTML.HTMLXMLHttpRequest_typekey`: HTMLXMLHttpRequest = js.native
  val constructor: js.Any = js.native
  var onreadystatechange: js.Any = js.native
  var ontimeout: js.Any = js.native
  val readyState: Double = js.native
  val responseBody: js.Any = js.native
  val responseText: String = js.native
  val responseXML: js.Any = js.native
  val status: Double = js.native
  val statusText: String = js.native
  var timeout: Double = js.native
  def abort(): Unit = js.native
  def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  def dispatchEvent(evt: IDOMEvent): Boolean = js.native
  def getAllResponseHeaders(): String = js.native
  def getResponseHeader(bstrHeader: String): String = js.native
  def open(bstrMethod: String, bstrURL: String, varAsync: js.Any): Unit = js.native
  def open(bstrMethod: String, bstrURL: String, varAsync: js.Any, varUser: js.Any): Unit = js.native
  def open(bstrMethod: String, bstrURL: String, varAsync: js.Any, varUser: js.Any, varPassword: js.Any): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  def send(): Unit = js.native
  def send(varBody: js.Any): Unit = js.native
  def setRequestHeader(bstrHeader: String, bstrValue: String): Unit = js.native
}

