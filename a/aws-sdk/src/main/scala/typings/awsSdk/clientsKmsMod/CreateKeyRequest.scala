package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeyRequest extends StObject {
  
  /**
    * Skips ("bypasses") the key policy lockout safety check. The default value is false.  Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately. For more information, see Default key policy in the Key Management Service Developer Guide.  Use this parameter only when you intend to prevent the principal that is making the request from making a subsequent PutKeyPolicy request on the KMS key.
    */
  var BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * Creates the KMS key in the specified custom key store. The ConnectionState of the custom key store must be CONNECTED. To find the CustomKeyStoreID and ConnectionState use the DescribeCustomKeyStores operation. This parameter is valid only for symmetric encryption KMS keys in a single Region. You cannot create any other type of KMS key in a custom key store. When you create a KMS key in an CloudHSM key store, KMS generates a non-exportable 256-bit symmetric key in its associated CloudHSM cluster and associates it with the KMS key. When you create a KMS key in an external key store, you must use the XksKeyId parameter to specify an external key that serves as key material for the KMS key.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
  
  /**
    * Instead, use the KeySpec parameter. The KeySpec and CustomerMasterKeySpec parameters work the same way. Only the names differ. We recommend that you use KeySpec parameter in your code. However, to avoid breaking changes, KMS supports both parameters.
    */
  var CustomerMasterKeySpec: js.UndefOr[typings.awsSdk.clientsKmsMod.CustomerMasterKeySpec] = js.undefined
  
  /**
    * A description of the KMS key. Use a description that helps you decide whether the KMS key is appropriate for a task. The default value is an empty string (no description).  Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in CloudTrail logs and other output.  To set or change the description after the key is created, use UpdateKeyDescription.
    */
  var Description: js.UndefOr[DescriptionType] = js.undefined
  
  /**
    * Specifies the type of KMS key to create. The default value, SYMMETRIC_DEFAULT, creates a KMS key with a 256-bit AES-GCM key that is used for encryption and decryption, except in China Regions, where it creates a 128-bit symmetric key that uses SM4 encryption. For help choosing a key spec for your KMS key, see Choosing a KMS key type in the  Key Management Service Developer Guide . The KeySpec determines whether the KMS key contains a symmetric key or an asymmetric key pair. It also determines the algorithms that the KMS key supports. You can't change the KeySpec after the KMS key is created. To further restrict the algorithms that can be used with the KMS key, use a condition key in its key policy or IAM policy. For more information, see kms:EncryptionAlgorithm, kms:MacAlgorithm or kms:Signing Algorithm in the  Key Management Service Developer Guide .   Amazon Web Services services that are integrated with KMS use symmetric encryption KMS keys to protect your data. These services do not support asymmetric KMS keys or HMAC KMS keys.  KMS supports the following key specs for KMS keys:   Symmetric encryption key (default)    SYMMETRIC_DEFAULT      HMAC keys (symmetric)    HMAC_224     HMAC_256     HMAC_384     HMAC_512      Asymmetric RSA key pairs    RSA_2048     RSA_3072     RSA_4096      Asymmetric NIST-recommended elliptic curve key pairs    ECC_NIST_P256 (secp256r1)    ECC_NIST_P384 (secp384r1)    ECC_NIST_P521 (secp521r1)     Other asymmetric elliptic curve key pairs    ECC_SECG_P256K1 (secp256k1), commonly used for cryptocurrencies.     SM2 key pairs (China Regions only)    SM2     
    */
  var KeySpec: js.UndefOr[typings.awsSdk.clientsKmsMod.KeySpec] = js.undefined
  
  /**
    * Determines the cryptographic operations for which you can use the KMS key. The default value is ENCRYPT_DECRYPT. This parameter is optional when you are creating a symmetric encryption KMS key; otherwise, it is required. You can't change the KeyUsage value after the KMS key is created. Select only one valid value.   For symmetric encryption KMS keys, omit the parameter or specify ENCRYPT_DECRYPT.   For HMAC KMS keys (symmetric), specify GENERATE_VERIFY_MAC.   For asymmetric KMS keys with RSA key material, specify ENCRYPT_DECRYPT or SIGN_VERIFY.   For asymmetric KMS keys with ECC key material, specify SIGN_VERIFY.   For asymmetric KMS keys with SM2 key material (China Regions only), specify ENCRYPT_DECRYPT or SIGN_VERIFY.  
    */
  var KeyUsage: js.UndefOr[KeyUsageType] = js.undefined
  
  /**
    * Creates a multi-Region primary key that you can replicate into other Amazon Web Services Regions. You cannot change this value after you create the KMS key.  For a multi-Region key, set this parameter to True. For a single-Region KMS key, omit this parameter or set it to False. The default value is False. This operation supports multi-Region keys, an KMS feature that lets you create multiple interoperable KMS keys in different Amazon Web Services Regions. Because these KMS keys have the same key ID, key material, and other metadata, you can use them interchangeably to encrypt data in one Amazon Web Services Region and decrypt it in a different Amazon Web Services Region without re-encrypting the data or making a cross-Region call. For more information about multi-Region keys, see Multi-Region keys in KMS in the Key Management Service Developer Guide. This value creates a primary key, not a replica. To create a replica key, use the ReplicateKey operation.  You can create a symmetric or asymmetric multi-Region key, and you can create a multi-Region key with imported key material. However, you cannot create a multi-Region key in a custom key store.
    */
  var MultiRegion: js.UndefOr[NullableBooleanType] = js.undefined
  
  /**
    * The source of the key material for the KMS key. You cannot change the origin after you create the KMS key. The default is AWS_KMS, which means that KMS creates the key material. To create a KMS key with no key material (for imported key material), set this value to EXTERNAL. For more information about importing key material into KMS, see Importing Key Material in the Key Management Service Developer Guide. The EXTERNAL origin value is valid only for symmetric KMS keys. To create a KMS key in an CloudHSM key store and create its key material in the associated CloudHSM cluster, set this value to AWS_CLOUDHSM. You must also use the CustomKeyStoreId parameter to identify the CloudHSM key store. The KeySpec value must be SYMMETRIC_DEFAULT. To create a KMS key in an external key store, set this value to EXTERNAL_KEY_STORE. You must also use the CustomKeyStoreId parameter to identify the external key store and the XksKeyId parameter to identify the associated external key. The KeySpec value must be SYMMETRIC_DEFAULT.
    */
  var Origin: js.UndefOr[OriginType] = js.undefined
  
  /**
    * The key policy to attach to the KMS key. If you provide a key policy, it must meet the following criteria:   The key policy must allow the calling principal to make a subsequent PutKeyPolicy request on the KMS key. This reduces the risk that the KMS key becomes unmanageable. For more information, see Default key policy in the Key Management Service Developer Guide. (To omit this condition, set BypassPolicyLockoutSafetyCheck to true.)   Each statement in the key policy must contain one or more principals. The principals in the key policy must exist and be visible to KMS. When you create a new Amazon Web Services principal, you might need to enforce a delay before including the new principal in a key policy because the new principal might not be immediately visible to KMS. For more information, see Changes that I make are not always immediately visible in the Amazon Web Services Identity and Access Management User Guide.   If you do not provide a key policy, KMS attaches a default key policy to the KMS key. For more information, see Default key policy in the Key Management Service Developer Guide.  The key policy size quota is 32 kilobytes (32768 bytes). For help writing and formatting a JSON policy document, see the IAM JSON Policy Reference in the  Identity and Access Management User Guide .
    */
  var Policy: js.UndefOr[PolicyType] = js.undefined
  
  /**
    * Assigns one or more tags to the KMS key. Use this parameter to tag the KMS key when it is created. To tag an existing KMS key, use the TagResource operation.  Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in CloudTrail logs and other output.   Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see ABAC for KMS in the Key Management Service Developer Guide.  To use this parameter, you must have kms:TagResource permission in an IAM policy. Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag value can be an empty (null) string. You cannot have more than one tag on a KMS key with the same tag key. If you specify an existing tag key with a different tag value, KMS replaces the current tag value with the specified one. When you add tags to an Amazon Web Services resource, Amazon Web Services generates a cost allocation report with usage and costs aggregated by tags. Tags can also be used to control access to a KMS key. For details, see Tagging Keys.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Identifies the external key that serves as key material for the KMS key in an external key store. Specify the ID that the external key store proxy uses to refer to the external key. For help, see the documentation for your external key store proxy. This parameter is required for a KMS key with an Origin value of EXTERNAL_KEY_STORE. It is not valid for KMS keys with any other Origin value. The external key must be an existing 256-bit AES symmetric encryption key hosted outside of Amazon Web Services in an external key manager associated with the external key store specified by the CustomKeyStoreId parameter. This key must be enabled and configured to perform encryption and decryption. Each KMS key in an external key store must use a different external key. For details, see Requirements for a KMS key in an external key store in the Key Management Service Developer Guide. Each KMS key in an external key store is associated two backing keys. One is key material that KMS generates. The other is the external key specified by this parameter. When you use the KMS key in an external key store to encrypt data, the encryption operation is performed first by KMS using the KMS key material, and then by the external key manager using the specified external key, a process known as double encryption. For details, see Double encryption in the Key Management Service Developer Guide.
    */
  var XksKeyId: js.UndefOr[XksKeyIdType] = js.undefined
}
object CreateKeyRequest {
  
  inline def apply(): CreateKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setBypassPolicyLockoutSafetyCheck(value: BooleanType): Self = StObject.set(x, "BypassPolicyLockoutSafetyCheck", value.asInstanceOf[js.Any])
    
    inline def setBypassPolicyLockoutSafetyCheckUndefined: Self = StObject.set(x, "BypassPolicyLockoutSafetyCheck", js.undefined)
    
    inline def setCustomKeyStoreId(value: CustomKeyStoreIdType): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreIdUndefined: Self = StObject.set(x, "CustomKeyStoreId", js.undefined)
    
    inline def setCustomerMasterKeySpec(value: CustomerMasterKeySpec): Self = StObject.set(x, "CustomerMasterKeySpec", value.asInstanceOf[js.Any])
    
    inline def setCustomerMasterKeySpecUndefined: Self = StObject.set(x, "CustomerMasterKeySpec", js.undefined)
    
    inline def setDescription(value: DescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setKeySpec(value: KeySpec): Self = StObject.set(x, "KeySpec", value.asInstanceOf[js.Any])
    
    inline def setKeySpecUndefined: Self = StObject.set(x, "KeySpec", js.undefined)
    
    inline def setKeyUsage(value: KeyUsageType): Self = StObject.set(x, "KeyUsage", value.asInstanceOf[js.Any])
    
    inline def setKeyUsageUndefined: Self = StObject.set(x, "KeyUsage", js.undefined)
    
    inline def setMultiRegion(value: NullableBooleanType): Self = StObject.set(x, "MultiRegion", value.asInstanceOf[js.Any])
    
    inline def setMultiRegionUndefined: Self = StObject.set(x, "MultiRegion", js.undefined)
    
    inline def setOrigin(value: OriginType): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "Origin", js.undefined)
    
    inline def setPolicy(value: PolicyType): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setXksKeyId(value: XksKeyIdType): Self = StObject.set(x, "XksKeyId", value.asInstanceOf[js.Any])
    
    inline def setXksKeyIdUndefined: Self = StObject.set(x, "XksKeyId", js.undefined)
  }
}
