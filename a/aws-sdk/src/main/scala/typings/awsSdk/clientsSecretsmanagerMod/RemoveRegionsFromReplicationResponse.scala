package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveRegionsFromReplicationResponse extends StObject {
  
  /**
    * The ARN of the primary secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The status of replicas for this secret after you remove Regions.
    */
  var ReplicationStatus: js.UndefOr[ReplicationStatusListType] = js.undefined
}
object RemoveRegionsFromReplicationResponse {
  
  inline def apply(): RemoveRegionsFromReplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveRegionsFromReplicationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveRegionsFromReplicationResponse] (val x: Self) extends AnyVal {
    
    inline def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setReplicationStatus(value: ReplicationStatusListType): Self = StObject.set(x, "ReplicationStatus", value.asInstanceOf[js.Any])
    
    inline def setReplicationStatusUndefined: Self = StObject.set(x, "ReplicationStatus", js.undefined)
    
    inline def setReplicationStatusVarargs(value: ReplicationStatusType*): Self = StObject.set(x, "ReplicationStatus", js.Array(value*))
  }
}
