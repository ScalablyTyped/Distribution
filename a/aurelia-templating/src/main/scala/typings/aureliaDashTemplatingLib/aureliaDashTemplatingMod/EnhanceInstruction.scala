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

