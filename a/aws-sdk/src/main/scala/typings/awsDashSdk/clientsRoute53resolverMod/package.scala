package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRoute53resolverMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type AccountId = String
  type Arn = String
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CreatorRequestId = String
  type DomainName = String
  type FilterName = String
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type Ip = String
  type IpAddressCount = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED_CREATION
    - typings.awsDashSdk.awsDashSdkStrings.ATTACHING
    - typings.awsDashSdk.awsDashSdkStrings.ATTACHED
    - typings.awsDashSdk.awsDashSdkStrings.REMAP_DETACHING
    - typings.awsDashSdk.awsDashSdkStrings.REMAP_ATTACHING
    - typings.awsDashSdk.awsDashSdkStrings.DETACHING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED_RESOURCE_GONE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FAILED_FAS_EXPIRED
    - java.lang.String
  */
  type IpAddressStatus = _IpAddressStatus | String
  type IpAddressesRequest = js.Array[IpAddressRequest]
  type IpAddressesResponse = js.Array[IpAddressResponse]
  type MaxResults = Double
  type Name = String
  type NextToken = String
  type Port = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INBOUND
    - typings.awsDashSdk.awsDashSdkStrings.OUTBOUND
    - java.lang.String
  */
  type ResolverEndpointDirection = _ResolverEndpointDirection | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.OPERATIONAL
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.AUTO_RECOVERING
    - typings.awsDashSdk.awsDashSdkStrings.ACTION_NEEDED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - java.lang.String
  */
  type ResolverEndpointStatus = _ResolverEndpointStatus | String
  type ResolverEndpoints = js.Array[ResolverEndpoint]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.OVERRIDDEN
    - java.lang.String
  */
  type ResolverRuleAssociationStatus = _ResolverRuleAssociationStatus | String
  type ResolverRuleAssociations = js.Array[ResolverRuleAssociation]
  type ResolverRulePolicy = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type ResolverRuleStatus = _ResolverRuleStatus | String
  type ResolverRules = js.Array[ResolverRule]
  type ResourceId = String
  type Rfc3339TimeString = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FORWARD
    - typings.awsDashSdk.awsDashSdkStrings.SYSTEM
    - typings.awsDashSdk.awsDashSdkStrings.RECURSIVE
    - java.lang.String
  */
  type RuleTypeOption = _RuleTypeOption | String
  type SecurityGroupIds = js.Array[ResourceId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NOT_SHARED
    - typings.awsDashSdk.awsDashSdkStrings.SHARED_WITH_ME
    - typings.awsDashSdk.awsDashSdkStrings.SHARED_BY_ME
    - java.lang.String
  */
  type ShareStatus = _ShareStatus | String
  type StatusMessage = String
  type SubnetId = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetList = js.Array[TargetAddress]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-04-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
