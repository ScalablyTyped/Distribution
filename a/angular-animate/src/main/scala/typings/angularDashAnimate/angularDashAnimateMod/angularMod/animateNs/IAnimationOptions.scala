package typings.angularDashAnimate.angularDashAnimateMod.angularMod.animateNs

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
  var addClass: js.UndefOr[String] = js.undefined
  /**
    * Whether or not the provided from and to styles will be removed once the animation is closed. This is useful for
    * when the styles are used purely for the sake of the animation and do not have a lasting visual effect on the element
    * (e.g. a colapse and open animation). By default this value is set to false.
    */
  var cleanupStyles: js.UndefOr[Boolean] = js.undefined
  /**
    * A number value representing the total delay of the transition and/or keyframe (note that a value of
    * 1 is 1000ms). If a value of true is used then whatever delay value is detected from the CSS classes will be
    * mirrored on the elements styles (e.g. by setting delay true then the style value of the element will be
    * transition-delay: DETECTED_VALUE). Using true is useful when you want the CSS classes and inline styles to
    * all share the same CSS delay value.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * A number value representing the total duration of the transition and/or keyframe (note that a value
    * of 1 is 1000ms). If a value of 0 is provided then the animation will be skipped entirely.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The CSS easing value that will be applied to the transition or keyframe animation (or both).
    */
  var easing: js.UndefOr[String] = js.undefined
  /**
    * The DOM event (e.g. enter, leave, move). When used, a generated CSS class of ng-EVENT and
    * ng-EVENT-active will be applied to the element during the animation. Multiple events can be provided when
    * spaces are used as a separator. (Note that this will not perform any DOM operation.)
    */
  var event: js.UndefOr[String] = js.undefined
  /**
    * The starting CSS styles (a key/value object) that will be applied at the start of the animation.
    */
  var from: js.UndefOr[js.Object] = js.undefined
  /**
    * The raw CSS keyframe animation style that will be used (e.g. 1s my_animation linear).
    */
  var keyframeStyle: js.UndefOr[String] = js.undefined
  /**
    * A space separated list of CSS classes that will be removed from the element and spread across
    * the animation.
    */
  var removeClass: js.UndefOr[String] = js.undefined
  /**
    * A numeric time value representing the delay between successively animated elements (Click here to
    * learn how CSS-based staggering works in ngAnimate.)
    */
  var stagger: js.UndefOr[Double] = js.undefined
  /**
    * The numeric index representing the stagger item (e.g. a value of 5 is equal to the sixth item
    * in the stagger; therefore when a stagger option value of 0.1 is used then there will be a stagger delay of 600ms)
    *
    */
  var staggerIndex: js.UndefOr[Double] = js.undefined
  /**
    * Indicates that the ng-prefix will be added to the event class. Setting to false or
    * omitting will turn ng-EVENT and ng-EVENT-active in EVENT and EVENT-active. Unused if event is omitted.
    */
  var structural: js.UndefOr[Boolean] = js.undefined
  /**
    * The ending CSS styles (a key/value object) that will be applied across the animation via a CSS transition.
    */
  var to: js.UndefOr[js.Object] = js.undefined
  /**
    * The raw CSS transition style that will be used (e.g. 1s linear all).
    */
  var transitionStyle: js.UndefOr[String] = js.undefined
}

object IAnimationOptions {
  @scala.inline
  def apply(
    addClass: String = null,
    cleanupStyles: js.UndefOr[Boolean] = js.undefined,
    delay: Int | Double = null,
    duration: Int | Double = null,
    easing: String = null,
    event: String = null,
    from: js.Object = null,
    keyframeStyle: String = null,
    removeClass: String = null,
    stagger: Int | Double = null,
    staggerIndex: Int | Double = null,
    structural: js.UndefOr[Boolean] = js.undefined,
    to: js.Object = null,
    transitionStyle: String = null
  ): IAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (addClass != null) __obj.updateDynamic("addClass")(addClass)
    if (!js.isUndefined(cleanupStyles)) __obj.updateDynamic("cleanupStyles")(cleanupStyles)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (event != null) __obj.updateDynamic("event")(event)
    if (from != null) __obj.updateDynamic("from")(from)
    if (keyframeStyle != null) __obj.updateDynamic("keyframeStyle")(keyframeStyle)
    if (removeClass != null) __obj.updateDynamic("removeClass")(removeClass)
    if (stagger != null) __obj.updateDynamic("stagger")(stagger.asInstanceOf[js.Any])
    if (staggerIndex != null) __obj.updateDynamic("staggerIndex")(staggerIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(structural)) __obj.updateDynamic("structural")(structural)
    if (to != null) __obj.updateDynamic("to")(to)
    if (transitionStyle != null) __obj.updateDynamic("transitionStyle")(transitionStyle)
    __obj.asInstanceOf[IAnimationOptions]
  }
}

