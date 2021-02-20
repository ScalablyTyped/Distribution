package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Free Threaded XML HTTP Request class 6.0 */
@js.native
trait FreeThreadedXMLHTTP60 extends StObject {
  
  def GetCookie(pwszUrl: String, pwszName: String, dwFlags: Double, pcCookies: Double, ppCookies: tagXHRCOOKIE): Unit = js.native
  
  @JSName("MSXML2.FreeThreadedXMLHTTP60_typekey")
  var MSXML2DotFreeThreadedXMLHTTP60_typekey: FreeThreadedXMLHTTP60 = js.native
  
  def SetCookie(pCookie: tagXHRCOOKIE, pdwCookieState: Double): Unit = js.native
  
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
object FreeThreadedXMLHTTP60 {
  
  @scala.inline
  def apply(
    GetCookie: (String, String, Double, Double, tagXHRCOOKIE) => Unit,
    MSXML2DotFreeThreadedXMLHTTP60_typekey: FreeThreadedXMLHTTP60,
    SetCookie: (tagXHRCOOKIE, Double) => Unit,
    SetCustomResponseStream: ISequentialStream => Unit,
    abort: () => Unit,
    getAllResponseHeaders: String => Unit,
    getResponseHeader: (String, String) => Unit,
    open: (String, String, IXMLHTTPRequest2Callback, String, String, String, String) => Unit,
    send: (ISequentialStream, Double) => Unit,
    setProperty: (XHR_PROPERTY, Double) => Unit,
    setRequestHeader: (String, String) => Unit
  ): FreeThreadedXMLHTTP60 = {
    val __obj = js.Dynamic.literal(GetCookie = js.Any.fromFunction5(GetCookie), SetCookie = js.Any.fromFunction2(SetCookie), SetCustomResponseStream = js.Any.fromFunction1(SetCustomResponseStream), abort = js.Any.fromFunction0(abort), getAllResponseHeaders = js.Any.fromFunction1(getAllResponseHeaders), getResponseHeader = js.Any.fromFunction2(getResponseHeader), open = js.Any.fromFunction7(open), send = js.Any.fromFunction2(send), setProperty = js.Any.fromFunction2(setProperty), setRequestHeader = js.Any.fromFunction2(setRequestHeader))
    __obj.updateDynamic("MSXML2.FreeThreadedXMLHTTP60_typekey")(MSXML2DotFreeThreadedXMLHTTP60_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeThreadedXMLHTTP60]
  }
  
  @scala.inline
  implicit class FreeThreadedXMLHTTP60MutableBuilder[Self <: FreeThreadedXMLHTTP60] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllResponseHeaders(value: String => Unit): Self = StObject.set(x, "getAllResponseHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCookie(value: (String, String, Double, Double, tagXHRCOOKIE) => Unit): Self = StObject.set(x, "GetCookie", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGetResponseHeader(value: (String, String) => Unit): Self = StObject.set(x, "getResponseHeader", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMSXML2DotFreeThreadedXMLHTTP60_typekey(value: FreeThreadedXMLHTTP60): Self = StObject.set(x, "MSXML2.FreeThreadedXMLHTTP60_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: (String, String, IXMLHTTPRequest2Callback, String, String, String, String) => Unit): Self = StObject.set(x, "open", js.Any.fromFunction7(value))
    
    @scala.inline
    def setSend(value: (ISequentialStream, Double) => Unit): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetCookie(value: (tagXHRCOOKIE, Double) => Unit): Self = StObject.set(x, "SetCookie", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetCustomResponseStream(value: ISequentialStream => Unit): Self = StObject.set(x, "SetCustomResponseStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetProperty(value: (XHR_PROPERTY, Double) => Unit): Self = StObject.set(x, "setProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetRequestHeader(value: (String, String) => Unit): Self = StObject.set(x, "setRequestHeader", js.Any.fromFunction2(value))
  }
}
