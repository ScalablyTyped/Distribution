package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLHttpRequestEventTarget extends StObject {
  
  @JSName("MSHTML.XMLHttpRequestEventTarget_typekey")
  var MSHTMLDotXMLHttpRequestEventTarget_typekey: XMLHttpRequestEventTarget = js.native
  
  def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  
  def dispatchEvent(evt: IDOMEvent): Boolean = js.native
  
  def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
}
object XMLHttpRequestEventTarget {
  
  @scala.inline
  def apply(
    MSHTMLDotXMLHttpRequestEventTarget_typekey: XMLHttpRequestEventTarget,
    addEventListener: (String, js.Any, Boolean) => Unit,
    dispatchEvent: IDOMEvent => Boolean,
    removeEventListener: (String, js.Any, Boolean) => Unit
  ): XMLHttpRequestEventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.updateDynamic("MSHTML.XMLHttpRequestEventTarget_typekey")(MSHTMLDotXMLHttpRequestEventTarget_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventTarget]
  }
  
  @scala.inline
  implicit class XMLHttpRequestEventTargetMutableBuilder[Self <: XMLHttpRequestEventTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEventListener(value: (String, js.Any, Boolean) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDispatchEvent(value: IDOMEvent => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMSHTMLDotXMLHttpRequestEventTarget_typekey(value: XMLHttpRequestEventTarget): Self = StObject.set(x, "MSHTML.XMLHttpRequestEventTarget_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEventListener(value: (String, js.Any, Boolean) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction3(value))
  }
}
