package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.awsDashSdkStrings.NAMESPACE_ID
import typings.awsDashSdk.awsDashSdkStrings.TYPE
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsServicediscoveryMod {
  type Arn = String
  type AttrKey = String
  type AttrValue = String
  type Attributes = StringDictionary[AttrValue]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type Code = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.UNHEALTHY
    - java.lang.String
  */
  type CustomHealthStatus = _CustomHealthStatus | String
  type DnsRecordList = js.Array[DnsRecord]
  type FailureThreshold = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EQ
    - typings.awsDashSdk.awsDashSdkStrings.IN
    - typings.awsDashSdk.awsDashSdkStrings.BETWEEN
    - java.lang.String
  */
  type FilterCondition = _FilterCondition | String
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HTTP
    - typings.awsDashSdk.awsDashSdkStrings.HTTPS
    - typings.awsDashSdk.awsDashSdkStrings.TCP
    - java.lang.String
  */
  type HealthCheckType = _HealthCheckType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.UNHEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN
    - java.lang.String
  */
  type HealthStatus = _HealthStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.UNHEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - java.lang.String
  */
  type HealthStatusFilter = _HealthStatusFilter | String
  type HttpInstanceSummaryList = js.Array[HttpInstanceSummary]
  type InstanceHealthStatusMap = StringDictionary[HealthStatus]
  type InstanceIdList = js.Array[ResourceId]
  type InstanceSummaryList = js.Array[InstanceSummary]
  type MaxResults = Double
  type Message = String
  type NamespaceFilterName = TYPE | String
  type NamespaceFilters = js.Array[NamespaceFilter]
  type NamespaceName = String
  type NamespaceSummariesList = js.Array[NamespaceSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DNS_PUBLIC
    - typings.awsDashSdk.awsDashSdkStrings.DNS_PRIVATE
    - typings.awsDashSdk.awsDashSdkStrings.HTTP
    - java.lang.String
  */
  type NamespaceType = _NamespaceType | String
  type NextToken = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NAMESPACE_ID
    - typings.awsDashSdk.awsDashSdkStrings.SERVICE_ID
    - typings.awsDashSdk.awsDashSdkStrings.STATUS
    - typings.awsDashSdk.awsDashSdkStrings.TYPE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_DATE
    - java.lang.String
  */
  type OperationFilterName = _OperationFilterName | String
  type OperationFilters = js.Array[OperationFilter]
  type OperationId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUBMITTED
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.FAIL
    - java.lang.String
  */
  type OperationStatus = _OperationStatus | String
  type OperationSummaryList = js.Array[OperationSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NAMESPACE
    - typings.awsDashSdk.awsDashSdkStrings.SERVICE
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE
    - java.lang.String
  */
  type OperationTargetType = _OperationTargetType | String
  type OperationTargetsMap = StringDictionary[ResourceId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_NAMESPACE
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_NAMESPACE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_SERVICE
    - typings.awsDashSdk.awsDashSdkStrings.REGISTER_INSTANCE
    - typings.awsDashSdk.awsDashSdkStrings.DEREGISTER_INSTANCE
    - java.lang.String
  */
  type OperationType = _OperationType | String
  type RecordTTL = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SRV
    - typings.awsDashSdk.awsDashSdkStrings.A
    - typings.awsDashSdk.awsDashSdkStrings.AAAA
    - typings.awsDashSdk.awsDashSdkStrings.CNAME
    - java.lang.String
  */
  type RecordType = _RecordType | String
  type ResourceCount = Double
  type ResourceDescription = String
  type ResourceId = String
  type ResourcePath = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MULTIVALUE
    - typings.awsDashSdk.awsDashSdkStrings.WEIGHTED
    - java.lang.String
  */
  type RoutingPolicy = _RoutingPolicy | String
  type ServiceFilterName = NAMESPACE_ID | String
  type ServiceFilters = js.Array[ServiceFilter]
  type ServiceName = String
  type ServiceSummariesList = js.Array[ServiceSummary]
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-03-14`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
