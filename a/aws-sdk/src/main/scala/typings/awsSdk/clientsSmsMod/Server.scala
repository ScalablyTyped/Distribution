package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Server extends StObject {
  
  /**
    * The ID of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
  
  /**
    * Indicates whether the replication job is deleted or failed.
    */
  var replicationJobTerminated: js.UndefOr[ReplicationJobTerminated] = js.undefined
  
  /**
    * The ID of the server.
    */
  var serverId: js.UndefOr[ServerId] = js.undefined
  
  /**
    * The type of server.
    */
  var serverType: js.UndefOr[ServerType] = js.undefined
  
  /**
    * Information about the VM server.
    */
  var vmServer: js.UndefOr[VmServer] = js.undefined
}
object Server {
  
  inline def apply(): Server = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Server]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Server] (val x: Self) extends AnyVal {
    
    inline def setReplicationJobId(value: ReplicationJobId): Self = StObject.set(x, "replicationJobId", value.asInstanceOf[js.Any])
    
    inline def setReplicationJobIdUndefined: Self = StObject.set(x, "replicationJobId", js.undefined)
    
    inline def setReplicationJobTerminated(value: ReplicationJobTerminated): Self = StObject.set(x, "replicationJobTerminated", value.asInstanceOf[js.Any])
    
    inline def setReplicationJobTerminatedUndefined: Self = StObject.set(x, "replicationJobTerminated", js.undefined)
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
    
    inline def setServerIdUndefined: Self = StObject.set(x, "serverId", js.undefined)
    
    inline def setServerType(value: ServerType): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
    
    inline def setServerTypeUndefined: Self = StObject.set(x, "serverType", js.undefined)
    
    inline def setVmServer(value: VmServer): Self = StObject.set(x, "vmServer", value.asInstanceOf[js.Any])
    
    inline def setVmServerUndefined: Self = StObject.set(x, "vmServer", js.undefined)
  }
}
