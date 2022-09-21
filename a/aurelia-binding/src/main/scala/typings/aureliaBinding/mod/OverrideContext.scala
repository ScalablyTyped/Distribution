package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideContext extends StObject {
  
  var bindingContext: Any
  
  var parentOverrideContext: js.UndefOr[OverrideContext] = js.undefined
}
object OverrideContext {
  
  inline def apply(bindingContext: Any): OverrideContext = {
    val __obj = js.Dynamic.literal(bindingContext = bindingContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideContext]
  }
  
  extension [Self <: OverrideContext](x: Self) {
    
    inline def setBindingContext(value: Any): Self = StObject.set(x, "bindingContext", value.asInstanceOf[js.Any])
    
    inline def setParentOverrideContext(value: OverrideContext): Self = StObject.set(x, "parentOverrideContext", value.asInstanceOf[js.Any])
    
    inline def setParentOverrideContextUndefined: Self = StObject.set(x, "parentOverrideContext", js.undefined)
  }
}
