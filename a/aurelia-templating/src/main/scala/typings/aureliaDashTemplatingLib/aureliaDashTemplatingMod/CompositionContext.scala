package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

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
  var childContainer: js.UndefOr[
    aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container
  ] = js.undefined
  /**
    * The parent Container for the component creation.
    */
  var container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container
  /**
    * The element that will parent the dynamic component.
    * It will be registered in the child container of this composition.
    */
  var host: js.UndefOr[stdLib.Element] = js.undefined
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
  var owningView: js.UndefOr[View] = js.undefined
  /**
    * Should the composition system skip calling the "activate" hook on the view model.
    */
  var skipActivation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The view url or view strategy to override the default view location convention.
    */
  var view: js.UndefOr[java.lang.String | ViewStrategy] = js.undefined
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
  var viewResources: ViewResources
  /**
    * The slot to push the dynamically composed component into.
    */
  var viewSlot: ViewSlot
}

