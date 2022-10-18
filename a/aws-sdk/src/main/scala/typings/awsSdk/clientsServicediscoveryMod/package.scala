package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.HTTP
import typings.awsSdk.awsSdkStrings.NAMESPACE_ID
import typings.awsSdk.awsSdkStrings.TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmazonResourceName = String

type Arn = String

type AttrKey = String

type AttrValue = String

type Attributes = StringDictionary[AttrValue]

type Code = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HEALTHY
  - typings.awsSdk.awsSdkStrings.UNHEALTHY
  - java.lang.String
*/
type CustomHealthStatus = _CustomHealthStatus | String

type DiscoverMaxResults = Double

type DnsRecordList = js.Array[DnsRecord]

type FailureThreshold = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQ
  - typings.awsSdk.awsSdkStrings.IN
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - java.lang.String
*/
type FilterCondition = _FilterCondition | String

type FilterValue = String

type FilterValues = js.Array[FilterValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTP
  - typings.awsSdk.awsSdkStrings.HTTPS
  - typings.awsSdk.awsSdkStrings.TCP
  - java.lang.String
*/
type HealthCheckType = _HealthCheckType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HEALTHY
  - typings.awsSdk.awsSdkStrings.UNHEALTHY
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type HealthStatus = _HealthStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HEALTHY
  - typings.awsSdk.awsSdkStrings.UNHEALTHY
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.HEALTHY_OR_ELSE_ALL
  - java.lang.String
*/
type HealthStatusFilter = _HealthStatusFilter | String

type HttpInstanceSummaryList = js.Array[HttpInstanceSummary]

type InstanceHealthStatusMap = StringDictionary[HealthStatus]

type InstanceId = String

type InstanceIdList = js.Array[ResourceId]

type InstanceSummaryList = js.Array[InstanceSummary]

type MaxResults = Double

type Message = String

type NamespaceFilterName = TYPE | String

type NamespaceFilters = js.Array[NamespaceFilter]

type NamespaceName = String

type NamespaceNameHttp = String

type NamespaceNamePrivate = String

type NamespaceNamePublic = String

type NamespaceSummariesList = js.Array[NamespaceSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DNS_PUBLIC
  - typings.awsSdk.awsSdkStrings.DNS_PRIVATE
  - typings.awsSdk.awsSdkStrings.HTTP
  - java.lang.String
*/
type NamespaceType = _NamespaceType | String

type NextToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NAMESPACE_ID
  - typings.awsSdk.awsSdkStrings.SERVICE_ID
  - typings.awsSdk.awsSdkStrings.STATUS
  - typings.awsSdk.awsSdkStrings.TYPE
  - typings.awsSdk.awsSdkStrings.UPDATE_DATE
  - java.lang.String
*/
type OperationFilterName = _OperationFilterName | String

type OperationFilters = js.Array[OperationFilter]

type OperationId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.FAIL
  - java.lang.String
*/
type OperationStatus = _OperationStatus | String

type OperationSummaryList = js.Array[OperationSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NAMESPACE
  - typings.awsSdk.awsSdkStrings.SERVICE
  - typings.awsSdk.awsSdkStrings.INSTANCE
  - java.lang.String
*/
type OperationTargetType = _OperationTargetType | String

type OperationTargetsMap = StringDictionary[ResourceId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_NAMESPACE
  - typings.awsSdk.awsSdkStrings.DELETE_NAMESPACE
  - typings.awsSdk.awsSdkStrings.UPDATE_NAMESPACE
  - typings.awsSdk.awsSdkStrings.UPDATE_SERVICE
  - typings.awsSdk.awsSdkStrings.REGISTER_INSTANCE
  - typings.awsSdk.awsSdkStrings.DEREGISTER_INSTANCE
  - java.lang.String
*/
type OperationType = _OperationType | String

type RecordTTL = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SRV
  - typings.awsSdk.awsSdkStrings.A
  - typings.awsSdk.awsSdkStrings.AAAA
  - typings.awsSdk.awsSdkStrings.CNAME
  - java.lang.String
*/
type RecordType = _RecordType | String

type ResourceCount = Double

type ResourceDescription = String

type ResourceId = String

type ResourcePath = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MULTIVALUE
  - typings.awsSdk.awsSdkStrings.WEIGHTED
  - java.lang.String
*/
type RoutingPolicy = _RoutingPolicy | String

type ServiceFilterName = NAMESPACE_ID | String

type ServiceFilters = js.Array[ServiceFilter]

type ServiceName = String

type ServiceSummariesList = js.Array[ServiceSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTP
  - typings.awsSdk.awsSdkStrings.DNS_HTTP
  - typings.awsSdk.awsSdkStrings.DNS
  - java.lang.String
*/
type ServiceType = _ServiceType | String

type ServiceTypeOption = HTTP | String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-03-14`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
