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

