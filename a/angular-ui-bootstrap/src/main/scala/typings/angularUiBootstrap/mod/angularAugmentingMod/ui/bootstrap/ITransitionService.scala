package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angular.mod.IAugmentedJQuery
import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WARNING: $transition is now deprecated. Use $animate from ngAnimate instead.
  */
@js.native
trait ITransitionService extends js.Object {
  
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
  def apply(element: IAugmentedJQuery, trigger: js.Any): IPromise[IAugmentedJQuery] = js.native
  def apply(element: IAugmentedJQuery, trigger: js.Any, options: ITransitionServiceOptions): IPromise[IAugmentedJQuery] = js.native
  
  /**
    * The browser specific animation event name.
    */
  var animationEndEventName: String = js.native
  
  /**
    * The browser specific transition event name.
    */
  var transitionEndEventName: String = js.native
}
