package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECSServiceRecommendation extends StObject {
  
  /**
    *  The Amazon Web Services account ID of the Amazon ECS service. 
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The risk of the current Amazon ECS service not meeting the performance needs of its workloads. The higher the risk, the more likely the current service can't meet the performance requirements of its workload. 
    */
  var currentPerformanceRisk: js.UndefOr[CurrentPerformanceRisk] = js.undefined
  
  /**
    *  The configuration of the current Amazon ECS service. 
    */
  var currentServiceConfiguration: js.UndefOr[ServiceConfiguration] = js.undefined
  
  /**
    *  The finding classification of an Amazon ECS service.  Findings for Amazon ECS services include:     Underprovisioned  — When Compute Optimizer detects that there’s not enough memory or CPU, an Amazon ECS service is considered under-provisioned. An under-provisioned service might result in poor application performance.     Overprovisioned  — When Compute Optimizer detects that there’s excessive memory or CPU, an Amazon ECS service is considered over-provisioned. An over-provisioned service might result in additional infrastructure costs.      Optimized  — When both the CPU and memory of your Amazon ECS service meet the performance requirements of your workload, the service is considered optimized.  
    */
  var finding: js.UndefOr[ECSServiceRecommendationFinding] = js.undefined
  
  /**
    *  The reason for the finding classification of an Amazon ECS service.  Finding reason codes for Amazon ECS services include:     CPUUnderprovisioned  — The service CPU configuration can be sized up to enhance the performance of your workload. This is identified by analyzing the CPUUtilization metric of the current service during the look-back period.     CPUOverprovisioned  — The service CPU configuration can be sized down while still meeting the performance requirements of your workload. This is identified by analyzing the CPUUtilization metric of the current service during the look-back period.      MemoryUnderprovisioned  — The service memory configuration can be sized up to enhance the performance of your workload. This is identified by analyzing the MemoryUtilization metric of the current service during the look-back period.     MemoryOverprovisioned  — The service memory configuration can be sized down while still meeting the performance requirements of your workload. This is identified by analyzing the MemoryUtilization metric of the current service during the look-back period.  
    */
  var findingReasonCodes: js.UndefOr[ECSServiceRecommendationFindingReasonCodes] = js.undefined
  
  /**
    *  The timestamp of when the Amazon ECS service recommendation was last generated. 
    */
  var lastRefreshTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The launch type the Amazon ECS service is using.   Compute Optimizer only supports the Fargate launch type. 
    */
  var launchType: js.UndefOr[ECSServiceLaunchType] = js.undefined
  
  /**
    *  The number of days the Amazon ECS service utilization metrics were analyzed. 
    */
  var lookbackPeriodInDays: js.UndefOr[LookBackPeriodInDays] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the current Amazon ECS service.   The following is the format of the ARN:   arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name 
    */
  var serviceArn: js.UndefOr[ServiceArn] = js.undefined
  
  /**
    *  An array of objects that describe the recommendation options for the Amazon ECS service. 
    */
  var serviceRecommendationOptions: js.UndefOr[ECSServiceRecommendationOptions] = js.undefined
  
  /**
    *  A list of tags assigned to your Amazon ECS service recommendations. 
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    *  An array of objects that describe the utilization metrics of the Amazon ECS service. 
    */
  var utilizationMetrics: js.UndefOr[ECSServiceUtilizationMetrics] = js.undefined
}
object ECSServiceRecommendation {
  
  inline def apply(): ECSServiceRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECSServiceRecommendation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ECSServiceRecommendation] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCurrentPerformanceRisk(value: CurrentPerformanceRisk): Self = StObject.set(x, "currentPerformanceRisk", value.asInstanceOf[js.Any])
    
    inline def setCurrentPerformanceRiskUndefined: Self = StObject.set(x, "currentPerformanceRisk", js.undefined)
    
    inline def setCurrentServiceConfiguration(value: ServiceConfiguration): Self = StObject.set(x, "currentServiceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCurrentServiceConfigurationUndefined: Self = StObject.set(x, "currentServiceConfiguration", js.undefined)
    
    inline def setFinding(value: ECSServiceRecommendationFinding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    inline def setFindingReasonCodes(value: ECSServiceRecommendationFindingReasonCodes): Self = StObject.set(x, "findingReasonCodes", value.asInstanceOf[js.Any])
    
    inline def setFindingReasonCodesUndefined: Self = StObject.set(x, "findingReasonCodes", js.undefined)
    
    inline def setFindingReasonCodesVarargs(value: ECSServiceRecommendationFindingReasonCode*): Self = StObject.set(x, "findingReasonCodes", js.Array(value*))
    
    inline def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    inline def setLastRefreshTimestamp(value: js.Date): Self = StObject.set(x, "lastRefreshTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastRefreshTimestampUndefined: Self = StObject.set(x, "lastRefreshTimestamp", js.undefined)
    
    inline def setLaunchType(value: ECSServiceLaunchType): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
    
    inline def setLaunchTypeUndefined: Self = StObject.set(x, "launchType", js.undefined)
    
    inline def setLookbackPeriodInDays(value: LookBackPeriodInDays): Self = StObject.set(x, "lookbackPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setLookbackPeriodInDaysUndefined: Self = StObject.set(x, "lookbackPeriodInDays", js.undefined)
    
    inline def setServiceArn(value: ServiceArn): Self = StObject.set(x, "serviceArn", value.asInstanceOf[js.Any])
    
    inline def setServiceArnUndefined: Self = StObject.set(x, "serviceArn", js.undefined)
    
    inline def setServiceRecommendationOptions(value: ECSServiceRecommendationOptions): Self = StObject.set(x, "serviceRecommendationOptions", value.asInstanceOf[js.Any])
    
    inline def setServiceRecommendationOptionsUndefined: Self = StObject.set(x, "serviceRecommendationOptions", js.undefined)
    
    inline def setServiceRecommendationOptionsVarargs(value: ECSServiceRecommendationOption*): Self = StObject.set(x, "serviceRecommendationOptions", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUtilizationMetrics(value: ECSServiceUtilizationMetrics): Self = StObject.set(x, "utilizationMetrics", value.asInstanceOf[js.Any])
    
    inline def setUtilizationMetricsUndefined: Self = StObject.set(x, "utilizationMetrics", js.undefined)
    
    inline def setUtilizationMetricsVarargs(value: ECSServiceUtilizationMetric*): Self = StObject.set(x, "utilizationMetrics", js.Array(value*))
  }
}
