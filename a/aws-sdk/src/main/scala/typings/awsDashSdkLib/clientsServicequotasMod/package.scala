package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsServicequotasMod {
  type AwsRegion = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CustomerServiceEngagementId = java.lang.String
  type DateTime = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEPENDENCY_ACCESS_DENIED_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.DEPENDENCY_THROTTLING_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.DEPENDENCY_SERVICE_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.SERVICE_QUOTA_NOT_AVAILABLE_ERROR
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | java.lang.String
  type ErrorMessage = java.lang.String
  type GlobalQuota = scala.Boolean
  type MaxResults = scala.Double
  type MetricDimensionName = java.lang.String
  type MetricDimensionValue = java.lang.String
  type MetricDimensionsMapDefinition = org.scalablytyped.runtime.StringDictionary[MetricDimensionValue]
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MICROSECOND
    - awsDashSdkLib.awsDashSdkLibStrings.MILLISECOND
    - awsDashSdkLib.awsDashSdkLibStrings.SECOND
    - awsDashSdkLib.awsDashSdkLibStrings.MINUTE
    - awsDashSdkLib.awsDashSdkLibStrings.HOUR
    - awsDashSdkLib.awsDashSdkLibStrings.DAY
    - awsDashSdkLib.awsDashSdkLibStrings.WEEK
    - java.lang.String
  */
  type PeriodUnit = _PeriodUnit | java.lang.String
  type PeriodValue = scala.Double
  type QuotaAdjustable = scala.Boolean
  type QuotaArn = java.lang.String
  type QuotaCode = java.lang.String
  type QuotaMetricName = java.lang.String
  type QuotaMetricNamespace = java.lang.String
  type QuotaName = java.lang.String
  type QuotaUnit = java.lang.String
  type QuotaValue = scala.Double
  type RequestId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.CASE_OPENED
    - awsDashSdkLib.awsDashSdkLibStrings.APPROVED
    - awsDashSdkLib.awsDashSdkLibStrings.DENIED
    - awsDashSdkLib.awsDashSdkLibStrings.CASE_CLOSED
    - java.lang.String
  */
  type RequestStatus = _RequestStatus | java.lang.String
  type RequestedServiceQuotaChangeHistoryListDefinition = js.Array[RequestedServiceQuotaChange]
  type Requester = java.lang.String
  type ServiceCode = java.lang.String
  type ServiceInfoListDefinition = js.Array[ServiceInfo]
  type ServiceName = java.lang.String
  type ServiceQuotaIncreaseRequestInTemplateList = js.Array[ServiceQuotaIncreaseRequestInTemplate]
  type ServiceQuotaListDefinition = js.Array[ServiceQuota]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ASSOCIATED
    - awsDashSdkLib.awsDashSdkLibStrings.DISASSOCIATED
    - java.lang.String
  */
  type ServiceQuotaTemplateAssociationStatus = _ServiceQuotaTemplateAssociationStatus | java.lang.String
  type Statistic = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2019-06-24`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
