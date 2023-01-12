package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartOnDemandReplicationRunResponse extends StObject {
  
  /**
    * The ID of the replication run.
    */
  var replicationRunId: js.UndefOr[ReplicationRunId] = js.undefined
}
object StartOnDemandReplicationRunResponse {
  
  inline def apply(): StartOnDemandReplicationRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOnDemandReplicationRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartOnDemandReplicationRunResponse] (val x: Self) extends AnyVal {
    
    inline def setReplicationRunId(value: ReplicationRunId): Self = StObject.set(x, "replicationRunId", value.asInstanceOf[js.Any])
    
    inline def setReplicationRunIdUndefined: Self = StObject.set(x, "replicationRunId", js.undefined)
  }
}
