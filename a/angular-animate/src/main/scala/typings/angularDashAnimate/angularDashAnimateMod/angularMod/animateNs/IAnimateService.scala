package typings.angularDashAnimate.angularDashAnimateMod.angularMod.animateNs

import typings.angular.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AnimateService
  * see http://docs.angularjs.org/api/ngAnimate/service/$animate
  */
@js.native
trait IAnimateService extends js.Object {
  /**
    * Triggers a custom animation event based off the className variable and then attaches the className
    * value to the element as a CSS class.
    *
    * @param element the element that will be animated
    * @param className the CSS class that will be added to the element and then animated
    * @param options an optional collection of styles that will be picked up by the CSS transition/animation
    * @returns the animation callback promise
    */
  def addClass(element: JQuery, className: String): IAnimationPromise = js.native
  def addClass(element: JQuery, className: String, options: IAnimationOptions): IAnimationPromise = js.native
  /**
    * Performs an inline animation on the element.
    *
    * @param element the element that will be the focus of the animation
    * @param from a collection of CSS styles that will be applied to the element at the start of the animation
    * @param to a collection of CSS styles that the element will animate towards
    * @param className an optional CSS class that will be added to the element for the duration of the animation (the default class is 'ng-inline-animate')
    * @param options an optional collection of styles that will be picked up by the CSS transition/animation
    * @returns the animation callback promise
    */
  def animate(element: JQuery, from: js.Any, to: js.Any): IAnimationPromise = js.native
  def animate(element: JQuery, from: js.Any, to: js.Any, className: String): IAnimationPromise = js.native
  def animate(element: JQuery, from: js.Any, to: js.Any, className: String, options: IAnimationOptions): IAnimationPromise = js.native
  /**
    * Cancels the provided animation.
    */
  def cancel(animationPromise: IAnimationPromise): Unit = js.native
  def enabled(): Boolean = js.native
  /**
    * Globally enables / disables animations.
    *
    * @param element If provided then the element will be used to represent the enable/disable operation.
    * @param value If provided then set the animation on or off.
    * @returns current animation state
    */
  def enabled(element: JQuery): Boolean = js.native
  def enabled(element: JQuery, value: Boolean): Boolean = js.native
  def enabled(value: Boolean): Boolean = js.native
  /**
    * Appends the element to the parentElement element that resides in the document and then runs the enter animation.
    *
    * @param element the element that will be the focus of the enter animation
    * @param parentElement the parent element of the element that will be the focus of the enter animation
    * @param afterElement the sibling element (which is the previous element) of the element that will be the focus of the enter animation
    * @param options an optional collection of styles that will be picked up by the CSS transition/animation
    * @returns the animation callback promise
    */
  def enter(element: JQuery, parentElement: JQuery): IAnimationPromise = js.native
  def enter(element: JQuery, parentElement: JQuery, afterElement: JQuery): IAnimationPromise = js.native
  def enter(element: JQuery, parentElement: JQuery, afterElement: JQuery, options: IAnimationOptions): IAnimationPromise = js.native
  /**
    * Runs the leave animation operation and, upon completion, removes the element from the DOM.
    *
    * @param element the element that will be the focus of the leave animation
    * @param options an optional collection of styles that will be picked up by the CSS transition/animation
    * @returns the animation callback promise
    */
  def leave(element: JQuery): IAnimationPromise = js.native
  def leave(element: JQuery, options: IAnimationOptions): IAnimationPromise = js.native
  /**
    * Fires the move DOM operation. Just before the animation starts, the animate service will either append
    * it into the parentElement container or add the element directly after the afterElement element if present.
    * Then the move animation will be run.
    *
    * @param element the element that will be the focus of the move animation
    * @param parentElement the parent element of the element that will be the focus of the move animation
    * @param afterElement the sibling element (which is the previous element) of the element that will be the focus of the move animation
    * @returns the animation callback promise
    */
  def move(element: JQuery, parentElement: JQuery): IAnimationPromise = js.native
  def move(element: JQuery, parentElement: JQuery, afterElement: JQuery): IAnimationPromise = js.native
  /**
    * Deregisters an event listener based on the event which has been associated with the provided element.
    *
    * @param event the animation event (e.g. enter, leave, move, addClass, removeClass, etc...)
    * @param container the container element the event listener was placed on
    * @param callback the callback function that was registered as the listener
    */
  def off(event: String): Unit = js.native
  def off(event: String, container: JQuery): Unit = js.native
  def off(
    event: String,
    container: JQuery,
    callback: js.Function2[/* element */ js.UndefOr[JQuery], /* phase */ js.UndefOr[String], _]
  ): Unit = js.native
  /**
    * Sets up an event listener to fire whenever the animation event has fired on the given element or among any of its children.
    *
    * @param event the animation event that will be captured (e.g. enter, leave, move, addClass, removeClass, etc...)
    * @param container the container element that will capture each of the animation events that are fired on itself as well as among its children
    * @param callback the callback function that will be fired when the listener is triggered
    */
  def on(
    event: String,
    container: JQuery,
    callback: js.Function2[/* element */ js.UndefOr[JQuery], /* phase */ js.UndefOr[String], _]
  ): Unit = js.native
  /**
    * Associates the provided element with a host parent element to allow the element to be animated even if it exists outside of the DOM structure of the Angular application.
    *
    * @param element the external element that will be pinned
    * @param parentElement the host parent element that will be associated with the external element
    */
  def pin(element: JQuery, parentElement: JQuery): Unit = js.native
  /**
    * Triggers a custom animation event based off the className variable and then removes the CSS class
    * provided by the className value from the element.
    *
    * @param element the element that will be animated
    * @param className the CSS class that will be animated and then removed from the element
    * @param options an optional collection of styles that will be picked up by the CSS transition/animation
    * @returns the animation callback promise
    */
  def removeClass(element: JQuery, className: String): IAnimationPromise = js.native
  def removeClass(element: JQuery, className: String, options: IAnimationOptions): IAnimationPromise = js.native
  /**
    * Adds and/or removes the given CSS classes to and from the element. Once complete, the done() callback
    * will be fired (if provided).
    *
    * @param element the element which will have its CSS classes changed removed from it
    * @param add the CSS classes which will be added to the element
    * @param remove the CSS class which will be removed from the element CSS classes have been set on the element
    * @param options an optional collection of styles that will be picked up by the CSS transition/animation
    * @returns the animation callback promise
    */
  def setClass(element: JQuery, add: String, remove: String): IAnimationPromise = js.native
  def setClass(element: JQuery, add: String, remove: String, options: IAnimationOptions): IAnimationPromise = js.native
}

