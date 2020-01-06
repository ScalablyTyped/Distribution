package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsOrganizationsMod {
  import typings.awsDashSdk.awsDashSdkStrings.TAG_POLICY
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AccountArn = String
  type AccountId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INVITED
    - typings.awsDashSdk.awsDashSdkStrings.CREATED
    - java.lang.String
  */
  type AccountJoinedMethod = _AccountJoinedMethod | String
  type AccountName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.SUSPENDED
    - java.lang.String
  */
  type AccountStatus = _AccountStatus | String
  type Accounts = js.Array[Account]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INVITE
    - typings.awsDashSdk.awsDashSdkStrings.ENABLE_ALL_FEATURES
    - typings.awsDashSdk.awsDashSdkStrings.APPROVE_ALL_FEATURES
    - typings.awsDashSdk.awsDashSdkStrings.ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE
    - java.lang.String
  */
  type ActionType = _ActionType | String
  type AwsManagedPolicy = Boolean
  type ChildId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACCOUNT
    - typings.awsDashSdk.awsDashSdkStrings.ORGANIZATIONAL_UNIT
    - java.lang.String
  */
  type ChildType = _ChildType | String
  type Children = js.Array[Child]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACCOUNT_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.EMAIL_ALREADY_EXISTS
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_ADDRESS
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_EMAIL
    - typings.awsDashSdk.awsDashSdkStrings.CONCURRENT_ACCOUNT_MODIFICATION
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.GOVCLOUD_ACCOUNT_ALREADY_EXISTS
    - java.lang.String
  */
  type CreateAccountFailureReason = _CreateAccountFailureReason | String
  type CreateAccountRequestId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type CreateAccountState = _CreateAccountState | String
  type CreateAccountStates = js.Array[CreateAccountState]
  type CreateAccountStatuses = js.Array[CreateAccountStatus]
  type EffectivePolicyType = TAG_POLICY | String
  type Email = String
  type EnabledServicePrincipals = js.Array[EnabledServicePrincipal]
  type GenericArn = String
  type HandshakeArn = String
  type HandshakeId = String
  type HandshakeNotes = String
  type HandshakeParties = js.Array[HandshakeParty]
  type HandshakePartyId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACCOUNT
    - typings.awsDashSdk.awsDashSdkStrings.ORGANIZATION
    - typings.awsDashSdk.awsDashSdkStrings.EMAIL
    - java.lang.String
  */
  type HandshakePartyType = _HandshakePartyType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACCOUNT
    - typings.awsDashSdk.awsDashSdkStrings.ORGANIZATION
    - typings.awsDashSdk.awsDashSdkStrings.ORGANIZATION_FEATURE_SET
    - typings.awsDashSdk.awsDashSdkStrings.EMAIL
    - typings.awsDashSdk.awsDashSdkStrings.MASTER_EMAIL
    - typings.awsDashSdk.awsDashSdkStrings.MASTER_NAME
    - typings.awsDashSdk.awsDashSdkStrings.NOTES
    - typings.awsDashSdk.awsDashSdkStrings.PARENT_HANDSHAKE
    - java.lang.String
  */
  type HandshakeResourceType = _HandshakeResourceType | String
  type HandshakeResourceValue = String
  type HandshakeResources = js.Array[HandshakeResource]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.REQUESTED
    - typings.awsDashSdk.awsDashSdkStrings.OPEN
    - typings.awsDashSdk.awsDashSdkStrings.CANCELED
    - typings.awsDashSdk.awsDashSdkStrings.ACCEPTED
    - typings.awsDashSdk.awsDashSdkStrings.DECLINED
    - typings.awsDashSdk.awsDashSdkStrings.EXPIRED
    - java.lang.String
  */
  type HandshakeState = _HandshakeState | String
  type Handshakes = js.Array[Handshake]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALLOW
    - typings.awsDashSdk.awsDashSdkStrings.DENY
    - java.lang.String
  */
  type IAMUserAccessToBilling = _IAMUserAccessToBilling | String
  type MaxResults = Double
  type NextToken = String
  type OrganizationArn = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - typings.awsDashSdk.awsDashSdkStrings.CONSOLIDATED_BILLING
    - java.lang.String
  */
  type OrganizationFeatureSet = _OrganizationFeatureSet | String
  type OrganizationId = String
  type OrganizationalUnitArn = String
  type OrganizationalUnitId = String
  type OrganizationalUnitName = String
  type OrganizationalUnits = js.Array[OrganizationalUnit]
  type ParentId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ROOT
    - typings.awsDashSdk.awsDashSdkStrings.ORGANIZATIONAL_UNIT
    - java.lang.String
  */
  type ParentType = _ParentType | String
  type Parents = js.Array[Parent]
  type Policies = js.Array[PolicySummary]
  type PolicyArn = String
  type PolicyContent = String
  type PolicyDescription = String
  type PolicyId = String
  type PolicyName = String
  type PolicyTargetId = String
  type PolicyTargets = js.Array[PolicyTargetSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SERVICE_CONTROL_POLICY
    - typings.awsDashSdk.awsDashSdkStrings.TAG_POLICY
    - java.lang.String
  */
  type PolicyType = _PolicyType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_ENABLE
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_DISABLE
    - java.lang.String
  */
  type PolicyTypeStatus = _PolicyTypeStatus | String
  type PolicyTypes = js.Array[PolicyTypeSummary]
  type RoleName = String
  type RootArn = String
  type RootId = String
  type RootName = String
  type Roots = js.Array[Root]
  type ServicePrincipal = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type TaggableResourceId = String
  type Tags = js.Array[Tag]
  type TargetName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACCOUNT
    - typings.awsDashSdk.awsDashSdkStrings.ORGANIZATIONAL_UNIT
    - typings.awsDashSdk.awsDashSdkStrings.ROOT
    - java.lang.String
  */
  type TargetType = _TargetType | String
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-11-28`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
