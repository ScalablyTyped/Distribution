package typings
package aosLib.aosMod.AosNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AosOptions extends js.Object {
  // #endregion
  // #region Settings that can be overridden on per-element basis, by `data-aos-*` attributes
  /**
    * Defines which position of the element regarding to window should trigger the animation
    */
  var anchorPlacement: js.UndefOr[anchorPlacementOptions] = js.undefined
  // #region Global settings
  /**
    * Class applied on animation
    */
  var animatedClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Values from 0 to 3000, with step 50ms
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Accepts following values: 'phone', 'tablet', 'mobile', boolean, expression or function
    */
  var disable: js.UndefOr[
    aosLib.aosLibStrings.phone | aosLib.aosLibStrings.tablet | aosLib.aosLibStrings.mobile | scala.Boolean | js.Function0[scala.Boolean]
  ] = js.undefined
  /**
    * Values from 0 to 3000, with step 50ms
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default easing for AOS animations
    */
  var easing: js.UndefOr[easingOptions] = js.undefined
  /**
    * Class applied after initialization
    */
  var initClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether elements should animate out while scrolling past them
    */
  var mirror: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Offset (in px) from the original trigger point
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether animation should happen only once - while scrolling down
    */
  var once: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Name of the event dispatched on the document, that AOS should initialize on
    */
  var startEvent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, will add content of `data-aos` as classes on scroll
    */
  var useClassNames: js.UndefOr[scala.Boolean] = js.undefined
}

object AosOptions {
  @scala.inline
  def apply(
    anchorPlacement: anchorPlacementOptions = null,
    animatedClassName: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    disable: aosLib.aosLibStrings.phone | aosLib.aosLibStrings.tablet | aosLib.aosLibStrings.mobile | scala.Boolean | js.Function0[scala.Boolean] = null,
    duration: scala.Int | scala.Double = null,
    easing: easingOptions = null,
    initClassName: java.lang.String = null,
    mirror: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Int | scala.Double = null,
    once: js.UndefOr[scala.Boolean] = js.undefined,
    startEvent: java.lang.String = null,
    useClassNames: js.UndefOr[scala.Boolean] = js.undefined
  ): AosOptions = {
    val __obj = js.Dynamic.literal()
    if (anchorPlacement != null) __obj.updateDynamic("anchorPlacement")(anchorPlacement)
    if (animatedClassName != null) __obj.updateDynamic("animatedClassName")(animatedClassName)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (disable != null) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (initClassName != null) __obj.updateDynamic("initClassName")(initClassName)
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    if (startEvent != null) __obj.updateDynamic("startEvent")(startEvent)
    if (!js.isUndefined(useClassNames)) __obj.updateDynamic("useClassNames")(useClassNames)
    __obj.asInstanceOf[AosOptions]
  }
}

