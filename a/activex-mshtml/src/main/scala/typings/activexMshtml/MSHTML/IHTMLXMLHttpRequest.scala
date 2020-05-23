package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLXMLHttpRequest extends js.Object {
  @JSName("MSHTML.IHTMLXMLHttpRequest_typekey")
  var MSHTMLDotIHTMLXMLHttpRequest_typekey: IHTMLXMLHttpRequest = js.native
  var onreadystatechange: js.Any = js.native
  val readyState: Double = js.native
  val responseBody: js.Any = js.native
  val responseText: String = js.native
  val responseXML: js.Any = js.native
  val status: Double = js.native
  val statusText: String = js.native
  def abort(): Unit = js.native
  def getAllResponseHeaders(): String = js.native
  def getResponseHeader(bstrHeader: String): String = js.native
  def open(bstrMethod: String, bstrURL: String, varAsync: js.Any): Unit = js.native
  def open(bstrMethod: String, bstrURL: String, varAsync: js.Any, varUser: js.Any): Unit = js.native
  def open(bstrMethod: String, bstrURL: String, varAsync: js.Any, varUser: js.Any, varPassword: js.Any): Unit = js.native
  def send(): Unit = js.native
  def send(varBody: js.Any): Unit = js.native
  def setRequestHeader(bstrHeader: String, bstrValue: String): Unit = js.native
}

