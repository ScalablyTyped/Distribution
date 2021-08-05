package typings.activexLibreoffice.com_.sun.star.chart2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** parameters that may be passed to {@link XChartTypeTemplate.createDiagramByDataSource()} . */
trait StandardDiagramCreationParameters extends StObject {
  
  /** States whether the first XLabeledDataSequence in a data-source is used as categories. */
  var HasCategories: Boolean
  
  /** If categories are given they should be used as x values also if a chart type requires x values. Default is true. */
  var UseCategoriesAsX: Boolean
}
object StandardDiagramCreationParameters {
  
  inline def apply(HasCategories: Boolean, UseCategoriesAsX: Boolean): StandardDiagramCreationParameters = {
    val __obj = js.Dynamic.literal(HasCategories = HasCategories.asInstanceOf[js.Any], UseCategoriesAsX = UseCategoriesAsX.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardDiagramCreationParameters]
  }
  
  extension [Self <: StandardDiagramCreationParameters](x: Self) {
    
    inline def setHasCategories(value: Boolean): Self = StObject.set(x, "HasCategories", value.asInstanceOf[js.Any])
    
    inline def setUseCategoriesAsX(value: Boolean): Self = StObject.set(x, "UseCategoriesAsX", value.asInstanceOf[js.Any])
  }
}
