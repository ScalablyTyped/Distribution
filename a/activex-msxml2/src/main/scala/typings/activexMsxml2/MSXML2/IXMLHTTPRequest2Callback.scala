package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IXMLHTTPRequest2Callback Interface */
@js.native
trait IXMLHTTPRequest2Callback extends js.Object {
  @JSName("MSXML2.IXMLHTTPRequest2Callback_typekey")
  var MSXML2DotIXMLHTTPRequest2Callback_typekey: IXMLHTTPRequest2Callback = js.native
  def OnError(pXHR: FreeThreadedXMLHTTP60, hrError: js.UndefOr[scala.Nothing]): Unit = js.native
  def OnHeadersAvailable(pXHR: FreeThreadedXMLHTTP60, dwStatus: Double, pwszStatus: String): Unit = js.native
  def OnRedirect(pXHR: FreeThreadedXMLHTTP60, pwszRedirectUrl: String): Unit = js.native
  def OnResponseReceived(pXHR: FreeThreadedXMLHTTP60, pResponseStream: ISequentialStream): Unit = js.native
  def ondataavailable(pXHR: FreeThreadedXMLHTTP60, pResponseStream: ISequentialStream): Unit = js.native
}

object IXMLHTTPRequest2Callback {
  @scala.inline
  def apply(
    MSXML2DotIXMLHTTPRequest2Callback_typekey: IXMLHTTPRequest2Callback,
    OnError: (FreeThreadedXMLHTTP60, js.UndefOr[scala.Nothing]) => Unit,
    OnHeadersAvailable: (FreeThreadedXMLHTTP60, Double, String) => Unit,
    OnRedirect: (FreeThreadedXMLHTTP60, String) => Unit,
    OnResponseReceived: (FreeThreadedXMLHTTP60, ISequentialStream) => Unit,
    ondataavailable: (FreeThreadedXMLHTTP60, ISequentialStream) => Unit
  ): IXMLHTTPRequest2Callback = {
    val __obj = js.Dynamic.literal(OnError = js.Any.fromFunction2(OnError), OnHeadersAvailable = js.Any.fromFunction3(OnHeadersAvailable), OnRedirect = js.Any.fromFunction2(OnRedirect), OnResponseReceived = js.Any.fromFunction2(OnResponseReceived), ondataavailable = js.Any.fromFunction2(ondataavailable))
    __obj.updateDynamic("MSXML2.IXMLHTTPRequest2Callback_typekey")(MSXML2DotIXMLHTTPRequest2Callback_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXMLHTTPRequest2Callback]
  }
  @scala.inline
  implicit class IXMLHTTPRequest2CallbackOps[Self <: IXMLHTTPRequest2Callback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMSXML2DotIXMLHTTPRequest2Callback_typekey(value: IXMLHTTPRequest2Callback): Self = this.set("MSXML2.IXMLHTTPRequest2Callback_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnError(value: (FreeThreadedXMLHTTP60, js.UndefOr[scala.Nothing]) => Unit): Self = this.set("OnError", js.Any.fromFunction2(value))
    @scala.inline
    def setOnHeadersAvailable(value: (FreeThreadedXMLHTTP60, Double, String) => Unit): Self = this.set("OnHeadersAvailable", js.Any.fromFunction3(value))
    @scala.inline
    def setOnRedirect(value: (FreeThreadedXMLHTTP60, String) => Unit): Self = this.set("OnRedirect", js.Any.fromFunction2(value))
    @scala.inline
    def setOnResponseReceived(value: (FreeThreadedXMLHTTP60, ISequentialStream) => Unit): Self = this.set("OnResponseReceived", js.Any.fromFunction2(value))
    @scala.inline
    def setOndataavailable(value: (FreeThreadedXMLHTTP60, ISequentialStream) => Unit): Self = this.set("ondataavailable", js.Any.fromFunction2(value))
  }
  
}

