package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLHttpRequestEventTarget extends StObject {
  
  /* private */ @JSName("MSHTML.XMLHttpRequestEventTarget_typekey")
  var MSHTMLDotXMLHttpRequestEventTarget_typekey: XMLHttpRequestEventTarget
  
  def addEventListener(`type`: String, listener: Any, useCapture: Boolean): Unit
  
  def dispatchEvent(evt: IDOMEvent): Boolean
  
  def removeEventListener(`type`: String, listener: Any, useCapture: Boolean): Unit
}
object XMLHttpRequestEventTarget {
  
  inline def apply(
    MSHTMLDotXMLHttpRequestEventTarget_typekey: XMLHttpRequestEventTarget,
    addEventListener: (String, Any, Boolean) => Unit,
    dispatchEvent: IDOMEvent => Boolean,
    removeEventListener: (String, Any, Boolean) => Unit
  ): XMLHttpRequestEventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.updateDynamic("MSHTML.XMLHttpRequestEventTarget_typekey")(MSHTMLDotXMLHttpRequestEventTarget_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XMLHttpRequestEventTarget] (val x: Self) extends AnyVal {
    
    inline def setAddEventListener(value: (String, Any, Boolean) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction3(value))
    
    inline def setDispatchEvent(value: IDOMEvent => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    inline def setMSHTMLDotXMLHttpRequestEventTarget_typekey(value: XMLHttpRequestEventTarget): Self = StObject.set(x, "MSHTML.XMLHttpRequestEventTarget_typekey", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: (String, Any, Boolean) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction3(value))
  }
}
