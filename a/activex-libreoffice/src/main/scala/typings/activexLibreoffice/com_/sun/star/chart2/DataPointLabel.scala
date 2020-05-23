package typings.activexLibreoffice.com_.sun.star.chart2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPointLabel extends js.Object {
  /** The caption contains the category name of the category to which a data point belongs. */
  var ShowCategoryName: Boolean
  /** The symbol of data series is additionally displayed in the caption. */
  var ShowLegendSymbol: Boolean
  /**
    * if `TRUE` , the value that is represented by a data point is displayed next to it.
    * @see ShowNumberInPercent
    */
  var ShowNumber: Boolean
  /**
    * This is only effective, if {@link ShowNumber} is `TRUE` . If this member is also `TRUE` , the numbers are displayed as percentages of a category.
    *
    * That means, if a data point is the first one of a series, the percentage is calculated by using the first data points of all available series.
    */
  var ShowNumberInPercent: Boolean
}

object DataPointLabel {
  @scala.inline
  def apply(
    ShowCategoryName: Boolean,
    ShowLegendSymbol: Boolean,
    ShowNumber: Boolean,
    ShowNumberInPercent: Boolean
  ): DataPointLabel = {
    val __obj = js.Dynamic.literal(ShowCategoryName = ShowCategoryName.asInstanceOf[js.Any], ShowLegendSymbol = ShowLegendSymbol.asInstanceOf[js.Any], ShowNumber = ShowNumber.asInstanceOf[js.Any], ShowNumberInPercent = ShowNumberInPercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPointLabel]
  }
}

