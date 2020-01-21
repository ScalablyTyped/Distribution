package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object acmpcaMod {
  type AccountId = java.lang.String
  type ActionList = js.Array[typings.awsSdk.acmpcaMod.ActionType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IssueCertificate
    - typings.awsSdk.awsSdkStrings.GetCertificate
    - typings.awsSdk.awsSdkStrings.ListPermissions
    - java.lang.String
  */
  type ActionType = typings.awsSdk.acmpcaMod._ActionType | java.lang.String
  type Arn = java.lang.String
  type AuditReportId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.JSON
    - typings.awsSdk.awsSdkStrings.CSV
    - java.lang.String
  */
  type AuditReportResponseFormat = typings.awsSdk.acmpcaMod._AuditReportResponseFormat | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AuditReportStatus = typings.awsSdk.acmpcaMod._AuditReportStatus | java.lang.String
  type Boolean = scala.Boolean
  type CertificateAuthorities = js.Array[typings.awsSdk.acmpcaMod.CertificateAuthority]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.PENDING_CERTIFICATE
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.EXPIRED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CertificateAuthorityStatus = typings.awsSdk.acmpcaMod._CertificateAuthorityStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ROOT
    - typings.awsSdk.awsSdkStrings.SUBORDINATE
    - java.lang.String
  */
  type CertificateAuthorityType = typings.awsSdk.acmpcaMod._CertificateAuthorityType | java.lang.String
  type CertificateBody = java.lang.String
  type CertificateBodyBlob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.acmpcaMod.Blob | java.lang.String
  type CertificateChain = java.lang.String
  type CertificateChainBlob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.acmpcaMod.Blob | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.acmpcaMod.ClientApiVersions
  type CountryCodeString = java.lang.String
  type CsrBlob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.acmpcaMod.Blob | java.lang.String
  type CsrBody = java.lang.String
  type DistinguishedNameQualifierString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.REQUEST_TIMED_OUT
    - typings.awsSdk.awsSdkStrings.UNSUPPORTED_ALGORITHM
    - typings.awsSdk.awsSdkStrings.OTHER
    - java.lang.String
  */
  type FailureReason = typings.awsSdk.acmpcaMod._FailureReason | java.lang.String
  type IdempotencyToken = java.lang.String
  type Integer1To5000 = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RSA_2048
    - typings.awsSdk.awsSdkStrings.RSA_4096
    - typings.awsSdk.awsSdkStrings.EC_prime256v1
    - typings.awsSdk.awsSdkStrings.EC_secp384r1
    - java.lang.String
  */
  type KeyAlgorithm = typings.awsSdk.acmpcaMod._KeyAlgorithm | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type PermanentDeletionTimeInDays = scala.Double
  type PermissionList = js.Array[typings.awsSdk.acmpcaMod.Permission]
  type PositiveLong = scala.Double
  type Principal = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.UNSPECIFIED
    - typings.awsSdk.awsSdkStrings.KEY_COMPROMISE
    - typings.awsSdk.awsSdkStrings.CERTIFICATE_AUTHORITY_COMPROMISE
    - typings.awsSdk.awsSdkStrings.AFFILIATION_CHANGED
    - typings.awsSdk.awsSdkStrings.SUPERSEDED
    - typings.awsSdk.awsSdkStrings.CESSATION_OF_OPERATION
    - typings.awsSdk.awsSdkStrings.PRIVILEGE_WITHDRAWN
    - typings.awsSdk.awsSdkStrings.A_A_COMPROMISE
    - java.lang.String
  */
  type RevocationReason = typings.awsSdk.acmpcaMod._RevocationReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SHA256WITHECDSA
    - typings.awsSdk.awsSdkStrings.SHA384WITHECDSA
    - typings.awsSdk.awsSdkStrings.SHA512WITHECDSA
    - typings.awsSdk.awsSdkStrings.SHA256WITHRSA
    - typings.awsSdk.awsSdkStrings.SHA384WITHRSA
    - typings.awsSdk.awsSdkStrings.SHA512WITHRSA
    - java.lang.String
  */
  type SigningAlgorithm = typings.awsSdk.acmpcaMod._SigningAlgorithm | java.lang.String
  type String = java.lang.String
  type String128 = java.lang.String
  type String16 = java.lang.String
  type String253 = java.lang.String
  type String3 = java.lang.String
  type String3To255 = java.lang.String
  type String40 = java.lang.String
  type String5 = java.lang.String
  type String64 = java.lang.String
  type TStamp = typings.std.Date
  type TagKey = java.lang.String
  type TagList = js.Array[typings.awsSdk.acmpcaMod.Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.END_DATE
    - typings.awsSdk.awsSdkStrings.ABSOLUTE
    - typings.awsSdk.awsSdkStrings.DAYS
    - typings.awsSdk.awsSdkStrings.MONTHS
    - typings.awsSdk.awsSdkStrings.YEARS
    - java.lang.String
  */
  type ValidityPeriodType = typings.awsSdk.acmpcaMod._ValidityPeriodType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-08-22`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.acmpcaMod._apiVersion | java.lang.String
}
