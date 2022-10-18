package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotMessage extends StObject {
  
  /**
    * The identifier of an existing cluster. The snapshot is created from this cluster.
    */
  var CacheClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the KMS key used to encrypt the snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of an existing replication group. The snapshot is created from this replication group.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * A name for the snapshot being created.
    */
  var SnapshotName: String
  
  /**
    * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag value, although null is accepted.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateSnapshotMessage {
  
  inline def apply(SnapshotName: String): CreateSnapshotMessage = {
    val __obj = js.Dynamic.literal(SnapshotName = SnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotMessage]
  }
  
  extension [Self <: CreateSnapshotMessage](x: Self) {
    
    inline def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterIdUndefined: Self = StObject.set(x, "CacheClusterId", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupIdUndefined: Self = StObject.set(x, "ReplicationGroupId", js.undefined)
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
