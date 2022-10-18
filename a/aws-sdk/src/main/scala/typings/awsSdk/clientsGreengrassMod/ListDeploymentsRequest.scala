package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeploymentsRequest extends StObject {
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string
  
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[string] = js.undefined
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListDeploymentsRequest {
  
  inline def apply(GroupId: string): ListDeploymentsRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeploymentsRequest]
  }
  
  extension [Self <: ListDeploymentsRequest](x: Self) {
    
    inline def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: string): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
