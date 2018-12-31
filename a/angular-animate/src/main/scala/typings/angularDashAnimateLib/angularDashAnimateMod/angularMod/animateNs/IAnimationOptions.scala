package typings
package angularDashAnimateLib.angularDashAnimateMod.angularMod.animateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Angular Animation Options
  * see https://docs.angularjs.org/api/ngAnimate/#applying-directive-specific-styles-to-an-animation
  */
trait IAnimationOptions extends js.Object {
  /**
    * A space separated list of CSS classes that will be added to the element and spread across the animation.
    */
  var addClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not the provided from and to styles will be removed once the animation is closed. This is useful for
    * when the styles are used purely for the sake of the animation and do not have a lasting visual effect on the element
    * (e.g. a colapse and open animation). By default this value is set to false.
    */
  var cleanupStyles: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A number value representing the total delay of the transition and/or keyframe (note that a value of
    * 1 is 1000ms). If a value of true is used then whatever delay value is detected from the CSS classes will be
    * mirrored on the elements styles (e.g. by setting delay true then the style value of the element will be
    * transition-delay: DETECTED_VALUE). Using true is useful when you want the CSS classes and inline styles to
    * all share the same CSS delay value.
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * A number value representing the total duration of the transition and/or keyframe (note that a value
    * of 1 is 1000ms). If a value of 0 is provided then the animation will be skipped entirely.
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * The CSS easing value that will be applied to the transition or keyframe animation (or both).
    */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The DOM event (e.g. enter, leave, move). When used, a generated CSS class of ng-EVENT and
    * ng-EVENT-active will be applied to the element during the animation. Multiple events can be provided when
    * spaces are used as a separator. (Note that this will not perform any DOM operation.)
    */
  var event: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The starting CSS styles (a key/value object) that will be applied at the start of the animation.
    */
  var from: js.UndefOr[js.Object] = js.undefined
  /**
    * The raw CSS keyframe animation style that will be used (e.g. 1s my_animation linear).
    */
  var keyframeStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A space separated list of CSS classes that will be removed from the element and spread across
    * the animation.
    */
  var removeClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A numeric time value representing the delay between successively animated elements (Click here to
    * learn how CSS-based staggering works in ngAnimate.)
    */
  var stagger: js.UndefOr[scala.Double] = js.undefined
  /**
    * The numeric index representing the stagger item (e.g. a value of 5 is equal to the sixth item
    * in the stagger; therefore when a stagger option value of 0.1 is used then there will be a stagger delay of 600ms)
    *
    */
  var staggerIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates that the ng-prefix will be added to the event class. Setting to false or
    * omitting will turn ng-EVENT and ng-EVENT-active in EVENT and EVENT-active. Unused if event is omitted.
    */
  var structural: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The ending CSS styles (a key/value object) that will be applied across the animation via a CSS transition.
    */
  var to: js.UndefOr[js.Object] = js.undefined
  /**
    * The raw CSS transition style that will be used (e.g. 1s linear all).
    */
  var transitionStyle: js.UndefOr[java.lang.String] = js.undefined
}

