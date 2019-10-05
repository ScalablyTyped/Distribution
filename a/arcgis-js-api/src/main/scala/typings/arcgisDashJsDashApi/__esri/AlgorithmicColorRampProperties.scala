package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`cie-lab`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`lab-lch`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hsv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgorithmicColorRampProperties extends ColorRampProperties {
  /**
    * The algorithm used to generate the colors between the `fromColor` and `toColor`. Each algorithm uses different methods for generating the intervening colors.
    *
    * Possible Value | Description
    * ---------------|------------
    * cie-lab | Blends the from and to colors without traversing the intervening hue space.
    * lab-lch | The hue, saturation, value (hsv) algorithm is a linear traverse of colors between pairs: Color 1 H to Color 2 H, Color 1 S to Color 2 S, and Color 1 V to Color 2 V.
    * hsv | The lab-lch algorithm is very similar to the cie-lab but does not seek the shortest path between colors.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AlgorithmicColorRamp.html#algorithm)
    */
  var algorithm: js.UndefOr[`cie-lab` | `lab-lch` | hsv] = js.undefined
  /**
    * The first color in the color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AlgorithmicColorRamp.html#fromColor)
    */
  var fromColor: js.UndefOr[Color] = js.undefined
  /**
    * The last color in the color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AlgorithmicColorRamp.html#toColor)
    */
  var toColor: js.UndefOr[Color] = js.undefined
}

object AlgorithmicColorRampProperties {
  @scala.inline
  def apply(algorithm: `cie-lab` | `lab-lch` | hsv = null, fromColor: Color = null, toColor: Color = null): AlgorithmicColorRampProperties = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (fromColor != null) __obj.updateDynamic("fromColor")(fromColor)
    if (toColor != null) __obj.updateDynamic("toColor")(toColor)
    __obj.asInstanceOf[AlgorithmicColorRampProperties]
  }
}

