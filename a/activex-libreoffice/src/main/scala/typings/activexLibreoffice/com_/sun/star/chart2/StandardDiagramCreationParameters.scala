package typings.activexLibreoffice.com_.sun.star.chart2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** parameters that may be passed to {@link XChartTypeTemplate.createDiagramByDataSource()} . */
@js.native
trait StandardDiagramCreationParameters extends js.Object {
  
  /** States whether the first XLabeledDataSequence in a data-source is used as categories. */
  var HasCategories: Boolean = js.native
  
  /** If categories are given they should be used as x values also if a chart type requires x values. Default is true. */
  var UseCategoriesAsX: Boolean = js.native
}
object StandardDiagramCreationParameters {
  
  @scala.inline
  def apply(HasCategories: Boolean, UseCategoriesAsX: Boolean): StandardDiagramCreationParameters = {
    val __obj = js.Dynamic.literal(HasCategories = HasCategories.asInstanceOf[js.Any], UseCategoriesAsX = UseCategoriesAsX.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardDiagramCreationParameters]
  }
  
  @scala.inline
  implicit class StandardDiagramCreationParametersOps[Self <: StandardDiagramCreationParameters] (val x: Self) extends AnyVal {
    
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
    def setHasCategories(value: Boolean): Self = this.set("HasCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCategoriesAsX(value: Boolean): Self = this.set("UseCategoriesAsX", value.asInstanceOf[js.Any])
  }
}
