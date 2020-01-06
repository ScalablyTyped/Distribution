package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKmsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.RSA_2048
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type AWSAccountIdType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RSAES_PKCS1_V1_5
    - typings.awsDashSdk.awsDashSdkStrings.RSAES_OAEP_SHA_1
    - typings.awsDashSdk.awsDashSdkStrings.RSAES_OAEP_SHA_256
    - java.lang.String
  */
  type AlgorithmSpec = _AlgorithmSpec | String
  type AliasList = js.Array[AliasListEntry]
  type AliasNameType = String
  type ArnType = String
  type BooleanType = Boolean
  type CiphertextType = Buffer | Uint8Array | Blob | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CloudHsmClusterIdType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_CREDENTIALS
    - typings.awsDashSdk.awsDashSdkStrings.CLUSTER_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.NETWORK_ERRORS
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.INSUFFICIENT_CLOUDHSM_HSMS
    - typings.awsDashSdk.awsDashSdkStrings.USER_LOCKED_OUT
    - java.lang.String
  */
  type ConnectionErrorCodeType = _ConnectionErrorCodeType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CONNECTED
    - typings.awsDashSdk.awsDashSdkStrings.CONNECTING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DISCONNECTED
    - typings.awsDashSdk.awsDashSdkStrings.DISCONNECTING
    - java.lang.String
  */
  type ConnectionStateType = _ConnectionStateType | String
  type CustomKeyStoreIdType = String
  type CustomKeyStoreNameType = String
  type CustomKeyStoresList = js.Array[CustomKeyStoresListEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RSA_2048
    - typings.awsDashSdk.awsDashSdkStrings.RSA_3072
    - typings.awsDashSdk.awsDashSdkStrings.RSA_4096
    - typings.awsDashSdk.awsDashSdkStrings.ECC_NIST_P256
    - typings.awsDashSdk.awsDashSdkStrings.ECC_NIST_P384
    - typings.awsDashSdk.awsDashSdkStrings.ECC_NIST_P521
    - typings.awsDashSdk.awsDashSdkStrings.ECC_SECG_P256K1
    - typings.awsDashSdk.awsDashSdkStrings.SYMMETRIC_DEFAULT
    - java.lang.String
  */
  type CustomerMasterKeySpec = _CustomerMasterKeySpec | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RSA_2048
    - typings.awsDashSdk.awsDashSdkStrings.RSA_3072
    - typings.awsDashSdk.awsDashSdkStrings.RSA_4096
    - typings.awsDashSdk.awsDashSdkStrings.ECC_NIST_P256
    - typings.awsDashSdk.awsDashSdkStrings.ECC_NIST_P384
    - typings.awsDashSdk.awsDashSdkStrings.ECC_NIST_P521
    - typings.awsDashSdk.awsDashSdkStrings.ECC_SECG_P256K1
    - java.lang.String
  */
  type DataKeyPairSpec = _DataKeyPairSpec | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AES_256
    - typings.awsDashSdk.awsDashSdkStrings.AES_128
    - java.lang.String
  */
  type DataKeySpec = _DataKeySpec | String
  type DateType = Date
  type DescriptionType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SYMMETRIC_DEFAULT
    - typings.awsDashSdk.awsDashSdkStrings.RSAES_OAEP_SHA_1
    - typings.awsDashSdk.awsDashSdkStrings.RSAES_OAEP_SHA_256
    - java.lang.String
  */
  type EncryptionAlgorithmSpec = _EncryptionAlgorithmSpec | String
  type EncryptionAlgorithmSpecList = js.Array[EncryptionAlgorithmSpec]
  type EncryptionContextKey = String
  type EncryptionContextType = StringDictionary[EncryptionContextValue]
  type EncryptionContextValue = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.KEY_MATERIAL_EXPIRES
    - typings.awsDashSdk.awsDashSdkStrings.KEY_MATERIAL_DOES_NOT_EXPIRE
    - java.lang.String
  */
  type ExpirationModelType = _ExpirationModelType | String
  type GrantIdType = String
  type GrantList = js.Array[GrantListEntry]
  type GrantNameType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Decrypt
    - typings.awsDashSdk.awsDashSdkStrings.Encrypt
    - typings.awsDashSdk.awsDashSdkStrings.GenerateDataKey
    - typings.awsDashSdk.awsDashSdkStrings.GenerateDataKeyWithoutPlaintext
    - typings.awsDashSdk.awsDashSdkStrings.ReEncryptFrom
    - typings.awsDashSdk.awsDashSdkStrings.ReEncryptTo
    - typings.awsDashSdk.awsDashSdkStrings.Sign_
    - typings.awsDashSdk.awsDashSdkStrings.Verify
    - typings.awsDashSdk.awsDashSdkStrings.GetPublicKey
    - typings.awsDashSdk.awsDashSdkStrings.CreateGrant
    - typings.awsDashSdk.awsDashSdkStrings.RetireGrant
    - typings.awsDashSdk.awsDashSdkStrings.DescribeKey
    - typings.awsDashSdk.awsDashSdkStrings.GenerateDataKeyPair
    - typings.awsDashSdk.awsDashSdkStrings.GenerateDataKeyPairWithoutPlaintext
    - java.lang.String
  */
  type GrantOperation = _GrantOperation | String
  type GrantOperationList = js.Array[GrantOperation]
  type GrantTokenList = js.Array[GrantTokenType]
  type GrantTokenType = String
  type KeyIdType = String
  type KeyList = js.Array[KeyListEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AWS
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOMER
    - java.lang.String
  */
  type KeyManagerType = _KeyManagerType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - typings.awsDashSdk.awsDashSdkStrings.PendingDeletion
    - typings.awsDashSdk.awsDashSdkStrings.PendingImport
    - typings.awsDashSdk.awsDashSdkStrings.Unavailable_
    - java.lang.String
  */
  type KeyState = _KeyState | String
  type KeyStorePasswordType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SIGN_VERIFY
    - typings.awsDashSdk.awsDashSdkStrings.ENCRYPT_DECRYPT
    - java.lang.String
  */
  type KeyUsageType = _KeyUsageType | String
  type LimitType = Double
  type MarkerType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RAW
    - typings.awsDashSdk.awsDashSdkStrings.DIGEST
    - java.lang.String
  */
  type MessageType = _MessageType | String
  type NumberOfBytesType = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AWS_KMS
    - typings.awsDashSdk.awsDashSdkStrings.EXTERNAL
    - typings.awsDashSdk.awsDashSdkStrings.AWS_CLOUDHSM
    - java.lang.String
  */
  type OriginType = _OriginType | String
  type PendingWindowInDaysType = Double
  type PlaintextType = Buffer | Uint8Array | Blob | String
  type PolicyNameList = js.Array[PolicyNameType]
  type PolicyNameType = String
  type PolicyType = String
  type PrincipalIdType = String
  type PublicKeyType = Buffer | Uint8Array | Blob | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RSASSA_PSS_SHA_256
    - typings.awsDashSdk.awsDashSdkStrings.RSASSA_PSS_SHA_384
    - typings.awsDashSdk.awsDashSdkStrings.RSASSA_PSS_SHA_512
    - typings.awsDashSdk.awsDashSdkStrings.RSASSA_PKCS1_V1_5_SHA_256
    - typings.awsDashSdk.awsDashSdkStrings.RSASSA_PKCS1_V1_5_SHA_384
    - typings.awsDashSdk.awsDashSdkStrings.RSASSA_PKCS1_V1_5_SHA_512
    - typings.awsDashSdk.awsDashSdkStrings.ECDSA_SHA_256
    - typings.awsDashSdk.awsDashSdkStrings.ECDSA_SHA_384
    - typings.awsDashSdk.awsDashSdkStrings.ECDSA_SHA_512
    - java.lang.String
  */
  type SigningAlgorithmSpec = _SigningAlgorithmSpec | String
  type SigningAlgorithmSpecList = js.Array[SigningAlgorithmSpec]
  type TagKeyList = js.Array[TagKeyType]
  type TagKeyType = String
  type TagList = js.Array[Tag]
  type TagValueType = String
  type TrustAnchorCertificateType = String
  type WrappingKeySpec = RSA_2048 | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2014-11-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
