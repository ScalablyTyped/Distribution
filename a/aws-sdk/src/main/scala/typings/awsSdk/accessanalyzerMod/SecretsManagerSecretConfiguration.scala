package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretsManagerSecretConfiguration extends StObject {
  
  /**
    * The proposed ARN, key ID, or alias of the KMS key.
    */
  var kmsKeyId: js.UndefOr[SecretsManagerSecretKmsId] = js.undefined
  
  /**
    * The proposed resource policy defining who can access or manage the secret.
    */
  var secretPolicy: js.UndefOr[SecretsManagerSecretPolicy] = js.undefined
}
object SecretsManagerSecretConfiguration {
  
  inline def apply(): SecretsManagerSecretConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretsManagerSecretConfiguration]
  }
  
  extension [Self <: SecretsManagerSecretConfiguration](x: Self) {
    
    inline def setKmsKeyId(value: SecretsManagerSecretKmsId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setSecretPolicy(value: SecretsManagerSecretPolicy): Self = StObject.set(x, "secretPolicy", value.asInstanceOf[js.Any])
    
    inline def setSecretPolicyUndefined: Self = StObject.set(x, "secretPolicy", js.undefined)
  }
}
