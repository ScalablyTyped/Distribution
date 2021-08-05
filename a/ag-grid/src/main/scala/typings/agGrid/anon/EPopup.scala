package typings.agGrid.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EPopup extends StObject {
  
  var ePopup: HTMLElement
  
  var eventSource: js.Any
}
object EPopup {
  
  inline def apply(ePopup: HTMLElement, eventSource: js.Any): EPopup = {
    val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EPopup]
  }
  
  extension [Self <: EPopup](x: Self) {
    
    inline def setEPopup(value: HTMLElement): Self = StObject.set(x, "ePopup", value.asInstanceOf[js.Any])
    
    inline def setEventSource(value: js.Any): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
  }
}
