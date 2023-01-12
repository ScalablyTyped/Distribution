package typings.aureliaTemplating.mod

import typings.aureliaDependencyInjection.mod.Container
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnhanceInstruction extends StObject {
  
  /**
  	* A binding context for the enhancement.
  	*/
  var bindingContext: js.UndefOr[js.Object] = js.undefined
  
  /**
  	* The DI container to use as the root for UI enhancement.
  	*/
  var container: js.UndefOr[Container] = js.undefined
  
  /**
  	* The element to enhance.
  	*/
  var element: Element
  
  /**
  	* A secondary binding context that can override the standard context.
  	*/
  var overrideContext: js.UndefOr[Any] = js.undefined
  
  /**
  	* The resources available for enhancement.
  	*/
  var resources: js.UndefOr[ViewResources_] = js.undefined
}
object EnhanceInstruction {
  
  inline def apply(element: Element): EnhanceInstruction = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhanceInstruction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnhanceInstruction] (val x: Self) extends AnyVal {
    
    inline def setBindingContext(value: js.Object): Self = StObject.set(x, "bindingContext", value.asInstanceOf[js.Any])
    
    inline def setBindingContextUndefined: Self = StObject.set(x, "bindingContext", js.undefined)
    
    inline def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setOverrideContext(value: Any): Self = StObject.set(x, "overrideContext", value.asInstanceOf[js.Any])
    
    inline def setOverrideContextUndefined: Self = StObject.set(x, "overrideContext", js.undefined)
    
    inline def setResources(value: ViewResources_): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
  }
}
