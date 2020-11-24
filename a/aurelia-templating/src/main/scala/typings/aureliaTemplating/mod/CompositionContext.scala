package typings.aureliaTemplating.mod

import typings.aureliaDependencyInjection.mod.Container
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositionContext extends js.Object {
  
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
  implicit class CompositionContextOps[Self <: CompositionContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBindingContext(value: js.Any): Self = this.set("bindingContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: Container): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewResources(value: ViewResources_): Self = this.set("viewResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewSlot(value: ViewSlot): Self = this.set("viewSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildContainer(value: Container): Self = this.set("childContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildContainer: Self = this.set("childContainer", js.undefined)
    
    @scala.inline
    def setHost(value: Element): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setOverrideContext(value: js.Any): Self = this.set("overrideContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideContext: Self = this.set("overrideContext", js.undefined)
    
    @scala.inline
    def setOwningView(value: View_): Self = this.set("owningView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwningView: Self = this.set("owningView", js.undefined)
    
    @scala.inline
    def setSkipActivation(value: Boolean): Self = this.set("skipActivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipActivation: Self = this.set("skipActivation", js.undefined)
    
    @scala.inline
    def setView(value: String | ViewStrategy_): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setViewModel(value: js.Any): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
    
    @scala.inline
    def setViewModelResource(value: HtmlBehaviorResource): Self = this.set("viewModelResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModelResource: Self = this.set("viewModelResource", js.undefined)
  }
}
