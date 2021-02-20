package typings.agGrid.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EPopup extends StObject {
  
  var ePopup: HTMLElement = js.native
  
  var eventSource: js.Any = js.native
}
object EPopup {
  
  @scala.inline
  def apply(ePopup: HTMLElement, eventSource: js.Any): EPopup = {
    val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EPopup]
  }
  
  @scala.inline
  implicit class EPopupMutableBuilder[Self <: EPopup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEPopup(value: HTMLElement): Self = StObject.set(x, "ePopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSource(value: js.Any): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
  }
}
