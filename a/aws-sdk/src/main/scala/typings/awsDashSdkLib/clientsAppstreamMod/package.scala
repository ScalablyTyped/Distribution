package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAppstreamMod {
  type AccountName = java.lang.String
  type AccountPassword = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CLIPBOARD_COPY_FROM_LOCAL_DEVICE
    - awsDashSdkLib.awsDashSdkLibStrings.CLIPBOARD_COPY_TO_LOCAL_DEVICE
    - awsDashSdkLib.awsDashSdkLibStrings.FILE_UPLOAD
    - awsDashSdkLib.awsDashSdkLibStrings.FILE_DOWNLOAD
    - awsDashSdkLib.awsDashSdkLibStrings.PRINTING_TO_LOCAL_DEVICE
    - java.lang.String
  */
  type Action = _Action | java.lang.String
  type Applications = js.Array[Application]
  type AppstreamAgentVersion = java.lang.String
  type Arn = java.lang.String
  type ArnList = js.Array[Arn]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.API
    - awsDashSdkLib.awsDashSdkLibStrings.SAML
    - awsDashSdkLib.awsDashSdkLibStrings.USERPOOL
    - java.lang.String
  */
  type AuthenticationType = _AuthenticationType | java.lang.String
  type AwsAccountId = java.lang.String
  type AwsAccountIdList = js.Array[AwsAccountId]
  type Boolean = scala.Boolean
  type BooleanObject = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DescribeImagesMaxResults = scala.Double
  type Description = java.lang.String
  type DirectoryConfigList = js.Array[DirectoryConfig]
  type DirectoryName = java.lang.String
  type DirectoryNameList = js.Array[DirectoryName]
  type DisplayName = java.lang.String
  type Domain = java.lang.String
  type DomainList = js.Array[Domain]
  type FeedbackURL = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.VPC_CONFIGURATION
    - awsDashSdkLib.awsDashSdkLibStrings.VPC_CONFIGURATION_SECURITY_GROUP_IDS
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_INFO
    - java.lang.String
  */
  type FleetAttribute = _FleetAttribute | java.lang.String
  type FleetAttributes = js.Array[FleetAttribute]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION
    - awsDashSdkLib.awsDashSdkLibStrings.IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION
    - awsDashSdkLib.awsDashSdkLibStrings.IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION
    - awsDashSdkLib.awsDashSdkLibStrings.NETWORK_INTERFACE_LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_SERVICE_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.IAM_SERVICE_ROLE_IS_MISSING
    - awsDashSdkLib.awsDashSdkLibStrings.SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES
    - awsDashSdkLib.awsDashSdkLibStrings.IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION
    - awsDashSdkLib.awsDashSdkLibStrings.SUBNET_NOT_FOUND
    - awsDashSdkLib.awsDashSdkLibStrings.IMAGE_NOT_FOUND
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID_SUBNET_CONFIGURATION
    - awsDashSdkLib.awsDashSdkLibStrings.SECURITY_GROUPS_NOT_FOUND
    - awsDashSdkLib.awsDashSdkLibStrings.IGW_NOT_ATTACHED
    - awsDashSdkLib.awsDashSdkLibStrings.IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_ERROR_FILE_NOT_FOUND
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_ERROR_ACCESS_DENIED
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_ERROR_LOGON_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_ERROR_INVALID_PARAMETER
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_ERROR_MORE_DATA
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_ERROR_NOT_SUPPORTED
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_NERR_PASSWORD_EXPIRED
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_INTERNAL_SERVICE_ERROR
    - java.lang.String
  */
  type FleetErrorCode = _FleetErrorCode | java.lang.String
  type FleetErrors = js.Array[FleetError]
  type FleetList = js.Array[Fleet]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STARTING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPED
    - java.lang.String
  */
  type FleetState = _FleetState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALWAYS_ON
    - awsDashSdkLib.awsDashSdkLibStrings.ON_DEMAND
    - java.lang.String
  */
  type FleetType = _FleetType | java.lang.String
  type ImageBuilderList = js.Array[ImageBuilder]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING_AGENT
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPED
    - awsDashSdkLib.awsDashSdkLibStrings.REBOOTING
    - awsDashSdkLib.awsDashSdkLibStrings.SNAPSHOTTING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type ImageBuilderState = _ImageBuilderState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.IMAGE_UNAVAILABLE
    - java.lang.String
  */
  type ImageBuilderStateChangeReasonCode = _ImageBuilderStateChangeReasonCode | java.lang.String
  type ImageList = js.Array[Image]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.COPYING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - java.lang.String
  */
  type ImageState = _ImageState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.IMAGE_BUILDER_NOT_AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.IMAGE_COPY_FAILURE
    - java.lang.String
  */
  type ImageStateChangeReasonCode = _ImageStateChangeReasonCode | java.lang.String
  type Integer = scala.Double
  type Long = scala.Double
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUPPRESS
    - awsDashSdkLib.awsDashSdkLibStrings.RESEND
    - java.lang.String
  */
  type MessageAction = _MessageAction | java.lang.String
  type Metadata = org.scalablytyped.runtime.StringDictionary[String]
  type Name = java.lang.String
  type OrganizationalUnitDistinguishedName = java.lang.String
  type OrganizationalUnitDistinguishedNamesList = js.Array[OrganizationalUnitDistinguishedName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type Permission = _Permission | java.lang.String
  type PlatformType = awsDashSdkLib.awsDashSdkLibStrings.WINDOWS | java.lang.String
  type RedirectURL = java.lang.String
  type RegionName = java.lang.String
  type ResourceErrors = js.Array[ResourceError]
  type ResourceIdentifier = java.lang.String
  type SecurityGroupIdList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CONNECTED
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_CONNECTED
    - java.lang.String
  */
  type SessionConnectionState = _SessionConnectionState | java.lang.String
  type SessionList = js.Array[Session]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED
    - java.lang.String
  */
  type SessionState = _SessionState | java.lang.String
  type SettingsGroup = java.lang.String
  type SharedImagePermissionsList = js.Array[SharedImagePermissions]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STORAGE_CONNECTORS
    - awsDashSdkLib.awsDashSdkLibStrings.STORAGE_CONNECTOR_HOMEFOLDERS
    - awsDashSdkLib.awsDashSdkLibStrings.STORAGE_CONNECTOR_GOOGLE_DRIVE
    - awsDashSdkLib.awsDashSdkLibStrings.STORAGE_CONNECTOR_ONE_DRIVE
    - awsDashSdkLib.awsDashSdkLibStrings.REDIRECT_URL
    - awsDashSdkLib.awsDashSdkLibStrings.FEEDBACK_URL
    - awsDashSdkLib.awsDashSdkLibStrings.THEME_NAME
    - awsDashSdkLib.awsDashSdkLibStrings.USER_SETTINGS
    - java.lang.String
  */
  type StackAttribute = _StackAttribute | java.lang.String
  type StackAttributes = js.Array[StackAttribute]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STORAGE_CONNECTOR_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_SERVICE_ERROR
    - java.lang.String
  */
  type StackErrorCode = _StackErrorCode | java.lang.String
  type StackErrors = js.Array[StackError]
  type StackList = js.Array[Stack]
  type StorageConnectorList = js.Array[StorageConnector]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HOMEFOLDERS
    - awsDashSdkLib.awsDashSdkLibStrings.GOOGLE_DRIVE
    - awsDashSdkLib.awsDashSdkLibStrings.ONE_DRIVE
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
  type Tags = org.scalablytyped.runtime.StringDictionary[TagValue]
  type Timestamp = stdLib.Date
  type UserAttributeValue = java.lang.String
  type UserId = java.lang.String
  type UserList = js.Array[User]
  type UserSettingList = js.Array[UserSetting]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STACK_NOT_FOUND
    - awsDashSdkLib.awsDashSdkLibStrings.USER_NAME_NOT_FOUND
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type UserStackAssociationErrorCode = _UserStackAssociationErrorCode | java.lang.String
  type UserStackAssociationErrorList = js.Array[UserStackAssociationError]
  type UserStackAssociationList = js.Array[UserStackAssociation]
  type Username = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PUBLIC
    - awsDashSdkLib.awsDashSdkLibStrings.PRIVATE
    - awsDashSdkLib.awsDashSdkLibStrings.SHARED
    - java.lang.String
  */
  type VisibilityType = _VisibilityType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-12-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
