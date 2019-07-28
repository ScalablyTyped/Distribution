package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a gradient between two colors. Many aspects of the gradient are undefined, like the algorithm and color space to use to interpolate between
  * the colors and what "intensity" means.
  */
trait Gradient extends js.Object {
  /** angle of the gradient in 1/10 degree. */
  var Angle: Double
  /** per cent of the total width where just the start color is used. */
  var Border: Double
  /** specifies the color at the end point of the gradient. */
  var EndColor: Color
  /** specifies the intensity at the end point of the gradient. */
  var EndIntensity: Double
  /** specifies the color at the start point of the gradient. */
  var StartColor: Color
  /** Specifies the intensity at the start point of the gradient. What that means is undefined. */
  var StartIntensity: Double
  /** Specifies the number of steps of change color. What that means is undefined. */
  var StepCount: Double
  /** specifies the style of the gradient. */
  var Style: GradientStyle
  /**
    * Specifies the X-coordinate, where the gradient begins, whatever that means. Possibly means the **center** of the ELLIPTICAL, SQUARE and RECT style
    * gradients?
    */
  var XOffset: Double
  /** Specifies the Y-coordinate, where the gradient begins. See previous field. */
  var YOffset: Double
}

object Gradient {
  @scala.inline
  def apply(
    Angle: Double,
    Border: Double,
    EndColor: Color,
    EndIntensity: Double,
    StartColor: Color,
    StartIntensity: Double,
    StepCount: Double,
    Style: GradientStyle,
    XOffset: Double,
    YOffset: Double
  ): Gradient = {
    val __obj = js.Dynamic.literal(Angle = Angle, Border = Border, EndColor = EndColor, EndIntensity = EndIntensity, StartColor = StartColor, StartIntensity = StartIntensity, StepCount = StepCount, Style = Style, XOffset = XOffset, YOffset = YOffset)
  
    __obj.asInstanceOf[Gradient]
  }
}

