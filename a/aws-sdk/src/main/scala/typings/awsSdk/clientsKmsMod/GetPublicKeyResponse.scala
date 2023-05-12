package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPublicKeyResponse extends StObject {
  
  /**
    * Instead, use the KeySpec field in the GetPublicKey response. The KeySpec and CustomerMasterKeySpec fields have the same value. We recommend that you use the KeySpec field in your code. However, to avoid breaking changes, KMS supports both fields.
    */
  var CustomerMasterKeySpec: js.UndefOr[typings.awsSdk.clientsKmsMod.CustomerMasterKeySpec] = js.undefined
  
  /**
    * The encryption algorithms that KMS supports for this key.  This information is critical. If a public key encrypts data outside of KMS by using an unsupported encryption algorithm, the ciphertext cannot be decrypted.  This field appears in the response only when the KeyUsage of the public key is ENCRYPT_DECRYPT.
    */
  var EncryptionAlgorithms: js.UndefOr[EncryptionAlgorithmSpecList] = js.undefined
  
  /**
    * The Amazon Resource Name (key ARN) of the asymmetric KMS key from which the public key was downloaded.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
  
  /**
    * The type of the of the public key that was downloaded.
    */
  var KeySpec: js.UndefOr[typings.awsSdk.clientsKmsMod.KeySpec] = js.undefined
  
  /**
    * The permitted use of the public key. Valid values are ENCRYPT_DECRYPT or SIGN_VERIFY.  This information is critical. If a public key with SIGN_VERIFY key usage encrypts data outside of KMS, the ciphertext cannot be decrypted. 
    */
  var KeyUsage: js.UndefOr[KeyUsageType] = js.undefined
  
  /**
    * The exported public key.  The value is a DER-encoded X.509 public key, also known as SubjectPublicKeyInfo (SPKI), as defined in RFC 5280. When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded. 
    */
  var PublicKey: js.UndefOr[PublicKeyType] = js.undefined
  
  /**
    * The signing algorithms that KMS supports for this key. This field appears in the response only when the KeyUsage of the public key is SIGN_VERIFY.
    */
  var SigningAlgorithms: js.UndefOr[SigningAlgorithmSpecList] = js.undefined
}
object GetPublicKeyResponse {
  
  inline def apply(): GetPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublicKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPublicKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setCustomerMasterKeySpec(value: CustomerMasterKeySpec): Self = StObject.set(x, "CustomerMasterKeySpec", value.asInstanceOf[js.Any])
    
    inline def setCustomerMasterKeySpecUndefined: Self = StObject.set(x, "CustomerMasterKeySpec", js.undefined)
    
    inline def setEncryptionAlgorithms(value: EncryptionAlgorithmSpecList): Self = StObject.set(x, "EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAlgorithmsUndefined: Self = StObject.set(x, "EncryptionAlgorithms", js.undefined)
    
    inline def setEncryptionAlgorithmsVarargs(value: EncryptionAlgorithmSpec*): Self = StObject.set(x, "EncryptionAlgorithms", js.Array(value*))
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setKeySpec(value: KeySpec): Self = StObject.set(x, "KeySpec", value.asInstanceOf[js.Any])
    
    inline def setKeySpecUndefined: Self = StObject.set(x, "KeySpec", js.undefined)
    
    inline def setKeyUsage(value: KeyUsageType): Self = StObject.set(x, "KeyUsage", value.asInstanceOf[js.Any])
    
    inline def setKeyUsageUndefined: Self = StObject.set(x, "KeyUsage", js.undefined)
    
    inline def setPublicKey(value: PublicKeyType): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
    
    inline def setSigningAlgorithms(value: SigningAlgorithmSpecList): Self = StObject.set(x, "SigningAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setSigningAlgorithmsUndefined: Self = StObject.set(x, "SigningAlgorithms", js.undefined)
    
    inline def setSigningAlgorithmsVarargs(value: SigningAlgorithmSpec*): Self = StObject.set(x, "SigningAlgorithms", js.Array(value*))
  }
}
