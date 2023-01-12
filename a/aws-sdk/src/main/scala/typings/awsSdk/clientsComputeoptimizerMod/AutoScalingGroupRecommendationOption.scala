package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingGroupRecommendationOption extends StObject {
  
  /**
    * An array of objects that describe an Auto Scaling group configuration.
    */
  var configuration: js.UndefOr[AutoScalingGroupConfiguration] = js.undefined
  
  /**
    * The level of effort required to migrate from the current instance type to the recommended instance type. For example, the migration effort is Low if Amazon EMR is the inferred workload type and an Amazon Web Services Graviton instance type is recommended. The migration effort is Medium if a workload type couldn't be inferred but an Amazon Web Services Graviton instance type is recommended. The migration effort is VeryLow if both the current and recommended instance types are of the same CPU architecture.
    */
  var migrationEffort: js.UndefOr[MigrationEffort] = js.undefined
  
  /**
    * The performance risk of the Auto Scaling group configuration recommendation. Performance risk indicates the likelihood of the recommended instance type not meeting the resource needs of your workload. Compute Optimizer calculates an individual performance risk score for each specification of the recommended instance, including CPU, memory, EBS throughput, EBS IOPS, disk throughput, disk IOPS, network throughput, and network PPS. The performance risk of the recommended instance is calculated as the maximum performance risk score across the analyzed resource specifications. The value ranges from 0 - 4, with 0 meaning that the recommended resource is predicted to always provide enough hardware capability. The higher the performance risk is, the more likely you should validate whether the recommendation will meet the performance requirements of your workload before migrating your resource.
    */
  var performanceRisk: js.UndefOr[PerformanceRisk] = js.undefined
  
  /**
    * An array of objects that describe the projected utilization metrics of the Auto Scaling group recommendation option.  The Cpu and Memory metrics are the only projected utilization metrics returned. Additionally, the Memory metric is returned only for resources that have the unified CloudWatch agent installed on them. For more information, see Enabling Memory Utilization with the CloudWatch Agent. 
    */
  var projectedUtilizationMetrics: js.UndefOr[ProjectedUtilizationMetrics] = js.undefined
  
  /**
    * The rank of the Auto Scaling group recommendation option. The top recommendation option is ranked as 1.
    */
  var rank: js.UndefOr[Rank] = js.undefined
  
  /**
    * An object that describes the savings opportunity for the Auto Scaling group recommendation option. Savings opportunity includes the estimated monthly savings amount and percentage.
    */
  var savingsOpportunity: js.UndefOr[SavingsOpportunity] = js.undefined
}
object AutoScalingGroupRecommendationOption {
  
  inline def apply(): AutoScalingGroupRecommendationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingGroupRecommendationOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoScalingGroupRecommendationOption] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: AutoScalingGroupConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setMigrationEffort(value: MigrationEffort): Self = StObject.set(x, "migrationEffort", value.asInstanceOf[js.Any])
    
    inline def setMigrationEffortUndefined: Self = StObject.set(x, "migrationEffort", js.undefined)
    
    inline def setPerformanceRisk(value: PerformanceRisk): Self = StObject.set(x, "performanceRisk", value.asInstanceOf[js.Any])
    
    inline def setPerformanceRiskUndefined: Self = StObject.set(x, "performanceRisk", js.undefined)
    
    inline def setProjectedUtilizationMetrics(value: ProjectedUtilizationMetrics): Self = StObject.set(x, "projectedUtilizationMetrics", value.asInstanceOf[js.Any])
    
    inline def setProjectedUtilizationMetricsUndefined: Self = StObject.set(x, "projectedUtilizationMetrics", js.undefined)
    
    inline def setProjectedUtilizationMetricsVarargs(value: UtilizationMetric*): Self = StObject.set(x, "projectedUtilizationMetrics", js.Array(value*))
    
    inline def setRank(value: Rank): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    inline def setSavingsOpportunity(value: SavingsOpportunity): Self = StObject.set(x, "savingsOpportunity", value.asInstanceOf[js.Any])
    
    inline def setSavingsOpportunityUndefined: Self = StObject.set(x, "savingsOpportunity", js.undefined)
  }
}
