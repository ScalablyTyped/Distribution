package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopReplicationToReplicaResponse extends StObject {
  
  /**
    * The ARN of the promoted secret. The ARN is the same as the original primary secret except the Region is changed.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
}
object StopReplicationToReplicaResponse {
  
  inline def apply(): StopReplicationToReplicaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopReplicationToReplicaResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopReplicationToReplicaResponse] (val x: Self) extends AnyVal {
    
    inline def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
  }
}
