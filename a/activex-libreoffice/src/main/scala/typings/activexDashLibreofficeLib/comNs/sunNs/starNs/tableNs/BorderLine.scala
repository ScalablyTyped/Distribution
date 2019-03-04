package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the line type for a single cell edge. */
trait BorderLine extends js.Object {
  /** contains the color value of the line. */
  var Color: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * contains the width of the inner part of a double line (in 1/100 mm).
    *
    * If this value is zero, only a single line is drawn.
    */
  var InnerLineWidth: scala.Double
  /** contains the distance between the inner and outer parts of a double line (in 1/100 mm). */
  var LineDistance: scala.Double
  /**
    * contains the width of a single line or the width of outer part of a double line (in 1/100 mm).
    *
    * If this value is zero, no line is drawn.
    */
  var OuterLineWidth: scala.Double
}

object BorderLine {
  @scala.inline
  def apply(
    Color: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    InnerLineWidth: scala.Double,
    LineDistance: scala.Double,
    OuterLineWidth: scala.Double
  ): BorderLine = {
    val __obj = js.Dynamic.literal(Color = Color, InnerLineWidth = InnerLineWidth, LineDistance = LineDistance, OuterLineWidth = OuterLineWidth)
  
    __obj.asInstanceOf[BorderLine]
  }
}

