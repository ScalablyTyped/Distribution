package typings.awsSdk.clientsServicequotasMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmazonResourceName = String

type AwsRegion = String

type CustomerServiceEngagementId = String

type DateTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEPENDENCY_ACCESS_DENIED_ERROR
  - typings.awsSdk.awsSdkStrings.DEPENDENCY_THROTTLING_ERROR
  - typings.awsSdk.awsSdkStrings.DEPENDENCY_SERVICE_ERROR
  - typings.awsSdk.awsSdkStrings.SERVICE_QUOTA_NOT_AVAILABLE_ERROR
  - java.lang.String
*/
type ErrorCode = _ErrorCode | String

type ErrorMessage = String

type GlobalQuota = Boolean

type InputTagKeys = js.Array[TagKey]

type InputTags = js.Array[Tag]

type MaxResults = Double

type MetricDimensionName = String

type MetricDimensionValue = String

type MetricDimensionsMapDefinition = StringDictionary[MetricDimensionValue]

type NextToken = String

type OutputTags = js.Array[Tag]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MICROSECOND
  - typings.awsSdk.awsSdkStrings.MILLISECOND
  - typings.awsSdk.awsSdkStrings.SECOND
  - typings.awsSdk.awsSdkStrings.MINUTE
  - typings.awsSdk.awsSdkStrings.HOUR
  - typings.awsSdk.awsSdkStrings.DAY
  - typings.awsSdk.awsSdkStrings.WEEK
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
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.CASE_OPENED
  - typings.awsSdk.awsSdkStrings.APPROVED
  - typings.awsSdk.awsSdkStrings.DENIED
  - typings.awsSdk.awsSdkStrings.CASE_CLOSED
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
  - typings.awsSdk.awsSdkStrings.ASSOCIATED
  - typings.awsSdk.awsSdkStrings.DISASSOCIATED
  - java.lang.String
*/
type ServiceQuotaTemplateAssociationStatus = _ServiceQuotaTemplateAssociationStatus | String

type Statistic = String

type TagKey = String

type TagValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-06-24`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
