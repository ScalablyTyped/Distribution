package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicateKeyResponse extends StObject {
  
  /**
    * Displays details about the new replica key, including its Amazon Resource Name (key ARN) and Key states of KMS keys. It also includes the ARN and Amazon Web Services Region of its primary key and other replica keys.
    */
  var ReplicaKeyMetadata: js.UndefOr[KeyMetadata] = js.undefined
  
  /**
    * The key policy of the new replica key. The value is a key policy document in JSON format.
    */
  var ReplicaPolicy: js.UndefOr[PolicyType] = js.undefined
  
  /**
    * The tags on the new replica key. The value is a list of tag key and tag value pairs.
    */
  var ReplicaTags: js.UndefOr[TagList] = js.undefined
}
object ReplicateKeyResponse {
  
  inline def apply(): ReplicateKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicateKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicateKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setReplicaKeyMetadata(value: KeyMetadata): Self = StObject.set(x, "ReplicaKeyMetadata", value.asInstanceOf[js.Any])
    
    inline def setReplicaKeyMetadataUndefined: Self = StObject.set(x, "ReplicaKeyMetadata", js.undefined)
    
    inline def setReplicaPolicy(value: PolicyType): Self = StObject.set(x, "ReplicaPolicy", value.asInstanceOf[js.Any])
    
    inline def setReplicaPolicyUndefined: Self = StObject.set(x, "ReplicaPolicy", js.undefined)
    
    inline def setReplicaTags(value: TagList): Self = StObject.set(x, "ReplicaTags", value.asInstanceOf[js.Any])
    
    inline def setReplicaTagsUndefined: Self = StObject.set(x, "ReplicaTags", js.undefined)
    
    inline def setReplicaTagsVarargs(value: Tag*): Self = StObject.set(x, "ReplicaTags", js.Array(value*))
  }
}
