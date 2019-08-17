package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ARN = java.lang.String
  type AdditionalLimitList = js.Array[AdditionalLimit]
  type AdvancedOptions = StringDictionary[String]
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchLogsLogGroupArn = java.lang.String
  type CompatibleElasticsearchVersionsList = js.Array[CompatibleVersionsMap]
  type DeploymentCloseDateTimeStamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_UPDATE
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.NOT_ELIGIBLE
    - typings.awsDashSdk.awsDashSdkStrings.ELIGIBLE
    - java.lang.String
  */
  type DeploymentStatus = _DeploymentStatus | java.lang.String
  type DomainId = java.lang.String
  type DomainInfoList = js.Array[DomainInfo]
  type DomainName = java.lang.String
  type DomainNameList = js.Array[DomainName]
  type Double = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.m3DOTmediumDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m3DOTlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m3DOTxlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m3DOT2xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m4DOTlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m4DOTxlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m4DOT2xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m4DOT4xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m4DOT10xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m5DOTlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m5DOTxlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m5DOT2xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m5DOT4xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m5DOT12xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r5DOTlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r5DOTxlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r5DOT2xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r5DOT4xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r5DOT12xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c5DOTlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c5DOTxlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c5DOT2xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c5DOT4xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c5DOT9xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c5DOT18xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.t2DOTmicroDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.t2DOTsmallDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.t2DOTmediumDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r3DOTlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r3DOTxlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r3DOT2xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r3DOT4xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r3DOT8xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.i2DOTxlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.i2DOT2xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.d2DOTxlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.d2DOT2xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.d2DOT4xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.d2DOT8xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c4DOTlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c4DOTxlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c4DOT2xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c4DOT4xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c4DOT8xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r4DOTlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r4DOTxlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r4DOT2xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r4DOT4xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r4DOT8xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r4DOT16xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.i3DOTlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.i3DOTxlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.i3DOT2xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.i3DOT4xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.i3DOT8xlargeDOTelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.i3DOT16xlargeDOTelasticsearch
    - java.lang.String
  */
  type ESPartitionInstanceType = _ESPartitionInstanceType | java.lang.String
  type ElasticsearchDomainStatusList = js.Array[ElasticsearchDomainStatus]
  type ElasticsearchInstanceTypeList = js.Array[ESPartitionInstanceType]
  type ElasticsearchVersionList = js.Array[ElasticsearchVersionString]
  type ElasticsearchVersionString = java.lang.String
  type EndpointsMap = StringDictionary[ServiceUrl]
  type GUID = java.lang.String
  type IdentityPoolId = java.lang.String
  type InstanceCount = scala.Double
  type InstanceRole = java.lang.String
  type Integer = scala.Double
  type IntegerClass = scala.Double
  type Issue = java.lang.String
  type Issues = js.Array[Issue]
  type KmsKeyId = java.lang.String
  type LimitName = java.lang.String
  type LimitValue = java.lang.String
  type LimitValueList = js.Array[LimitValue]
  type LimitsByRole = StringDictionary[Limits]
  type LogPublishingOptions = StringDictionary[LogPublishingOption]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INDEX_SLOW_LOGS
    - typings.awsDashSdk.awsDashSdkStrings.SEARCH_SLOW_LOGS
    - typings.awsDashSdk.awsDashSdkStrings.ES_APPLICATION_LOGS
    - java.lang.String
  */
  type LogType = _LogType | java.lang.String
  type MaxResults = scala.Double
  type MaximumInstanceCount = scala.Double
  type MinimumInstanceCount = scala.Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RequiresIndexDocuments
    - typings.awsDashSdk.awsDashSdkStrings.Processing
    - typings.awsDashSdk.awsDashSdkStrings.Active
    - java.lang.String
  */
  type OptionState = _OptionState | java.lang.String
  type PolicyDocument = java.lang.String
  type RecurringChargeList = js.Array[RecurringCharge]
  type ReservationToken = java.lang.String
  type ReservedElasticsearchInstanceList = js.Array[ReservedElasticsearchInstance]
  type ReservedElasticsearchInstanceOfferingList = js.Array[ReservedElasticsearchInstanceOffering]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALL_UPFRONT
    - typings.awsDashSdk.awsDashSdkStrings.PARTIAL_UPFRONT
    - typings.awsDashSdk.awsDashSdkStrings.NO_UPFRONT
    - java.lang.String
  */
  type ReservedElasticsearchInstancePaymentOption = _ReservedElasticsearchInstancePaymentOption | java.lang.String
  type RoleArn = java.lang.String
  type ServiceUrl = java.lang.String
  type StartTimestamp = Date
  type StorageSubTypeName = java.lang.String
  type StorageTypeLimitList = js.Array[StorageTypeLimit]
  type StorageTypeList = js.Array[StorageType]
  type StorageTypeName = java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type TagKey = java.lang.String
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type UIntValue = scala.Double
  type UpdateTimestamp = Date
  type UpgradeHistoryList = js.Array[UpgradeHistory]
  type UpgradeName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED_WITH_ISSUES
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type UpgradeStatus = _UpgradeStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PRE_UPGRADE_CHECK
    - typings.awsDashSdk.awsDashSdkStrings.SNAPSHOT
    - typings.awsDashSdk.awsDashSdkStrings.UPGRADE
    - java.lang.String
  */
  type UpgradeStep = _UpgradeStep | java.lang.String
  type UpgradeStepsList = js.Array[UpgradeStepItem]
  type UserPoolId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.standard
    - typings.awsDashSdk.awsDashSdkStrings.gp2
    - typings.awsDashSdk.awsDashSdkStrings.io1
    - java.lang.String
  */
  type VolumeType = _VolumeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-01-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
