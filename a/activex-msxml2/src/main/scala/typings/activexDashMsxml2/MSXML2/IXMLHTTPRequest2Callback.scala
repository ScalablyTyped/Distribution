package typings.activexDashMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IXMLHTTPRequest2Callback Interface */
@JSGlobal("MSXML2.IXMLHTTPRequest2Callback")
@js.native
class IXMLHTTPRequest2Callback protected () extends js.Object {
  @JSName("MSXML2.IXMLHTTPRequest2Callback_typekey")
  var MSXML2DotIXMLHTTPRequest2Callback_typekey: IXMLHTTPRequest2Callback = js.native
  def OnError(pXHR: FreeThreadedXMLHTTP60): Unit = js.native
  def OnHeadersAvailable(pXHR: FreeThreadedXMLHTTP60, dwStatus: Double, pwszStatus: String): Unit = js.native
  def OnRedirect(pXHR: FreeThreadedXMLHTTP60, pwszRedirectUrl: String): Unit = js.native
  def OnResponseReceived(pXHR: FreeThreadedXMLHTTP60, pResponseStream: ISequentialStream): Unit = js.native
  def ondataavailable(pXHR: FreeThreadedXMLHTTP60, pResponseStream: ISequentialStream): Unit = js.native
}

