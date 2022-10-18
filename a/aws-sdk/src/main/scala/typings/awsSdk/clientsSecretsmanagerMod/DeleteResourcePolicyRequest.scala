package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyRequest extends StObject {
  
  /**
    * The ARN or name of the secret to delete the attached resource-based policy for. For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See Finding a secret from a partial ARN.
    */
  var SecretId: SecretIdType
}
object DeleteResourcePolicyRequest {
  
  inline def apply(SecretId: SecretIdType): DeleteResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePolicyRequest]
  }
  
  extension [Self <: DeleteResourcePolicyRequest](x: Self) {
    
    inline def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
  }
}
