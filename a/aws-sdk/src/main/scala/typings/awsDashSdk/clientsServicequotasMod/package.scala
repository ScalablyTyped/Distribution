package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsServicequotasMod {
  type AwsRegion = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CustomerServiceEngagementId = String
  type DateTime = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEPENDENCY_ACCESS_DENIED_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.DEPENDENCY_THROTTLING_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.DEPENDENCY_SERVICE_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.SERVICE_QUOTA_NOT_AVAILABLE_ERROR
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | String
  type ErrorMessage = String
  type GlobalQuota = Boolean
  type MaxResults = Double
  type MetricDimensionName = String
  type MetricDimensionValue = String
  type MetricDimensionsMapDefinition = StringDictionary[MetricDimensionValue]
  type NextToken = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MICROSECOND
    - typings.awsDashSdk.awsDashSdkStrings.MILLISECOND
    - typings.awsDashSdk.awsDashSdkStrings.SECOND
    - typings.awsDashSdk.awsDashSdkStrings.MINUTE
    - typings.awsDashSdk.awsDashSdkStrings.HOUR
    - typings.awsDashSdk.awsDashSdkStrings.DAY
    - typings.awsDashSdk.awsDashSdkStrings.WEEK
    - java.lang.String
  */
  type PeriodUnit = _PeriodUnit | String
  type PeriodValue = Double
  type QuotaAdjustable = Boolean
  type QuotaArn = String
  type QuotaCode = String
  type QuotaMetricName = String
  type QuotaMetricNamespace = String
  type QuotaName = String
  type QuotaUnit = String
  type QuotaValue = Double
  type RequestId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.CASE_OPENED
    - typings.awsDashSdk.awsDashSdkStrings.APPROVED
    - typings.awsDashSdk.awsDashSdkStrings.DENIED
    - typings.awsDashSdk.awsDashSdkStrings.CASE_CLOSED
    - java.lang.String
  */
  type RequestStatus = _RequestStatus | String
  type RequestedServiceQuotaChangeHistoryListDefinition = js.Array[RequestedServiceQuotaChange]
  type Requester = String
  type ServiceCode = String
  type ServiceInfoListDefinition = js.Array[ServiceInfo]
  type ServiceName = String
  type ServiceQuotaIncreaseRequestInTemplateList = js.Array[ServiceQuotaIncreaseRequestInTemplate]
  type ServiceQuotaListDefinition = js.Array[ServiceQuota]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASSOCIATED
    - typings.awsDashSdk.awsDashSdkStrings.DISASSOCIATED
    - java.lang.String
  */
  type ServiceQuotaTemplateAssociationStatus = _ServiceQuotaTemplateAssociationStatus | String
  type Statistic = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-06-24`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
