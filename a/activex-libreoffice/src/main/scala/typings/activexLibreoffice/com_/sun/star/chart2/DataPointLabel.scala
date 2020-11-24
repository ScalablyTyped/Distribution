package typings.activexLibreoffice.com_.sun.star.chart2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataPointLabel extends js.Object {
  
  /** The caption contains the category name of the category to which a data point belongs. */
  var ShowCategoryName: Boolean = js.native
  
  /** The symbol of data series is additionally displayed in the caption. */
  var ShowLegendSymbol: Boolean = js.native
  
  /**
    * if `TRUE` , the value that is represented by a data point is displayed next to it.
    * @see ShowNumberInPercent
    */
  var ShowNumber: Boolean = js.native
  
  /**
    * This is only effective, if {@link ShowNumber} is `TRUE` . If this member is also `TRUE` , the numbers are displayed as percentages of a category.
    *
    * That means, if a data point is the first one of a series, the percentage is calculated by using the first data points of all available series.
    */
  var ShowNumberInPercent: Boolean = js.native
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
  
  @scala.inline
  implicit class DataPointLabelOps[Self <: DataPointLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setShowCategoryName(value: Boolean): Self = this.set("ShowCategoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLegendSymbol(value: Boolean): Self = this.set("ShowLegendSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNumber(value: Boolean): Self = this.set("ShowNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNumberInPercent(value: Boolean): Self = this.set("ShowNumberInPercent", value.asInstanceOf[js.Any])
  }
}
