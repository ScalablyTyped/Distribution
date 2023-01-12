package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutKMSEncryptionKeyRequest extends StObject {
  
  /**
    * The KMS encryption key ARN. The KMS key must be single-Region key. Amazon Fraud Detector does not support multi-Region KMS key.
    */
  var kmsEncryptionKeyArn: KmsEncryptionKeyArn
}
object PutKMSEncryptionKeyRequest {
  
  inline def apply(kmsEncryptionKeyArn: KmsEncryptionKeyArn): PutKMSEncryptionKeyRequest = {
    val __obj = js.Dynamic.literal(kmsEncryptionKeyArn = kmsEncryptionKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutKMSEncryptionKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutKMSEncryptionKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setKmsEncryptionKeyArn(value: KmsEncryptionKeyArn): Self = StObject.set(x, "kmsEncryptionKeyArn", value.asInstanceOf[js.Any])
  }
}
