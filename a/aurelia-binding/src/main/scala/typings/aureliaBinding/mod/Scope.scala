package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scope extends StObject {
  
  /**
    * The primary aspect of the binding scope.  Typically a view-model instance.
    */
  var bindingContext: js.Any
  
  /**
    * The "parallel" or "artificial" aspect of the binding scope. Provides access to the parent binding
    * context and stores contextual bindable members such as $event, $index, $odd, etc. Members on this
    * object take precedence over members of the bindingContext object.
    */
  var overrideContext: OverrideContext
}
object Scope {
  
  @scala.inline
  def apply(bindingContext: js.Any, overrideContext: OverrideContext): Scope = {
    val __obj = js.Dynamic.literal(bindingContext = bindingContext.asInstanceOf[js.Any], overrideContext = overrideContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
  
  @scala.inline
  implicit class ScopeMutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingContext(value: js.Any): Self = StObject.set(x, "bindingContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideContext(value: OverrideContext): Self = StObject.set(x, "overrideContext", value.asInstanceOf[js.Any])
  }
}
