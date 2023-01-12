package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReplicationRunsResponse extends StObject {
  
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Information about the replication job.
    */
  var replicationJob: js.UndefOr[ReplicationJob] = js.undefined
  
  /**
    * Information about the replication runs.
    */
  var replicationRunList: js.UndefOr[ReplicationRunList] = js.undefined
}
object GetReplicationRunsResponse {
  
  inline def apply(): GetReplicationRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReplicationRunsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReplicationRunsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReplicationJob(value: ReplicationJob): Self = StObject.set(x, "replicationJob", value.asInstanceOf[js.Any])
    
    inline def setReplicationJobUndefined: Self = StObject.set(x, "replicationJob", js.undefined)
    
    inline def setReplicationRunList(value: ReplicationRunList): Self = StObject.set(x, "replicationRunList", value.asInstanceOf[js.Any])
    
    inline def setReplicationRunListUndefined: Self = StObject.set(x, "replicationRunList", js.undefined)
    
    inline def setReplicationRunListVarargs(value: ReplicationRun*): Self = StObject.set(x, "replicationRunList", js.Array(value*))
  }
}
