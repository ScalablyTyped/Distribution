package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitEvent extends StObject {
  
  var emitEvent: js.UndefOr[Boolean] = js.undefined
  
  var onlySelf: js.UndefOr[Boolean] = js.undefined
}
object EmitEvent {
  
  inline def apply(): EmitEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmitEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmitEvent] (val x: Self) extends AnyVal {
    
    inline def setEmitEvent(value: Boolean): Self = StObject.set(x, "emitEvent", value.asInstanceOf[js.Any])
    
    inline def setEmitEventUndefined: Self = StObject.set(x, "emitEvent", js.undefined)
    
    inline def setOnlySelf(value: Boolean): Self = StObject.set(x, "onlySelf", value.asInstanceOf[js.Any])
    
    inline def setOnlySelfUndefined: Self = StObject.set(x, "onlySelf", js.undefined)
  }
}
