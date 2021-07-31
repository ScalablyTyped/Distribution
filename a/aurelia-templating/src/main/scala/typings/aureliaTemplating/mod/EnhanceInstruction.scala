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
  var overrideContext: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The resources available for enhancement.
    */
  var resources: js.UndefOr[ViewResources_] = js.undefined
}
object EnhanceInstruction {
  
  @scala.inline
  def apply(element: Element): EnhanceInstruction = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhanceInstruction]
  }
  
  @scala.inline
  implicit class EnhanceInstructionMutableBuilder[Self <: EnhanceInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingContext(value: js.Object): Self = StObject.set(x, "bindingContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingContextUndefined: Self = StObject.set(x, "bindingContext", js.undefined)
    
    @scala.inline
    def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideContext(value: js.Any): Self = StObject.set(x, "overrideContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideContextUndefined: Self = StObject.set(x, "overrideContext", js.undefined)
    
    @scala.inline
    def setResources(value: ViewResources_): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
  }
}
