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
    - typings.awsDashSdk.awsDashSdkStrings.m3DotmediumDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m3DotlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m3DotxlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m3Dot2xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m4DotlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m4DotxlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m4Dot2xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m4Dot4xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m4Dot10xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m5DotlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m5DotxlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m5Dot2xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m5Dot4xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.m5Dot12xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r5DotlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r5DotxlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r5Dot2xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r5Dot4xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r5Dot12xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c5DotlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c5DotxlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c5Dot2xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c5Dot4xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c5Dot9xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c5Dot18xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.ultrawarm1DotmediumDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.ultrawarm1DotlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.t2DotmicroDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.t2DotsmallDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.t2DotmediumDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r3DotlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r3DotxlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r3Dot2xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r3Dot4xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r3Dot8xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.i2DotxlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.i2Dot2xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.d2DotxlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.d2Dot2xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.d2Dot4xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.d2Dot8xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c4DotlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c4DotxlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c4Dot2xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c4Dot4xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.c4Dot8xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r4DotlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r4DotxlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r4Dot2xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r4Dot4xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r4Dot8xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.r4Dot16xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.i3DotlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.i3DotxlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.i3Dot2xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.i3Dot4xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.i3Dot8xlargeDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.i3Dot16xlargeDotelasticsearch
    - java.lang.String
  */
  type ESPartitionInstanceType = _ESPartitionInstanceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ultrawarm1DotmediumDotelasticsearch
    - typings.awsDashSdk.awsDashSdkStrings.ultrawarm1DotlargeDotelasticsearch
    - java.lang.String
  */
  type ESWarmPartitionInstanceType = _ESWarmPartitionInstanceType | java.lang.String
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
    - typings.awsDashSdk.awsDashSdkStrings.Processing_
    - typings.awsDashSdk.awsDashSdkStrings.Active_
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
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`Policy-Min-TLS-1-0-2019-07`
    - typings.awsDashSdk.awsDashSdkStrings.`Policy-Min-TLS-1-2-2019-07`
    - java.lang.String
  */
  type TLSSecurityPolicy = _TLSSecurityPolicy | java.lang.String
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
    - typings.awsDashSdk.awsDashSdkStrings.standard__
    - typings.awsDashSdk.awsDashSdkStrings.gp2
    - typings.awsDashSdk.awsDashSdkStrings.io1
    - java.lang.String
  */
  type VolumeType = _VolumeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-01-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
