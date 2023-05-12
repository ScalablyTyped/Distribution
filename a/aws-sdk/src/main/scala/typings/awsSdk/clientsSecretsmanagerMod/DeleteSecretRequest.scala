package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSecretRequest extends StObject {
  
  /**
    * Specifies whether to delete the secret without any recovery window. You can't use both this parameter and RecoveryWindowInDays in the same call. If you don't use either, then by default Secrets Manager uses a 30 day recovery window. Secrets Manager performs the actual deletion with an asynchronous background process, so there might be a short delay before the secret is permanently deleted. If you delete a secret and then immediately create a secret with the same name, use appropriate back off and retry logic.  Use this parameter with caution. This parameter causes the operation to skip the normal recovery window before the permanent deletion that Secrets Manager would normally impose with the RecoveryWindowInDays parameter. If you delete a secret with the ForceDeleteWithoutRecovery parameter, then you have no opportunity to recover the secret. You lose the secret permanently. 
    */
  var ForceDeleteWithoutRecovery: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * The number of days from 7 to 30 that Secrets Manager waits before permanently deleting the secret. You can't use both this parameter and ForceDeleteWithoutRecovery in the same call. If you don't use either, then by default Secrets Manager uses a 30 day recovery window.
    */
  var RecoveryWindowInDays: js.UndefOr[RecoveryWindowInDaysType] = js.undefined
  
  /**
    * The ARN or name of the secret to delete. For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See Finding a secret from a partial ARN.
    */
  var SecretId: SecretIdType
}
object DeleteSecretRequest {
  
  inline def apply(SecretId: SecretIdType): DeleteSecretRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSecretRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSecretRequest] (val x: Self) extends AnyVal {
    
    inline def setForceDeleteWithoutRecovery(value: BooleanType): Self = StObject.set(x, "ForceDeleteWithoutRecovery", value.asInstanceOf[js.Any])
    
    inline def setForceDeleteWithoutRecoveryUndefined: Self = StObject.set(x, "ForceDeleteWithoutRecovery", js.undefined)
    
    inline def setRecoveryWindowInDays(value: RecoveryWindowInDaysType): Self = StObject.set(x, "RecoveryWindowInDays", value.asInstanceOf[js.Any])
    
    inline def setRecoveryWindowInDaysUndefined: Self = StObject.set(x, "RecoveryWindowInDays", js.undefined)
    
    inline def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
  }
}
