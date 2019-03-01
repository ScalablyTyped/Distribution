package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a gradient between two colors. Many aspects of the gradient are undefined, like the algorithm and color space to use to interpolate between
  * the colors and what "intensity" means.
  */
trait Gradient extends js.Object {
  /** angle of the gradient in 1/10 degree. */
  var Angle: scala.Double
  /** per cent of the total width where just the start color is used. */
  var Border: scala.Double
  /** specifies the color at the end point of the gradient. */
  var EndColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** specifies the intensity at the end point of the gradient. */
  var EndIntensity: scala.Double
  /** specifies the color at the start point of the gradient. */
  var StartColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** Specifies the intensity at the start point of the gradient. What that means is undefined. */
  var StartIntensity: scala.Double
  /** Specifies the number of steps of change color. What that means is undefined. */
  var StepCount: scala.Double
  /** specifies the style of the gradient. */
  var Style: GradientStyle
  /**
    * Specifies the X-coordinate, where the gradient begins, whatever that means. Possibly means the **center** of the ELLIPTICAL, SQUARE and RECT style
    * gradients?
    */
  var XOffset: scala.Double
  /** Specifies the Y-coordinate, where the gradient begins. See previous field. */
  var YOffset: scala.Double
}

object Gradient {
  @scala.inline
  def apply(
    Angle: scala.Double,
    Border: scala.Double,
    EndColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    EndIntensity: scala.Double,
    StartColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    StartIntensity: scala.Double,
    StepCount: scala.Double,
    Style: GradientStyle,
    XOffset: scala.Double,
    YOffset: scala.Double
  ): Gradient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Angle")(Angle)
    __obj.updateDynamic("Border")(Border)
    __obj.updateDynamic("EndColor")(EndColor)
    __obj.updateDynamic("EndIntensity")(EndIntensity)
    __obj.updateDynamic("StartColor")(StartColor)
    __obj.updateDynamic("StartIntensity")(StartIntensity)
    __obj.updateDynamic("StepCount")(StepCount)
    __obj.updateDynamic("Style")(Style)
    __obj.updateDynamic("XOffset")(XOffset)
    __obj.updateDynamic("YOffset")(YOffset)
    __obj.asInstanceOf[Gradient]
  }
}

