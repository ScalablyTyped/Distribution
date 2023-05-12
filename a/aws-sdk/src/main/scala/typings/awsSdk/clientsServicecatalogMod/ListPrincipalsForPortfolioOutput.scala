package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPrincipalsForPortfolioOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * The PrincipalARNs and corresponding PrincipalTypes associated with the portfolio.
    */
  var Principals: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Principals] = js.undefined
}
object ListPrincipalsForPortfolioOutput {
  
  inline def apply(): ListPrincipalsForPortfolioOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPrincipalsForPortfolioOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPrincipalsForPortfolioOutput] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setPrincipals(value: Principals): Self = StObject.set(x, "Principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsUndefined: Self = StObject.set(x, "Principals", js.undefined)
    
    inline def setPrincipalsVarargs(value: Principal*): Self = StObject.set(x, "Principals", js.Array(value*))
  }
}
