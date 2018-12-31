package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Server XML HTTP Request 6.0  */
@JSGlobal("MSXML2.ServerXMLHTTP60")
@js.native
class ServerXMLHTTP60 protected () extends js.Object {
  var `MSXML2.ServerXMLHTTP60_typekey`: ServerXMLHTTP60 = js.native
  /** Register a complete event handler */
  val onreadystatechange: js.Any = js.native
  /** Get ready state */
  val readyState: scala.Double = js.native
  /** Get response body */
  val responseBody: js.Any = js.native
  /** Get response body */
  val responseStream: js.Any = js.native
  /** Get response body */
  val responseText: java.lang.String = js.native
  /** Get response body */
  val responseXML: js.Any = js.native
  /** Get HTTP status code */
  val status: scala.Double = js.native
  /** Get HTTP status text */
  val statusText: java.lang.String = js.native
  /** Abort HTTP request */
  def abort(): scala.Unit = js.native
  /** Get all HTTP response headers */
  def getAllResponseHeaders(): java.lang.String = js.native
  /** Get an option value */
  def getOption(option: SERVERXMLHTTP_OPTION): js.Any = js.native
  /** Get HTTP response header */
  def getResponseHeader(bstrHeader: java.lang.String): java.lang.String = js.native
  /** Open HTTP connection */
  def open(bstrMethod: java.lang.String, bstrUrl: java.lang.String): scala.Unit = js.native
  def open(bstrMethod: java.lang.String, bstrUrl: java.lang.String, varAsync: js.Any): scala.Unit = js.native
  def open(bstrMethod: java.lang.String, bstrUrl: java.lang.String, varAsync: js.Any, bstrUser: js.Any): scala.Unit = js.native
  def open(
    bstrMethod: java.lang.String,
    bstrUrl: java.lang.String,
    varAsync: js.Any,
    bstrUser: js.Any,
    bstrPassword: js.Any
  ): scala.Unit = js.native
  /** Send HTTP request */
  def send(): scala.Unit = js.native
  def send(varBody: js.Any): scala.Unit = js.native
  /** Set an option value */
  def setOption(option: SERVERXMLHTTP_OPTION, value: js.Any): scala.Unit = js.native
  /** Specify proxy configuration */
  def setProxy(proxySetting: SXH_PROXY_SETTING): scala.Unit = js.native
  def setProxy(proxySetting: SXH_PROXY_SETTING, varProxyServer: js.Any): scala.Unit = js.native
  def setProxy(proxySetting: SXH_PROXY_SETTING, varProxyServer: js.Any, varBypassList: js.Any): scala.Unit = js.native
  /** Specify proxy authentication credentials */
  def setProxyCredentials(bstrUserName: java.lang.String, bstrPassword: java.lang.String): scala.Unit = js.native
  /** Add HTTP request header */
  def setRequestHeader(bstrHeader: java.lang.String, bstrValue: java.lang.String): scala.Unit = js.native
  /** Specify timeout settings (in milliseconds) */
  def setTimeouts(
    resolveTimeout: scala.Double,
    connectTimeout: scala.Double,
    sendTimeout: scala.Double,
    receiveTimeout: scala.Double
  ): scala.Unit = js.native
  /** Wait for asynchronous send to complete, with optional timeout (in seconds) */
  def waitForResponse(): scala.Boolean = js.native
  def waitForResponse(timeoutInSeconds: js.Any): scala.Boolean = js.native
}

