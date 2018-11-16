package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IXMLHTTPRequest2Callback Interface */
@JSGlobal("MSXML2.IXMLHTTPRequest2Callback")
@js.native
class IXMLHTTPRequest2Callback protected () extends js.Object {
  var `MSXML2.IXMLHTTPRequest2Callback_typekey`: IXMLHTTPRequest2Callback = js.native
  def OnError(pXHR: FreeThreadedXMLHTTP60): scala.Unit = js.native
  def OnHeadersAvailable(pXHR: FreeThreadedXMLHTTP60, dwStatus: scala.Double, pwszStatus: java.lang.String): scala.Unit = js.native
  def OnRedirect(pXHR: FreeThreadedXMLHTTP60, pwszRedirectUrl: java.lang.String): scala.Unit = js.native
  def OnResponseReceived(pXHR: FreeThreadedXMLHTTP60, pResponseStream: ISequentialStream): scala.Unit = js.native
  def ondataavailable(pXHR: FreeThreadedXMLHTTP60, pResponseStream: ISequentialStream): scala.Unit = js.native
}

