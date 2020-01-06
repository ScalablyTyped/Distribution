package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsComputeoptimizerMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AccountId = String
  type AccountIds = js.Array[AccountId]
  type AutoScalingGroupArn = String
  type AutoScalingGroupArns = js.Array[AutoScalingGroupArn]
  type AutoScalingGroupName = String
  type AutoScalingGroupRecommendationOptions = js.Array[AutoScalingGroupRecommendationOption]
  type AutoScalingGroupRecommendations = js.Array[AutoScalingGroupRecommendation]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type Code = String
  type CurrentInstanceType = String
  type DesiredCapacity = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Finding_
    - typings.awsDashSdk.awsDashSdkStrings.RecommendationSourceType
    - java.lang.String
  */
  type FilterName = _FilterName | String
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Underprovisioned
    - typings.awsDashSdk.awsDashSdkStrings.Overprovisioned
    - typings.awsDashSdk.awsDashSdkStrings.Optimized
    - typings.awsDashSdk.awsDashSdkStrings.NotOptimized
    - java.lang.String
  */
  type Finding = _Finding | String
  type GetRecommendationErrors = js.Array[GetRecommendationError]
  type Identifier = String
  type IncludeMemberAccounts = Boolean
  type InstanceArn = String
  type InstanceArns = js.Array[InstanceArn]
  type InstanceName = String
  type InstanceRecommendations = js.Array[InstanceRecommendation]
  type InstanceType = String
  type LastRefreshTimestamp = Date
  type LookBackPeriodInDays = Double
  type MaxResults = Double
  type MaxSize = Double
  type MemberAccountsEnrolled = Boolean
  type Message = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Cpu_
    - typings.awsDashSdk.awsDashSdkStrings.Memory_
    - java.lang.String
  */
  type MetricName = _MetricName | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Maximum_
    - typings.awsDashSdk.awsDashSdkStrings.Average_
    - java.lang.String
  */
  type MetricStatistic = _MetricStatistic | String
  type MetricValue = Double
  type MetricValues = js.Array[MetricValue]
  type MinSize = Double
  type NextToken = String
  type PerformanceRisk = Double
  type Period = Double
  type ProjectedMetrics = js.Array[ProjectedMetric]
  type ProjectedUtilizationMetrics = js.Array[UtilizationMetric]
  type Rank = Double
  type RecommendationOptions = js.Array[InstanceRecommendationOption]
  type RecommendationSourceArn = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Ec2Instance_
    - typings.awsDashSdk.awsDashSdkStrings.AutoScalingGroup
    - java.lang.String
  */
  type RecommendationSourceType = _RecommendationSourceType | String
  type RecommendationSources = js.Array[RecommendationSource]
  type RecommendationSummaries = js.Array[RecommendationSummary]
  type RecommendedInstanceType = String
  type RecommendedOptionProjectedMetrics = js.Array[RecommendedOptionProjectedMetric]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Active_
    - typings.awsDashSdk.awsDashSdkStrings.Inactive_
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type Status = _Status | String
  type StatusReason = String
  type Summaries = js.Array[Summary]
  type SummaryValue = Double
  type Timestamp = Date
  type Timestamps = js.Array[Timestamp]
  type UtilizationMetrics = js.Array[UtilizationMetric]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-11-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
