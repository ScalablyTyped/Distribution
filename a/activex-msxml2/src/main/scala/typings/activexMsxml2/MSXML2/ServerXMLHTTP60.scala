package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Server XML HTTP Request 6.0  */
@JSGlobal("MSXML2.ServerXMLHTTP60")
@js.native
class ServerXMLHTTP60 protected () extends js.Object {
  @JSName("MSXML2.ServerXMLHTTP60_typekey")
  var MSXML2DotServerXMLHTTP60_typekey: ServerXMLHTTP60 = js.native
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
  /** Get an option value */
  def getOption(option: SERVERXMLHTTP_OPTION): js.Any = js.native
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
  /** Set an option value */
  def setOption(option: SERVERXMLHTTP_OPTION, value: js.Any): Unit = js.native
  /** Specify proxy configuration */
  def setProxy(proxySetting: SXH_PROXY_SETTING): Unit = js.native
  def setProxy(proxySetting: SXH_PROXY_SETTING, varProxyServer: js.Any): Unit = js.native
  def setProxy(proxySetting: SXH_PROXY_SETTING, varProxyServer: js.Any, varBypassList: js.Any): Unit = js.native
  /** Specify proxy authentication credentials */
  def setProxyCredentials(bstrUserName: String, bstrPassword: String): Unit = js.native
  /** Add HTTP request header */
  def setRequestHeader(bstrHeader: String, bstrValue: String): Unit = js.native
  /** Specify timeout settings (in milliseconds) */
  def setTimeouts(resolveTimeout: Double, connectTimeout: Double, sendTimeout: Double, receiveTimeout: Double): Unit = js.native
  /** Wait for asynchronous send to complete, with optional timeout (in seconds) */
  def waitForResponse(): Boolean = js.native
  def waitForResponse(timeoutInSeconds: js.Any): Boolean = js.native
}

