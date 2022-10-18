package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveRegionsFromReplicationRequest extends StObject {
  
  /**
    * The Regions of the replicas to remove.
    */
  var RemoveReplicaRegions: RemoveReplicaRegionListType
  
  /**
    * The ARN or name of the secret.
    */
  var SecretId: SecretIdType
}
object RemoveRegionsFromReplicationRequest {
  
  inline def apply(RemoveReplicaRegions: RemoveReplicaRegionListType, SecretId: SecretIdType): RemoveRegionsFromReplicationRequest = {
    val __obj = js.Dynamic.literal(RemoveReplicaRegions = RemoveReplicaRegions.asInstanceOf[js.Any], SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRegionsFromReplicationRequest]
  }
  
  extension [Self <: RemoveRegionsFromReplicationRequest](x: Self) {
    
    inline def setRemoveReplicaRegions(value: RemoveReplicaRegionListType): Self = StObject.set(x, "RemoveReplicaRegions", value.asInstanceOf[js.Any])
    
    inline def setRemoveReplicaRegionsVarargs(value: RegionType*): Self = StObject.set(x, "RemoveReplicaRegions", js.Array(value*))
    
    inline def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
  }
}
