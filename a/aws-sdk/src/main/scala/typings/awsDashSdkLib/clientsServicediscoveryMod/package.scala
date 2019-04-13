package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsServicediscoveryMod {
  type Arn = java.lang.String
  type AttrKey = java.lang.String
  type AttrValue = java.lang.String
  type Attributes = org.scalablytyped.runtime.StringDictionary[AttrValue]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Code = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY
    - java.lang.String
  */
  type CustomHealthStatus = _CustomHealthStatus | java.lang.String
  type DnsRecordList = js.Array[DnsRecord]
  type FailureThreshold = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EQ
    - awsDashSdkLib.awsDashSdkLibStrings.IN
    - awsDashSdkLib.awsDashSdkLibStrings.BETWEEN
    - java.lang.String
  */
  type FilterCondition = _FilterCondition | java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[FilterValue]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPS
    - awsDashSdkLib.awsDashSdkLibStrings.TCP
    - java.lang.String
  */
  type HealthCheckType = _HealthCheckType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - java.lang.String
  */
  type HealthStatus = _HealthStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - java.lang.String
  */
  type HealthStatusFilter = _HealthStatusFilter | java.lang.String
  type HttpInstanceSummaryList = js.Array[HttpInstanceSummary]
  type InstanceHealthStatusMap = org.scalablytyped.runtime.StringDictionary[HealthStatus]
  type InstanceIdList = js.Array[ResourceId]
  type InstanceSummaryList = js.Array[InstanceSummary]
  type MaxResults = scala.Double
  type Message = java.lang.String
  type NamespaceFilterName = awsDashSdkLib.awsDashSdkLibStrings.TYPE | java.lang.String
  type NamespaceFilters = js.Array[NamespaceFilter]
  type NamespaceName = java.lang.String
  type NamespaceSummariesList = js.Array[NamespaceSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DNS_PUBLIC
    - awsDashSdkLib.awsDashSdkLibStrings.DNS_PRIVATE
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP
    - java.lang.String
  */
  type NamespaceType = _NamespaceType | java.lang.String
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NAMESPACE_ID
    - awsDashSdkLib.awsDashSdkLibStrings.SERVICE_ID
    - awsDashSdkLib.awsDashSdkLibStrings.STATUS
    - awsDashSdkLib.awsDashSdkLibStrings.TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_DATE
    - java.lang.String
  */
  type OperationFilterName = _OperationFilterName | java.lang.String
  type OperationFilters = js.Array[OperationFilter]
  type OperationId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUBMITTED
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAIL
    - java.lang.String
  */
  type OperationStatus = _OperationStatus | java.lang.String
  type OperationSummaryList = js.Array[OperationSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NAMESPACE
    - awsDashSdkLib.awsDashSdkLibStrings.SERVICE
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE
    - java.lang.String
  */
  type OperationTargetType = _OperationTargetType | java.lang.String
  type OperationTargetsMap = org.scalablytyped.runtime.StringDictionary[ResourceId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_NAMESPACE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_NAMESPACE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_SERVICE
    - awsDashSdkLib.awsDashSdkLibStrings.REGISTER_INSTANCE
    - awsDashSdkLib.awsDashSdkLibStrings.DEREGISTER_INSTANCE
    - java.lang.String
  */
  type OperationType = _OperationType | java.lang.String
  type RecordTTL = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SRV
    - awsDashSdkLib.awsDashSdkLibStrings.A
    - awsDashSdkLib.awsDashSdkLibStrings.AAAA
    - awsDashSdkLib.awsDashSdkLibStrings.CNAME
    - java.lang.String
  */
  type RecordType = _RecordType | java.lang.String
  type ResourceCount = scala.Double
  type ResourceDescription = java.lang.String
  type ResourceId = java.lang.String
  type ResourcePath = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MULTIVALUE
    - awsDashSdkLib.awsDashSdkLibStrings.WEIGHTED
    - java.lang.String
  */
  type RoutingPolicy = _RoutingPolicy | java.lang.String
  type ServiceFilterName = awsDashSdkLib.awsDashSdkLibStrings.NAMESPACE_ID | java.lang.String
  type ServiceFilters = js.Array[ServiceFilter]
  type ServiceName = java.lang.String
  type ServiceSummariesList = js.Array[ServiceSummary]
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-03-14`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
