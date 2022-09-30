package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitModelToViewChange extends StObject {
  
  var emitEvent: js.UndefOr[Boolean] = js.undefined
  
  var emitModelToViewChange: js.UndefOr[Boolean] = js.undefined
  
  var emitViewToModelChange: js.UndefOr[Boolean] = js.undefined
  
  var onlySelf: js.UndefOr[Boolean] = js.undefined
}
object EmitModelToViewChange {
  
  inline def apply(): EmitModelToViewChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmitModelToViewChange]
  }
  
  extension [Self <: EmitModelToViewChange](x: Self) {
    
    inline def setEmitEvent(value: Boolean): Self = StObject.set(x, "emitEvent", value.asInstanceOf[js.Any])
    
    inline def setEmitEventUndefined: Self = StObject.set(x, "emitEvent", js.undefined)
    
    inline def setEmitModelToViewChange(value: Boolean): Self = StObject.set(x, "emitModelToViewChange", value.asInstanceOf[js.Any])
    
    inline def setEmitModelToViewChangeUndefined: Self = StObject.set(x, "emitModelToViewChange", js.undefined)
    
    inline def setEmitViewToModelChange(value: Boolean): Self = StObject.set(x, "emitViewToModelChange", value.asInstanceOf[js.Any])
    
    inline def setEmitViewToModelChangeUndefined: Self = StObject.set(x, "emitViewToModelChange", js.undefined)
    
    inline def setOnlySelf(value: Boolean): Self = StObject.set(x, "onlySelf", value.asInstanceOf[js.Any])
    
    inline def setOnlySelfUndefined: Self = StObject.set(x, "onlySelf", js.undefined)
  }
}
