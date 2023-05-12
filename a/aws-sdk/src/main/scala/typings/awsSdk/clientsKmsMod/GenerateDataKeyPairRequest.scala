package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateDataKeyPairRequest extends StObject {
  
  /**
    * Specifies the encryption context that will be used when encrypting the private key in the data key pair.  Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in CloudTrail logs and other output.  An encryption context is a collection of non-secret key-value pairs that represent additional authenticated data. When you use an encryption context to encrypt data, you must specify the same (an exact case-sensitive match) encryption context to decrypt the data. An encryption context is supported only on operations with symmetric encryption KMS keys. On operations with symmetric encryption KMS keys, an encryption context is optional, but it is strongly recommended. For more information, see Encryption context in the Key Management Service Developer Guide.
    */
  var EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined
  
  /**
    * A list of grant tokens. Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved eventual consistency. For more information, see Grant token and Using a grant token in the Key Management Service Developer Guide.
    */
  var GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
  
  /**
    * Specifies the symmetric encryption KMS key that encrypts the private key in the data key pair. You cannot specify an asymmetric KMS key or a KMS key in a custom key store. To get the type and origin of your KMS key, use the DescribeKey operation. To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a KMS key in a different Amazon Web Services account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
    */
  var KeyId: KeyIdType
  
  /**
    * Determines the type of data key pair that is generated.  The KMS rule that restricts the use of asymmetric RSA and SM2 KMS keys to encrypt and decrypt or to sign and verify (but not both), and the rule that permits you to use ECC KMS keys only to sign and verify, are not effective on data key pairs, which are used outside of KMS. The SM2 key spec is only available in China Regions.
    */
  var KeyPairSpec: DataKeyPairSpec
  
  /**
    * A signed attestation document from an Amazon Web Services Nitro enclave and the encryption algorithm to use with the enclave's public key. The only valid encryption algorithm is RSAES_OAEP_SHA_256.  This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To include this parameter, use the Amazon Web Services Nitro Enclaves SDK or any Amazon Web Services SDK. When you use this parameter, instead of returning a plaintext copy of the private data key, KMS encrypts the plaintext private data key under the public key in the attestation document, and returns the resulting ciphertext in the CiphertextForRecipient field in the response. This ciphertext can be decrypted only with the private key in the enclave. The CiphertextBlob field in the response contains a copy of the private data key encrypted under the KMS key specified by the KeyId parameter. The PrivateKeyPlaintext field in the response is null or empty. For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see How Amazon Web Services Nitro Enclaves uses KMS in the Key Management Service Developer Guide.
    */
  var Recipient: js.UndefOr[RecipientInfo] = js.undefined
}
object GenerateDataKeyPairRequest {
  
  inline def apply(KeyId: KeyIdType, KeyPairSpec: DataKeyPairSpec): GenerateDataKeyPairRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], KeyPairSpec = KeyPairSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateDataKeyPairRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateDataKeyPairRequest] (val x: Self) extends AnyVal {
    
    inline def setEncryptionContext(value: EncryptionContextType): Self = StObject.set(x, "EncryptionContext", value.asInstanceOf[js.Any])
    
    inline def setEncryptionContextUndefined: Self = StObject.set(x, "EncryptionContext", js.undefined)
    
    inline def setGrantTokens(value: GrantTokenList): Self = StObject.set(x, "GrantTokens", value.asInstanceOf[js.Any])
    
    inline def setGrantTokensUndefined: Self = StObject.set(x, "GrantTokens", js.undefined)
    
    inline def setGrantTokensVarargs(value: GrantTokenType*): Self = StObject.set(x, "GrantTokens", js.Array(value*))
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyPairSpec(value: DataKeyPairSpec): Self = StObject.set(x, "KeyPairSpec", value.asInstanceOf[js.Any])
    
    inline def setRecipient(value: RecipientInfo): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "Recipient", js.undefined)
  }
}
