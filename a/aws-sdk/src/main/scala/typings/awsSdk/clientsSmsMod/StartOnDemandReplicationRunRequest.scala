package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartOnDemandReplicationRunRequest extends StObject {
  
  /**
    * The description of the replication run.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the replication job.
    */
  var replicationJobId: ReplicationJobId
}
object StartOnDemandReplicationRunRequest {
  
  inline def apply(replicationJobId: ReplicationJobId): StartOnDemandReplicationRunRequest = {
    val __obj = js.Dynamic.literal(replicationJobId = replicationJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOnDemandReplicationRunRequest]
  }
  
  extension [Self <: StartOnDemandReplicationRunRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setReplicationJobId(value: ReplicationJobId): Self = StObject.set(x, "replicationJobId", value.asInstanceOf[js.Any])
  }
}
