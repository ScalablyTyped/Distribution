package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateDataKeyPairResponse extends StObject {
  
  /**
    * The Amazon Resource Name (key ARN) of the KMS key that encrypted the private key.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
  
  /**
    * The type of data key pair that was generated.
    */
  var KeyPairSpec: js.UndefOr[DataKeyPairSpec] = js.undefined
  
  /**
    * The encrypted copy of the private key. When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var PrivateKeyCiphertextBlob: js.UndefOr[CiphertextType] = js.undefined
  
  /**
    * The plaintext copy of the private key. When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var PrivateKeyPlaintext: js.UndefOr[PlaintextType] = js.undefined
  
  /**
    * The public key (in plaintext). When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var PublicKey: js.UndefOr[PublicKeyType] = js.undefined
}
object GenerateDataKeyPairResponse {
  
  inline def apply(): GenerateDataKeyPairResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateDataKeyPairResponse]
  }
  
  extension [Self <: GenerateDataKeyPairResponse](x: Self) {
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setKeyPairSpec(value: DataKeyPairSpec): Self = StObject.set(x, "KeyPairSpec", value.asInstanceOf[js.Any])
    
    inline def setKeyPairSpecUndefined: Self = StObject.set(x, "KeyPairSpec", js.undefined)
    
    inline def setPrivateKeyCiphertextBlob(value: CiphertextType): Self = StObject.set(x, "PrivateKeyCiphertextBlob", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyCiphertextBlobUndefined: Self = StObject.set(x, "PrivateKeyCiphertextBlob", js.undefined)
    
    inline def setPrivateKeyPlaintext(value: PlaintextType): Self = StObject.set(x, "PrivateKeyPlaintext", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyPlaintextUndefined: Self = StObject.set(x, "PrivateKeyPlaintext", js.undefined)
    
    inline def setPublicKey(value: PublicKeyType): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
  }
}
