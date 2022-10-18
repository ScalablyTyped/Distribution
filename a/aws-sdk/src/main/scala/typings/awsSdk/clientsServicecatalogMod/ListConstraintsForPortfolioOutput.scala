package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConstraintsForPortfolioOutput extends StObject {
  
  /**
    * Information about the constraints.
    */
  var ConstraintDetails: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ConstraintDetails] = js.undefined
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
}
object ListConstraintsForPortfolioOutput {
  
  inline def apply(): ListConstraintsForPortfolioOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConstraintsForPortfolioOutput]
  }
  
  extension [Self <: ListConstraintsForPortfolioOutput](x: Self) {
    
    inline def setConstraintDetails(value: ConstraintDetails): Self = StObject.set(x, "ConstraintDetails", value.asInstanceOf[js.Any])
    
    inline def setConstraintDetailsUndefined: Self = StObject.set(x, "ConstraintDetails", js.undefined)
    
    inline def setConstraintDetailsVarargs(value: ConstraintDetail*): Self = StObject.set(x, "ConstraintDetails", js.Array(value*))
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
  }
}
