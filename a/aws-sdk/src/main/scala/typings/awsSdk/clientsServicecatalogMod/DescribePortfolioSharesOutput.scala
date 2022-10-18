package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePortfolioSharesOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * Summaries about each of the portfolio shares.
    */
  var PortfolioShareDetails: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.PortfolioShareDetails] = js.undefined
}
object DescribePortfolioSharesOutput {
  
  inline def apply(): DescribePortfolioSharesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePortfolioSharesOutput]
  }
  
  extension [Self <: DescribePortfolioSharesOutput](x: Self) {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setPortfolioShareDetails(value: PortfolioShareDetails): Self = StObject.set(x, "PortfolioShareDetails", value.asInstanceOf[js.Any])
    
    inline def setPortfolioShareDetailsUndefined: Self = StObject.set(x, "PortfolioShareDetails", js.undefined)
    
    inline def setPortfolioShareDetailsVarargs(value: PortfolioShareDetail*): Self = StObject.set(x, "PortfolioShareDetails", js.Array(value*))
  }
}
