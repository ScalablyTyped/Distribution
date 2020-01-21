package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** XML HTTP Request class 6.0 */
@JSGlobal("MSXML2.XMLHTTP60")
@js.native
class XMLHTTP60 protected () extends js.Object {
  @JSName("MSXML2.XMLHTTP60_typekey")
  var MSXML2DotXMLHTTP60_typekey: XMLHTTP60 = js.native
  /** Register a complete event handler */
  val onreadystatechange: js.Any = js.native
  /** Get ready state */
  val readyState: Double = js.native
  /** Get response body */
  val responseBody: js.Any = js.native
  /** Get response body */
  val responseStream: js.Any = js.native
  /** Get response body */
  val responseText: String = js.native
  /** Get response body */
  val responseXML: js.Any = js.native
  /** Get HTTP status code */
  val status: Double = js.native
  /** Get HTTP status text */
  val statusText: String = js.native
  /** Abort HTTP request */
  def abort(): Unit = js.native
  /** Get all HTTP response headers */
  def getAllResponseHeaders(): String = js.native
  /** Get HTTP response header */
  def getResponseHeader(bstrHeader: String): String = js.native
  /** Open HTTP connection */
  def open(bstrMethod: String, bstrUrl: String): Unit = js.native
  def open(bstrMethod: String, bstrUrl: String, varAsync: js.Any): Unit = js.native
  def open(bstrMethod: String, bstrUrl: String, varAsync: js.Any, bstrUser: js.Any): Unit = js.native
  def open(bstrMethod: String, bstrUrl: String, varAsync: js.Any, bstrUser: js.Any, bstrPassword: js.Any): Unit = js.native
  /** Send HTTP request */
  def send(): Unit = js.native
  def send(varBody: js.Any): Unit = js.native
  /** Add HTTP request header */
  def setRequestHeader(bstrHeader: String, bstrValue: String): Unit = js.native
}

