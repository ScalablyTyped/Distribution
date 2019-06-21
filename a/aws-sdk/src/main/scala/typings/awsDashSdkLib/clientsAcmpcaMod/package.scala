package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAcmpcaMod {
  type AccountId = java.lang.String
  type ActionList = js.Array[ActionType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IssueCertificate
    - awsDashSdkLib.awsDashSdkLibStrings.GetCertificate
    - awsDashSdkLib.awsDashSdkLibStrings.ListPermissions
    - java.lang.String
  */
  type ActionType = _ActionType | java.lang.String
  type Arn = java.lang.String
  type AuditReportId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.JSON
    - awsDashSdkLib.awsDashSdkLibStrings.CSV
    - java.lang.String
  */
  type AuditReportResponseFormat = _AuditReportResponseFormat | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type AuditReportStatus = _AuditReportStatus | java.lang.String
  type Boolean = scala.Boolean
  type CertificateAuthorities = js.Array[CertificateAuthority]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_CERTIFICATE
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type CertificateAuthorityStatus = _CertificateAuthorityStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ROOT
    - awsDashSdkLib.awsDashSdkLibStrings.SUBORDINATE
    - java.lang.String
  */
  type CertificateAuthorityType = _CertificateAuthorityType | java.lang.String
  type CertificateBody = java.lang.String
  type CertificateBodyBlob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type CertificateChain = java.lang.String
  type CertificateChainBlob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CountryCodeString = java.lang.String
  type CsrBlob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type CsrBody = java.lang.String
  type DistinguishedNameQualifierString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.REQUEST_TIMED_OUT
    - awsDashSdkLib.awsDashSdkLibStrings.UNSUPPORTED_ALGORITHM
    - awsDashSdkLib.awsDashSdkLibStrings.OTHER
    - java.lang.String
  */
  type FailureReason = _FailureReason | java.lang.String
  type IdempotencyToken = java.lang.String
  type Integer1To5000 = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RSA_2048
    - awsDashSdkLib.awsDashSdkLibStrings.RSA_4096
    - awsDashSdkLib.awsDashSdkLibStrings.EC_prime256v1
    - awsDashSdkLib.awsDashSdkLibStrings.EC_secp384r1
    - java.lang.String
  */
  type KeyAlgorithm = _KeyAlgorithm | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type PermanentDeletionTimeInDays = scala.Double
  type PermissionList = js.Array[Permission]
  type PositiveLong = scala.Double
  type Principal = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNSPECIFIED
    - awsDashSdkLib.awsDashSdkLibStrings.KEY_COMPROMISE
    - awsDashSdkLib.awsDashSdkLibStrings.CERTIFICATE_AUTHORITY_COMPROMISE
    - awsDashSdkLib.awsDashSdkLibStrings.AFFILIATION_CHANGED
    - awsDashSdkLib.awsDashSdkLibStrings.SUPERSEDED
    - awsDashSdkLib.awsDashSdkLibStrings.CESSATION_OF_OPERATION
    - awsDashSdkLib.awsDashSdkLibStrings.PRIVILEGE_WITHDRAWN
    - awsDashSdkLib.awsDashSdkLibStrings.A_A_COMPROMISE
    - java.lang.String
  */
  type RevocationReason = _RevocationReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SHA256WITHECDSA
    - awsDashSdkLib.awsDashSdkLibStrings.SHA384WITHECDSA
    - awsDashSdkLib.awsDashSdkLibStrings.SHA512WITHECDSA
    - awsDashSdkLib.awsDashSdkLibStrings.SHA256WITHRSA
    - awsDashSdkLib.awsDashSdkLibStrings.SHA384WITHRSA
    - awsDashSdkLib.awsDashSdkLibStrings.SHA512WITHRSA
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
  type TStamp = stdLib.Date
  type TagKey = java.lang.String
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.END_DATE
    - awsDashSdkLib.awsDashSdkLibStrings.ABSOLUTE
    - awsDashSdkLib.awsDashSdkLibStrings.DAYS
    - awsDashSdkLib.awsDashSdkLibStrings.MONTHS
    - awsDashSdkLib.awsDashSdkLibStrings.YEARS
    - java.lang.String
  */
  type ValidityPeriodType = _ValidityPeriodType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-08-22`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
