package typings.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventsRequest extends StObject {
  
  /**
    * To receive a paginated response, use this parameter to specify the maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.MaxResults] = js.undefined
  
  /**
    * NextToken is a string that is returned in some command responses. It indicates that not all entries have been returned, and that you must run at least one more request to get remaining items. To get remaining results, call DescribeEvents again, and assign the token from the previous results as the value of the nextToken parameter. If there are no more results, the response object's nextToken parameter value is null. Setting a nextToken value that was not returned in your previous results causes an InvalidNextTokenException to occur. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.NextToken] = js.undefined
  
  /**
    * The name of the server for which you want to view events.
    */
  var ServerName: typings.awsSdk.clientsOpsworkscmMod.ServerName
}
object DescribeEventsRequest {
  
  inline def apply(ServerName: ServerName): DescribeEventsRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventsRequest]
  }
  
  extension [Self <: DescribeEventsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
  }
}
