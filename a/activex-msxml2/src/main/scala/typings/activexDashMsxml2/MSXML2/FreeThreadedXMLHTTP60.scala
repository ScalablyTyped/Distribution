package typings.activexDashMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Free Threaded XML HTTP Request class 6.0 */
@JSGlobal("MSXML2.FreeThreadedXMLHTTP60")
@js.native
class FreeThreadedXMLHTTP60 protected () extends js.Object {
  @JSName("MSXML2.FreeThreadedXMLHTTP60_typekey")
  var MSXML2DotFreeThreadedXMLHTTP60_typekey: FreeThreadedXMLHTTP60 = js.native
  def GetCookie(pwszUrl: String, pwszName: String, dwFlags: Double, pcCookies: Double, ppCookies: tagXHR_COOKIE): Unit = js.native
  def SetCookie(pCookie: tagXHR_COOKIE, pdwCookieState: Double): Unit = js.native
  def SetCustomResponseStream(pSequentialStream: ISequentialStream): Unit = js.native
  def abort(): Unit = js.native
  def getAllResponseHeaders(ppwszHeaders: String): Unit = js.native
  def getResponseHeader(pwszHeader: String, ppwszValue: String): Unit = js.native
  def open(
    pwszMethod: String,
    pwszUrl: String,
    pStatusCallback: IXMLHTTPRequest2Callback,
    pwszUserName: String,
    pwszPassword: String,
    pwszProxyUserName: String,
    pwszProxyPassword: String
  ): Unit = js.native
  def send(pBody: ISequentialStream, cbBody: Double): Unit = js.native
  def setProperty(eProperty: XHR_PROPERTY, ullValue: Double): Unit = js.native
  def setRequestHeader(pwszHeader: String, pwszValue: String): Unit = js.native
}

