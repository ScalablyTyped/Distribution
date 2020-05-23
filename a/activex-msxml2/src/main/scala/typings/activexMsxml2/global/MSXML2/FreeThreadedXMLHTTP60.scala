package typings.activexMsxml2.global.MSXML2

import typings.activexMsxml2.MSXML2.XHR_PROPERTY
import typings.activexMsxml2.MSXML2.tagXHRCOOKIE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Free Threaded XML HTTP Request class 6.0 */
@JSGlobal("MSXML2.FreeThreadedXMLHTTP60")
@js.native
class FreeThreadedXMLHTTP60 protected ()
  extends typings.activexMsxml2.MSXML2.FreeThreadedXMLHTTP60 {
  /* CompleteClass */
  @JSName("MSXML2.FreeThreadedXMLHTTP60_typekey")
  override var MSXML2DotFreeThreadedXMLHTTP60_typekey: typings.activexMsxml2.MSXML2.FreeThreadedXMLHTTP60 = js.native
  /* CompleteClass */
  override def GetCookie(pwszUrl: String, pwszName: String, dwFlags: Double, pcCookies: Double, ppCookies: tagXHRCOOKIE): Unit = js.native
  /* CompleteClass */
  override def SetCookie(pCookie: tagXHRCOOKIE, pdwCookieState: Double): Unit = js.native
  /* CompleteClass */
  override def SetCustomResponseStream(pSequentialStream: typings.activexMsxml2.MSXML2.ISequentialStream): Unit = js.native
  /* CompleteClass */
  override def abort(): Unit = js.native
  /* CompleteClass */
  override def getAllResponseHeaders(ppwszHeaders: String): Unit = js.native
  /* CompleteClass */
  override def getResponseHeader(pwszHeader: String, ppwszValue: String): Unit = js.native
  /* CompleteClass */
  override def open(
    pwszMethod: String,
    pwszUrl: String,
    pStatusCallback: typings.activexMsxml2.MSXML2.IXMLHTTPRequest2Callback,
    pwszUserName: String,
    pwszPassword: String,
    pwszProxyUserName: String,
    pwszProxyPassword: String
  ): Unit = js.native
  /* CompleteClass */
  override def send(pBody: typings.activexMsxml2.MSXML2.ISequentialStream, cbBody: Double): Unit = js.native
  /* CompleteClass */
  override def setProperty(eProperty: XHR_PROPERTY, ullValue: Double): Unit = js.native
  /* CompleteClass */
  override def setRequestHeader(pwszHeader: String, pwszValue: String): Unit = js.native
}

