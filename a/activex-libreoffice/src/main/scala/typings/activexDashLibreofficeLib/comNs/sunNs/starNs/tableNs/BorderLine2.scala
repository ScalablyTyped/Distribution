package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A border line, extended with line style.
  * @since LibreOffice 3.4
  */
trait BorderLine2 extends BorderLine {
  /**
    * Style of the border.
    * @see BorderLineStyle
    */
  var LineStyle: scala.Double
  /**
    * Width of the border, this is the base to compute all the lines and gaps widths. These widths computations are based on the LineStyle property
    *
    * This property is prevailing on the old Out, In and Dist width from {@link BorderLine} . If this property is set to 0, then the other widths will be
    * used to guess the border width.
    */
  var LineWidth: scala.Double
}

object BorderLine2 {
  @scala.inline
  def apply(
    Color: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    InnerLineWidth: scala.Double,
    LineDistance: scala.Double,
    LineStyle: scala.Double,
    LineWidth: scala.Double,
    OuterLineWidth: scala.Double
  ): BorderLine2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Color")(Color)
    __obj.updateDynamic("InnerLineWidth")(InnerLineWidth)
    __obj.updateDynamic("LineDistance")(LineDistance)
    __obj.updateDynamic("LineStyle")(LineStyle)
    __obj.updateDynamic("LineWidth")(LineWidth)
    __obj.updateDynamic("OuterLineWidth")(OuterLineWidth)
    __obj.asInstanceOf[BorderLine2]
  }
}

