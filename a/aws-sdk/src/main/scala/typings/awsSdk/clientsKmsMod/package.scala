package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_256
import typings.awsSdk.awsSdkStrings.RSA_2048
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSAccountIdType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RSAES_PKCS1_V1_5
  - typings.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_1
  - typings.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_256
  - java.lang.String
*/
type AlgorithmSpec = _AlgorithmSpec | String

type AliasList = js.Array[AliasListEntry]

type AliasNameType = String

type ArnType = String

type AttestationDocumentType = Buffer | js.typedarray.Uint8Array | Blob | String

type BooleanType = Boolean

type CiphertextType = Buffer | js.typedarray.Uint8Array | Blob | String

type CloudHsmClusterIdType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INVALID_CREDENTIALS
  - typings.awsSdk.awsSdkStrings.CLUSTER_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.NETWORK_ERRORS
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.INSUFFICIENT_CLOUDHSM_HSMS
  - typings.awsSdk.awsSdkStrings.USER_LOCKED_OUT
  - typings.awsSdk.awsSdkStrings.USER_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.USER_LOGGED_IN
  - typings.awsSdk.awsSdkStrings.SUBNET_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET
  - typings.awsSdk.awsSdkStrings.XKS_PROXY_ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.XKS_PROXY_NOT_REACHABLE
  - typings.awsSdk.awsSdkStrings.XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.XKS_PROXY_INVALID_RESPONSE
  - typings.awsSdk.awsSdkStrings.XKS_PROXY_INVALID_CONFIGURATION
  - typings.awsSdk.awsSdkStrings.XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION
  - typings.awsSdk.awsSdkStrings.XKS_PROXY_TIMED_OUT
  - typings.awsSdk.awsSdkStrings.XKS_PROXY_INVALID_TLS_CONFIGURATION
  - java.lang.String
*/
type ConnectionErrorCodeType = _ConnectionErrorCodeType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONNECTED
  - typings.awsSdk.awsSdkStrings.CONNECTING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.DISCONNECTED
  - typings.awsSdk.awsSdkStrings.DISCONNECTING
  - java.lang.String
*/
type ConnectionStateType = _ConnectionStateType | String

type CustomKeyStoreIdType = String

type CustomKeyStoreNameType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS_CLOUDHSM
  - typings.awsSdk.awsSdkStrings.EXTERNAL_KEY_STORE
  - java.lang.String
*/
type CustomKeyStoreType = _CustomKeyStoreType | String

type CustomKeyStoresList = js.Array[CustomKeyStoresListEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RSA_2048
  - typings.awsSdk.awsSdkStrings.RSA_3072
  - typings.awsSdk.awsSdkStrings.RSA_4096
  - typings.awsSdk.awsSdkStrings.ECC_NIST_P256
  - typings.awsSdk.awsSdkStrings.ECC_NIST_P384
  - typings.awsSdk.awsSdkStrings.ECC_NIST_P521
  - typings.awsSdk.awsSdkStrings.ECC_SECG_P256K1
  - typings.awsSdk.awsSdkStrings.SYMMETRIC_DEFAULT
  - typings.awsSdk.awsSdkStrings.HMAC_224
  - typings.awsSdk.awsSdkStrings.HMAC_256
  - typings.awsSdk.awsSdkStrings.HMAC_384
  - typings.awsSdk.awsSdkStrings.HMAC_512
  - typings.awsSdk.awsSdkStrings.SM2
  - java.lang.String
*/
type CustomerMasterKeySpec = _CustomerMasterKeySpec | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RSA_2048
  - typings.awsSdk.awsSdkStrings.RSA_3072
  - typings.awsSdk.awsSdkStrings.RSA_4096
  - typings.awsSdk.awsSdkStrings.ECC_NIST_P256
  - typings.awsSdk.awsSdkStrings.ECC_NIST_P384
  - typings.awsSdk.awsSdkStrings.ECC_NIST_P521
  - typings.awsSdk.awsSdkStrings.ECC_SECG_P256K1
  - typings.awsSdk.awsSdkStrings.SM2
  - java.lang.String
*/
type DataKeyPairSpec = _DataKeyPairSpec | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AES_256
  - typings.awsSdk.awsSdkStrings.AES_128
  - java.lang.String
*/
type DataKeySpec = _DataKeySpec | String

type DateType = js.Date

type DescriptionType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SYMMETRIC_DEFAULT
  - typings.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_1
  - typings.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_256
  - typings.awsSdk.awsSdkStrings.SM2PKE
  - java.lang.String
*/
type EncryptionAlgorithmSpec = _EncryptionAlgorithmSpec | String

type EncryptionAlgorithmSpecList = js.Array[EncryptionAlgorithmSpec]

type EncryptionContextKey = String

type EncryptionContextType = StringDictionary[EncryptionContextValue]

type EncryptionContextValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.KEY_MATERIAL_EXPIRES
  - typings.awsSdk.awsSdkStrings.KEY_MATERIAL_DOES_NOT_EXPIRE
  - java.lang.String
*/
type ExpirationModelType = _ExpirationModelType | String

type GrantIdType = String

type GrantList = js.Array[GrantListEntry]

type GrantNameType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Decrypt_
  - typings.awsSdk.awsSdkStrings.Encrypt
  - typings.awsSdk.awsSdkStrings.GenerateDataKey
  - typings.awsSdk.awsSdkStrings.GenerateDataKeyWithoutPlaintext
  - typings.awsSdk.awsSdkStrings.ReEncryptFrom
  - typings.awsSdk.awsSdkStrings.ReEncryptTo
  - typings.awsSdk.awsSdkStrings.Sign_
  - typings.awsSdk.awsSdkStrings.Verify
  - typings.awsSdk.awsSdkStrings.GetPublicKey
  - typings.awsSdk.awsSdkStrings.CreateGrant
  - typings.awsSdk.awsSdkStrings.RetireGrant
  - typings.awsSdk.awsSdkStrings.DescribeKey
  - typings.awsSdk.awsSdkStrings.GenerateDataKeyPair
  - typings.awsSdk.awsSdkStrings.GenerateDataKeyPairWithoutPlaintext
  - typings.awsSdk.awsSdkStrings.GenerateMac
  - typings.awsSdk.awsSdkStrings.VerifyMac
  - java.lang.String
*/
type GrantOperation = _GrantOperation | String

type GrantOperationList = js.Array[GrantOperation]

type GrantTokenList = js.Array[GrantTokenType]

type GrantTokenType = String

type KeyEncryptionMechanism = RSAES_OAEP_SHA_256 | String

type KeyIdType = String

type KeyList = js.Array[KeyListEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS
  - typings.awsSdk.awsSdkStrings.CUSTOMER
  - java.lang.String
*/
type KeyManagerType = _KeyManagerType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RSA_2048
  - typings.awsSdk.awsSdkStrings.RSA_3072
  - typings.awsSdk.awsSdkStrings.RSA_4096
  - typings.awsSdk.awsSdkStrings.ECC_NIST_P256
  - typings.awsSdk.awsSdkStrings.ECC_NIST_P384
  - typings.awsSdk.awsSdkStrings.ECC_NIST_P521
  - typings.awsSdk.awsSdkStrings.ECC_SECG_P256K1
  - typings.awsSdk.awsSdkStrings.SYMMETRIC_DEFAULT
  - typings.awsSdk.awsSdkStrings.HMAC_224
  - typings.awsSdk.awsSdkStrings.HMAC_256
  - typings.awsSdk.awsSdkStrings.HMAC_384
  - typings.awsSdk.awsSdkStrings.HMAC_512
  - typings.awsSdk.awsSdkStrings.SM2
  - java.lang.String
*/
type KeySpec = _KeySpec | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Creating_
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - typings.awsSdk.awsSdkStrings.PendingDeletion
  - typings.awsSdk.awsSdkStrings.PendingImport
  - typings.awsSdk.awsSdkStrings.PendingReplicaDeletion
  - typings.awsSdk.awsSdkStrings.Unavailable__
  - typings.awsSdk.awsSdkStrings.Updating_
  - java.lang.String
*/
type KeyState = _KeyState | String

type KeyStorePasswordType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SIGN_VERIFY
  - typings.awsSdk.awsSdkStrings.ENCRYPT_DECRYPT
  - typings.awsSdk.awsSdkStrings.GENERATE_VERIFY_MAC
  - java.lang.String
*/
type KeyUsageType = _KeyUsageType | String

type LimitType = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HMAC_SHA_224
  - typings.awsSdk.awsSdkStrings.HMAC_SHA_256
  - typings.awsSdk.awsSdkStrings.HMAC_SHA_384
  - typings.awsSdk.awsSdkStrings.HMAC_SHA_512
  - java.lang.String
*/
type MacAlgorithmSpec = _MacAlgorithmSpec | String

type MacAlgorithmSpecList = js.Array[MacAlgorithmSpec]

type MarkerType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RAW
  - typings.awsSdk.awsSdkStrings.DIGEST
  - java.lang.String
*/
type MessageType = _MessageType | String

type MultiRegionKeyList = js.Array[MultiRegionKey]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRIMARY
  - typings.awsSdk.awsSdkStrings.REPLICA
  - java.lang.String
*/
type MultiRegionKeyType = _MultiRegionKeyType | String

type NullableBooleanType = Boolean

type NumberOfBytesType = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS_KMS
  - typings.awsSdk.awsSdkStrings.EXTERNAL
  - typings.awsSdk.awsSdkStrings.AWS_CLOUDHSM
  - typings.awsSdk.awsSdkStrings.EXTERNAL_KEY_STORE
  - java.lang.String
*/
type OriginType = _OriginType | String

type PendingWindowInDaysType = Double

type PlaintextType = Buffer | js.typedarray.Uint8Array | Blob | String

type PolicyNameList = js.Array[PolicyNameType]

type PolicyNameType = String

type PolicyType = String

type PrincipalIdType = String

type PublicKeyType = Buffer | js.typedarray.Uint8Array | Blob | String

type RegionType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RSASSA_PSS_SHA_256
  - typings.awsSdk.awsSdkStrings.RSASSA_PSS_SHA_384
  - typings.awsSdk.awsSdkStrings.RSASSA_PSS_SHA_512
  - typings.awsSdk.awsSdkStrings.RSASSA_PKCS1_V1_5_SHA_256
  - typings.awsSdk.awsSdkStrings.RSASSA_PKCS1_V1_5_SHA_384
  - typings.awsSdk.awsSdkStrings.RSASSA_PKCS1_V1_5_SHA_512
  - typings.awsSdk.awsSdkStrings.ECDSA_SHA_256
  - typings.awsSdk.awsSdkStrings.ECDSA_SHA_384
  - typings.awsSdk.awsSdkStrings.ECDSA_SHA_512
  - typings.awsSdk.awsSdkStrings.SM2DSA
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

type XksKeyIdType = String

type XksProxyAuthenticationAccessKeyIdType = String

type XksProxyAuthenticationRawSecretAccessKeyType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUBLIC_ENDPOINT
  - typings.awsSdk.awsSdkStrings.VPC_ENDPOINT_SERVICE
  - java.lang.String
*/
type XksProxyConnectivityType = _XksProxyConnectivityType | String

type XksProxyUriEndpointType = String

type XksProxyUriPathType = String

type XksProxyVpcEndpointServiceNameType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2014-11-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
