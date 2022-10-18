package typings.awsSdk.clientsLicensemanagerMod

import typings.awsSdk.awsSdkStrings.JWT_PS384
import typings.awsSdk.awsSdkStrings.REFRESH_TOKEN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CreateGrant
  - typings.awsSdk.awsSdkStrings.CheckoutLicense
  - typings.awsSdk.awsSdkStrings.CheckoutBorrowLicense
  - typings.awsSdk.awsSdkStrings.CheckInLicense
  - typings.awsSdk.awsSdkStrings.ExtendConsumptionLicense
  - typings.awsSdk.awsSdkStrings.ListPurchasedLicenses
  - typings.awsSdk.awsSdkStrings.CreateToken
  - java.lang.String
*/
type AllowedOperation = _AllowedOperation | java.lang.String

type AllowedOperationList = js.Array[AllowedOperation]

type Arn = java.lang.String

type ArnList = js.Array[Arn]

type Boolean = scala.Boolean

type BoxBoolean = scala.Boolean

type BoxInteger = Double

type BoxLong = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROVISIONAL
  - typings.awsSdk.awsSdkStrings.PERPETUAL
  - java.lang.String
*/
type CheckoutType = _CheckoutType | java.lang.String

type ClientRequestToken = java.lang.String

type ClientToken = java.lang.String

type ConsumedLicenseSummaryList = js.Array[ConsumedLicenseSummary]

type DateTime = js.Date

type DigitalSignatureMethod = JWT_PS384 | java.lang.String

type EntitlementDataList = js.Array[EntitlementData]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Count_
  - typings.awsSdk.awsSdkStrings.None_
  - typings.awsSdk.awsSdkStrings.Seconds_
  - typings.awsSdk.awsSdkStrings.Microseconds_
  - typings.awsSdk.awsSdkStrings.Milliseconds_
  - typings.awsSdk.awsSdkStrings.Bytes_
  - typings.awsSdk.awsSdkStrings.Kilobytes
  - typings.awsSdk.awsSdkStrings.Megabytes
  - typings.awsSdk.awsSdkStrings.Gigabytes
  - typings.awsSdk.awsSdkStrings.Terabytes_
  - typings.awsSdk.awsSdkStrings.Bits_
  - typings.awsSdk.awsSdkStrings.Kilobits
  - typings.awsSdk.awsSdkStrings.Megabits
  - typings.awsSdk.awsSdkStrings.Gigabits
  - typings.awsSdk.awsSdkStrings.Terabits
  - typings.awsSdk.awsSdkStrings.Percent_
  - typings.awsSdk.awsSdkStrings.BytesSlashSecond
  - typings.awsSdk.awsSdkStrings.KilobytesSlashSecond
  - typings.awsSdk.awsSdkStrings.MegabytesSlashSecond
  - typings.awsSdk.awsSdkStrings.GigabytesSlashSecond
  - typings.awsSdk.awsSdkStrings.TerabytesSlashSecond
  - typings.awsSdk.awsSdkStrings.BitsSlashSecond
  - typings.awsSdk.awsSdkStrings.KilobitsSlashSecond
  - typings.awsSdk.awsSdkStrings.MegabitsSlashSecond
  - typings.awsSdk.awsSdkStrings.GigabitsSlashSecond
  - typings.awsSdk.awsSdkStrings.TerabitsSlashSecond
  - typings.awsSdk.awsSdkStrings.CountSlashSecond
  - java.lang.String
*/
type EntitlementDataUnit = _EntitlementDataUnit | java.lang.String

type EntitlementList = js.Array[Entitlement]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Count_
  - typings.awsSdk.awsSdkStrings.None_
  - typings.awsSdk.awsSdkStrings.Seconds_
  - typings.awsSdk.awsSdkStrings.Microseconds_
  - typings.awsSdk.awsSdkStrings.Milliseconds_
  - typings.awsSdk.awsSdkStrings.Bytes_
  - typings.awsSdk.awsSdkStrings.Kilobytes
  - typings.awsSdk.awsSdkStrings.Megabytes
  - typings.awsSdk.awsSdkStrings.Gigabytes
  - typings.awsSdk.awsSdkStrings.Terabytes_
  - typings.awsSdk.awsSdkStrings.Bits_
  - typings.awsSdk.awsSdkStrings.Kilobits
  - typings.awsSdk.awsSdkStrings.Megabits
  - typings.awsSdk.awsSdkStrings.Gigabits
  - typings.awsSdk.awsSdkStrings.Terabits
  - typings.awsSdk.awsSdkStrings.Percent_
  - typings.awsSdk.awsSdkStrings.BytesSlashSecond
  - typings.awsSdk.awsSdkStrings.KilobytesSlashSecond
  - typings.awsSdk.awsSdkStrings.MegabytesSlashSecond
  - typings.awsSdk.awsSdkStrings.GigabytesSlashSecond
  - typings.awsSdk.awsSdkStrings.TerabytesSlashSecond
  - typings.awsSdk.awsSdkStrings.BitsSlashSecond
  - typings.awsSdk.awsSdkStrings.KilobitsSlashSecond
  - typings.awsSdk.awsSdkStrings.MegabitsSlashSecond
  - typings.awsSdk.awsSdkStrings.GigabitsSlashSecond
  - typings.awsSdk.awsSdkStrings.TerabitsSlashSecond
  - typings.awsSdk.awsSdkStrings.CountSlashSecond
  - java.lang.String
*/
type EntitlementUnit = _EntitlementUnit | java.lang.String

type EntitlementUsageList = js.Array[EntitlementUsage]

type FilterList = js.Array[Filter]

type FilterName = java.lang.String

type FilterValue = java.lang.String

type FilterValues = js.Array[FilterValue]

type Filters = js.Array[Filter]

type GrantList = js.Array[Grant]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_WORKFLOW
  - typings.awsSdk.awsSdkStrings.PENDING_ACCEPT
  - typings.awsSdk.awsSdkStrings.REJECTED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.FAILED_WORKFLOW
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.PENDING_DELETE
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.WORKFLOW_COMPLETED
  - java.lang.String
*/
type GrantStatus = _GrantStatus | java.lang.String

type GrantedLicenseList = js.Array[GrantedLicense]

type ISO8601DateTime = java.lang.String

type Integer = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQUALS
  - typings.awsSdk.awsSdkStrings.NOT_EQUALS
  - typings.awsSdk.awsSdkStrings.BEGINS_WITH
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - java.lang.String
*/
type InventoryFilterCondition = _InventoryFilterCondition | java.lang.String

type InventoryFilterList = js.Array[InventoryFilter]

type LicenseConfigurationAssociations = js.Array[LicenseConfigurationAssociation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type LicenseConfigurationStatus = _LicenseConfigurationStatus | java.lang.String

type LicenseConfigurationUsageList = js.Array[LicenseConfigurationUsage]

type LicenseConfigurations = js.Array[LicenseConfiguration]

type LicenseConversionTaskId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type LicenseConversionTaskStatus = _LicenseConversionTaskStatus | java.lang.String

type LicenseConversionTasks = js.Array[LicenseConversionTask]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.vCPU_
  - typings.awsSdk.awsSdkStrings.Instance_
  - typings.awsSdk.awsSdkStrings.Core_
  - typings.awsSdk.awsSdkStrings.Socket
  - java.lang.String
*/
type LicenseCountingType = _LicenseCountingType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_DELETE
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type LicenseDeletionStatus = _LicenseDeletionStatus | java.lang.String

type LicenseList = js.Array[License]

type LicenseOperationFailureList = js.Array[LicenseOperationFailure]

type LicenseSpecifications = js.Array[LicenseSpecification]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.PENDING_AVAILABLE
  - typings.awsSdk.awsSdkStrings.DEACTIVATED
  - typings.awsSdk.awsSdkStrings.SUSPENDED
  - typings.awsSdk.awsSdkStrings.EXPIRED
  - typings.awsSdk.awsSdkStrings.PENDING_DELETE
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type LicenseStatus = _LicenseStatus | java.lang.String

type Long = Double

type ManagedResourceSummaryList = js.Array[ManagedResourceSummary]

type MaxSize100 = Double

type MaxSize3StringList = js.Array[String]

type MetadataList = js.Array[Metadata]

type PrincipalArnList = js.Array[Arn]

type ProductInformationFilterList = js.Array[ProductInformationFilter]

type ProductInformationList = js.Array[ProductInformation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_WORKFLOW
  - typings.awsSdk.awsSdkStrings.PENDING_ACCEPT
  - typings.awsSdk.awsSdkStrings.REJECTED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.FAILED_WORKFLOW
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.WORKFLOW_COMPLETED
  - java.lang.String
*/
type ReceivedStatus = _ReceivedStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.None_
  - typings.awsSdk.awsSdkStrings.Weekly_
  - typings.awsSdk.awsSdkStrings.Monthly_
  - java.lang.String
*/
type RenewType = _RenewType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DAY
  - typings.awsSdk.awsSdkStrings.WEEK
  - typings.awsSdk.awsSdkStrings.MONTH
  - java.lang.String
*/
type ReportFrequencyType = _ReportFrequencyType | java.lang.String

type ReportGeneratorList = js.Array[ReportGenerator]

type ReportGeneratorName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LicenseConfigurationSummaryReport
  - typings.awsSdk.awsSdkStrings.LicenseConfigurationUsageReport
  - java.lang.String
*/
type ReportType = _ReportType | java.lang.String

type ReportTypeList = js.Array[ReportType]

type ResourceInventoryList = js.Array[ResourceInventory]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EC2_INSTANCE
  - typings.awsSdk.awsSdkStrings.EC2_HOST
  - typings.awsSdk.awsSdkStrings.EC2_AMI
  - typings.awsSdk.awsSdkStrings.RDS
  - typings.awsSdk.awsSdkStrings.SYSTEMS_MANAGER_MANAGED_INSTANCE
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

type SignedToken = java.lang.String

type StatusReasonMessage = java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type TagKeyList = js.Array[String]

type TagList = js.Array[Tag]

type TokenList = js.Array[TokenData]

type TokenString = java.lang.String

type TokenType = REFRESH_TOKEN | java.lang.String

type UsageOperation = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-08-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
