package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LAKEFORMATION
  - typings.awsSdk.awsSdkStrings.S3
  - java.lang.String
*/
type AccessType = _AccessType | java.lang.String

type AccessTypeList = js.Array[AccessType]

type AccountList = js.Array[String]

type AccountSourcesList = js.Array[AccountSources]

type AllDimensionsMap = StringDictionary[TwoDimensionsMap]

type AutoEnableNewRegionConfigurationList = js.Array[AutoEnableNewRegionConfiguration]

type AwsAccountId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ROUTE53
  - typings.awsSdk.awsSdkStrings.VPC_FLOW
  - typings.awsSdk.awsSdkStrings.CLOUD_TRAIL
  - typings.awsSdk.awsSdkStrings.SH_FINDINGS
  - java.lang.String
*/
type AwsLogSourceType = _AwsLogSourceType | java.lang.String

type AwsSourceTypeList = js.Array[AwsLogSourceType]

type Boolean = scala.Boolean

type CreateSubscriberRequestSubscriberNameString = java.lang.String

type CreateSubscriptionNotificationConfigurationRequestSubscriptionEndpointString = java.lang.String

type CustomSourceType = java.lang.String

type DescriptionString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REGION
  - typings.awsSdk.awsSdkStrings.SOURCE_TYPE
  - typings.awsSdk.awsSdkStrings.MEMBER
  - java.lang.String
*/
type Dimension = _Dimension | java.lang.String

type DimensionSet = js.Array[Dimension]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTPS
  - typings.awsSdk.awsSdkStrings.SQS
  - java.lang.String
*/
type EndpointProtocol = _EndpointProtocol | java.lang.String

type FailuresResponseList = js.Array[FailuresResponse]

type Failureslist = js.Array[Failures]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.POST
  - typings.awsSdk.awsSdkStrings.PUT
  - java.lang.String
*/
type HttpsMethod = _HttpsMethod | java.lang.String

type InputSet = js.Array[SafeString]

type Integer = Double

type LakeConfigurationRequestMap = StringDictionary[LakeConfigurationRequest]

type LakeConfigurationResponseMap = StringDictionary[LakeConfigurationResponse]

type LogsStatusList = js.Array[LogsStatus]

type Long = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCESS_ACTIVITY
  - typings.awsSdk.awsSdkStrings.FILE_ACTIVITY
  - typings.awsSdk.awsSdkStrings.KERNEL_ACTIVITY
  - typings.awsSdk.awsSdkStrings.KERNEL_EXTENSION
  - typings.awsSdk.awsSdkStrings.MEMORY_ACTIVITY
  - typings.awsSdk.awsSdkStrings.MODULE_ACTIVITY
  - typings.awsSdk.awsSdkStrings.PROCESS_ACTIVITY
  - typings.awsSdk.awsSdkStrings.REGISTRY_KEY_ACTIVITY
  - typings.awsSdk.awsSdkStrings.REGISTRY_VALUE_ACTIVITY
  - typings.awsSdk.awsSdkStrings.RESOURCE_ACTIVITY
  - typings.awsSdk.awsSdkStrings.SCHEDULED_JOB_ACTIVITY
  - typings.awsSdk.awsSdkStrings.SECURITY_FINDING
  - typings.awsSdk.awsSdkStrings.ACCOUNT_CHANGE
  - typings.awsSdk.awsSdkStrings.AUTHENTICATION
  - typings.awsSdk.awsSdkStrings.AUTHORIZATION
  - typings.awsSdk.awsSdkStrings.ENTITY_MANAGEMENT_AUDIT
  - typings.awsSdk.awsSdkStrings.DHCP_ACTIVITY
  - typings.awsSdk.awsSdkStrings.NETWORK_ACTIVITY
  - typings.awsSdk.awsSdkStrings.DNS_ACTIVITY
  - typings.awsSdk.awsSdkStrings.FTP_ACTIVITY
  - typings.awsSdk.awsSdkStrings.HTTP_ACTIVITY
  - typings.awsSdk.awsSdkStrings.RDP_ACTIVITY
  - typings.awsSdk.awsSdkStrings.SMB_ACTIVITY
  - typings.awsSdk.awsSdkStrings.SSH_ACTIVITY
  - typings.awsSdk.awsSdkStrings.CLOUD_API
  - typings.awsSdk.awsSdkStrings.CONTAINER_LIFECYCLE
  - typings.awsSdk.awsSdkStrings.DATABASE_LIFECYCLE
  - typings.awsSdk.awsSdkStrings.CONFIG_STATE
  - typings.awsSdk.awsSdkStrings.CLOUD_STORAGE
  - typings.awsSdk.awsSdkStrings.INVENTORY_INFO
  - typings.awsSdk.awsSdkStrings.RFB_ACTIVITY
  - typings.awsSdk.awsSdkStrings.SMTP_ACTIVITY
  - typings.awsSdk.awsSdkStrings.VIRTUAL_MACHINE_ACTIVITY
  - java.lang.String
*/
type OcsfEventClass = _OcsfEventClass | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`us-east-1`
  - typings.awsSdk.awsSdkStrings.`us-west-2`
  - typings.awsSdk.awsSdkStrings.`eu-central-1`
  - typings.awsSdk.awsSdkStrings.`us-east-2`
  - typings.awsSdk.awsSdkStrings.`eu-west-1`
  - typings.awsSdk.awsSdkStrings.`ap-northeast-1`
  - typings.awsSdk.awsSdkStrings.`ap-southeast-2`
  - java.lang.String
*/
type Region = _Region | java.lang.String

type RegionSet = js.Array[Region]

type RegionSourceTypesAccountsList = js.Array[AllDimensionsMap]

type ResourceShareArn = java.lang.String

type ResourceShareName = java.lang.String

type RetentionSettingList = js.Array[RetentionSetting]

type RetentionSettingRetentionPeriodInteger = Double

type RoleArn = java.lang.String

type S3BucketArn = java.lang.String

type SafeString = java.lang.String

type SnsTopicArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DEACTIVATED
  - typings.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
type SourceStatus = _SourceStatus | java.lang.String

type SourceTypeList = js.Array[SourceType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD_IA
  - typings.awsSdk.awsSdkStrings.ONEZONE_IA
  - typings.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typings.awsSdk.awsSdkStrings.GLACIER_IR
  - typings.awsSdk.awsSdkStrings.GLACIER
  - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - typings.awsSdk.awsSdkStrings.EXPIRE
  - java.lang.String
*/
type StorageClass = _StorageClass | java.lang.String

type String = java.lang.String

type SubscriberList = js.Array[SubscriberResource]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTP
  - typings.awsSdk.awsSdkStrings.HTTPS
  - typings.awsSdk.awsSdkStrings.EMAIL
  - typings.awsSdk.awsSdkStrings.EMAIL_JSON
  - typings.awsSdk.awsSdkStrings.SMS
  - typings.awsSdk.awsSdkStrings.SQS
  - typings.awsSdk.awsSdkStrings.LAMBDA
  - typings.awsSdk.awsSdkStrings.APP
  - typings.awsSdk.awsSdkStrings.FIREHOSE
  - java.lang.String
*/
type SubscriptionProtocolType = _SubscriptionProtocolType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DEACTIVATED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.READY
  - java.lang.String
*/
type SubscriptionStatus = _SubscriptionStatus | java.lang.String

type SyntheticTimestampDateTime = js.Date

type TagsMap = StringDictionary[String]

type TwoDimensionsMap = StringDictionary[ValueSet]

type UUID = java.lang.String

type UpdateDatalakeExceptionsExpiryRequestExceptionMessageExpiryLong = Double

type UpdateSubscriberRequestSubscriberNameString = java.lang.String

type UpdateSubscriptionNotificationConfigurationRequestSubscriptionEndpointString = java.lang.String

type ValueSet = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-05-10`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIALIZED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type settingsStatus = _settingsStatus | java.lang.String
