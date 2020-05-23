package typings.aureliaTemplating.mod

import typings.aureliaDependencyInjection.mod.Container
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositionContext extends js.Object {
  /**
    * The context in which the view model is executed in.
    */
  var bindingContext: js.Any
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
  var model: js.UndefOr[js.Any] = js.undefined
  /**
    * A secondary binding context that can override the standard context.
    */
  var overrideContext: js.UndefOr[js.Any] = js.undefined
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
  var viewModel: js.UndefOr[js.Any] = js.undefined
  /**
    * The HtmlBehaviorResource for the component.
    */
  var viewModelResource: js.UndefOr[HtmlBehaviorResource] = js.undefined
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
  @scala.inline
  def apply(
    bindingContext: js.Any,
    container: Container,
    viewResources: ViewResources_,
    viewSlot: ViewSlot,
    childContainer: Container = null,
    host: Element = null,
    model: js.Any = null,
    overrideContext: js.Any = null,
    owningView: View_ = null,
    skipActivation: js.UndefOr[Boolean] = js.undefined,
    view: String | ViewStrategy_ = null,
    viewModel: js.Any = null,
    viewModelResource: HtmlBehaviorResource = null
  ): CompositionContext = {
    val __obj = js.Dynamic.literal(bindingContext = bindingContext.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], viewResources = viewResources.asInstanceOf[js.Any], viewSlot = viewSlot.asInstanceOf[js.Any])
    if (childContainer != null) __obj.updateDynamic("childContainer")(childContainer.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (overrideContext != null) __obj.updateDynamic("overrideContext")(overrideContext.asInstanceOf[js.Any])
    if (owningView != null) __obj.updateDynamic("owningView")(owningView.asInstanceOf[js.Any])
    if (!js.isUndefined(skipActivation)) __obj.updateDynamic("skipActivation")(skipActivation.get.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    if (viewModelResource != null) __obj.updateDynamic("viewModelResource")(viewModelResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionContext]
  }
}

