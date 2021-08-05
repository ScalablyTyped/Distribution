package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IXMLHTTPRequest2Callback Interface */
trait IXMLHTTPRequest2Callback extends StObject {
  
  /* private */ @JSName("MSXML2.IXMLHTTPRequest2Callback_typekey")
  var MSXML2DotIXMLHTTPRequest2Callback_typekey: IXMLHTTPRequest2Callback
  
  def OnError(pXHR: FreeThreadedXMLHTTP60, hrError: Unit): Unit
  
  def OnHeadersAvailable(pXHR: FreeThreadedXMLHTTP60, dwStatus: Double, pwszStatus: String): Unit
  
  def OnRedirect(pXHR: FreeThreadedXMLHTTP60, pwszRedirectUrl: String): Unit
  
  def OnResponseReceived(pXHR: FreeThreadedXMLHTTP60, pResponseStream: ISequentialStream): Unit
  
  def ondataavailable(pXHR: FreeThreadedXMLHTTP60, pResponseStream: ISequentialStream): Unit
}
object IXMLHTTPRequest2Callback {
  
  inline def apply(
    MSXML2DotIXMLHTTPRequest2Callback_typekey: IXMLHTTPRequest2Callback,
    OnError: (FreeThreadedXMLHTTP60, Unit) => Unit,
    OnHeadersAvailable: (FreeThreadedXMLHTTP60, Double, String) => Unit,
    OnRedirect: (FreeThreadedXMLHTTP60, String) => Unit,
    OnResponseReceived: (FreeThreadedXMLHTTP60, ISequentialStream) => Unit,
    ondataavailable: (FreeThreadedXMLHTTP60, ISequentialStream) => Unit
  ): IXMLHTTPRequest2Callback = {
    val __obj = js.Dynamic.literal(OnError = js.Any.fromFunction2(OnError), OnHeadersAvailable = js.Any.fromFunction3(OnHeadersAvailable), OnRedirect = js.Any.fromFunction2(OnRedirect), OnResponseReceived = js.Any.fromFunction2(OnResponseReceived), ondataavailable = js.Any.fromFunction2(ondataavailable))
    __obj.updateDynamic("MSXML2.IXMLHTTPRequest2Callback_typekey")(MSXML2DotIXMLHTTPRequest2Callback_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXMLHTTPRequest2Callback]
  }
  
  extension [Self <: IXMLHTTPRequest2Callback](x: Self) {
    
    inline def setMSXML2DotIXMLHTTPRequest2Callback_typekey(value: IXMLHTTPRequest2Callback): Self = StObject.set(x, "MSXML2.IXMLHTTPRequest2Callback_typekey", value.asInstanceOf[js.Any])
    
    inline def setOnError(value: (FreeThreadedXMLHTTP60, Unit) => Unit): Self = StObject.set(x, "OnError", js.Any.fromFunction2(value))
    
    inline def setOnHeadersAvailable(value: (FreeThreadedXMLHTTP60, Double, String) => Unit): Self = StObject.set(x, "OnHeadersAvailable", js.Any.fromFunction3(value))
    
    inline def setOnRedirect(value: (FreeThreadedXMLHTTP60, String) => Unit): Self = StObject.set(x, "OnRedirect", js.Any.fromFunction2(value))
    
    inline def setOnResponseReceived(value: (FreeThreadedXMLHTTP60, ISequentialStream) => Unit): Self = StObject.set(x, "OnResponseReceived", js.Any.fromFunction2(value))
    
    inline def setOndataavailable(value: (FreeThreadedXMLHTTP60, ISequentialStream) => Unit): Self = StObject.set(x, "ondataavailable", js.Any.fromFunction2(value))
  }
}
