package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopReplicationToReplicaRequest extends StObject {
  
  /**
    * The ARN of the primary secret. 
    */
  var SecretId: SecretIdType
}
object StopReplicationToReplicaRequest {
  
  inline def apply(SecretId: SecretIdType): StopReplicationToReplicaRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopReplicationToReplicaRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopReplicationToReplicaRequest] (val x: Self) extends AnyVal {
    
    inline def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
  }
}
