package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A {@link LineDash} defines a non-continuous line. */
trait LineDash extends js.Object {
  /** This is the length of a single dash. */
  var DashLen: scala.Double
  /** This is the number of dashes. */
  var Dashes: scala.Double
  /** This is the distance between the dots. */
  var Distance: scala.Double
  /** This is the length of a dot. */
  var DotLen: scala.Double
  /** This is the number of dots in this {@link LineDash} . */
  var Dots: scala.Double
  /** This sets the style of this {@link LineDash} . */
  var Style: DashStyle
}

object LineDash {
  @scala.inline
  def apply(
    DashLen: scala.Double,
    Dashes: scala.Double,
    Distance: scala.Double,
    DotLen: scala.Double,
    Dots: scala.Double,
    Style: DashStyle
  ): LineDash = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DashLen")(DashLen)
    __obj.updateDynamic("Dashes")(Dashes)
    __obj.updateDynamic("Distance")(Distance)
    __obj.updateDynamic("DotLen")(DotLen)
    __obj.updateDynamic("Dots")(Dots)
    __obj.updateDynamic("Style")(Style)
    __obj.asInstanceOf[LineDash]
  }
}

