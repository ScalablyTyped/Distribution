package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAcmMod {
  import typings.awsDashSdk.awsDashSdkStrings.CNAME
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type Arn = java.lang.String
  type CertificateBody = java.lang.String
  type CertificateBodyBlob = Buffer | Uint8Array | Blob | java.lang.String
  type CertificateChain = java.lang.String
  type CertificateChainBlob = Buffer | Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_VALIDATION
    - typings.awsDashSdk.awsDashSdkStrings.ISSUED
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.EXPIRED
    - typings.awsDashSdk.awsDashSdkStrings.VALIDATION_TIMED_OUT
    - typings.awsDashSdk.awsDashSdkStrings.REVOKED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type CertificateStatus = _CertificateStatus | java.lang.String
  type CertificateStatuses = js.Array[CertificateStatus]
  type CertificateSummaryList = js.Array[CertificateSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type CertificateTransparencyLoggingPreference = _CertificateTransparencyLoggingPreference | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IMPORTED
    - typings.awsDashSdk.awsDashSdkStrings.AMAZON_ISSUED
    - typings.awsDashSdk.awsDashSdkStrings.PRIVATE
    - java.lang.String
  */
  type CertificateType = _CertificateType | java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DomainList = js.Array[DomainNameString]
  type DomainNameString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_VALIDATION
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type DomainStatus = _DomainStatus | java.lang.String
  type DomainValidationList = js.Array[DomainValidation]
  type DomainValidationOptionList = js.Array[DomainValidationOption]
  type ExtendedKeyUsageFilterList = js.Array[ExtendedKeyUsageName]
  type ExtendedKeyUsageList = js.Array[ExtendedKeyUsage]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TLS_WEB_SERVER_AUTHENTICATION
    - typings.awsDashSdk.awsDashSdkStrings.TLS_WEB_CLIENT_AUTHENTICATION
    - typings.awsDashSdk.awsDashSdkStrings.CODE_SIGNING
    - typings.awsDashSdk.awsDashSdkStrings.EMAIL_PROTECTION
    - typings.awsDashSdk.awsDashSdkStrings.TIME_STAMPING
    - typings.awsDashSdk.awsDashSdkStrings.OCSP_SIGNING
    - typings.awsDashSdk.awsDashSdkStrings.IPSEC_END_SYSTEM
    - typings.awsDashSdk.awsDashSdkStrings.IPSEC_TUNNEL
    - typings.awsDashSdk.awsDashSdkStrings.IPSEC_USER
    - typings.awsDashSdk.awsDashSdkStrings.ANY
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOM
    - java.lang.String
  */
  type ExtendedKeyUsageName = _ExtendedKeyUsageName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NO_AVAILABLE_CONTACTS
    - typings.awsDashSdk.awsDashSdkStrings.ADDITIONAL_VERIFICATION_REQUIRED
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN_NOT_ALLOWED
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_PUBLIC_DOMAIN
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN_VALIDATION_DENIED
    - typings.awsDashSdk.awsDashSdkStrings.CAA_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.PCA_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.PCA_INVALID_ARN
    - typings.awsDashSdk.awsDashSdkStrings.PCA_INVALID_STATE
    - typings.awsDashSdk.awsDashSdkStrings.PCA_REQUEST_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.PCA_NAME_CONSTRAINTS_VALIDATION
    - typings.awsDashSdk.awsDashSdkStrings.PCA_RESOURCE_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.PCA_INVALID_ARGS
    - typings.awsDashSdk.awsDashSdkStrings.PCA_INVALID_DURATION
    - typings.awsDashSdk.awsDashSdkStrings.PCA_ACCESS_DENIED
    - typings.awsDashSdk.awsDashSdkStrings.OTHER
    - java.lang.String
  */
  type FailureReason = _FailureReason | java.lang.String
  type IdempotencyToken = java.lang.String
  type InUseList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RSA_2048
    - typings.awsDashSdk.awsDashSdkStrings.RSA_1024
    - typings.awsDashSdk.awsDashSdkStrings.RSA_4096
    - typings.awsDashSdk.awsDashSdkStrings.EC_prime256v1
    - typings.awsDashSdk.awsDashSdkStrings.EC_secp384r1
    - typings.awsDashSdk.awsDashSdkStrings.EC_secp521r1
    - java.lang.String
  */
  type KeyAlgorithm = _KeyAlgorithm | java.lang.String
  type KeyAlgorithmList = js.Array[KeyAlgorithm]
  type KeyUsageFilterList = js.Array[KeyUsageName]
  type KeyUsageList = js.Array[KeyUsage]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DIGITAL_SIGNATURE
    - typings.awsDashSdk.awsDashSdkStrings.NON_REPUDIATION
    - typings.awsDashSdk.awsDashSdkStrings.KEY_ENCIPHERMENT
    - typings.awsDashSdk.awsDashSdkStrings.DATA_ENCIPHERMENT
    - typings.awsDashSdk.awsDashSdkStrings.KEY_AGREEMENT
    - typings.awsDashSdk.awsDashSdkStrings.CERTIFICATE_SIGNING
    - typings.awsDashSdk.awsDashSdkStrings.CRL_SIGNING
    - typings.awsDashSdk.awsDashSdkStrings.ENCIPHER_ONLY
    - typings.awsDashSdk.awsDashSdkStrings.DECIPHER_ONLY
    - typings.awsDashSdk.awsDashSdkStrings.ANY
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOM
    - java.lang.String
  */
  type KeyUsageName = _KeyUsageName | java.lang.String
  type MaxItems = Double
  type NextToken = java.lang.String
  type PassphraseBlob = Buffer | Uint8Array | Blob | java.lang.String
  type PrivateKey = java.lang.String
  type PrivateKeyBlob = Buffer | Uint8Array | Blob | java.lang.String
  type RecordType = CNAME | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ELIGIBLE
    - typings.awsDashSdk.awsDashSdkStrings.INELIGIBLE
    - java.lang.String
  */
  type RenewalEligibility = _RenewalEligibility | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_AUTO_RENEWAL
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_VALIDATION
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type RenewalStatus = _RenewalStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNSPECIFIED
    - typings.awsDashSdk.awsDashSdkStrings.KEY_COMPROMISE
    - typings.awsDashSdk.awsDashSdkStrings.CA_COMPROMISE
    - typings.awsDashSdk.awsDashSdkStrings.AFFILIATION_CHANGED
    - typings.awsDashSdk.awsDashSdkStrings.SUPERCEDED
    - typings.awsDashSdk.awsDashSdkStrings.CESSATION_OF_OPERATION
    - typings.awsDashSdk.awsDashSdkStrings.CERTIFICATE_HOLD
    - typings.awsDashSdk.awsDashSdkStrings.REMOVE_FROM_CRL
    - typings.awsDashSdk.awsDashSdkStrings.PRIVILEGE_WITHDRAWN
    - typings.awsDashSdk.awsDashSdkStrings.A_A_COMPROMISE
    - java.lang.String
  */
  type RevocationReason = _RevocationReason | java.lang.String
  type String = java.lang.String
  type TStamp = Date
  type TagKey = java.lang.String
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type ValidationEmailList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EMAIL
    - typings.awsDashSdk.awsDashSdkStrings.DNS
    - java.lang.String
  */
  type ValidationMethod = _ValidationMethod | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-12-08`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
