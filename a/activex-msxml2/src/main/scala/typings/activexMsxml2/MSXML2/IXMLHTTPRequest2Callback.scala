package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IXMLHTTPRequest2Callback Interface */
trait IXMLHTTPRequest2Callback extends js.Object {
  @JSName("MSXML2.IXMLHTTPRequest2Callback_typekey")
  var MSXML2DotIXMLHTTPRequest2Callback_typekey: IXMLHTTPRequest2Callback
  def OnError(pXHR: FreeThreadedXMLHTTP60): Unit
  def OnHeadersAvailable(pXHR: FreeThreadedXMLHTTP60, dwStatus: Double, pwszStatus: String): Unit
  def OnRedirect(pXHR: FreeThreadedXMLHTTP60, pwszRedirectUrl: String): Unit
  def OnResponseReceived(pXHR: FreeThreadedXMLHTTP60, pResponseStream: ISequentialStream): Unit
  def ondataavailable(pXHR: FreeThreadedXMLHTTP60, pResponseStream: ISequentialStream): Unit
}

object IXMLHTTPRequest2Callback {
  @scala.inline
  def apply(
    MSXML2DotIXMLHTTPRequest2Callback_typekey: IXMLHTTPRequest2Callback,
    OnError: FreeThreadedXMLHTTP60 => Unit,
    OnHeadersAvailable: (FreeThreadedXMLHTTP60, Double, String) => Unit,
    OnRedirect: (FreeThreadedXMLHTTP60, String) => Unit,
    OnResponseReceived: (FreeThreadedXMLHTTP60, ISequentialStream) => Unit,
    ondataavailable: (FreeThreadedXMLHTTP60, ISequentialStream) => Unit
  ): IXMLHTTPRequest2Callback = {
    val __obj = js.Dynamic.literal(OnError = js.Any.fromFunction1(OnError), OnHeadersAvailable = js.Any.fromFunction3(OnHeadersAvailable), OnRedirect = js.Any.fromFunction2(OnRedirect), OnResponseReceived = js.Any.fromFunction2(OnResponseReceived), ondataavailable = js.Any.fromFunction2(ondataavailable))
    __obj.updateDynamic("MSXML2.IXMLHTTPRequest2Callback_typekey")(MSXML2DotIXMLHTTPRequest2Callback_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXMLHTTPRequest2Callback]
  }
}

