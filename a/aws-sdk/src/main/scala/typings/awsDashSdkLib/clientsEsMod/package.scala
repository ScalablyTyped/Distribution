package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEsMod {
  type ARN = java.lang.String
  type AdditionalLimitList = js.Array[AdditionalLimit]
  type AdvancedOptions = org.scalablytyped.runtime.StringDictionary[String]
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchLogsLogGroupArn = java.lang.String
  type CompatibleElasticsearchVersionsList = js.Array[CompatibleVersionsMap]
  type DeploymentCloseDateTimeStamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_UPDATE
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_ELIGIBLE
    - awsDashSdkLib.awsDashSdkLibStrings.ELIGIBLE
    - java.lang.String
  */
  type DeploymentStatus = _DeploymentStatus | java.lang.String
  type DomainId = java.lang.String
  type DomainInfoList = js.Array[DomainInfo]
  type DomainName = java.lang.String
  type DomainNameList = js.Array[DomainName]
  type Double = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.m3DOTmediumDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.m3DOTlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.m3DOTxlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.m3DOT2xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.m4DOTlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.m4DOTxlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.m4DOT2xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.m4DOT4xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.m4DOT10xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.t2DOTmicroDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.t2DOTsmallDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.t2DOTmediumDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.r3DOTlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.r3DOTxlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.r3DOT2xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.r3DOT4xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.r3DOT8xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.i2DOTxlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.i2DOT2xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.d2DOTxlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.d2DOT2xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.d2DOT4xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.d2DOT8xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.c4DOTlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.c4DOTxlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.c4DOT2xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.c4DOT4xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.c4DOT8xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOTlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOTxlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOT2xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOT4xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOT8xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOT16xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.i3DOTlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.i3DOTxlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.i3DOT2xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.i3DOT4xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.i3DOT8xlargeDOTelasticsearch
    - awsDashSdkLib.awsDashSdkLibStrings.i3DOT16xlargeDOTelasticsearch
    - java.lang.String
  */
  type ESPartitionInstanceType = _ESPartitionInstanceType | java.lang.String
  type ElasticsearchDomainStatusList = js.Array[ElasticsearchDomainStatus]
  type ElasticsearchInstanceTypeList = js.Array[ESPartitionInstanceType]
  type ElasticsearchVersionList = js.Array[ElasticsearchVersionString]
  type ElasticsearchVersionString = java.lang.String
  type EndpointsMap = org.scalablytyped.runtime.StringDictionary[ServiceUrl]
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
  type LimitsByRole = org.scalablytyped.runtime.StringDictionary[Limits]
  type LogPublishingOptions = org.scalablytyped.runtime.StringDictionary[LogPublishingOption]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INDEX_SLOW_LOGS
    - awsDashSdkLib.awsDashSdkLibStrings.SEARCH_SLOW_LOGS
    - awsDashSdkLib.awsDashSdkLibStrings.ES_APPLICATION_LOGS
    - java.lang.String
  */
  type LogType = _LogType | java.lang.String
  type MaxResults = scala.Double
  type MaximumInstanceCount = scala.Double
  type MinimumInstanceCount = scala.Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RequiresIndexDocuments
    - awsDashSdkLib.awsDashSdkLibStrings.Processing
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - java.lang.String
  */
  type OptionState = _OptionState | java.lang.String
  type PolicyDocument = java.lang.String
  type RecurringChargeList = js.Array[RecurringCharge]
  type ReservationToken = java.lang.String
  type ReservedElasticsearchInstanceList = js.Array[ReservedElasticsearchInstance]
  type ReservedElasticsearchInstanceOfferingList = js.Array[ReservedElasticsearchInstanceOffering]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALL_UPFRONT
    - awsDashSdkLib.awsDashSdkLibStrings.PARTIAL_UPFRONT
    - awsDashSdkLib.awsDashSdkLibStrings.NO_UPFRONT
    - java.lang.String
  */
  type ReservedElasticsearchInstancePaymentOption = _ReservedElasticsearchInstancePaymentOption | java.lang.String
  type RoleArn = java.lang.String
  type ServiceUrl = java.lang.String
  type StartTimestamp = stdLib.Date
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
  type UpdateTimestamp = stdLib.Date
  type UpgradeHistoryList = js.Array[UpgradeHistory]
  type UpgradeName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED_WITH_ISSUES
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type UpgradeStatus = _UpgradeStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PRE_UPGRADE_CHECK
    - awsDashSdkLib.awsDashSdkLibStrings.SNAPSHOT
    - awsDashSdkLib.awsDashSdkLibStrings.UPGRADE
    - java.lang.String
  */
  type UpgradeStep = _UpgradeStep | java.lang.String
  type UpgradeStepsList = js.Array[UpgradeStepItem]
  type UserPoolId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.standard
    - awsDashSdkLib.awsDashSdkLibStrings.gp2
    - awsDashSdkLib.awsDashSdkLibStrings.io1
    - java.lang.String
  */
  type VolumeType = _VolumeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-01-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
