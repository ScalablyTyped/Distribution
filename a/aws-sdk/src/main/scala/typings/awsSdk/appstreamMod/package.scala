package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object appstreamMod {
  
  type AccessEndpointList = js.Array[typings.awsSdk.appstreamMod.AccessEndpoint]
  
  type AccessEndpointType = typings.awsSdk.awsSdkStrings.STREAMING | java.lang.String
  
  type AccountName = java.lang.String
  
  type AccountPassword = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CLIPBOARD_COPY_FROM_LOCAL_DEVICE
    - typings.awsSdk.awsSdkStrings.CLIPBOARD_COPY_TO_LOCAL_DEVICE
    - typings.awsSdk.awsSdkStrings.FILE_UPLOAD
    - typings.awsSdk.awsSdkStrings.FILE_DOWNLOAD
    - typings.awsSdk.awsSdkStrings.PRINTING_TO_LOCAL_DEVICE
    - java.lang.String
  */
  type Action = typings.awsSdk.appstreamMod._Action | java.lang.String
  
  type Applications = js.Array[typings.awsSdk.appstreamMod.Application]
  
  type AppstreamAgentVersion = java.lang.String
  
  type Arn = java.lang.String
  
  type ArnList = js.Array[typings.awsSdk.appstreamMod.Arn]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.API
    - typings.awsSdk.awsSdkStrings.SAML
    - typings.awsSdk.awsSdkStrings.USERPOOL
    - java.lang.String
  */
  type AuthenticationType = typings.awsSdk.appstreamMod._AuthenticationType | java.lang.String
  
  type AwsAccountId = java.lang.String
  
  type AwsAccountIdList = js.Array[typings.awsSdk.appstreamMod.AwsAccountId]
  
  type Boolean = scala.Boolean
  
  type BooleanObject = scala.Boolean
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.appstreamMod.ClientApiVersions
  
  type DescribeImagesMaxResults = scala.Double
  
  type Description = java.lang.String
  
  type DirectoryConfigList = js.Array[typings.awsSdk.appstreamMod.DirectoryConfig]
  
  type DirectoryName = java.lang.String
  
  type DirectoryNameList = js.Array[typings.awsSdk.appstreamMod.DirectoryName]
  
  type DisplayName = java.lang.String
  
  type Domain = java.lang.String
  
  type DomainList = js.Array[typings.awsSdk.appstreamMod.Domain]
  
  type EmbedHostDomain = java.lang.String
  
  type EmbedHostDomains = js.Array[typings.awsSdk.appstreamMod.EmbedHostDomain]
  
  type FeedbackURL = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.VPC_CONFIGURATION
    - typings.awsSdk.awsSdkStrings.VPC_CONFIGURATION_SECURITY_GROUP_IDS
    - typings.awsSdk.awsSdkStrings.DOMAIN_JOIN_INFO
    - typings.awsSdk.awsSdkStrings.IAM_ROLE_ARN
    - java.lang.String
  */
  type FleetAttribute = typings.awsSdk.appstreamMod._FleetAttribute | java.lang.String
  
  type FleetAttributes = js.Array[typings.awsSdk.appstreamMod.FleetAttribute]
  
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
  type FleetErrorCode = typings.awsSdk.appstreamMod._FleetErrorCode | java.lang.String
  
  type FleetErrors = js.Array[typings.awsSdk.appstreamMod.FleetError]
  
  type FleetList = js.Array[typings.awsSdk.appstreamMod.Fleet]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STARTING
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.STOPPING
    - typings.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type FleetState = typings.awsSdk.appstreamMod._FleetState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALWAYS_ON
    - typings.awsSdk.awsSdkStrings.ON_DEMAND
    - java.lang.String
  */
  type FleetType = typings.awsSdk.appstreamMod._FleetType | java.lang.String
  
  type ImageBuilderList = js.Array[typings.awsSdk.appstreamMod.ImageBuilder]
  
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
    - java.lang.String
  */
  type ImageBuilderState = typings.awsSdk.appstreamMod._ImageBuilderState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typings.awsSdk.awsSdkStrings.IMAGE_UNAVAILABLE
    - java.lang.String
  */
  type ImageBuilderStateChangeReasonCode = typings.awsSdk.appstreamMod._ImageBuilderStateChangeReasonCode | java.lang.String
  
  type ImageList = js.Array[typings.awsSdk.appstreamMod.Image]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.COPYING
    - typings.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ImageState = typings.awsSdk.appstreamMod._ImageState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typings.awsSdk.awsSdkStrings.IMAGE_BUILDER_NOT_AVAILABLE
    - typings.awsSdk.awsSdkStrings.IMAGE_COPY_FAILURE
    - java.lang.String
  */
  type ImageStateChangeReasonCode = typings.awsSdk.appstreamMod._ImageStateChangeReasonCode | java.lang.String
  
  type Integer = scala.Double
  
  type LastReportGenerationExecutionErrors = js.Array[typings.awsSdk.appstreamMod.LastReportGenerationExecutionError]
  
  type Long = scala.Double
  
  type MaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUPPRESS
    - typings.awsSdk.awsSdkStrings.RESEND
    - java.lang.String
  */
  type MessageAction = typings.awsSdk.appstreamMod._MessageAction | java.lang.String
  
  type Metadata = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.appstreamMod.String]
  
  type Name = java.lang.String
  
  type OrganizationalUnitDistinguishedName = java.lang.String
  
  type OrganizationalUnitDistinguishedNamesList = js.Array[typings.awsSdk.appstreamMod.OrganizationalUnitDistinguishedName]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type Permission = typings.awsSdk.appstreamMod._Permission | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.WINDOWS
    - typings.awsSdk.awsSdkStrings.WINDOWS_SERVER_2016
    - typings.awsSdk.awsSdkStrings.WINDOWS_SERVER_2019
    - java.lang.String
  */
  type PlatformType = typings.awsSdk.appstreamMod._PlatformType | java.lang.String
  
  type RedirectURL = java.lang.String
  
  type RegionName = java.lang.String
  
  type ResourceErrors = js.Array[typings.awsSdk.appstreamMod.ResourceError]
  
  type ResourceIdentifier = java.lang.String
  
  type SecurityGroupIdList = js.Array[typings.awsSdk.appstreamMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CONNECTED
    - typings.awsSdk.awsSdkStrings.NOT_CONNECTED
    - java.lang.String
  */
  type SessionConnectionState = typings.awsSdk.appstreamMod._SessionConnectionState | java.lang.String
  
  type SessionList = js.Array[typings.awsSdk.appstreamMod.Session]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type SessionState = typings.awsSdk.appstreamMod._SessionState | java.lang.String
  
  type SettingsGroup = java.lang.String
  
  type SharedImagePermissionsList = js.Array[typings.awsSdk.appstreamMod.SharedImagePermissions]
  
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
    - java.lang.String
  */
  type StackAttribute = typings.awsSdk.appstreamMod._StackAttribute | java.lang.String
  
  type StackAttributes = js.Array[typings.awsSdk.appstreamMod.StackAttribute]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STORAGE_CONNECTOR_ERROR
    - typings.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
    - java.lang.String
  */
  type StackErrorCode = typings.awsSdk.appstreamMod._StackErrorCode | java.lang.String
  
  type StackErrors = js.Array[typings.awsSdk.appstreamMod.StackError]
  
  type StackList = js.Array[typings.awsSdk.appstreamMod.Stack]
  
  type StorageConnectorList = js.Array[typings.awsSdk.appstreamMod.StorageConnector]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HOMEFOLDERS
    - typings.awsSdk.awsSdkStrings.GOOGLE_DRIVE
    - typings.awsSdk.awsSdkStrings.ONE_DRIVE
    - java.lang.String
  */
  type StorageConnectorType = typings.awsSdk.appstreamMod._StorageConnectorType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.APP
    - typings.awsSdk.awsSdkStrings.DESKTOP
    - java.lang.String
  */
  type StreamView = typings.awsSdk.appstreamMod._StreamView | java.lang.String
  
  type StreamingUrlUserId = java.lang.String
  
  type String = java.lang.String
  
  type StringList = js.Array[typings.awsSdk.appstreamMod.String]
  
  type SubnetIdList = js.Array[typings.awsSdk.appstreamMod.String]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.appstreamMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.appstreamMod.TagValue]
  
  type Timestamp = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND
    - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
    - typings.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
    - java.lang.String
  */
  type UsageReportExecutionErrorCode = typings.awsSdk.appstreamMod._UsageReportExecutionErrorCode | java.lang.String
  
  type UsageReportSchedule = typings.awsSdk.awsSdkStrings.DAILY | java.lang.String
  
  type UsageReportSubscriptionList = js.Array[typings.awsSdk.appstreamMod.UsageReportSubscription]
  
  type UserAttributeValue = java.lang.String
  
  type UserId = java.lang.String
  
  type UserList = js.Array[typings.awsSdk.appstreamMod.User]
  
  type UserSettingList = js.Array[typings.awsSdk.appstreamMod.UserSetting]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STACK_NOT_FOUND
    - typings.awsSdk.awsSdkStrings.USER_NAME_NOT_FOUND
    - typings.awsSdk.awsSdkStrings.DIRECTORY_NOT_FOUND
    - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type UserStackAssociationErrorCode = typings.awsSdk.appstreamMod._UserStackAssociationErrorCode | java.lang.String
  
  type UserStackAssociationErrorList = js.Array[typings.awsSdk.appstreamMod.UserStackAssociationError]
  
  type UserStackAssociationList = js.Array[typings.awsSdk.appstreamMod.UserStackAssociation]
  
  type Username = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PUBLIC
    - typings.awsSdk.awsSdkStrings.PRIVATE
    - typings.awsSdk.awsSdkStrings.SHARED
    - java.lang.String
  */
  type VisibilityType = typings.awsSdk.appstreamMod._VisibilityType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-12-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.appstreamMod._apiVersion | java.lang.String
}
