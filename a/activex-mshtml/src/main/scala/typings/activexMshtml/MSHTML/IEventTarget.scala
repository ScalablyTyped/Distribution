package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventTarget extends StObject {
  
  /* private */ @JSName("MSHTML.IEventTarget_typekey")
  var MSHTMLDotIEventTarget_typekey: IEventTarget
  
  def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit
  
  def dispatchEvent(evt: IDOMEvent): Boolean
  
  def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit
}
object IEventTarget {
  
  inline def apply(
    MSHTMLDotIEventTarget_typekey: IEventTarget,
    addEventListener: (String, js.Any, Boolean) => Unit,
    dispatchEvent: IDOMEvent => Boolean,
    removeEventListener: (String, js.Any, Boolean) => Unit
  ): IEventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.updateDynamic("MSHTML.IEventTarget_typekey")(MSHTMLDotIEventTarget_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventTarget]
  }
  
  extension [Self <: IEventTarget](x: Self) {
    
    inline def setAddEventListener(value: (String, js.Any, Boolean) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction3(value))
    
    inline def setDispatchEvent(value: IDOMEvent => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    inline def setMSHTMLDotIEventTarget_typekey(value: IEventTarget): Self = StObject.set(x, "MSHTML.IEventTarget_typekey", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: (String, js.Any, Boolean) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction3(value))
  }
}
