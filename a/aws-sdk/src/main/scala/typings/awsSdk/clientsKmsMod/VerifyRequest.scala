package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyRequest extends StObject {
  
  /**
    * A list of grant tokens. Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved eventual consistency. For more information, see Grant token and Using a grant token in the Key Management Service Developer Guide.
    */
  var GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
  
  /**
    * Identifies the asymmetric KMS key that will be used to verify the signature. This must be the same KMS key that was used to generate the signature. If you specify a different KMS key, the signature verification fails. To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a KMS key in a different Amazon Web Services account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
    */
  var KeyId: KeyIdType
  
  /**
    * Specifies the message that was signed. You can submit a raw message of up to 4096 bytes, or a hash digest of the message. If you submit a digest, use the MessageType parameter with a value of DIGEST. If the message specified here is different from the message that was signed, the signature verification fails. A message and its hash digest are considered to be the same message.
    */
  var Message: PlaintextType
  
  /**
    * Tells KMS whether the value of the Message parameter should be hashed as part of the signing algorithm. Use RAW for unhashed messages; use DIGEST for message digests, which are already hashed. When the value of MessageType is RAW, KMS uses the standard signing algorithm, which begins with a hash function. When the value is DIGEST, KMS skips the hashing step in the signing algorithm.  Use the DIGEST value only when the value of the Message parameter is a message digest. If you use the DIGEST value with an unhashed message, the security of the verification operation can be compromised.  When the value of MessageTypeis DIGEST, the length of the Message value must match the length of hashed messages for the specified signing algorithm. You can submit a message digest and omit the MessageType or specify RAW so the digest is hashed again while signing. However, if the signed message is hashed once while signing, but twice while verifying, verification fails, even when the message hasn't changed. The hashing algorithm in that Verify uses is based on the SigningAlgorithm value.   Signing algorithms that end in SHA_256 use the SHA_256 hashing algorithm.   Signing algorithms that end in SHA_384 use the SHA_384 hashing algorithm.   Signing algorithms that end in SHA_512 use the SHA_512 hashing algorithm.   SM2DSA uses the SM3 hashing algorithm. For details, see Offline verification with SM2 key pairs.  
    */
  var MessageType: js.UndefOr[typings.awsSdk.clientsKmsMod.MessageType] = js.undefined
  
  /**
    * The signature that the Sign operation generated.
    */
  var Signature: CiphertextType
  
  /**
    * The signing algorithm that was used to sign the message. If you submit a different algorithm, the signature verification fails.
    */
  var SigningAlgorithm: SigningAlgorithmSpec
}
object VerifyRequest {
  
  inline def apply(
    KeyId: KeyIdType,
    Message: PlaintextType,
    Signature: CiphertextType,
    SigningAlgorithm: SigningAlgorithmSpec
  ): VerifyRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any], SigningAlgorithm = SigningAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifyRequest] (val x: Self) extends AnyVal {
    
    inline def setGrantTokens(value: GrantTokenList): Self = StObject.set(x, "GrantTokens", value.asInstanceOf[js.Any])
    
    inline def setGrantTokensUndefined: Self = StObject.set(x, "GrantTokens", js.undefined)
    
    inline def setGrantTokensVarargs(value: GrantTokenType*): Self = StObject.set(x, "GrantTokens", js.Array(value*))
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: PlaintextType): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
    
    inline def setSignature(value: CiphertextType): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    inline def setSigningAlgorithm(value: SigningAlgorithmSpec): Self = StObject.set(x, "SigningAlgorithm", value.asInstanceOf[js.Any])
  }
}
