package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRoute53resolverMod {
  type AccountId = java.lang.String
  type Arn = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CreatorRequestId = java.lang.String
  type DomainName = java.lang.String
  type FilterName = java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type Ip = java.lang.String
  type IpAddressCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED_CREATION
    - awsDashSdkLib.awsDashSdkLibStrings.ATTACHING
    - awsDashSdkLib.awsDashSdkLibStrings.ATTACHED
    - awsDashSdkLib.awsDashSdkLibStrings.REMAP_DETACHING
    - awsDashSdkLib.awsDashSdkLibStrings.REMAP_ATTACHING
    - awsDashSdkLib.awsDashSdkLibStrings.DETACHING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED_RESOURCE_GONE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_FAILED_FAS_EXPIRED
    - java.lang.String
  */
  type IpAddressStatus = _IpAddressStatus | java.lang.String
  type IpAddressesRequest = js.Array[IpAddressRequest]
  type IpAddressesResponse = js.Array[IpAddressResponse]
  type MaxResults = scala.Double
  type Name = java.lang.String
  type NextToken = java.lang.String
  type Port = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INBOUND
    - awsDashSdkLib.awsDashSdkLibStrings.OUTBOUND
    - java.lang.String
  */
  type ResolverEndpointDirection = _ResolverEndpointDirection | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.OPERATIONAL
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.AUTO_RECOVERING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTION_NEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - java.lang.String
  */
  type ResolverEndpointStatus = _ResolverEndpointStatus | java.lang.String
  type ResolverEndpoints = js.Array[ResolverEndpoint]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.OVERRIDDEN
    - java.lang.String
  */
  type ResolverRuleAssociationStatus = _ResolverRuleAssociationStatus | java.lang.String
  type ResolverRuleAssociations = js.Array[ResolverRuleAssociation]
  type ResolverRulePolicy = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type ResolverRuleStatus = _ResolverRuleStatus | java.lang.String
  type ResolverRules = js.Array[ResolverRule]
  type ResourceId = java.lang.String
  type Rfc3339TimeString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FORWARD
    - awsDashSdkLib.awsDashSdkLibStrings.SYSTEM
    - awsDashSdkLib.awsDashSdkLibStrings.RECURSIVE
    - java.lang.String
  */
  type RuleTypeOption = _RuleTypeOption | java.lang.String
  type SecurityGroupIds = js.Array[ResourceId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_SHARED
    - awsDashSdkLib.awsDashSdkLibStrings.SHARED_WITH_ME
    - awsDashSdkLib.awsDashSdkLibStrings.SHARED_BY_ME
    - java.lang.String
  */
  type ShareStatus = _ShareStatus | java.lang.String
  type StatusMessage = java.lang.String
  type SubnetId = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TargetList = js.Array[TargetAddress]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-04-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
