package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReplicationJobsRequest extends StObject {
  
  /**
    * The maximum number of results to return in a single call. The default value is 50. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The ID of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
}
object GetReplicationJobsRequest {
  
  inline def apply(): GetReplicationJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReplicationJobsRequest]
  }
  
  extension [Self <: GetReplicationJobsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReplicationJobId(value: ReplicationJobId): Self = StObject.set(x, "replicationJobId", value.asInstanceOf[js.Any])
    
    inline def setReplicationJobIdUndefined: Self = StObject.set(x, "replicationJobId", js.undefined)
  }
}
