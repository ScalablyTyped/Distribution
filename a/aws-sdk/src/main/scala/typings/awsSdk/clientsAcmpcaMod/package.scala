package typings.awsSdk.clientsAcmpcaMod

import typings.awsSdk.awsSdkStrings.CPS
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ASN1PrintableString64 = java.lang.String

type AWSPolicy = java.lang.String

type AccessDescriptionList = js.Array[AccessDescription]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CA_REPOSITORY
  - typings.awsSdk.awsSdkStrings.RESOURCE_PKI_MANIFEST
  - typings.awsSdk.awsSdkStrings.RESOURCE_PKI_NOTIFY
  - java.lang.String
*/
type AccessMethodType = _AccessMethodType | java.lang.String

type AccountId = java.lang.String

type ActionList = js.Array[ActionType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IssueCertificate
  - typings.awsSdk.awsSdkStrings.GetCertificate
  - typings.awsSdk.awsSdkStrings.ListPermissions
  - java.lang.String
*/
type ActionType = _ActionType | java.lang.String

type Arn = java.lang.String

type AuditReportId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.JSON
  - typings.awsSdk.awsSdkStrings.CSV
  - java.lang.String
*/
type AuditReportResponseFormat = _AuditReportResponseFormat | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type AuditReportStatus = _AuditReportStatus | java.lang.String

type Base64String1To4096 = java.lang.String

type Boolean = scala.Boolean

type CertificateAuthorities = js.Array[CertificateAuthority]

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
type CertificateAuthorityStatus = _CertificateAuthorityStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ROOT
  - typings.awsSdk.awsSdkStrings.SUBORDINATE
  - java.lang.String
*/
type CertificateAuthorityType = _CertificateAuthorityType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GENERAL_PURPOSE
  - typings.awsSdk.awsSdkStrings.SHORT_LIVED_CERTIFICATE
  - java.lang.String
*/
type CertificateAuthorityUsageMode = _CertificateAuthorityUsageMode | java.lang.String

type CertificateBody = java.lang.String

type CertificateBodyBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type CertificateChain = java.lang.String

type CertificateChainBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type CertificatePolicyList = js.Array[PolicyInformation]

type CnameString = java.lang.String

type CountryCodeString = java.lang.String

type CsrBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type CsrBody = java.lang.String

type CustomAttributeList = js.Array[CustomAttribute]

type CustomExtensionList = js.Array[CustomExtension]

type CustomObjectIdentifier = java.lang.String

type ExtendedKeyUsageList = js.Array[ExtendedKeyUsage]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SERVER_AUTH
  - typings.awsSdk.awsSdkStrings.CLIENT_AUTH
  - typings.awsSdk.awsSdkStrings.CODE_SIGNING
  - typings.awsSdk.awsSdkStrings.EMAIL_PROTECTION
  - typings.awsSdk.awsSdkStrings.TIME_STAMPING
  - typings.awsSdk.awsSdkStrings.OCSP_SIGNING
  - typings.awsSdk.awsSdkStrings.SMART_CARD_LOGIN
  - typings.awsSdk.awsSdkStrings.DOCUMENT_SIGNING
  - typings.awsSdk.awsSdkStrings.CERTIFICATE_TRANSPARENCY
  - java.lang.String
*/
type ExtendedKeyUsageType = _ExtendedKeyUsageType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REQUEST_TIMED_OUT
  - typings.awsSdk.awsSdkStrings.UNSUPPORTED_ALGORITHM
  - typings.awsSdk.awsSdkStrings.OTHER
  - java.lang.String
*/
type FailureReason = _FailureReason | java.lang.String

type GeneralNameList = js.Array[GeneralName]

type IdempotencyToken = java.lang.String

type Integer1To5000 = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RSA_2048
  - typings.awsSdk.awsSdkStrings.RSA_4096
  - typings.awsSdk.awsSdkStrings.EC_prime256v1
  - typings.awsSdk.awsSdkStrings.EC_secp384r1
  - java.lang.String
*/
type KeyAlgorithm = _KeyAlgorithm | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FIPS_140_2_LEVEL_2_OR_HIGHER
  - typings.awsSdk.awsSdkStrings.FIPS_140_2_LEVEL_3_OR_HIGHER
  - java.lang.String
*/
type KeyStorageSecurityStandard = _KeyStorageSecurityStandard | java.lang.String

type MaxResults = Double

type NextToken = java.lang.String

type PermanentDeletionTimeInDays = Double

type PermissionList = js.Array[Permission]

type PolicyQualifierId = CPS | java.lang.String

type PolicyQualifierInfoList = js.Array[PolicyQualifierInfo]

type PositiveLong = Double

type Principal = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SELF
  - typings.awsSdk.awsSdkStrings.OTHER_ACCOUNTS
  - java.lang.String
*/
type ResourceOwner = _ResourceOwner | java.lang.String

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
type RevocationReason = _RevocationReason | java.lang.String

type S3BucketName = java.lang.String

type S3BucketName3To255 = java.lang.String

type S3Key = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUBLIC_READ
  - typings.awsSdk.awsSdkStrings.BUCKET_OWNER_FULL_CONTROL
  - java.lang.String
*/
type S3ObjectAcl = _S3ObjectAcl | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SHA256WITHECDSA
  - typings.awsSdk.awsSdkStrings.SHA384WITHECDSA
  - typings.awsSdk.awsSdkStrings.SHA512WITHECDSA
  - typings.awsSdk.awsSdkStrings.SHA256WITHRSA
  - typings.awsSdk.awsSdkStrings.SHA384WITHRSA
  - typings.awsSdk.awsSdkStrings.SHA512WITHRSA
  - java.lang.String
*/
type SigningAlgorithm = _SigningAlgorithm | java.lang.String

type String = java.lang.String

type String128 = java.lang.String

type String16 = java.lang.String

type String1To256 = java.lang.String

type String253 = java.lang.String

type String256 = java.lang.String

type String3 = java.lang.String

type String39 = java.lang.String

type String40 = java.lang.String

type String5 = java.lang.String

type String64 = java.lang.String

type TStamp = js.Date

type TagKey = java.lang.String

type TagList = js.Array[Tag]

type TagValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.END_DATE
  - typings.awsSdk.awsSdkStrings.ABSOLUTE
  - typings.awsSdk.awsSdkStrings.DAYS
  - typings.awsSdk.awsSdkStrings.MONTHS
  - typings.awsSdk.awsSdkStrings.YEARS
  - java.lang.String
*/
type ValidityPeriodType = _ValidityPeriodType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-08-22`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
