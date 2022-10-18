package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePortfolioOutput extends StObject {
  
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Budgets] = js.undefined
  
  /**
    * Information about the portfolio.
    */
  var PortfolioDetail: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.PortfolioDetail] = js.undefined
  
  /**
    * Information about the TagOptions associated with the portfolio.
    */
  var TagOptions: js.UndefOr[TagOptionDetails] = js.undefined
  
  /**
    * Information about the tags associated with the portfolio.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Tags] = js.undefined
}
object DescribePortfolioOutput {
  
  inline def apply(): DescribePortfolioOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePortfolioOutput]
  }
  
  extension [Self <: DescribePortfolioOutput](x: Self) {
    
    inline def setBudgets(value: Budgets): Self = StObject.set(x, "Budgets", value.asInstanceOf[js.Any])
    
    inline def setBudgetsUndefined: Self = StObject.set(x, "Budgets", js.undefined)
    
    inline def setBudgetsVarargs(value: BudgetDetail*): Self = StObject.set(x, "Budgets", js.Array(value*))
    
    inline def setPortfolioDetail(value: PortfolioDetail): Self = StObject.set(x, "PortfolioDetail", value.asInstanceOf[js.Any])
    
    inline def setPortfolioDetailUndefined: Self = StObject.set(x, "PortfolioDetail", js.undefined)
    
    inline def setTagOptions(value: TagOptionDetails): Self = StObject.set(x, "TagOptions", value.asInstanceOf[js.Any])
    
    inline def setTagOptionsUndefined: Self = StObject.set(x, "TagOptions", js.undefined)
    
    inline def setTagOptionsVarargs(value: TagOptionDetail*): Self = StObject.set(x, "TagOptions", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
