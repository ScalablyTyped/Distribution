package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object acmMod {
  type Arn = java.lang.String
  type CertificateBody = java.lang.String
  type CertificateBodyBlob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.acmMod.Blob | java.lang.String
  type CertificateChain = java.lang.String
  type CertificateChainBlob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.acmMod.Blob | java.lang.String
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
  type CertificateStatus = typings.awsSdk.acmMod._CertificateStatus | java.lang.String
  type CertificateStatuses = js.Array[typings.awsSdk.acmMod.CertificateStatus]
  type CertificateSummaryList = js.Array[typings.awsSdk.acmMod.CertificateSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type CertificateTransparencyLoggingPreference = typings.awsSdk.acmMod._CertificateTransparencyLoggingPreference | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IMPORTED
    - typings.awsSdk.awsSdkStrings.AMAZON_ISSUED
    - typings.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type CertificateType = typings.awsSdk.acmMod._CertificateType | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.acmMod.ClientApiVersions
  type DomainList = js.Array[typings.awsSdk.acmMod.DomainNameString]
  type DomainNameString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type DomainStatus = typings.awsSdk.acmMod._DomainStatus | java.lang.String
  type DomainValidationList = js.Array[typings.awsSdk.acmMod.DomainValidation]
  type DomainValidationOptionList = js.Array[typings.awsSdk.acmMod.DomainValidationOption]
  type ExtendedKeyUsageFilterList = js.Array[typings.awsSdk.acmMod.ExtendedKeyUsageName]
  type ExtendedKeyUsageList = js.Array[typings.awsSdk.acmMod.ExtendedKeyUsage]
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
  type ExtendedKeyUsageName = typings.awsSdk.acmMod._ExtendedKeyUsageName | java.lang.String
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
    - typings.awsSdk.awsSdkStrings.OTHER
    - java.lang.String
  */
  type FailureReason = typings.awsSdk.acmMod._FailureReason | java.lang.String
  type IdempotencyToken = java.lang.String
  type InUseList = js.Array[typings.awsSdk.acmMod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RSA_2048
    - typings.awsSdk.awsSdkStrings.RSA_1024
    - typings.awsSdk.awsSdkStrings.RSA_4096
    - typings.awsSdk.awsSdkStrings.EC_prime256v1
    - typings.awsSdk.awsSdkStrings.EC_secp384r1
    - typings.awsSdk.awsSdkStrings.EC_secp521r1
    - java.lang.String
  */
  type KeyAlgorithm = typings.awsSdk.acmMod._KeyAlgorithm | java.lang.String
  type KeyAlgorithmList = js.Array[typings.awsSdk.acmMod.KeyAlgorithm]
  type KeyUsageFilterList = js.Array[typings.awsSdk.acmMod.KeyUsageName]
  type KeyUsageList = js.Array[typings.awsSdk.acmMod.KeyUsage]
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
  type KeyUsageName = typings.awsSdk.acmMod._KeyUsageName | java.lang.String
  type MaxItems = scala.Double
  type NextToken = java.lang.String
  type PassphraseBlob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.acmMod.Blob | java.lang.String
  type PrivateKey = java.lang.String
  type PrivateKeyBlob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.acmMod.Blob | java.lang.String
  type RecordType = typings.awsSdk.awsSdkStrings.CNAME | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ELIGIBLE
    - typings.awsSdk.awsSdkStrings.INELIGIBLE
    - java.lang.String
  */
  type RenewalEligibility = typings.awsSdk.acmMod._RenewalEligibility | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING_AUTO_RENEWAL
    - typings.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RenewalStatus = typings.awsSdk.acmMod._RenewalStatus | java.lang.String
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
  type RevocationReason = typings.awsSdk.acmMod._RevocationReason | java.lang.String
  type String = java.lang.String
  type TStamp = typings.std.Date
  type TagKey = java.lang.String
  type TagList = js.Array[typings.awsSdk.acmMod.Tag]
  type TagValue = java.lang.String
  type ValidationEmailList = js.Array[typings.awsSdk.acmMod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EMAIL
    - typings.awsSdk.awsSdkStrings.DNS
    - java.lang.String
  */
  type ValidationMethod = typings.awsSdk.acmMod._ValidationMethod | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2015-12-08`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.acmMod._apiVersion | java.lang.String
}
