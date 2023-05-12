package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.SNS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CURRENT_ACCOUNT
  - typings.awsSdk.awsSdkStrings.ORGANIZATION
  - java.lang.String
*/
type AccountAccessType = _AccountAccessType | java.lang.String

type AllowedOrganization = java.lang.String

type AllowedOrganizations = js.Array[AllowedOrganization]

type ApiKeyName = java.lang.String

type ApiKeyToken = java.lang.String

type AssertionAttribute = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS_SSO
  - typings.awsSdk.awsSdkStrings.SAML
  - java.lang.String
*/
type AuthenticationProviderTypes = _AuthenticationProviderTypes | java.lang.String

type AuthenticationProviders = js.Array[AuthenticationProviderTypes]

type Boolean = scala.Boolean

type ClientToken = java.lang.String

type CreateWorkspaceApiKeyRequestSecondsToLiveInteger = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AMAZON_OPENSEARCH_SERVICE
  - typings.awsSdk.awsSdkStrings.CLOUDWATCH
  - typings.awsSdk.awsSdkStrings.PROMETHEUS
  - typings.awsSdk.awsSdkStrings.XRAY
  - typings.awsSdk.awsSdkStrings.TIMESTREAM
  - typings.awsSdk.awsSdkStrings.SITEWISE
  - typings.awsSdk.awsSdkStrings.ATHENA
  - typings.awsSdk.awsSdkStrings.REDSHIFT
  - typings.awsSdk.awsSdkStrings.TWINMAKER
  - java.lang.String
*/
type DataSourceType = _DataSourceType | java.lang.String

type DataSourceTypesList = js.Array[DataSourceType]

type Description = java.lang.String

type Endpoint = java.lang.String

type GrafanaVersion = java.lang.String

type IamRoleArn = java.lang.String

type IdpMetadataUrl = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENTERPRISE
  - typings.awsSdk.awsSdkStrings.ENTERPRISE_FREE_TRIAL
  - java.lang.String
*/
type LicenseType = _LicenseType | java.lang.String

type ListPermissionsRequestMaxResultsInteger = Double

type ListWorkspacesRequestMaxResultsInteger = Double

type LoginValidityDuration = Double

type NotificationDestinationType = SNS | java.lang.String

type NotificationDestinationsList = js.Array[NotificationDestinationType]

type OrganizationRoleName = java.lang.String

type OrganizationalUnit = java.lang.String

type OrganizationalUnitList = js.Array[OrganizationalUnit]

type OverridableConfigurationJson = java.lang.String

type PaginationToken = java.lang.String

type PermissionEntryList = js.Array[PermissionEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CUSTOMER_MANAGED
  - typings.awsSdk.awsSdkStrings.SERVICE_MANAGED
  - java.lang.String
*/
type PermissionType = _PermissionType | java.lang.String

type PrefixListId = java.lang.String

type PrefixListIds = js.Array[PrefixListId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ADMIN
  - typings.awsSdk.awsSdkStrings.EDITOR
  - typings.awsSdk.awsSdkStrings.VIEWER
  - java.lang.String
*/
type Role = _Role | java.lang.String

type RoleValue = java.lang.String

type RoleValueList = js.Array[RoleValue]

type SSOClientId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONFIGURED
  - typings.awsSdk.awsSdkStrings.NOT_CONFIGURED
  - java.lang.String
*/
type SamlConfigurationStatus = _SamlConfigurationStatus | java.lang.String

type SecurityGroupId = java.lang.String

type SecurityGroupIds = js.Array[SecurityGroupId]

type SsoId = java.lang.String

type StackSetName = java.lang.String

type String = java.lang.String

type SubnetId = java.lang.String

type SubnetIds = js.Array[SubnetId]

type TagKey = java.lang.String

type TagKeys = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ADD
  - typings.awsSdk.awsSdkStrings.REVOKE
  - java.lang.String
*/
type UpdateAction = _UpdateAction | java.lang.String

type UpdateErrorCodeInteger = Double

type UpdateErrorList = js.Array[UpdateError]

type UpdateInstructionBatch = js.Array[UpdateInstruction]

type UserList = js.Array[User]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SSO_USER
  - typings.awsSdk.awsSdkStrings.SSO_GROUP
  - java.lang.String
*/
type UserType = _UserType | java.lang.String

type VpceId = java.lang.String

type VpceIds = js.Array[VpceId]

type WorkspaceId = java.lang.String

type WorkspaceList = js.Array[WorkspaceSummary]

type WorkspaceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.UPGRADING
  - typings.awsSdk.awsSdkStrings.DELETION_FAILED
  - typings.awsSdk.awsSdkStrings.CREATION_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - typings.awsSdk.awsSdkStrings.UPGRADE_FAILED
  - typings.awsSdk.awsSdkStrings.LICENSE_REMOVAL_FAILED
  - java.lang.String
*/
type WorkspaceStatus = _WorkspaceStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-08-18`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
