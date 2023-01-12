package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCostCategoryDefinitionsResponse extends StObject {
  
  /**
    * A reference to a Cost Category that contains enough information to identify the Cost Category. 
    */
  var CostCategoryReferences: js.UndefOr[CostCategoryReferencesList] = js.undefined
  
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextToken: js.UndefOr[NextPageToken] = js.undefined
}
object ListCostCategoryDefinitionsResponse {
  
  inline def apply(): ListCostCategoryDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCostCategoryDefinitionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCostCategoryDefinitionsResponse] (val x: Self) extends AnyVal {
    
    inline def setCostCategoryReferences(value: CostCategoryReferencesList): Self = StObject.set(x, "CostCategoryReferences", value.asInstanceOf[js.Any])
    
    inline def setCostCategoryReferencesUndefined: Self = StObject.set(x, "CostCategoryReferences", js.undefined)
    
    inline def setCostCategoryReferencesVarargs(value: CostCategoryReference*): Self = StObject.set(x, "CostCategoryReferences", js.Array(value*))
    
    inline def setNextToken(value: NextPageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
