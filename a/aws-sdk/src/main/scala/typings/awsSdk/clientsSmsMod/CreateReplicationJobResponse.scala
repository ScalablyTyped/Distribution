package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReplicationJobResponse extends StObject {
  
  /**
    * The unique identifier of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
}
object CreateReplicationJobResponse {
  
  inline def apply(): CreateReplicationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReplicationJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateReplicationJobResponse] (val x: Self) extends AnyVal {
    
    inline def setReplicationJobId(value: ReplicationJobId): Self = StObject.set(x, "replicationJobId", value.asInstanceOf[js.Any])
    
    inline def setReplicationJobIdUndefined: Self = StObject.set(x, "replicationJobId", js.undefined)
  }
}
