package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WARNING: $transition is now deprecated. Use $animate from ngAnimate instead.
  */
@js.native
trait ITransitionService extends js.Object {
  /**
    * The browser specific animation event name.
    */
  var animationEndEventName: java.lang.String = js.native
  /**
    * The browser specific transition event name.
    */
  var transitionEndEventName: java.lang.String = js.native
  /**
    * Provides a consistent interface to trigger CSS 3 transitions and to be informed when they complete.
    *
    * @param element The DOMElement that will be animated
    * @param trigger The thing that will cause the transition to start:
    *   - As a string, it represents the css class to be added to the element.
    *   - As an object, it represents a hash of style attributes to be applied to the element.
    *   - As a function, it represents a function to be called that will cause the transition to occur.
    * @param options Optional settings for the transition.
    *
    * @return A promise that is resolved when the transition finishes.
    */
  def apply(element: angularLib.angularMod.angularNs.IAugmentedJQuery, trigger: js.Any): angularLib.angularMod.angularNs.IPromise[angularLib.angularMod.angularNs.IAugmentedJQuery] = js.native
  def apply(
    element: angularLib.angularMod.angularNs.IAugmentedJQuery,
    trigger: js.Any,
    options: ITransitionServiceOptions
  ): angularLib.angularMod.angularNs.IPromise[angularLib.angularMod.angularNs.IAugmentedJQuery] = js.native
}

