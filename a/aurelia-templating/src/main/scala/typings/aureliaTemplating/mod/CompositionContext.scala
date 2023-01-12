package typings.aureliaTemplating.mod

import typings.aureliaDependencyInjection.mod.Container
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositionContext extends StObject {
  
  /**
  	* The context in which the view model is executed in.
  	*/
  var bindingContext: Any
  
  /**
  	* The child Container for the component creation. One will be created from the parent if not provided.
  	*/
  var childContainer: js.UndefOr[Container] = js.undefined
  
  /**
  	* The parent Container for the component creation.
  	*/
  var container: Container
  
  /**
  	* The element that will parent the dynamic component.
  	* It will be registered in the child container of this composition.
  	*/
  var host: js.UndefOr[Element] = js.undefined
  
  /**
  	* Data to be passed to the "activate" hook on the view model.
  	*/
  var model: js.UndefOr[Any] = js.undefined
  
  /**
  	* A secondary binding context that can override the standard context.
  	*/
  var overrideContext: js.UndefOr[Any] = js.undefined
  
  /**
  	* The view inside which this composition is happening.
  	*/
  var owningView: js.UndefOr[View_] = js.undefined
  
  /**
  	* Should the composition system skip calling the "activate" hook on the view model.
  	*/
  var skipActivation: js.UndefOr[Boolean] = js.undefined
  
  /**
  	* The view url or view strategy to override the default view location convention.
  	*/
  var view: js.UndefOr[String | ViewStrategy_] = js.undefined
  
  /**
  	* The view model url or instance for the component.
  	*/
  var viewModel: js.UndefOr[Any] = js.undefined
  
  /**
  	* The HtmlBehaviorResource for the component.
  	*/
  var viewModelResource: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
  	* The view resources for the view in which the component should be created.
  	*/
  var viewResources: ViewResources_
  
  /**
  	* The slot to push the dynamically composed component into.
  	*/
  var viewSlot: ViewSlot
}
object CompositionContext {
  
  inline def apply(bindingContext: Any, container: Container, viewResources: ViewResources_, viewSlot: ViewSlot): CompositionContext = {
    val __obj = js.Dynamic.literal(bindingContext = bindingContext.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], viewResources = viewResources.asInstanceOf[js.Any], viewSlot = viewSlot.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompositionContext] (val x: Self) extends AnyVal {
    
    inline def setBindingContext(value: Any): Self = StObject.set(x, "bindingContext", value.asInstanceOf[js.Any])
    
    inline def setChildContainer(value: Container): Self = StObject.set(x, "childContainer", value.asInstanceOf[js.Any])
    
    inline def setChildContainerUndefined: Self = StObject.set(x, "childContainer", js.undefined)
    
    inline def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setHost(value: Element): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setOverrideContext(value: Any): Self = StObject.set(x, "overrideContext", value.asInstanceOf[js.Any])
    
    inline def setOverrideContextUndefined: Self = StObject.set(x, "overrideContext", js.undefined)
    
    inline def setOwningView(value: View_): Self = StObject.set(x, "owningView", value.asInstanceOf[js.Any])
    
    inline def setOwningViewUndefined: Self = StObject.set(x, "owningView", js.undefined)
    
    inline def setSkipActivation(value: Boolean): Self = StObject.set(x, "skipActivation", value.asInstanceOf[js.Any])
    
    inline def setSkipActivationUndefined: Self = StObject.set(x, "skipActivation", js.undefined)
    
    inline def setView(value: String | ViewStrategy_): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: Any): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelResource(value: ResourceDescription): Self = StObject.set(x, "viewModelResource", value.asInstanceOf[js.Any])
    
    inline def setViewModelResourceUndefined: Self = StObject.set(x, "viewModelResource", js.undefined)
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewResources(value: ViewResources_): Self = StObject.set(x, "viewResources", value.asInstanceOf[js.Any])
    
    inline def setViewSlot(value: ViewSlot): Self = StObject.set(x, "viewSlot", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
