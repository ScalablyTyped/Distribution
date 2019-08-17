package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAcmpcaMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type AccountId = java.lang.String
  type ActionList = js.Array[ActionType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IssueCertificate
    - typings.awsDashSdk.awsDashSdkStrings.GetCertificate
    - typings.awsDashSdk.awsDashSdkStrings.ListPermissions
    - java.lang.String
  */
  type ActionType = _ActionType | java.lang.String
  type Arn = java.lang.String
  type AuditReportId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.JSON
    - typings.awsDashSdk.awsDashSdkStrings.CSV
    - java.lang.String
  */
  type AuditReportResponseFormat = _AuditReportResponseFormat | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type AuditReportStatus = _AuditReportStatus | java.lang.String
  type Boolean = scala.Boolean
  type CertificateAuthorities = js.Array[CertificateAuthority]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_CERTIFICATE
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.EXPIRED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type CertificateAuthorityStatus = _CertificateAuthorityStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ROOT
    - typings.awsDashSdk.awsDashSdkStrings.SUBORDINATE
    - java.lang.String
  */
  type CertificateAuthorityType = _CertificateAuthorityType | java.lang.String
  type CertificateBody = java.lang.String
  type CertificateBodyBlob = Buffer | Uint8Array | Blob | java.lang.String
  type CertificateChain = java.lang.String
  type CertificateChainBlob = Buffer | Uint8Array | Blob | java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CountryCodeString = java.lang.String
  type CsrBlob = Buffer | Uint8Array | Blob | java.lang.String
  type CsrBody = java.lang.String
  type DistinguishedNameQualifierString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.REQUEST_TIMED_OUT
    - typings.awsDashSdk.awsDashSdkStrings.UNSUPPORTED_ALGORITHM
    - typings.awsDashSdk.awsDashSdkStrings.OTHER
    - java.lang.String
  */
  type FailureReason = _FailureReason | java.lang.String
  type IdempotencyToken = java.lang.String
  type Integer1To5000 = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RSA_2048
    - typings.awsDashSdk.awsDashSdkStrings.RSA_4096
    - typings.awsDashSdk.awsDashSdkStrings.EC_prime256v1
    - typings.awsDashSdk.awsDashSdkStrings.EC_secp384r1
    - java.lang.String
  */
  type KeyAlgorithm = _KeyAlgorithm | java.lang.String
  type MaxResults = Double
  type NextToken = java.lang.String
  type PermanentDeletionTimeInDays = Double
  type PermissionList = js.Array[Permission]
  type PositiveLong = Double
  type Principal = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNSPECIFIED
    - typings.awsDashSdk.awsDashSdkStrings.KEY_COMPROMISE
    - typings.awsDashSdk.awsDashSdkStrings.CERTIFICATE_AUTHORITY_COMPROMISE
    - typings.awsDashSdk.awsDashSdkStrings.AFFILIATION_CHANGED
    - typings.awsDashSdk.awsDashSdkStrings.SUPERSEDED
    - typings.awsDashSdk.awsDashSdkStrings.CESSATION_OF_OPERATION
    - typings.awsDashSdk.awsDashSdkStrings.PRIVILEGE_WITHDRAWN
    - typings.awsDashSdk.awsDashSdkStrings.A_A_COMPROMISE
    - java.lang.String
  */
  type RevocationReason = _RevocationReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SHA256WITHECDSA
    - typings.awsDashSdk.awsDashSdkStrings.SHA384WITHECDSA
    - typings.awsDashSdk.awsDashSdkStrings.SHA512WITHECDSA
    - typings.awsDashSdk.awsDashSdkStrings.SHA256WITHRSA
    - typings.awsDashSdk.awsDashSdkStrings.SHA384WITHRSA
    - typings.awsDashSdk.awsDashSdkStrings.SHA512WITHRSA
    - java.lang.String
  */
  type SigningAlgorithm = _SigningAlgorithm | java.lang.String
  type String = java.lang.String
  type String128 = java.lang.String
  type String16 = java.lang.String
  type String253 = java.lang.String
  type String3 = java.lang.String
  type String3To255 = java.lang.String
  type String40 = java.lang.String
  type String5 = java.lang.String
  type String64 = java.lang.String
  type TStamp = Date
  type TagKey = java.lang.String
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.END_DATE
    - typings.awsDashSdk.awsDashSdkStrings.ABSOLUTE
    - typings.awsDashSdk.awsDashSdkStrings.DAYS
    - typings.awsDashSdk.awsDashSdkStrings.MONTHS
    - typings.awsDashSdk.awsDashSdkStrings.YEARS
    - java.lang.String
  */
  type ValidityPeriodType = _ValidityPeriodType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-08-22`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
