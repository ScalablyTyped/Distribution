package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** XML HTTP Request class 6.0 */
@js.native
trait XMLHTTP60 extends StObject {
  
  /* private */ @JSName("MSXML2.XMLHTTP60_typekey")
  var MSXML2DotXMLHTTP60_typekey: XMLHTTP60 = js.native
  
  /** Abort HTTP request */
  def abort(): Unit = js.native
  
  /** Get all HTTP response headers */
  def getAllResponseHeaders(): String = js.native
  
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
  
  /** Add HTTP request header */
  def setRequestHeader(bstrHeader: String, bstrValue: String): Unit = js.native
  
  /** Get HTTP status code */
  val status: Double = js.native
  
  /** Get HTTP status text */
  val statusText: String = js.native
}
