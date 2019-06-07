package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsOrganizationsMod {
  type AccountArn = java.lang.String
  type AccountId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INVITED
    - awsDashSdkLib.awsDashSdkLibStrings.CREATED
    - java.lang.String
  */
  type AccountJoinedMethod = _AccountJoinedMethod | java.lang.String
  type AccountName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.SUSPENDED
    - java.lang.String
  */
  type AccountStatus = _AccountStatus | java.lang.String
  type Accounts = js.Array[Account]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INVITE
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLE_ALL_FEATURES
    - awsDashSdkLib.awsDashSdkLibStrings.APPROVE_ALL_FEATURES
    - awsDashSdkLib.awsDashSdkLibStrings.ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE
    - java.lang.String
  */
  type ActionType = _ActionType | java.lang.String
  type AwsManagedPolicy = scala.Boolean
  type ChildId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT
    - awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATIONAL_UNIT
    - java.lang.String
  */
  type ChildType = _ChildType | java.lang.String
  type Children = js.Array[Child]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT_LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.EMAIL_ALREADY_EXISTS
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID_ADDRESS
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID_EMAIL
    - awsDashSdkLib.awsDashSdkLibStrings.CONCURRENT_ACCOUNT_MODIFICATION
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_FAILURE
    - java.lang.String
  */
  type CreateAccountFailureReason = _CreateAccountFailureReason | java.lang.String
  type CreateAccountRequestId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type CreateAccountState = _CreateAccountState | java.lang.String
  type CreateAccountStates = js.Array[CreateAccountState]
  type CreateAccountStatuses = js.Array[CreateAccountStatus]
  type Email = java.lang.String
  type EnabledServicePrincipals = js.Array[EnabledServicePrincipal]
  type GenericArn = java.lang.String
  type HandshakeArn = java.lang.String
  type HandshakeId = java.lang.String
  type HandshakeNotes = java.lang.String
  type HandshakeParties = js.Array[HandshakeParty]
  type HandshakePartyId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT
    - awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATION
    - awsDashSdkLib.awsDashSdkLibStrings.EMAIL
    - java.lang.String
  */
  type HandshakePartyType = _HandshakePartyType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT
    - awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATION
    - awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATION_FEATURE_SET
    - awsDashSdkLib.awsDashSdkLibStrings.EMAIL
    - awsDashSdkLib.awsDashSdkLibStrings.MASTER_EMAIL
    - awsDashSdkLib.awsDashSdkLibStrings.MASTER_NAME
    - awsDashSdkLib.awsDashSdkLibStrings.NOTES
    - awsDashSdkLib.awsDashSdkLibStrings.PARENT_HANDSHAKE
    - java.lang.String
  */
  type HandshakeResourceType = _HandshakeResourceType | java.lang.String
  type HandshakeResourceValue = java.lang.String
  type HandshakeResources = js.Array[HandshakeResource]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.REQUESTED
    - awsDashSdkLib.awsDashSdkLibStrings.OPEN
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELED
    - awsDashSdkLib.awsDashSdkLibStrings.ACCEPTED
    - awsDashSdkLib.awsDashSdkLibStrings.DECLINED
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED
    - java.lang.String
  */
  type HandshakeState = _HandshakeState | java.lang.String
  type Handshakes = js.Array[Handshake]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALLOW
    - awsDashSdkLib.awsDashSdkLibStrings.DENY
    - java.lang.String
  */
  type IAMUserAccessToBilling = _IAMUserAccessToBilling | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type OrganizationArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - awsDashSdkLib.awsDashSdkLibStrings.CONSOLIDATED_BILLING
    - java.lang.String
  */
  type OrganizationFeatureSet = _OrganizationFeatureSet | java.lang.String
  type OrganizationId = java.lang.String
  type OrganizationalUnitArn = java.lang.String
  type OrganizationalUnitId = java.lang.String
  type OrganizationalUnitName = java.lang.String
  type OrganizationalUnits = js.Array[OrganizationalUnit]
  type ParentId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ROOT
    - awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATIONAL_UNIT
    - java.lang.String
  */
  type ParentType = _ParentType | java.lang.String
  type Parents = js.Array[Parent]
  type Policies = js.Array[PolicySummary]
  type PolicyArn = java.lang.String
  type PolicyContent = java.lang.String
  type PolicyDescription = java.lang.String
  type PolicyId = java.lang.String
  type PolicyName = java.lang.String
  type PolicyTargetId = java.lang.String
  type PolicyTargets = js.Array[PolicyTargetSummary]
  type PolicyType = awsDashSdkLib.awsDashSdkLibStrings.SERVICE_CONTROL_POLICY | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_ENABLE
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_DISABLE
    - java.lang.String
  */
  type PolicyTypeStatus = _PolicyTypeStatus | java.lang.String
  type PolicyTypes = js.Array[PolicyTypeSummary]
  type RoleName = java.lang.String
  type RootArn = java.lang.String
  type RootId = java.lang.String
  type RootName = java.lang.String
  type Roots = js.Array[Root]
  type ServicePrincipal = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type TaggableResourceId = java.lang.String
  type Tags = js.Array[Tag]
  type TargetName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT
    - awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATIONAL_UNIT
    - awsDashSdkLib.awsDashSdkLibStrings.ROOT
    - java.lang.String
  */
  type TargetType = _TargetType | java.lang.String
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-11-28`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
