package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePortfolioOutput extends StObject {
  
  /**
    * Information about the portfolio.
    */
  var PortfolioDetail: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.PortfolioDetail] = js.undefined
  
  /**
    * Information about the tags associated with the portfolio.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Tags] = js.undefined
}
object UpdatePortfolioOutput {
  
  inline def apply(): UpdatePortfolioOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePortfolioOutput]
  }
  
  extension [Self <: UpdatePortfolioOutput](x: Self) {
    
    inline def setPortfolioDetail(value: PortfolioDetail): Self = StObject.set(x, "PortfolioDetail", value.asInstanceOf[js.Any])
    
    inline def setPortfolioDetailUndefined: Self = StObject.set(x, "PortfolioDetail", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
