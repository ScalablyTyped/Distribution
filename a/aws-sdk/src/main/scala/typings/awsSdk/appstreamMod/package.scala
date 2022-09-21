package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.DAILY
import typings.awsSdk.awsSdkStrings.STREAMING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessEndpointList = js.Array[AccessEndpoint]

type AccessEndpointType = STREAMING | java.lang.String

type AccountName = java.lang.String

type AccountPassword = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CLIPBOARD_COPY_FROM_LOCAL_DEVICE
  - typings.awsSdk.awsSdkStrings.CLIPBOARD_COPY_TO_LOCAL_DEVICE
  - typings.awsSdk.awsSdkStrings.FILE_UPLOAD
  - typings.awsSdk.awsSdkStrings.FILE_DOWNLOAD
  - typings.awsSdk.awsSdkStrings.PRINTING_TO_LOCAL_DEVICE
  - typings.awsSdk.awsSdkStrings.DOMAIN_PASSWORD_SIGNIN
  - typings.awsSdk.awsSdkStrings.DOMAIN_SMART_CARD_SIGNIN
  - java.lang.String
*/
type Action = _Action | java.lang.String

type AppBlocks = js.Array[AppBlock]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.ASSOCIATED
  - java.lang.String
*/
type AppVisibility = _AppVisibility | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LAUNCH_PARAMETERS
  - typings.awsSdk.awsSdkStrings.WORKING_DIRECTORY
  - java.lang.String
*/
type ApplicationAttribute = _ApplicationAttribute | java.lang.String

type ApplicationAttributes = js.Array[ApplicationAttribute]

type ApplicationFleetAssociationList = js.Array[ApplicationFleetAssociation]

type Applications = js.Array[Application]

type AppstreamAgentVersion = java.lang.String

type Arn = java.lang.String

type ArnList = js.Array[Arn]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.API
  - typings.awsSdk.awsSdkStrings.SAML
  - typings.awsSdk.awsSdkStrings.USERPOOL
  - java.lang.String
*/
type AuthenticationType = _AuthenticationType | java.lang.String

type AwsAccountId = java.lang.String

type AwsAccountIdList = js.Array[AwsAccountId]

type Boolean = scala.Boolean

type BooleanObject = scala.Boolean

type DescribeImagesMaxResults = Double

type Description = java.lang.String

type DirectoryConfigList = js.Array[DirectoryConfig]

type DirectoryName = java.lang.String

type DirectoryNameList = js.Array[DirectoryName]

type DisplayName = java.lang.String

type Domain = java.lang.String

type DomainList = js.Array[Domain]

type EmbedHostDomain = java.lang.String

type EmbedHostDomains = js.Array[EmbedHostDomain]

type EntitledApplicationList = js.Array[EntitledApplication]

type EntitlementAttributeList = js.Array[EntitlementAttribute]

type EntitlementList = js.Array[Entitlement]

type FeedbackURL = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VPC_CONFIGURATION
  - typings.awsSdk.awsSdkStrings.VPC_CONFIGURATION_SECURITY_GROUP_IDS
  - typings.awsSdk.awsSdkStrings.DOMAIN_JOIN_INFO
  - typings.awsSdk.awsSdkStrings.IAM_ROLE_ARN
  - typings.awsSdk.awsSdkStrings.USB_DEVICE_FILTER_STRINGS
  - typings.awsSdk.awsSdkStrings.SESSION_SCRIPT_S3_LOCATION
  - java.lang.String
*/
type FleetAttribute = _FleetAttribute | java.lang.String

type FleetAttributes = js.Array[FleetAttribute]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION
  - typings.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION
  - typings.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION
  - typings.awsSdk.awsSdkStrings.NETWORK_INTERFACE_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
  - typings.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_IS_MISSING
  - typings.awsSdk.awsSdkStrings.MACHINE_ROLE_IS_MISSING
  - typings.awsSdk.awsSdkStrings.STS_DISABLED_IN_REGION
  - typings.awsSdk.awsSdkStrings.SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES
  - typings.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION
  - typings.awsSdk.awsSdkStrings.SUBNET_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.IMAGE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.INVALID_SUBNET_CONFIGURATION
  - typings.awsSdk.awsSdkStrings.SECURITY_GROUPS_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.IGW_NOT_ATTACHED
  - typings.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION
  - typings.awsSdk.awsSdkStrings.FLEET_STOPPED
  - typings.awsSdk.awsSdkStrings.FLEET_INSTANCE_PROVISIONING_FAILURE
  - typings.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_FILE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_LOGON_FAILURE
  - typings.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_INVALID_PARAMETER
  - typings.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_MORE_DATA
  - typings.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN
  - typings.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_NOT_SUPPORTED
  - typings.awsSdk.awsSdkStrings.DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME
  - typings.awsSdk.awsSdkStrings.DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED
  - typings.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED
  - typings.awsSdk.awsSdkStrings.DOMAIN_JOIN_NERR_PASSWORD_EXPIRED
  - typings.awsSdk.awsSdkStrings.DOMAIN_JOIN_INTERNAL_SERVICE_ERROR
  - java.lang.String
*/
type FleetErrorCode = _FleetErrorCode | java.lang.String

type FleetErrors = js.Array[FleetError]

type FleetList = js.Array[Fleet]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type FleetState = _FleetState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALWAYS_ON
  - typings.awsSdk.awsSdkStrings.ON_DEMAND
  - typings.awsSdk.awsSdkStrings.ELASTIC
  - java.lang.String
*/
type FleetType = _FleetType | java.lang.String

type ImageBuilderList = js.Array[ImageBuilder]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.UPDATING_AGENT
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.REBOOTING
  - typings.awsSdk.awsSdkStrings.SNAPSHOTTING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.PENDING_QUALIFICATION
  - java.lang.String
*/
type ImageBuilderState = _ImageBuilderState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.IMAGE_UNAVAILABLE
  - java.lang.String
*/
type ImageBuilderStateChangeReasonCode = _ImageBuilderStateChangeReasonCode | java.lang.String

type ImageList = js.Array[Image]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COPYING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.IMPORTING
  - java.lang.String
*/
type ImageState = _ImageState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.IMAGE_BUILDER_NOT_AVAILABLE
  - typings.awsSdk.awsSdkStrings.IMAGE_COPY_FAILURE
  - java.lang.String
*/
type ImageStateChangeReasonCode = _ImageStateChangeReasonCode | java.lang.String

type Integer = Double

type LastReportGenerationExecutionErrors = js.Array[LastReportGenerationExecutionError]

type Long = Double

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUPPRESS
  - typings.awsSdk.awsSdkStrings.RESEND
  - java.lang.String
*/
type MessageAction = _MessageAction | java.lang.String

type Metadata = StringDictionary[String]

type Name = java.lang.String

type OrganizationalUnitDistinguishedName = java.lang.String

type OrganizationalUnitDistinguishedNamesList = js.Array[OrganizationalUnitDistinguishedName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type Permission = _Permission | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WINDOWS
  - typings.awsSdk.awsSdkStrings.WINDOWS_SERVER_2016
  - typings.awsSdk.awsSdkStrings.WINDOWS_SERVER_2019
  - typings.awsSdk.awsSdkStrings.AMAZON_LINUX2
  - java.lang.String
*/
type PlatformType = _PlatformType | java.lang.String

type Platforms = js.Array[PlatformType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TCP
  - typings.awsSdk.awsSdkStrings.UDP
  - java.lang.String
*/
type PreferredProtocol = _PreferredProtocol | java.lang.String

type RedirectURL = java.lang.String

type RegionName = java.lang.String

type ResourceErrors = js.Array[ResourceError]

type ResourceIdentifier = java.lang.String

type S3Bucket = java.lang.String

type S3Key = java.lang.String

type SecurityGroupIdList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONNECTED
  - typings.awsSdk.awsSdkStrings.NOT_CONNECTED
  - java.lang.String
*/
type SessionConnectionState = _SessionConnectionState | java.lang.String

type SessionList = js.Array[Session]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
type SessionState = _SessionState | java.lang.String

type SettingsGroup = java.lang.String

type SharedImagePermissionsList = js.Array[SharedImagePermissions]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STORAGE_CONNECTORS
  - typings.awsSdk.awsSdkStrings.STORAGE_CONNECTOR_HOMEFOLDERS
  - typings.awsSdk.awsSdkStrings.STORAGE_CONNECTOR_GOOGLE_DRIVE
  - typings.awsSdk.awsSdkStrings.STORAGE_CONNECTOR_ONE_DRIVE
  - typings.awsSdk.awsSdkStrings.REDIRECT_URL
  - typings.awsSdk.awsSdkStrings.FEEDBACK_URL
  - typings.awsSdk.awsSdkStrings.THEME_NAME
  - typings.awsSdk.awsSdkStrings.USER_SETTINGS
  - typings.awsSdk.awsSdkStrings.EMBED_HOST_DOMAINS
  - typings.awsSdk.awsSdkStrings.IAM_ROLE_ARN
  - typings.awsSdk.awsSdkStrings.ACCESS_ENDPOINTS
  - typings.awsSdk.awsSdkStrings.STREAMING_EXPERIENCE_SETTINGS
  - java.lang.String
*/
type StackAttribute = _StackAttribute | java.lang.String

type StackAttributes = js.Array[StackAttribute]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STORAGE_CONNECTOR_ERROR
  - typings.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
  - java.lang.String
*/
type StackErrorCode = _StackErrorCode | java.lang.String

type StackErrors = js.Array[StackError]

type StackList = js.Array[Stack]

type StorageConnectorList = js.Array[StorageConnector]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HOMEFOLDERS
  - typings.awsSdk.awsSdkStrings.GOOGLE_DRIVE
  - typings.awsSdk.awsSdkStrings.ONE_DRIVE
  - java.lang.String
*/
type StorageConnectorType = _StorageConnectorType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.APP
  - typings.awsSdk.awsSdkStrings.DESKTOP
  - java.lang.String
*/
type StreamView = _StreamView | java.lang.String

type StreamingUrlUserId = java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type SubnetIdList = js.Array[String]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagValue = java.lang.String

type Tags = StringDictionary[TagValue]

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
  - java.lang.String
*/
type UsageReportExecutionErrorCode = _UsageReportExecutionErrorCode | java.lang.String

type UsageReportSchedule = DAILY | java.lang.String

type UsageReportSubscriptionList = js.Array[UsageReportSubscription]

type UsbDeviceFilterString = java.lang.String

type UsbDeviceFilterStrings = js.Array[UsbDeviceFilterString]

type UserAttributeValue = java.lang.String

type UserId = java.lang.String

type UserList = js.Array[User]

type UserSettingList = js.Array[UserSetting]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STACK_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.USER_NAME_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.DIRECTORY_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - java.lang.String
*/
type UserStackAssociationErrorCode = _UserStackAssociationErrorCode | java.lang.String

type UserStackAssociationErrorList = js.Array[UserStackAssociationError]

type UserStackAssociationList = js.Array[UserStackAssociation]

type Username = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUBLIC
  - typings.awsSdk.awsSdkStrings.PRIVATE
  - typings.awsSdk.awsSdkStrings.SHARED
  - java.lang.String
*/
type VisibilityType = _VisibilityType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-12-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
