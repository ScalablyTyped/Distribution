package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationGroupMessage extends StObject {
  
  /**
    * The name of a final node group (shard) snapshot. ElastiCache creates the snapshot from the primary node in the cluster, rather than one of the replicas; this is to ensure that it captures the freshest data. After the final snapshot is taken, the replication group is immediately deleted.
    */
  var FinalSnapshotIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the cluster to be deleted. This parameter is not case sensitive.
    */
  var ReplicationGroupId: String
  
  /**
    * If set to true, all of the read replicas are deleted, but the primary node is retained.
    */
  var RetainPrimaryCluster: js.UndefOr[BooleanOptional] = js.undefined
}
object DeleteReplicationGroupMessage {
  
  inline def apply(ReplicationGroupId: String): DeleteReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationGroupMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteReplicationGroupMessage] (val x: Self) extends AnyVal {
    
    inline def setFinalSnapshotIdentifier(value: String): Self = StObject.set(x, "FinalSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setFinalSnapshotIdentifierUndefined: Self = StObject.set(x, "FinalSnapshotIdentifier", js.undefined)
    
    inline def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    inline def setRetainPrimaryCluster(value: BooleanOptional): Self = StObject.set(x, "RetainPrimaryCluster", value.asInstanceOf[js.Any])
    
    inline def setRetainPrimaryClusterUndefined: Self = StObject.set(x, "RetainPrimaryCluster", js.undefined)
  }
}
