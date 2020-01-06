package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsFmsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.ACCOUNT
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AWSAccountId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.READY
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_DELETION
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type AccountRoleStatus = _AccountRoleStatus | String
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ComplianceViolators = js.Array[ComplianceViolator]
  type CustomerPolicyScopeId = String
  type CustomerPolicyScopeIdList = js.Array[CustomerPolicyScopeId]
  type CustomerPolicyScopeIdType = ACCOUNT | String
  type CustomerPolicyScopeMap = StringDictionary[CustomerPolicyScopeIdList]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AWSCONFIG
    - typings.awsDashSdk.awsDashSdkStrings.AWSWAF
    - typings.awsDashSdk.awsDashSdkStrings.AWSSHIELD_ADVANCED
    - typings.awsDashSdk.awsDashSdkStrings.AWSVPC
    - java.lang.String
  */
  type DependentServiceName = _DependentServiceName | String
  type DetailedInfo = String
  type EvaluationResults = js.Array[EvaluationResult]
  type IssueInfoMap = StringDictionary[DetailedInfo]
  type ManagedServiceData = String
  type MemberAccounts = js.Array[AWSAccountId]
  type PaginationMaxResults = Double
  type PaginationToken = String
  type PolicyComplianceStatusList = js.Array[PolicyComplianceStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COMPLIANT
    - typings.awsDashSdk.awsDashSdkStrings.NON_COMPLIANT
    - java.lang.String
  */
  type PolicyComplianceStatusType = _PolicyComplianceStatusType | String
  type PolicyId = String
  type PolicySummaryList = js.Array[PolicySummary]
  type PolicyUpdateToken = String
  type ProtectionData = String
  type ResourceArn = String
  type ResourceCount = Double
  type ResourceId = String
  type ResourceName = String
  type ResourceTags = js.Array[ResourceTag]
  type ResourceType = String
  type ResourceTypeList = js.Array[ResourceType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WAF
    - typings.awsDashSdk.awsDashSdkStrings.SHIELD_ADVANCED
    - typings.awsDashSdk.awsDashSdkStrings.SECURITY_GROUPS_COMMON
    - typings.awsDashSdk.awsDashSdkStrings.SECURITY_GROUPS_CONTENT_AUDIT
    - typings.awsDashSdk.awsDashSdkStrings.SECURITY_GROUPS_USAGE_AUDIT
    - java.lang.String
  */
  type SecurityServiceType = _SecurityServiceType | String
  type TagKey = String
  type TagValue = String
  type TimeStamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WEB_ACL_MISSING_RULE_GROUP
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE_MISSING_WEB_ACL
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE_INCORRECT_WEB_ACL
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE_MISSING_SHIELD_PROTECTION
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE_MISSING_SECURITY_GROUP
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP
    - typings.awsDashSdk.awsDashSdkStrings.SECURITY_GROUP_UNUSED
    - typings.awsDashSdk.awsDashSdkStrings.SECURITY_GROUP_REDUNDANT
    - java.lang.String
  */
  type ViolationReason = _ViolationReason | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-01-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
