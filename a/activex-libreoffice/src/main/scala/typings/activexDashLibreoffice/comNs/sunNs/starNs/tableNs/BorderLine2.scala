package typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
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
  var LineStyle: Double
  /**
    * Width of the border, this is the base to compute all the lines and gaps widths. These widths computations are based on the LineStyle property
    *
    * This property is prevailing on the old Out, In and Dist width from {@link BorderLine} . If this property is set to 0, then the other widths will be
    * used to guess the border width.
    */
  var LineWidth: Double
}

object BorderLine2 {
  @scala.inline
  def apply(
    Color: Color,
    InnerLineWidth: Double,
    LineDistance: Double,
    LineStyle: Double,
    LineWidth: Double,
    OuterLineWidth: Double
  ): BorderLine2 = {
    val __obj = js.Dynamic.literal(Color = Color, InnerLineWidth = InnerLineWidth, LineDistance = LineDistance, LineStyle = LineStyle, LineWidth = LineWidth, OuterLineWidth = OuterLineWidth)
  
    __obj.asInstanceOf[BorderLine2]
  }
}

