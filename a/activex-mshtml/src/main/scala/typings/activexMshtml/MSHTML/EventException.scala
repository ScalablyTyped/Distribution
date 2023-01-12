package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventException extends StObject {
  
  /* private */ @JSName("MSHTML.EventException_typekey")
  var MSHTMLDotEventException_typekey: EventException
}
object EventException {
  
  inline def apply(MSHTMLDotEventException_typekey: EventException): EventException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MSHTML.EventException_typekey")(MSHTMLDotEventException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventException]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventException] (val x: Self) extends AnyVal {
    
    inline def setMSHTMLDotEventException_typekey(value: EventException): Self = StObject.set(x, "MSHTML.EventException_typekey", value.asInstanceOf[js.Any])
  }
}
