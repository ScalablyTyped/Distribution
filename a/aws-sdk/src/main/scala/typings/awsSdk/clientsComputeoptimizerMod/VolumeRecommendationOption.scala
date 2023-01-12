package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeRecommendationOption extends StObject {
  
  /**
    * An array of objects that describe a volume configuration.
    */
  var configuration: js.UndefOr[VolumeConfiguration] = js.undefined
  
  /**
    * The performance risk of the volume recommendation option. Performance risk is the likelihood of the recommended volume type meeting the performance requirement of your workload. The value ranges from 0 - 4, with 0 meaning that the recommended resource is predicted to always provide enough hardware capability. The higher the performance risk is, the more likely you should validate whether the recommendation will meet the performance requirements of your workload before migrating your resource.
    */
  var performanceRisk: js.UndefOr[PerformanceRisk] = js.undefined
  
  /**
    * The rank of the volume recommendation option. The top recommendation option is ranked as 1.
    */
  var rank: js.UndefOr[Rank] = js.undefined
  
  /**
    * An object that describes the savings opportunity for the EBS volume recommendation option. Savings opportunity includes the estimated monthly savings amount and percentage.
    */
  var savingsOpportunity: js.UndefOr[SavingsOpportunity] = js.undefined
}
object VolumeRecommendationOption {
  
  inline def apply(): VolumeRecommendationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeRecommendationOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VolumeRecommendationOption] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: VolumeConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setPerformanceRisk(value: PerformanceRisk): Self = StObject.set(x, "performanceRisk", value.asInstanceOf[js.Any])
    
    inline def setPerformanceRiskUndefined: Self = StObject.set(x, "performanceRisk", js.undefined)
    
    inline def setRank(value: Rank): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    inline def setSavingsOpportunity(value: SavingsOpportunity): Self = StObject.set(x, "savingsOpportunity", value.asInstanceOf[js.Any])
    
    inline def setSavingsOpportunityUndefined: Self = StObject.set(x, "savingsOpportunity", js.undefined)
  }
}
