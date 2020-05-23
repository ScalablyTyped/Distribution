package typings.activexMsxml2.global.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IXMLHTTPRequest2Callback Interface */
@JSGlobal("MSXML2.IXMLHTTPRequest2Callback")
@js.native
class IXMLHTTPRequest2Callback protected ()
  extends typings.activexMsxml2.MSXML2.IXMLHTTPRequest2Callback {
  /* CompleteClass */
  @JSName("MSXML2.IXMLHTTPRequest2Callback_typekey")
  override var MSXML2DotIXMLHTTPRequest2Callback_typekey: typings.activexMsxml2.MSXML2.IXMLHTTPRequest2Callback = js.native
  /* CompleteClass */
  override def OnError(pXHR: typings.activexMsxml2.MSXML2.FreeThreadedXMLHTTP60): Unit = js.native
  /* CompleteClass */
  override def OnHeadersAvailable(pXHR: typings.activexMsxml2.MSXML2.FreeThreadedXMLHTTP60, dwStatus: Double, pwszStatus: String): Unit = js.native
  /* CompleteClass */
  override def OnRedirect(pXHR: typings.activexMsxml2.MSXML2.FreeThreadedXMLHTTP60, pwszRedirectUrl: String): Unit = js.native
  /* CompleteClass */
  override def OnResponseReceived(
    pXHR: typings.activexMsxml2.MSXML2.FreeThreadedXMLHTTP60,
    pResponseStream: typings.activexMsxml2.MSXML2.ISequentialStream
  ): Unit = js.native
  /* CompleteClass */
  override def ondataavailable(
    pXHR: typings.activexMsxml2.MSXML2.FreeThreadedXMLHTTP60,
    pResponseStream: typings.activexMsxml2.MSXML2.ISequentialStream
  ): Unit = js.native
}

