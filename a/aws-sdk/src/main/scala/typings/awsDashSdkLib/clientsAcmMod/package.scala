package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAcmMod {
  type Arn = java.lang.String
  type CertificateBody = java.lang.String
  type CertificateBodyBlob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type CertificateChain = java.lang.String
  type CertificateChainBlob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_VALIDATION
    - awsDashSdkLib.awsDashSdkLibStrings.ISSUED
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED
    - awsDashSdkLib.awsDashSdkLibStrings.VALIDATION_TIMED_OUT
    - awsDashSdkLib.awsDashSdkLibStrings.REVOKED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type CertificateStatus = _CertificateStatus | java.lang.String
  type CertificateStatuses = js.Array[CertificateStatus]
  type CertificateSummaryList = js.Array[CertificateSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type CertificateTransparencyLoggingPreference = _CertificateTransparencyLoggingPreference | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IMPORTED
    - awsDashSdkLib.awsDashSdkLibStrings.AMAZON_ISSUED
    - awsDashSdkLib.awsDashSdkLibStrings.PRIVATE
    - java.lang.String
  */
  type CertificateType = _CertificateType | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DomainList = js.Array[DomainNameString]
  type DomainNameString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_VALIDATION
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type DomainStatus = _DomainStatus | java.lang.String
  type DomainValidationList = js.Array[DomainValidation]
  type DomainValidationOptionList = js.Array[DomainValidationOption]
  type ExtendedKeyUsageFilterList = js.Array[ExtendedKeyUsageName]
  type ExtendedKeyUsageList = js.Array[ExtendedKeyUsage]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TLS_WEB_SERVER_AUTHENTICATION
    - awsDashSdkLib.awsDashSdkLibStrings.TLS_WEB_CLIENT_AUTHENTICATION
    - awsDashSdkLib.awsDashSdkLibStrings.CODE_SIGNING
    - awsDashSdkLib.awsDashSdkLibStrings.EMAIL_PROTECTION
    - awsDashSdkLib.awsDashSdkLibStrings.TIME_STAMPING
    - awsDashSdkLib.awsDashSdkLibStrings.OCSP_SIGNING
    - awsDashSdkLib.awsDashSdkLibStrings.IPSEC_END_SYSTEM
    - awsDashSdkLib.awsDashSdkLibStrings.IPSEC_TUNNEL
    - awsDashSdkLib.awsDashSdkLibStrings.IPSEC_USER
    - awsDashSdkLib.awsDashSdkLibStrings.ANY
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.CUSTOM
    - java.lang.String
  */
  type ExtendedKeyUsageName = _ExtendedKeyUsageName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NO_AVAILABLE_CONTACTS
    - awsDashSdkLib.awsDashSdkLibStrings.ADDITIONAL_VERIFICATION_REQUIRED
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_NOT_ALLOWED
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID_PUBLIC_DOMAIN
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_VALIDATION_DENIED
    - awsDashSdkLib.awsDashSdkLibStrings.CAA_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.PCA_LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.PCA_INVALID_ARN
    - awsDashSdkLib.awsDashSdkLibStrings.PCA_INVALID_STATE
    - awsDashSdkLib.awsDashSdkLibStrings.PCA_REQUEST_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.PCA_RESOURCE_NOT_FOUND
    - awsDashSdkLib.awsDashSdkLibStrings.PCA_INVALID_ARGS
    - awsDashSdkLib.awsDashSdkLibStrings.PCA_INVALID_DURATION
    - awsDashSdkLib.awsDashSdkLibStrings.PCA_ACCESS_DENIED
    - awsDashSdkLib.awsDashSdkLibStrings.OTHER
    - java.lang.String
  */
  type FailureReason = _FailureReason | java.lang.String
  type IdempotencyToken = java.lang.String
  type InUseList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RSA_2048
    - awsDashSdkLib.awsDashSdkLibStrings.RSA_1024
    - awsDashSdkLib.awsDashSdkLibStrings.RSA_4096
    - awsDashSdkLib.awsDashSdkLibStrings.EC_prime256v1
    - awsDashSdkLib.awsDashSdkLibStrings.EC_secp384r1
    - awsDashSdkLib.awsDashSdkLibStrings.EC_secp521r1
    - java.lang.String
  */
  type KeyAlgorithm = _KeyAlgorithm | java.lang.String
  type KeyAlgorithmList = js.Array[KeyAlgorithm]
  type KeyUsageFilterList = js.Array[KeyUsageName]
  type KeyUsageList = js.Array[KeyUsage]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DIGITAL_SIGNATURE
    - awsDashSdkLib.awsDashSdkLibStrings.NON_REPUDIATION
    - awsDashSdkLib.awsDashSdkLibStrings.KEY_ENCIPHERMENT
    - awsDashSdkLib.awsDashSdkLibStrings.DATA_ENCIPHERMENT
    - awsDashSdkLib.awsDashSdkLibStrings.KEY_AGREEMENT
    - awsDashSdkLib.awsDashSdkLibStrings.CERTIFICATE_SIGNING
    - awsDashSdkLib.awsDashSdkLibStrings.CRL_SIGNING
    - awsDashSdkLib.awsDashSdkLibStrings.ENCIPHER_ONLY
    - awsDashSdkLib.awsDashSdkLibStrings.DECIPHER_ONLY
    - awsDashSdkLib.awsDashSdkLibStrings.ANY
    - awsDashSdkLib.awsDashSdkLibStrings.CUSTOM
    - java.lang.String
  */
  type KeyUsageName = _KeyUsageName | java.lang.String
  type MaxItems = scala.Double
  type NextToken = java.lang.String
  type PassphraseBlob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type PrivateKey = java.lang.String
  type PrivateKeyBlob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type RecordType = awsDashSdkLib.awsDashSdkLibStrings.CNAME | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ELIGIBLE
    - awsDashSdkLib.awsDashSdkLibStrings.INELIGIBLE
    - java.lang.String
  */
  type RenewalEligibility = _RenewalEligibility | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_AUTO_RENEWAL
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_VALIDATION
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type RenewalStatus = _RenewalStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNSPECIFIED
    - awsDashSdkLib.awsDashSdkLibStrings.KEY_COMPROMISE
    - awsDashSdkLib.awsDashSdkLibStrings.CA_COMPROMISE
    - awsDashSdkLib.awsDashSdkLibStrings.AFFILIATION_CHANGED
    - awsDashSdkLib.awsDashSdkLibStrings.SUPERCEDED
    - awsDashSdkLib.awsDashSdkLibStrings.CESSATION_OF_OPERATION
    - awsDashSdkLib.awsDashSdkLibStrings.CERTIFICATE_HOLD
    - awsDashSdkLib.awsDashSdkLibStrings.REMOVE_FROM_CRL
    - awsDashSdkLib.awsDashSdkLibStrings.PRIVILEGE_WITHDRAWN
    - awsDashSdkLib.awsDashSdkLibStrings.A_A_COMPROMISE
    - java.lang.String
  */
  type RevocationReason = _RevocationReason | java.lang.String
  type String = java.lang.String
  type TStamp = stdLib.Date
  type TagKey = java.lang.String
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type ValidationEmailList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EMAIL
    - awsDashSdkLib.awsDashSdkLibStrings.DNS
    - java.lang.String
  */
  type ValidationMethod = _ValidationMethod | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-12-08`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
