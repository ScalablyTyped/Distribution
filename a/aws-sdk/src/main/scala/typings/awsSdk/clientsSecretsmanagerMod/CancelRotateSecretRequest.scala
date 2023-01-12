package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelRotateSecretRequest extends StObject {
  
  /**
    * The ARN or name of the secret. For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See Finding a secret from a partial ARN.
    */
  var SecretId: SecretIdType
}
object CancelRotateSecretRequest {
  
  inline def apply(SecretId: SecretIdType): CancelRotateSecretRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelRotateSecretRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelRotateSecretRequest] (val x: Self) extends AnyVal {
    
    inline def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
  }
}
