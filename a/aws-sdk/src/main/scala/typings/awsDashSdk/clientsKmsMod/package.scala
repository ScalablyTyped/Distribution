package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKmsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.ENCRYPT_DECRYPT
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
    - typings.awsDashSdk.awsDashSdkStrings.AES_256
    - typings.awsDashSdk.awsDashSdkStrings.AES_128
    - java.lang.String
  */
  type DataKeySpec = _DataKeySpec | String
  type DateType = Date
  type DescriptionType = String
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
    - typings.awsDashSdk.awsDashSdkStrings.CreateGrant
    - typings.awsDashSdk.awsDashSdkStrings.RetireGrant
    - typings.awsDashSdk.awsDashSdkStrings.DescribeKey
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
    - typings.awsDashSdk.awsDashSdkStrings.Enabled
    - typings.awsDashSdk.awsDashSdkStrings.Disabled
    - typings.awsDashSdk.awsDashSdkStrings.PendingDeletion
    - typings.awsDashSdk.awsDashSdkStrings.PendingImport
    - typings.awsDashSdk.awsDashSdkStrings.Unavailable
    - java.lang.String
  */
  type KeyState = _KeyState | String
  type KeyStorePasswordType = String
  type KeyUsageType = ENCRYPT_DECRYPT | String
  type LimitType = Double
  type MarkerType = String
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
  type TagKeyList = js.Array[TagKeyType]
  type TagKeyType = String
  type TagList = js.Array[Tag]
  type TagValueType = String
  type TrustAnchorCertificateType = String
  type WrappingKeySpec = RSA_2048 | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2014-11-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
