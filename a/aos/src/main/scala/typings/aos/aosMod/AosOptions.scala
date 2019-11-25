package typings.aos.aosMod

import typings.aos.aosStrings.mobile
import typings.aos.aosStrings.phone
import typings.aos.aosStrings.tablet
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
  var animatedClassName: js.UndefOr[String] = js.undefined
  /**
    * The delay on debounce used while resizing window
    */
  var debounceDelay: js.UndefOr[Double] = js.undefined
  /**
    * Values from 0 to 3000, with step 50ms
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Accepts following values: 'phone', 'tablet', 'mobile', boolean, expression or function
    */
  var disable: js.UndefOr[phone | tablet | mobile | Boolean | js.Function0[Boolean]] = js.undefined
  /**
    * Disables automatic mutations' detections
    */
  var disableMutationObserver: js.UndefOr[Boolean] = js.undefined
  /**
    * Values from 0 to 3000, with step 50ms
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Default easing for AOS animations
    */
  var easing: js.UndefOr[easingOptions] = js.undefined
  /**
    * Class applied after initialization
    */
  var initClassName: js.UndefOr[String] = js.undefined
  /**
    * Whether elements should animate out while scrolling past them
    */
  var mirror: js.UndefOr[Boolean] = js.undefined
  /**
    * Offset (in px) from the original trigger point
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * Whether animation should happen only once - while scrolling down
    */
  var once: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of the event dispatched on the document, that AOS should initialize on
    */
  var startEvent: js.UndefOr[String] = js.undefined
  /**
    * The delay on throttle used while scrolling the page
    */
  var throttleDelay: js.UndefOr[Double] = js.undefined
  /**
    * If true, will add content of `data-aos` as classes on scroll
    */
  var useClassNames: js.UndefOr[Boolean] = js.undefined
}

object AosOptions {
  @scala.inline
  def apply(
    anchorPlacement: anchorPlacementOptions = null,
    animatedClassName: String = null,
    debounceDelay: Int | Double = null,
    delay: Int | Double = null,
    disable: phone | tablet | mobile | Boolean | js.Function0[Boolean] = null,
    disableMutationObserver: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    easing: easingOptions = null,
    initClassName: String = null,
    mirror: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    once: js.UndefOr[Boolean] = js.undefined,
    startEvent: String = null,
    throttleDelay: Int | Double = null,
    useClassNames: js.UndefOr[Boolean] = js.undefined
  ): AosOptions = {
    val __obj = js.Dynamic.literal()
    if (anchorPlacement != null) __obj.updateDynamic("anchorPlacement")(anchorPlacement.asInstanceOf[js.Any])
    if (animatedClassName != null) __obj.updateDynamic("animatedClassName")(animatedClassName.asInstanceOf[js.Any])
    if (debounceDelay != null) __obj.updateDynamic("debounceDelay")(debounceDelay.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (disable != null) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMutationObserver)) __obj.updateDynamic("disableMutationObserver")(disableMutationObserver.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (initClassName != null) __obj.updateDynamic("initClassName")(initClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (startEvent != null) __obj.updateDynamic("startEvent")(startEvent.asInstanceOf[js.Any])
    if (throttleDelay != null) __obj.updateDynamic("throttleDelay")(throttleDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(useClassNames)) __obj.updateDynamic("useClassNames")(useClassNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AosOptions]
  }
}

