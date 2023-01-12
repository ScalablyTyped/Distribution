package typings.awsSdk.clientsCloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceRequestsInput extends StObject {
  
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results. The default is 20.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.MaxResults] = js.undefined
  
  /**
    * If the previous paginated request didn't return all of the remaining results, the response object's NextToken parameter value is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.NextToken] = js.undefined
  
  /**
    * The filter criteria to apply to the requests returned.
    */
  var ResourceRequestStatusFilter: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.ResourceRequestStatusFilter] = js.undefined
}
object ListResourceRequestsInput {
  
  inline def apply(): ListResourceRequestsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceRequestsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourceRequestsInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceRequestStatusFilter(value: ResourceRequestStatusFilter): Self = StObject.set(x, "ResourceRequestStatusFilter", value.asInstanceOf[js.Any])
    
    inline def setResourceRequestStatusFilterUndefined: Self = StObject.set(x, "ResourceRequestStatusFilter", js.undefined)
  }
}
