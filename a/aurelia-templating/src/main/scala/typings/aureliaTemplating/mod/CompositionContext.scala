package typings.aureliaTemplating.mod

import typings.aureliaDependencyInjection.mod.Container
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositionContext extends StObject {
  
  /**
    * The context in which the view model is executed in.
    */
  var bindingContext: js.Any = js.native
  
  /**
    * The child Container for the component creation. One will be created from the parent if not provided.
    */
  var childContainer: js.UndefOr[Container] = js.native
  
  /**
    * The parent Container for the component creation.
    */
  var container: Container = js.native
  
  /**
    * The element that will parent the dynamic component.
    * It will be registered in the child container of this composition.
    */
  var host: js.UndefOr[Element] = js.native
  
  /**
    * Data to be passed to the "activate" hook on the view model.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /**
    * A secondary binding context that can override the standard context.
    */
  var overrideContext: js.UndefOr[js.Any] = js.native
  
  /**
    * The view inside which this composition is happening.
    */
  var owningView: js.UndefOr[View_] = js.native
  
  /**
    * Should the composition system skip calling the "activate" hook on the view model.
    */
  var skipActivation: js.UndefOr[Boolean] = js.native
  
  /**
    * The view url or view strategy to override the default view location convention.
    */
  var view: js.UndefOr[String | ViewStrategy_] = js.native
  
  /**
    * The view model url or instance for the component.
    */
  var viewModel: js.UndefOr[js.Any] = js.native
  
  /**
    * The HtmlBehaviorResource for the component.
    */
  var viewModelResource: js.UndefOr[HtmlBehaviorResource] = js.native
  
  /**
    * The view resources for the view in which the component should be created.
    */
  var viewResources: ViewResources_ = js.native
  
  /**
    * The slot to push the dynamically composed component into.
    */
  var viewSlot: ViewSlot = js.native
}
object CompositionContext {
  
  @scala.inline
  def apply(bindingContext: js.Any, container: Container, viewResources: ViewResources_, viewSlot: ViewSlot): CompositionContext = {
    val __obj = js.Dynamic.literal(bindingContext = bindingContext.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], viewResources = viewResources.asInstanceOf[js.Any], viewSlot = viewSlot.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionContext]
  }
  
  @scala.inline
  implicit class CompositionContextMutableBuilder[Self <: CompositionContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingContext(value: js.Any): Self = StObject.set(x, "bindingContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildContainer(value: Container): Self = StObject.set(x, "childContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildContainerUndefined: Self = StObject.set(x, "childContainer", js.undefined)
    
    @scala.inline
    def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: Element): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setOverrideContext(value: js.Any): Self = StObject.set(x, "overrideContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideContextUndefined: Self = StObject.set(x, "overrideContext", js.undefined)
    
    @scala.inline
    def setOwningView(value: View_): Self = StObject.set(x, "owningView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwningViewUndefined: Self = StObject.set(x, "owningView", js.undefined)
    
    @scala.inline
    def setSkipActivation(value: Boolean): Self = StObject.set(x, "skipActivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipActivationUndefined: Self = StObject.set(x, "skipActivation", js.undefined)
    
    @scala.inline
    def setView(value: String | ViewStrategy_): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: js.Any): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelResource(value: HtmlBehaviorResource): Self = StObject.set(x, "viewModelResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelResourceUndefined: Self = StObject.set(x, "viewModelResource", js.undefined)
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewResources(value: ViewResources_): Self = StObject.set(x, "viewResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewSlot(value: ViewSlot): Self = StObject.set(x, "viewSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
