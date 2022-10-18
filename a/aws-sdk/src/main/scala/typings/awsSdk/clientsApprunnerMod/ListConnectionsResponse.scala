package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectionsResponse extends StObject {
  
  /**
    * A list of summary information records for connections. In a paginated request, the request returns up to MaxResults records for each call.
    */
  var ConnectionSummaryList: typings.awsSdk.clientsApprunnerMod.ConnectionSummaryList
  
  /**
    * The token that you can pass in a subsequent request to get the next result page. Returned in a paginated request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsApprunnerMod.NextToken] = js.undefined
}
object ListConnectionsResponse {
  
  inline def apply(ConnectionSummaryList: ConnectionSummaryList): ListConnectionsResponse = {
    val __obj = js.Dynamic.literal(ConnectionSummaryList = ConnectionSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConnectionsResponse]
  }
  
  extension [Self <: ListConnectionsResponse](x: Self) {
    
    inline def setConnectionSummaryList(value: ConnectionSummaryList): Self = StObject.set(x, "ConnectionSummaryList", value.asInstanceOf[js.Any])
    
    inline def setConnectionSummaryListVarargs(value: ConnectionSummary*): Self = StObject.set(x, "ConnectionSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
