package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IXMLHTTPRequest2Callback Interface */
@js.native
trait IXMLHTTPRequest2Callback extends StObject {
  
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
  implicit class IXMLHTTPRequest2CallbackMutableBuilder[Self <: IXMLHTTPRequest2Callback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSXML2DotIXMLHTTPRequest2Callback_typekey(value: IXMLHTTPRequest2Callback): Self = StObject.set(x, "MSXML2.IXMLHTTPRequest2Callback_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnError(value: (FreeThreadedXMLHTTP60, js.UndefOr[scala.Nothing]) => Unit): Self = StObject.set(x, "OnError", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnHeadersAvailable(value: (FreeThreadedXMLHTTP60, Double, String) => Unit): Self = StObject.set(x, "OnHeadersAvailable", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnRedirect(value: (FreeThreadedXMLHTTP60, String) => Unit): Self = StObject.set(x, "OnRedirect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnResponseReceived(value: (FreeThreadedXMLHTTP60, ISequentialStream) => Unit): Self = StObject.set(x, "OnResponseReceived", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOndataavailable(value: (FreeThreadedXMLHTTP60, ISequentialStream) => Unit): Self = StObject.set(x, "ondataavailable", js.Any.fromFunction2(value))
  }
}
