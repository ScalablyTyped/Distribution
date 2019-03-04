package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPointLabel extends js.Object {
  /** The caption contains the category name of the category to which a data point belongs. */
  var ShowCategoryName: scala.Boolean
  /** The symbol of data series is additionally displayed in the caption. */
  var ShowLegendSymbol: scala.Boolean
  /**
    * if `TRUE` , the value that is represented by a data point is displayed next to it.
    * @see ShowNumberInPercent
    */
  var ShowNumber: scala.Boolean
  /**
    * This is only effective, if {@link ShowNumber} is `TRUE` . If this member is also `TRUE` , the numbers are displayed as percentages of a category.
    *
    * That means, if a data point is the first one of a series, the percentage is calculated by using the first data points of all available series.
    */
  var ShowNumberInPercent: scala.Boolean
}

object DataPointLabel {
  @scala.inline
  def apply(
    ShowCategoryName: scala.Boolean,
    ShowLegendSymbol: scala.Boolean,
    ShowNumber: scala.Boolean,
    ShowNumberInPercent: scala.Boolean
  ): DataPointLabel = {
    val __obj = js.Dynamic.literal(ShowCategoryName = ShowCategoryName, ShowLegendSymbol = ShowLegendSymbol, ShowNumber = ShowNumber, ShowNumberInPercent = ShowNumberInPercent)
  
    __obj.asInstanceOf[DataPointLabel]
  }
}

