package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKmsMod {
  type AWSAccountIdType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RSAES_PKCS1_V1_5
    - awsDashSdkLib.awsDashSdkLibStrings.RSAES_OAEP_SHA_1
    - awsDashSdkLib.awsDashSdkLibStrings.RSAES_OAEP_SHA_256
    - java.lang.String
  */
  type AlgorithmSpec = _AlgorithmSpec | java.lang.String
  type AliasList = js.Array[AliasListEntry]
  type AliasNameType = java.lang.String
  type ArnType = java.lang.String
  type BooleanType = scala.Boolean
  type CiphertextType = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudHsmClusterIdType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID_CREDENTIALS
    - awsDashSdkLib.awsDashSdkLibStrings.CLUSTER_NOT_FOUND
    - awsDashSdkLib.awsDashSdkLibStrings.NETWORK_ERRORS
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.INSUFFICIENT_CLOUDHSM_HSMS
    - awsDashSdkLib.awsDashSdkLibStrings.USER_LOCKED_OUT
    - java.lang.String
  */
  type ConnectionErrorCodeType = _ConnectionErrorCodeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CONNECTED
    - awsDashSdkLib.awsDashSdkLibStrings.CONNECTING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DISCONNECTED
    - awsDashSdkLib.awsDashSdkLibStrings.DISCONNECTING
    - java.lang.String
  */
  type ConnectionStateType = _ConnectionStateType | java.lang.String
  type CustomKeyStoreIdType = java.lang.String
  type CustomKeyStoreNameType = java.lang.String
  type CustomKeyStoresList = js.Array[CustomKeyStoresListEntry]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AES_256
    - awsDashSdkLib.awsDashSdkLibStrings.AES_128
    - java.lang.String
  */
  type DataKeySpec = _DataKeySpec | java.lang.String
  type DateType = stdLib.Date
  type DescriptionType = java.lang.String
  type EncryptionContextKey = java.lang.String
  type EncryptionContextType = org.scalablytyped.runtime.StringDictionary[EncryptionContextValue]
  type EncryptionContextValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.KEY_MATERIAL_EXPIRES
    - awsDashSdkLib.awsDashSdkLibStrings.KEY_MATERIAL_DOES_NOT_EXPIRE
    - java.lang.String
  */
  type ExpirationModelType = _ExpirationModelType | java.lang.String
  type GrantIdType = java.lang.String
  type GrantList = js.Array[GrantListEntry]
  type GrantNameType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Decrypt
    - awsDashSdkLib.awsDashSdkLibStrings.Encrypt
    - awsDashSdkLib.awsDashSdkLibStrings.GenerateDataKey
    - awsDashSdkLib.awsDashSdkLibStrings.GenerateDataKeyWithoutPlaintext
    - awsDashSdkLib.awsDashSdkLibStrings.ReEncryptFrom
    - awsDashSdkLib.awsDashSdkLibStrings.ReEncryptTo
    - awsDashSdkLib.awsDashSdkLibStrings.CreateGrant
    - awsDashSdkLib.awsDashSdkLibStrings.RetireGrant
    - awsDashSdkLib.awsDashSdkLibStrings.DescribeKey
    - java.lang.String
  */
  type GrantOperation = _GrantOperation | java.lang.String
  type GrantOperationList = js.Array[GrantOperation]
  type GrantTokenList = js.Array[GrantTokenType]
  type GrantTokenType = java.lang.String
  type KeyIdType = java.lang.String
  type KeyList = js.Array[KeyListEntry]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AWS
    - awsDashSdkLib.awsDashSdkLibStrings.CUSTOMER
    - java.lang.String
  */
  type KeyManagerType = _KeyManagerType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Enabled
    - awsDashSdkLib.awsDashSdkLibStrings.Disabled
    - awsDashSdkLib.awsDashSdkLibStrings.PendingDeletion
    - awsDashSdkLib.awsDashSdkLibStrings.PendingImport
    - awsDashSdkLib.awsDashSdkLibStrings.Unavailable
    - java.lang.String
  */
  type KeyState = _KeyState | java.lang.String
  type KeyStorePasswordType = java.lang.String
  type KeyUsageType = awsDashSdkLib.awsDashSdkLibStrings.ENCRYPT_DECRYPT | java.lang.String
  type LimitType = scala.Double
  type MarkerType = java.lang.String
  type NumberOfBytesType = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AWS_KMS
    - awsDashSdkLib.awsDashSdkLibStrings.EXTERNAL
    - awsDashSdkLib.awsDashSdkLibStrings.AWS_CLOUDHSM
    - java.lang.String
  */
  type OriginType = _OriginType | java.lang.String
  type PendingWindowInDaysType = scala.Double
  type PlaintextType = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type PolicyNameList = js.Array[PolicyNameType]
  type PolicyNameType = java.lang.String
  type PolicyType = java.lang.String
  type PrincipalIdType = java.lang.String
  type TagKeyList = js.Array[TagKeyType]
  type TagKeyType = java.lang.String
  type TagList = js.Array[Tag]
  type TagValueType = java.lang.String
  type TrustAnchorCertificateType = java.lang.String
  type WrappingKeySpec = awsDashSdkLib.awsDashSdkLibStrings.RSA_2048 | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-11-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
