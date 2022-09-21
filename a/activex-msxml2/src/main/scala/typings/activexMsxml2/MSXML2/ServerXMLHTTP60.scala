package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Server XML HTTP Request 6.0  */
@js.native
trait ServerXMLHTTP60 extends StObject {
  
  /* private */ @JSName("MSXML2.ServerXMLHTTP60_typekey")
  var MSXML2DotServerXMLHTTP60_typekey: ServerXMLHTTP60 = js.native
  
  /** Abort HTTP request */
  def abort(): Unit = js.native
  
  /** Get all HTTP response headers */
  def getAllResponseHeaders(): String = js.native
  
  /** Get an option value */
  def getOption(option: SERVERXMLHTTP_OPTION): Any = js.native
  
  /** Get HTTP response header */
  def getResponseHeader(bstrHeader: String): String = js.native
  
  /** Register a complete event handler */
  val onreadystatechange: Any = js.native
  
  /** Open HTTP connection */
  def open(bstrMethod: String, bstrUrl: String): Unit = js.native
  def open(bstrMethod: String, bstrUrl: String, varAsync: Any): Unit = js.native
  def open(bstrMethod: String, bstrUrl: String, varAsync: Any, bstrUser: Any): Unit = js.native
  def open(bstrMethod: String, bstrUrl: String, varAsync: Any, bstrUser: Any, bstrPassword: Any): Unit = js.native
  def open(bstrMethod: String, bstrUrl: String, varAsync: Any, bstrUser: Unit, bstrPassword: Any): Unit = js.native
  def open(bstrMethod: String, bstrUrl: String, varAsync: Unit, bstrUser: Any): Unit = js.native
  def open(bstrMethod: String, bstrUrl: String, varAsync: Unit, bstrUser: Any, bstrPassword: Any): Unit = js.native
  def open(bstrMethod: String, bstrUrl: String, varAsync: Unit, bstrUser: Unit, bstrPassword: Any): Unit = js.native
  
  /** Get ready state */
  val readyState: Double = js.native
  
  /** Get response body */
  val responseBody: Any = js.native
  
  /** Get response body */
  val responseStream: Any = js.native
  
  /** Get response body */
  val responseText: String = js.native
  
  /** Get response body */
  val responseXML: Any = js.native
  
  /** Send HTTP request */
  def send(): Unit = js.native
  def send(varBody: Any): Unit = js.native
  
  /** Set an option value */
  def setOption(option: SERVERXMLHTTP_OPTION, value: Any): Unit = js.native
  
  /** Specify proxy configuration */
  def setProxy(proxySetting: SXH_PROXY_SETTING): Unit = js.native
  def setProxy(proxySetting: SXH_PROXY_SETTING, varProxyServer: Any): Unit = js.native
  def setProxy(proxySetting: SXH_PROXY_SETTING, varProxyServer: Any, varBypassList: Any): Unit = js.native
  def setProxy(proxySetting: SXH_PROXY_SETTING, varProxyServer: Unit, varBypassList: Any): Unit = js.native
  
  /** Specify proxy authentication credentials */
  def setProxyCredentials(bstrUserName: String, bstrPassword: String): Unit = js.native
  
  /** Add HTTP request header */
  def setRequestHeader(bstrHeader: String, bstrValue: String): Unit = js.native
  
  /** Specify timeout settings (in milliseconds) */
  def setTimeouts(resolveTimeout: Double, connectTimeout: Double, sendTimeout: Double, receiveTimeout: Double): Unit = js.native
  
  /** Get HTTP status code */
  val status: Double = js.native
  
  /** Get HTTP status text */
  val statusText: String = js.native
  
  /** Wait for asynchronous send to complete, with optional timeout (in seconds) */
  def waitForResponse(): Boolean = js.native
  def waitForResponse(timeoutInSeconds: Any): Boolean = js.native
}
