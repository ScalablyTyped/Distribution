package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAppstreamMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.DAILY
  import typings.awsDashSdk.awsDashSdkStrings.STREAMING
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AccessEndpointList = js.Array[AccessEndpoint]
  type AccessEndpointType = STREAMING | java.lang.String
  type AccountName = java.lang.String
  type AccountPassword = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CLIPBOARD_COPY_FROM_LOCAL_DEVICE
    - typings.awsDashSdk.awsDashSdkStrings.CLIPBOARD_COPY_TO_LOCAL_DEVICE
    - typings.awsDashSdk.awsDashSdkStrings.FILE_UPLOAD
    - typings.awsDashSdk.awsDashSdkStrings.FILE_DOWNLOAD
    - typings.awsDashSdk.awsDashSdkStrings.PRINTING_TO_LOCAL_DEVICE
    - java.lang.String
  */
  type Action = _Action | java.lang.String
  type Applications = js.Array[Application]
  type AppstreamAgentVersion = java.lang.String
  type Arn = java.lang.String
  type ArnList = js.Array[Arn]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.API
    - typings.awsDashSdk.awsDashSdkStrings.SAML
    - typings.awsDashSdk.awsDashSdkStrings.USERPOOL
    - java.lang.String
  */
  type AuthenticationType = _AuthenticationType | java.lang.String
  type AwsAccountId = java.lang.String
  type AwsAccountIdList = js.Array[AwsAccountId]
  type Boolean = scala.Boolean
  type BooleanObject = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
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
  type FeedbackURL = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.VPC_CONFIGURATION
    - typings.awsDashSdk.awsDashSdkStrings.VPC_CONFIGURATION_SECURITY_GROUP_IDS
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN_JOIN_INFO
    - typings.awsDashSdk.awsDashSdkStrings.IAM_ROLE_ARN
    - java.lang.String
  */
  type FleetAttribute = _FleetAttribute | java.lang.String
  type FleetAttributes = js.Array[FleetAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION
    - typings.awsDashSdk.awsDashSdkStrings.IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION
    - typings.awsDashSdk.awsDashSdkStrings.IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION
    - typings.awsDashSdk.awsDashSdkStrings.NETWORK_INTERFACE_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_SERVICE_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.IAM_SERVICE_ROLE_IS_MISSING
    - typings.awsDashSdk.awsDashSdkStrings.MACHINE_ROLE_IS_MISSING
    - typings.awsDashSdk.awsDashSdkStrings.STS_DISABLED_IN_REGION
    - typings.awsDashSdk.awsDashSdkStrings.SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES
    - typings.awsDashSdk.awsDashSdkStrings.IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION
    - typings.awsDashSdk.awsDashSdkStrings.SUBNET_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.IMAGE_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_SUBNET_CONFIGURATION
    - typings.awsDashSdk.awsDashSdkStrings.SECURITY_GROUPS_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.IGW_NOT_ATTACHED
    - typings.awsDashSdk.awsDashSdkStrings.IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN_JOIN_ERROR_FILE_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN_JOIN_ERROR_ACCESS_DENIED
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN_JOIN_ERROR_LOGON_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN_JOIN_ERROR_INVALID_PARAMETER
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN_JOIN_ERROR_MORE_DATA
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN_JOIN_ERROR_NOT_SUPPORTED
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN_JOIN_NERR_PASSWORD_EXPIRED
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN_JOIN_INTERNAL_SERVICE_ERROR
    - java.lang.String
  */
  type FleetErrorCode = _FleetErrorCode | java.lang.String
  type FleetErrors = js.Array[FleetError]
  type FleetList = js.Array[Fleet]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STARTING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPED
    - java.lang.String
  */
  type FleetState = _FleetState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALWAYS_ON
    - typings.awsDashSdk.awsDashSdkStrings.ON_DEMAND
    - java.lang.String
  */
  type FleetType = _FleetType | java.lang.String
  type ImageBuilderList = js.Array[ImageBuilder]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING_AGENT
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPED
    - typings.awsDashSdk.awsDashSdkStrings.REBOOTING
    - typings.awsDashSdk.awsDashSdkStrings.SNAPSHOTTING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type ImageBuilderState = _ImageBuilderState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.IMAGE_UNAVAILABLE
    - java.lang.String
  */
  type ImageBuilderStateChangeReasonCode = _ImageBuilderStateChangeReasonCode | java.lang.String
  type ImageList = js.Array[Image]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.COPYING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - java.lang.String
  */
  type ImageState = _ImageState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.IMAGE_BUILDER_NOT_AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.IMAGE_COPY_FAILURE
    - java.lang.String
  */
  type ImageStateChangeReasonCode = _ImageStateChangeReasonCode | java.lang.String
  type Integer = Double
  type LastReportGenerationExecutionErrors = js.Array[LastReportGenerationExecutionError]
  type Long = Double
  type MaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUPPRESS
    - typings.awsDashSdk.awsDashSdkStrings.RESEND
    - java.lang.String
  */
  type MessageAction = _MessageAction | java.lang.String
  type Metadata = StringDictionary[String]
  type Name = java.lang.String
  type OrganizationalUnitDistinguishedName = java.lang.String
  type OrganizationalUnitDistinguishedNamesList = js.Array[OrganizationalUnitDistinguishedName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type Permission = _Permission | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WINDOWS
    - typings.awsDashSdk.awsDashSdkStrings.WINDOWS_SERVER_2016
    - typings.awsDashSdk.awsDashSdkStrings.WINDOWS_SERVER_2019
    - java.lang.String
  */
  type PlatformType = _PlatformType | java.lang.String
  type RedirectURL = java.lang.String
  type RegionName = java.lang.String
  type ResourceErrors = js.Array[ResourceError]
  type ResourceIdentifier = java.lang.String
  type SecurityGroupIdList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CONNECTED
    - typings.awsDashSdk.awsDashSdkStrings.NOT_CONNECTED
    - java.lang.String
  */
  type SessionConnectionState = _SessionConnectionState | java.lang.String
  type SessionList = js.Array[Session]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.EXPIRED
    - java.lang.String
  */
  type SessionState = _SessionState | java.lang.String
  type SettingsGroup = java.lang.String
  type SharedImagePermissionsList = js.Array[SharedImagePermissions]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STORAGE_CONNECTORS
    - typings.awsDashSdk.awsDashSdkStrings.STORAGE_CONNECTOR_HOMEFOLDERS
    - typings.awsDashSdk.awsDashSdkStrings.STORAGE_CONNECTOR_GOOGLE_DRIVE
    - typings.awsDashSdk.awsDashSdkStrings.STORAGE_CONNECTOR_ONE_DRIVE
    - typings.awsDashSdk.awsDashSdkStrings.REDIRECT_URL
    - typings.awsDashSdk.awsDashSdkStrings.FEEDBACK_URL
    - typings.awsDashSdk.awsDashSdkStrings.THEME_NAME
    - typings.awsDashSdk.awsDashSdkStrings.USER_SETTINGS
    - typings.awsDashSdk.awsDashSdkStrings.EMBED_HOST_DOMAINS
    - typings.awsDashSdk.awsDashSdkStrings.IAM_ROLE_ARN
    - typings.awsDashSdk.awsDashSdkStrings.ACCESS_ENDPOINTS
    - java.lang.String
  */
  type StackAttribute = _StackAttribute | java.lang.String
  type StackAttributes = js.Array[StackAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STORAGE_CONNECTOR_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_SERVICE_ERROR
    - java.lang.String
  */
  type StackErrorCode = _StackErrorCode | java.lang.String
  type StackErrors = js.Array[StackError]
  type StackList = js.Array[Stack]
  type StorageConnectorList = js.Array[StorageConnector]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HOMEFOLDERS
    - typings.awsDashSdk.awsDashSdkStrings.GOOGLE_DRIVE
    - typings.awsDashSdk.awsDashSdkStrings.ONE_DRIVE
    - java.lang.String
  */
  type StorageConnectorType = _StorageConnectorType | java.lang.String
  type StreamingUrlUserId = java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type SubnetIdList = js.Array[String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = StringDictionary[TagValue]
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.ACCESS_DENIED
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_SERVICE_ERROR
    - java.lang.String
  */
  type UsageReportExecutionErrorCode = _UsageReportExecutionErrorCode | java.lang.String
  type UsageReportSchedule = DAILY | java.lang.String
  type UsageReportSubscriptionList = js.Array[UsageReportSubscription]
  type UserAttributeValue = java.lang.String
  type UserId = java.lang.String
  type UserList = js.Array[User]
  type UserSettingList = js.Array[UserSetting]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STACK_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.USER_NAME_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type UserStackAssociationErrorCode = _UserStackAssociationErrorCode | java.lang.String
  type UserStackAssociationErrorList = js.Array[UserStackAssociationError]
  type UserStackAssociationList = js.Array[UserStackAssociation]
  type Username = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PUBLIC
    - typings.awsDashSdk.awsDashSdkStrings.PRIVATE
    - typings.awsDashSdk.awsDashSdkStrings.SHARED
    - java.lang.String
  */
  type VisibilityType = _VisibilityType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-12-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
