package typings.awsSdk.clientsRoute53resolverMod

import typings.awsSdk.awsSdkStrings.CNAME
import typings.awsSdk.awsSdkStrings.REPLACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALLOW
  - typings.awsSdk.awsSdkStrings.BLOCK
  - typings.awsSdk.awsSdkStrings.ALERT
  - java.lang.String
*/
type Action = _Action | String

type Arn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLE
  - typings.awsSdk.awsSdkStrings.DISABLE
  - typings.awsSdk.awsSdkStrings.USE_LOCAL_RESOURCE_SETTING
  - java.lang.String
*/
type AutodefinedReverseFlag = _AutodefinedReverseFlag | String

type BlockOverrideDnsType = CNAME | String

type BlockOverrideDomain = String

type BlockOverrideTtl = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NODATA
  - typings.awsSdk.awsSdkStrings.NXDOMAIN
  - typings.awsSdk.awsSdkStrings.OVERRIDE
  - java.lang.String
*/
type BlockResponse = _BlockResponse | String

type Boolean = scala.Boolean

type Count = Double

type CreatorRequestId = String

type DestinationArn = String

type DomainListFileUrl = String

type DomainName = String

type FilterName = String

type FilterValue = String

type FilterValues = js.Array[FilterValue]

type Filters = js.Array[Filter]

type FirewallConfigList = js.Array[FirewallConfig]

type FirewallDomainImportOperation = REPLACE | String

type FirewallDomainListMetadataList = js.Array[FirewallDomainListMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.COMPLETE_IMPORT_FAILED
  - typings.awsSdk.awsSdkStrings.IMPORTING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type FirewallDomainListStatus = _FirewallDomainListStatus | String

type FirewallDomainName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ADD
  - typings.awsSdk.awsSdkStrings.REMOVE
  - typings.awsSdk.awsSdkStrings.REPLACE
  - java.lang.String
*/
type FirewallDomainUpdateOperation = _FirewallDomainUpdateOperation | String

type FirewallDomains = js.Array[FirewallDomainName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.USE_LOCAL_RESOURCE_SETTING
  - java.lang.String
*/
type FirewallFailOpenStatus = _FirewallFailOpenStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type FirewallRuleGroupAssociationStatus = _FirewallRuleGroupAssociationStatus | String

type FirewallRuleGroupAssociations = js.Array[FirewallRuleGroupAssociation]

type FirewallRuleGroupMetadataList = js.Array[FirewallRuleGroupMetadata]

type FirewallRuleGroupPolicy = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type FirewallRuleGroupStatus = _FirewallRuleGroupStatus | String

type FirewallRules = js.Array[FirewallRule]

type Ip = String

type IpAddressCount = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.FAILED_CREATION
  - typings.awsSdk.awsSdkStrings.ATTACHING
  - typings.awsSdk.awsSdkStrings.ATTACHED
  - typings.awsSdk.awsSdkStrings.REMAP_DETACHING
  - typings.awsSdk.awsSdkStrings.REMAP_ATTACHING
  - typings.awsSdk.awsSdkStrings.DETACHING
  - typings.awsSdk.awsSdkStrings.FAILED_RESOURCE_GONE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED_FAS_EXPIRED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type IpAddressStatus = _IpAddressStatus | String

type IpAddressesRequest = js.Array[IpAddressRequest]

type IpAddressesResponse = js.Array[IpAddressResponse]

type Ipv6 = String

type ListDomainMaxResults = Double

type ListFirewallConfigsMaxResult = Double

type ListResolverConfigsMaxResult = Double

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type MutationProtectionStatus = _MutationProtectionStatus | String

type Name = String

type NextToken = String

type Port = Double

type Priority = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLING
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLING
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.UPDATING_TO_USE_LOCAL_RESOURCE_SETTING
  - typings.awsSdk.awsSdkStrings.USE_LOCAL_RESOURCE_SETTING
  - java.lang.String
*/
type ResolverAutodefinedReverseStatus = _ResolverAutodefinedReverseStatus | String

type ResolverConfigList = js.Array[ResolverConfig]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLING
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLING
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.UPDATING_TO_USE_LOCAL_RESOURCE_SETTING
  - typings.awsSdk.awsSdkStrings.USE_LOCAL_RESOURCE_SETTING
  - java.lang.String
*/
type ResolverDNSSECValidationStatus = _ResolverDNSSECValidationStatus | String

type ResolverDnssecConfigList = js.Array[ResolverDnssecConfig]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INBOUND
  - typings.awsSdk.awsSdkStrings.OUTBOUND
  - java.lang.String
*/
type ResolverEndpointDirection = _ResolverEndpointDirection | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.OPERATIONAL
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.AUTO_RECOVERING
  - typings.awsSdk.awsSdkStrings.ACTION_NEEDED
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type ResolverEndpointStatus = _ResolverEndpointStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IPV6
  - typings.awsSdk.awsSdkStrings.IPV4
  - typings.awsSdk.awsSdkStrings.DUALSTACK
  - java.lang.String
*/
type ResolverEndpointType = _ResolverEndpointType | String

type ResolverEndpoints = js.Array[ResolverEndpoint]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.DESTINATION_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
  - java.lang.String
*/
type ResolverQueryLogConfigAssociationError = _ResolverQueryLogConfigAssociationError | String

type ResolverQueryLogConfigAssociationErrorMessage = String

type ResolverQueryLogConfigAssociationList = js.Array[ResolverQueryLogConfigAssociation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.ACTION_NEEDED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ResolverQueryLogConfigAssociationStatus = _ResolverQueryLogConfigAssociationStatus | String

type ResolverQueryLogConfigList = js.Array[ResolverQueryLogConfig]

type ResolverQueryLogConfigName = String

type ResolverQueryLogConfigPolicy = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ResolverQueryLogConfigStatus = _ResolverQueryLogConfigStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.OVERRIDDEN
  - java.lang.String
*/
type ResolverRuleAssociationStatus = _ResolverRuleAssociationStatus | String

type ResolverRuleAssociations = js.Array[ResolverRuleAssociation]

type ResolverRulePolicy = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ResolverRuleStatus = _ResolverRuleStatus | String

type ResolverRules = js.Array[ResolverRule]

type ResourceId = String

type Rfc3339TimeString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FORWARD
  - typings.awsSdk.awsSdkStrings.SYSTEM
  - typings.awsSdk.awsSdkStrings.RECURSIVE
  - java.lang.String
*/
type RuleTypeOption = _RuleTypeOption | String

type SecurityGroupIds = js.Array[ResourceId]

type ServicePrinciple = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_SHARED
  - typings.awsSdk.awsSdkStrings.SHARED_WITH_ME
  - typings.awsSdk.awsSdkStrings.SHARED_BY_ME
  - java.lang.String
*/
type ShareStatus = _ShareStatus | String

type SortByKey = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | String

type StatusMessage = String

type SubnetId = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TargetList = js.Array[TargetAddress]

type Unsigned = Double

type UpdateIpAddresses = js.Array[UpdateIpAddress]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLE
  - typings.awsSdk.awsSdkStrings.DISABLE
  - typings.awsSdk.awsSdkStrings.USE_LOCAL_RESOURCE_SETTING
  - java.lang.String
*/
type Validation = _Validation | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-04-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
