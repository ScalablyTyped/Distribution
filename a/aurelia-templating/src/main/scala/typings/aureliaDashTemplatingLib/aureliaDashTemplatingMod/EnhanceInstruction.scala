package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnhanceInstruction extends js.Object {
  /**
    * A binding context for the enhancement.
    */
  var bindingContext: js.UndefOr[js.Object] = js.undefined
  /**
    * The DI container to use as the root for UI enhancement.
    */
  var container: js.UndefOr[
    aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container
  ] = js.undefined
  /**
    * The element to enhance.
    */
  var element: stdLib.Element
  /**
    * A secondary binding context that can override the standard context.
    */
  var overrideContext: js.UndefOr[js.Any] = js.undefined
  /**
    * The resources available for enhancement.
    */
  var resources: js.UndefOr[ViewResources] = js.undefined
}

object EnhanceInstruction {
  @scala.inline
  def apply(
    element: stdLib.Element,
    bindingContext: js.Object = null,
    container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container = null,
    overrideContext: js.Any = null,
    resources: ViewResources = null
  ): EnhanceInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("element")(element)
    if (bindingContext != null) __obj.updateDynamic("bindingContext")(bindingContext)
    if (container != null) __obj.updateDynamic("container")(container)
    if (overrideContext != null) __obj.updateDynamic("overrideContext")(overrideContext)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    __obj.asInstanceOf[EnhanceInstruction]
  }
}

