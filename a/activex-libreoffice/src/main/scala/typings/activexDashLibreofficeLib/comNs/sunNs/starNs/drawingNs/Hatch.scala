package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This struct defines the appearance of a hatch.
  *
  * A hatch is a texture made of straight lines.
  */
trait Hatch extends js.Object {
  /** You can rotate the lines of the hatch with this angle. */
  var Angle: scala.Double
  /** This is the color of the hatch lines. */
  var Color: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** This is the distance between the lines in the hatch. */
  var Distance: scala.Double
  /** The HatchStyle defines the kind of lines used to draw this hatch. */
  var Style: HatchStyle
}

object Hatch {
  @scala.inline
  def apply(
    Angle: scala.Double,
    Color: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Distance: scala.Double,
    Style: HatchStyle
  ): Hatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Angle")(Angle)
    __obj.updateDynamic("Color")(Color)
    __obj.updateDynamic("Distance")(Distance)
    __obj.updateDynamic("Style")(Style)
    __obj.asInstanceOf[Hatch]
  }
}

