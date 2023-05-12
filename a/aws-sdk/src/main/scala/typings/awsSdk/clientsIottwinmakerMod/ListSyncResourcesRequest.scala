package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSyncResourcesRequest extends StObject {
  
  /**
    * A list of objects that filter the request. The following filter combinations are supported:   Filter with state   Filter with ResourceType and ResourceId   Filter with ResourceType and ExternalId  
    */
  var filters: js.UndefOr[SyncResourceFilters] = js.undefined
  
  /**
    * The maximum number of results to return at one time. The default is 50. Valid Range: Minimum value of 0. Maximum value of 200.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The string that specifies the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The sync source.  Currently the only supported syncSource is SITEWISE . 
    */
  var syncSource: SyncSource
  
  /**
    * The ID of the workspace that contains the sync job.
    */
  var workspaceId: Id
}
object ListSyncResourcesRequest {
  
  inline def apply(syncSource: SyncSource, workspaceId: Id): ListSyncResourcesRequest = {
    val __obj = js.Dynamic.literal(syncSource = syncSource.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSyncResourcesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSyncResourcesRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: SyncResourceFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: SyncResourceFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSyncSource(value: SyncSource): Self = StObject.set(x, "syncSource", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
