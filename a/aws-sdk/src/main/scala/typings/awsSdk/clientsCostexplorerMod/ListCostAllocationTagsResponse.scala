package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCostAllocationTagsResponse extends StObject {
  
  /**
    * A list of cost allocation tags that includes the detailed metadata for each one. 
    */
  var CostAllocationTags: js.UndefOr[CostAllocationTagList] = js.undefined
  
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextToken: js.UndefOr[NextPageToken] = js.undefined
}
object ListCostAllocationTagsResponse {
  
  inline def apply(): ListCostAllocationTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCostAllocationTagsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCostAllocationTagsResponse] (val x: Self) extends AnyVal {
    
    inline def setCostAllocationTags(value: CostAllocationTagList): Self = StObject.set(x, "CostAllocationTags", value.asInstanceOf[js.Any])
    
    inline def setCostAllocationTagsUndefined: Self = StObject.set(x, "CostAllocationTags", js.undefined)
    
    inline def setCostAllocationTagsVarargs(value: CostAllocationTag*): Self = StObject.set(x, "CostAllocationTags", js.Array(value*))
    
    inline def setNextToken(value: NextPageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
