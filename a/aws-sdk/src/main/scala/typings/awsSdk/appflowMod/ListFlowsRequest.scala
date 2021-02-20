package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFlowsRequest extends StObject {
  
  /**
    *  Specifies the maximum number of items that should be returned in the result set. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    *  The pagination token for next page of data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListFlowsRequest {
  
  @scala.inline
  def apply(): ListFlowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFlowsRequest]
  }
  
  @scala.inline
  implicit class ListFlowsRequestMutableBuilder[Self <: ListFlowsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
