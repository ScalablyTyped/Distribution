package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSecretResponse extends StObject {
  
  /**
    * The ARN of the new secret. The ARN includes the name of the secret followed by six random characters. This ensures that if you create a new secret with the same name as a deleted secret, then users with access to the old secret don't get access to the new secret because the ARNs are different.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The name of the new secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
  
  /**
    * A list of the replicas of this secret and their status:    Failed, which indicates that the replica was not created.    InProgress, which indicates that Secrets Manager is in the process of creating the replica.    InSync, which indicates that the replica was created.  
    */
  var ReplicationStatus: js.UndefOr[ReplicationStatusListType] = js.undefined
  
  /**
    * The unique identifier associated with the version of the new secret.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
}
object CreateSecretResponse {
  
  inline def apply(): CreateSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSecretResponse]
  }
  
  extension [Self <: CreateSecretResponse](x: Self) {
    
    inline def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setReplicationStatus(value: ReplicationStatusListType): Self = StObject.set(x, "ReplicationStatus", value.asInstanceOf[js.Any])
    
    inline def setReplicationStatusUndefined: Self = StObject.set(x, "ReplicationStatus", js.undefined)
    
    inline def setReplicationStatusVarargs(value: ReplicationStatusType*): Self = StObject.set(x, "ReplicationStatus", js.Array(value*))
    
    inline def setVersionId(value: SecretVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
