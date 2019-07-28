package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** parameters that may be passed to {@link XChartTypeTemplate.createDiagramByDataSource()} . */
trait StandardDiagramCreationParameters extends js.Object {
  /** States whether the first XLabeledDataSequence in a data-source is used as categories. */
  var HasCategories: Boolean
  /** If categories are given they should be used as x values also if a chart type requires x values. Default is true. */
  var UseCategoriesAsX: Boolean
}

object StandardDiagramCreationParameters {
  @scala.inline
  def apply(HasCategories: Boolean, UseCategoriesAsX: Boolean): StandardDiagramCreationParameters = {
    val __obj = js.Dynamic.literal(HasCategories = HasCategories, UseCategoriesAsX = UseCategoriesAsX)
  
    __obj.asInstanceOf[StandardDiagramCreationParameters]
  }
}

