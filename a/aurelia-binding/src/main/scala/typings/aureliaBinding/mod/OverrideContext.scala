package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideContext extends StObject {
  
  var bindingContext: js.Any
  
  var parentOverrideContext: js.UndefOr[OverrideContext] = js.undefined
}
object OverrideContext {
  
  @scala.inline
  def apply(bindingContext: js.Any): OverrideContext = {
    val __obj = js.Dynamic.literal(bindingContext = bindingContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideContext]
  }
  
  @scala.inline
  implicit class OverrideContextMutableBuilder[Self <: OverrideContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingContext(value: js.Any): Self = StObject.set(x, "bindingContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentOverrideContext(value: OverrideContext): Self = StObject.set(x, "parentOverrideContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentOverrideContextUndefined: Self = StObject.set(x, "parentOverrideContext", js.undefined)
  }
}
