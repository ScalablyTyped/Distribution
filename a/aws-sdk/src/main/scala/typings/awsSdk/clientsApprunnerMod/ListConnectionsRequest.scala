package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectionsRequest extends StObject {
  
  /**
    * If specified, only this connection is returned. If not specified, the result isn't filtered by name.
    */
  var ConnectionName: js.UndefOr[typings.awsSdk.clientsApprunnerMod.ConnectionName] = js.undefined
  
  /**
    * The maximum number of results to include in each response (result page). Used for a paginated request. If you don't specify MaxResults, the request retrieves all available results in a single response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsApprunnerMod.MaxResults] = js.undefined
  
  /**
    * A token from a previous result page. Used for a paginated request. The request retrieves the next result page. All other parameter values must be identical to the ones specified in the initial request. If you don't specify NextToken, the request retrieves the first result page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsApprunnerMod.NextToken] = js.undefined
}
object ListConnectionsRequest {
  
  inline def apply(): ListConnectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListConnectionsRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectionName(value: ConnectionName): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionNameUndefined: Self = StObject.set(x, "ConnectionName", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
