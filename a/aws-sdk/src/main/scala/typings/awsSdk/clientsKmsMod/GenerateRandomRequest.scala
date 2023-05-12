package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateRandomRequest extends StObject {
  
  /**
    * Generates the random byte string in the CloudHSM cluster that is associated with the specified CloudHSM key store. To find the ID of a custom key store, use the DescribeCustomKeyStores operation. External key store IDs are not valid for this parameter. If you specify the ID of an external key store, GenerateRandom throws an UnsupportedOperationException.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
  
  /**
    * The length of the random byte string. This parameter is required.
    */
  var NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined
  
  /**
    * A signed attestation document from an Amazon Web Services Nitro enclave and the encryption algorithm to use with the enclave's public key. The only valid encryption algorithm is RSAES_OAEP_SHA_256.  This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To include this parameter, use the Amazon Web Services Nitro Enclaves SDK or any Amazon Web Services SDK. When you use this parameter, instead of returning plaintext bytes, KMS encrypts the plaintext bytes under the public key in the attestation document, and returns the resulting ciphertext in the CiphertextForRecipient field in the response. This ciphertext can be decrypted only with the private key in the enclave. The Plaintext field in the response is null or empty. For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see How Amazon Web Services Nitro Enclaves uses KMS in the Key Management Service Developer Guide.
    */
  var Recipient: js.UndefOr[RecipientInfo] = js.undefined
}
object GenerateRandomRequest {
  
  inline def apply(): GenerateRandomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateRandomRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateRandomRequest] (val x: Self) extends AnyVal {
    
    inline def setCustomKeyStoreId(value: CustomKeyStoreIdType): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreIdUndefined: Self = StObject.set(x, "CustomKeyStoreId", js.undefined)
    
    inline def setNumberOfBytes(value: NumberOfBytesType): Self = StObject.set(x, "NumberOfBytes", value.asInstanceOf[js.Any])
    
    inline def setNumberOfBytesUndefined: Self = StObject.set(x, "NumberOfBytes", js.undefined)
    
    inline def setRecipient(value: RecipientInfo): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "Recipient", js.undefined)
  }
}
