package typings.awsSdk.clientsAcmMod

import typings.awsSdk.awsSdkStrings.CNAME
import typings.awsSdk.awsSdkStrings.CREATED_AT
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Arn = java.lang.String

type CertificateBody = java.lang.String

type CertificateBodyBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type CertificateChain = java.lang.String

type CertificateChainBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_VALIDATION
  - typings.awsSdk.awsSdkStrings.ISSUED
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - typings.awsSdk.awsSdkStrings.EXPIRED
  - typings.awsSdk.awsSdkStrings.VALIDATION_TIMED_OUT
  - typings.awsSdk.awsSdkStrings.REVOKED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type CertificateStatus = _CertificateStatus | java.lang.String

type CertificateStatuses = js.Array[CertificateStatus]

type CertificateSummaryList = js.Array[CertificateSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type CertificateTransparencyLoggingPreference = _CertificateTransparencyLoggingPreference | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IMPORTED
  - typings.awsSdk.awsSdkStrings.AMAZON_ISSUED
  - typings.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
type CertificateType = _CertificateType | java.lang.String

type DomainList = js.Array[DomainNameString]

type DomainNameString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_VALIDATION
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type DomainStatus = _DomainStatus | java.lang.String

type DomainValidationList = js.Array[DomainValidation]

type DomainValidationOptionList = js.Array[DomainValidationOption]

type ExtendedKeyUsageFilterList = js.Array[ExtendedKeyUsageName]

type ExtendedKeyUsageList = js.Array[ExtendedKeyUsage]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TLS_WEB_SERVER_AUTHENTICATION
  - typings.awsSdk.awsSdkStrings.TLS_WEB_CLIENT_AUTHENTICATION
  - typings.awsSdk.awsSdkStrings.CODE_SIGNING
  - typings.awsSdk.awsSdkStrings.EMAIL_PROTECTION
  - typings.awsSdk.awsSdkStrings.TIME_STAMPING
  - typings.awsSdk.awsSdkStrings.OCSP_SIGNING
  - typings.awsSdk.awsSdkStrings.IPSEC_END_SYSTEM
  - typings.awsSdk.awsSdkStrings.IPSEC_TUNNEL
  - typings.awsSdk.awsSdkStrings.IPSEC_USER
  - typings.awsSdk.awsSdkStrings.ANY
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type ExtendedKeyUsageName = _ExtendedKeyUsageName | java.lang.String

type ExtendedKeyUsageNames = js.Array[ExtendedKeyUsageName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NO_AVAILABLE_CONTACTS
  - typings.awsSdk.awsSdkStrings.ADDITIONAL_VERIFICATION_REQUIRED
  - typings.awsSdk.awsSdkStrings.DOMAIN_NOT_ALLOWED
  - typings.awsSdk.awsSdkStrings.INVALID_PUBLIC_DOMAIN
  - typings.awsSdk.awsSdkStrings.DOMAIN_VALIDATION_DENIED
  - typings.awsSdk.awsSdkStrings.CAA_ERROR
  - typings.awsSdk.awsSdkStrings.PCA_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.PCA_INVALID_ARN
  - typings.awsSdk.awsSdkStrings.PCA_INVALID_STATE
  - typings.awsSdk.awsSdkStrings.PCA_REQUEST_FAILED
  - typings.awsSdk.awsSdkStrings.PCA_NAME_CONSTRAINTS_VALIDATION
  - typings.awsSdk.awsSdkStrings.PCA_RESOURCE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.PCA_INVALID_ARGS
  - typings.awsSdk.awsSdkStrings.PCA_INVALID_DURATION
  - typings.awsSdk.awsSdkStrings.PCA_ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.SLR_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.OTHER
  - java.lang.String
*/
type FailureReason = _FailureReason | java.lang.String

type IdempotencyToken = java.lang.String

type InUseList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RSA_1024
  - typings.awsSdk.awsSdkStrings.RSA_2048
  - typings.awsSdk.awsSdkStrings.RSA_3072
  - typings.awsSdk.awsSdkStrings.RSA_4096
  - typings.awsSdk.awsSdkStrings.EC_prime256v1
  - typings.awsSdk.awsSdkStrings.EC_secp384r1
  - typings.awsSdk.awsSdkStrings.EC_secp521r1
  - java.lang.String
*/
type KeyAlgorithm = _KeyAlgorithm | java.lang.String

type KeyAlgorithmList = js.Array[KeyAlgorithm]

type KeyUsageFilterList = js.Array[KeyUsageName]

type KeyUsageList = js.Array[KeyUsage]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DIGITAL_SIGNATURE
  - typings.awsSdk.awsSdkStrings.NON_REPUDIATION
  - typings.awsSdk.awsSdkStrings.KEY_ENCIPHERMENT
  - typings.awsSdk.awsSdkStrings.DATA_ENCIPHERMENT
  - typings.awsSdk.awsSdkStrings.KEY_AGREEMENT
  - typings.awsSdk.awsSdkStrings.CERTIFICATE_SIGNING
  - typings.awsSdk.awsSdkStrings.CRL_SIGNING
  - typings.awsSdk.awsSdkStrings.ENCIPHER_ONLY
  - typings.awsSdk.awsSdkStrings.DECIPHER_ONLY
  - typings.awsSdk.awsSdkStrings.ANY
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type KeyUsageName = _KeyUsageName | java.lang.String

type KeyUsageNames = js.Array[KeyUsageName]

type MaxItems = Double

type NextToken = java.lang.String

type NullableBoolean = Boolean

type PassphraseBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type PcaArn = java.lang.String

type PositiveInteger = Double

type PrivateKey = java.lang.String

type PrivateKeyBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type RecordType = CNAME | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ELIGIBLE
  - typings.awsSdk.awsSdkStrings.INELIGIBLE
  - java.lang.String
*/
type RenewalEligibility = _RenewalEligibility | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_AUTO_RENEWAL
  - typings.awsSdk.awsSdkStrings.PENDING_VALIDATION
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type RenewalStatus = _RenewalStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNSPECIFIED
  - typings.awsSdk.awsSdkStrings.KEY_COMPROMISE
  - typings.awsSdk.awsSdkStrings.CA_COMPROMISE
  - typings.awsSdk.awsSdkStrings.AFFILIATION_CHANGED
  - typings.awsSdk.awsSdkStrings.SUPERCEDED
  - typings.awsSdk.awsSdkStrings.CESSATION_OF_OPERATION
  - typings.awsSdk.awsSdkStrings.CERTIFICATE_HOLD
  - typings.awsSdk.awsSdkStrings.REMOVE_FROM_CRL
  - typings.awsSdk.awsSdkStrings.PRIVILEGE_WITHDRAWN
  - typings.awsSdk.awsSdkStrings.A_A_COMPROMISE
  - java.lang.String
*/
type RevocationReason = _RevocationReason | java.lang.String

type SortBy = CREATED_AT | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type String = java.lang.String

type TStamp = js.Date

type TagKey = java.lang.String

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type ValidationEmailList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EMAIL
  - typings.awsSdk.awsSdkStrings.DNS
  - java.lang.String
*/
type ValidationMethod = _ValidationMethod | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-12-08`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
