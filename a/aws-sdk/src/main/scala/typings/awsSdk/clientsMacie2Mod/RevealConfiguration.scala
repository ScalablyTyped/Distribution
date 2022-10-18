package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevealConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN), ID, or alias of the KMS key to use to encrypt sensitive data that's retrieved. The key must be an existing, customer managed, symmetric encryption key that's in the same Amazon Web Services Region as the Amazon Macie account. If this value specifies an alias, it must include the following prefix: alias/. If this value specifies a key that's owned by another Amazon Web Services account, it must specify the ARN of the key or the ARN of the key's alias.
    */
  var kmsKeyId: js.UndefOr[stringMin1Max2048] = js.undefined
  
  /**
    * The status of the configuration for the Amazon Macie account. In a request, valid values are: ENABLED, enable the configuration for the account; and, DISABLED, disable the configuration for the account. In a response, possible values are: ENABLED, the configuration is currently enabled for the account; and, DISABLED, the configuration is currently disabled for the account.
    */
  var status: RevealStatus
}
object RevealConfiguration {
  
  inline def apply(status: RevealStatus): RevealConfiguration = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevealConfiguration]
  }
  
  extension [Self <: RevealConfiguration](x: Self) {
    
    inline def setKmsKeyId(value: stringMin1Max2048): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setStatus(value: RevealStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
