package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** XML HTTP Request class 6.0 */
@JSGlobal("MSXML2.XMLHTTP60")
@js.native
class XMLHTTP60 protected () extends js.Object {
  var `MSXML2.XMLHTTP60_typekey`: XMLHTTP60 = js.native
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
  /** Get HTTP response header */
  def getResponseHeader(bstrHeader: java.lang.String): java.lang.String = js.native
  /** Open HTTP connection */
  def open(bstrMethod: java.lang.String, bstrUrl: java.lang.String): scala.Unit = js.native
  /** Open HTTP connection */
  def open(bstrMethod: java.lang.String, bstrUrl: java.lang.String, varAsync: js.Any): scala.Unit = js.native
  /** Open HTTP connection */
  def open(bstrMethod: java.lang.String, bstrUrl: java.lang.String, varAsync: js.Any, bstrUser: js.Any): scala.Unit = js.native
  /** Open HTTP connection */
  def open(
    bstrMethod: java.lang.String,
    bstrUrl: java.lang.String,
    varAsync: js.Any,
    bstrUser: js.Any,
    bstrPassword: js.Any
  ): scala.Unit = js.native
  /** Send HTTP request */
  def send(): scala.Unit = js.native
  /** Send HTTP request */
  def send(varBody: js.Any): scala.Unit = js.native
  /** Add HTTP request header */
  def setRequestHeader(bstrHeader: java.lang.String, bstrValue: java.lang.String): scala.Unit = js.native
}

