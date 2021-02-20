package typings.ariaQuery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMDefinition extends StObject {
  
  var interactive: js.UndefOr[Boolean] = js.native
  
  var reserved: js.UndefOr[Boolean] = js.native
}
object DOMDefinition {
  
  @scala.inline
  def apply(): DOMDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMDefinition]
  }
  
  @scala.inline
  implicit class DOMDefinitionMutableBuilder[Self <: DOMDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    @scala.inline
    def setReserved(value: Boolean): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
  }
}
