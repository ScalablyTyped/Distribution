package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsFmsMod {
  type AWSAccountId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.READY
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_DELETION
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type AccountRoleStatus = _AccountRoleStatus | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComplianceViolators = js.Array[ComplianceViolator]
  type CustomerPolicyScopeId = java.lang.String
  type CustomerPolicyScopeIdList = js.Array[CustomerPolicyScopeId]
  type CustomerPolicyScopeIdType = awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT | java.lang.String
  type CustomerPolicyScopeMap = org.scalablytyped.runtime.StringDictionary[CustomerPolicyScopeIdList]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AWSCONFIG
    - awsDashSdkLib.awsDashSdkLibStrings.AWSWAF
    - awsDashSdkLib.awsDashSdkLibStrings.AWSSHIELD_ADVANCED
    - java.lang.String
  */
  type DependentServiceName = _DependentServiceName | java.lang.String
  type DetailedInfo = java.lang.String
  type EvaluationResults = js.Array[EvaluationResult]
  type IssueInfoMap = org.scalablytyped.runtime.StringDictionary[DetailedInfo]
  type ManagedServiceData = java.lang.String
  type MemberAccounts = js.Array[AWSAccountId]
  type PaginationMaxResults = scala.Double
  type PaginationToken = java.lang.String
  type PolicyComplianceStatusList = js.Array[PolicyComplianceStatus]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLIANT
    - awsDashSdkLib.awsDashSdkLibStrings.NON_COMPLIANT
    - java.lang.String
  */
  type PolicyComplianceStatusType = _PolicyComplianceStatusType | java.lang.String
  type PolicyId = java.lang.String
  type PolicySummaryList = js.Array[PolicySummary]
  type PolicyUpdateToken = java.lang.String
  type ProtectionData = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceCount = scala.Double
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  type ResourceTags = js.Array[ResourceTag]
  type ResourceType = java.lang.String
  type ResourceTypeList = js.Array[ResourceType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.WAF
    - awsDashSdkLib.awsDashSdkLibStrings.SHIELD_ADVANCED
    - java.lang.String
  */
  type SecurityServiceType = _SecurityServiceType | java.lang.String
  type TagKey = java.lang.String
  type TagValue = java.lang.String
  type TimeStamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.WEB_ACL_MISSING_RULE_GROUP
    - awsDashSdkLib.awsDashSdkLibStrings.RESOURCE_MISSING_WEB_ACL
    - awsDashSdkLib.awsDashSdkLibStrings.RESOURCE_INCORRECT_WEB_ACL
    - awsDashSdkLib.awsDashSdkLibStrings.RESOURCE_MISSING_SHIELD_PROTECTION
    - java.lang.String
  */
  type ViolationReason = _ViolationReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-01-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
