package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Free Threaded XML HTTP Request class 6.0 */
@JSGlobal("MSXML2.FreeThreadedXMLHTTP60")
@js.native
class FreeThreadedXMLHTTP60 protected () extends js.Object {
  var `MSXML2.FreeThreadedXMLHTTP60_typekey`: FreeThreadedXMLHTTP60 = js.native
  def GetCookie(
    pwszUrl: java.lang.String,
    pwszName: java.lang.String,
    dwFlags: scala.Double,
    pcCookies: scala.Double,
    ppCookies: tagXHR_COOKIE
  ): scala.Unit = js.native
  def SetCookie(pCookie: tagXHR_COOKIE, pdwCookieState: scala.Double): scala.Unit = js.native
  def SetCustomResponseStream(pSequentialStream: ISequentialStream): scala.Unit = js.native
  def abort(): scala.Unit = js.native
  def getAllResponseHeaders(ppwszHeaders: java.lang.String): scala.Unit = js.native
  def getResponseHeader(pwszHeader: java.lang.String, ppwszValue: java.lang.String): scala.Unit = js.native
  def open(
    pwszMethod: java.lang.String,
    pwszUrl: java.lang.String,
    pStatusCallback: IXMLHTTPRequest2Callback,
    pwszUserName: java.lang.String,
    pwszPassword: java.lang.String,
    pwszProxyUserName: java.lang.String,
    pwszProxyPassword: java.lang.String
  ): scala.Unit = js.native
  def send(pBody: ISequentialStream, cbBody: scala.Double): scala.Unit = js.native
  def setProperty(eProperty: XHR_PROPERTY, ullValue: scala.Double): scala.Unit = js.native
  def setRequestHeader(pwszHeader: java.lang.String, pwszValue: java.lang.String): scala.Unit = js.native
}

