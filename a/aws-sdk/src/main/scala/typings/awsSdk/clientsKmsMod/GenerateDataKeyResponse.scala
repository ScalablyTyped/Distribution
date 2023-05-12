package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateDataKeyResponse extends StObject {
  
  /**
    * The encrypted copy of the data key. When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined
  
  /**
    * The plaintext data key encrypted with the public key from the Nitro enclave. This ciphertext can be decrypted only by using a private key in the Nitro enclave.  This field is included in the response only when the Recipient parameter in the request includes a valid attestation document from an Amazon Web Services Nitro enclave. For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see How Amazon Web Services Nitro Enclaves uses KMS in the Key Management Service Developer Guide.
    */
  var CiphertextForRecipient: js.UndefOr[CiphertextType] = js.undefined
  
  /**
    * The Amazon Resource Name (key ARN) of the KMS key that encrypted the data key.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
  
  /**
    * The plaintext data key. When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded. Use this data key to encrypt your data outside of KMS. Then, remove it from memory as soon as possible. If the response includes the CiphertextForRecipient field, the Plaintext field is null or empty.
    */
  var Plaintext: js.UndefOr[PlaintextType] = js.undefined
}
object GenerateDataKeyResponse {
  
  inline def apply(): GenerateDataKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateDataKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateDataKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setCiphertextBlob(value: CiphertextType): Self = StObject.set(x, "CiphertextBlob", value.asInstanceOf[js.Any])
    
    inline def setCiphertextBlobUndefined: Self = StObject.set(x, "CiphertextBlob", js.undefined)
    
    inline def setCiphertextForRecipient(value: CiphertextType): Self = StObject.set(x, "CiphertextForRecipient", value.asInstanceOf[js.Any])
    
    inline def setCiphertextForRecipientUndefined: Self = StObject.set(x, "CiphertextForRecipient", js.undefined)
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setPlaintext(value: PlaintextType): Self = StObject.set(x, "Plaintext", value.asInstanceOf[js.Any])
    
    inline def setPlaintextUndefined: Self = StObject.set(x, "Plaintext", js.undefined)
  }
}
