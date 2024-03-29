package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEffectiveRecommendationPreferencesResponse extends StObject {
  
  /**
    * The status of the enhanced infrastructure metrics recommendation preference. Considers all applicable preferences that you might have set at the resource, account, and organization level. A status of Active confirms that the preference is applied in the latest recommendation refresh, and a status of Inactive confirms that it's not yet applied to recommendations. To validate whether the preference is applied to your last generated set of recommendations, review the effectiveRecommendationPreferences value in the response of the GetAutoScalingGroupRecommendations and GetEC2InstanceRecommendations actions. For more information, see Enhanced infrastructure metrics in the Compute Optimizer User Guide.
    */
  var enhancedInfrastructureMetrics: js.UndefOr[EnhancedInfrastructureMetrics] = js.undefined
  
  /**
    * The provider of the external metrics recommendation preference. Considers all applicable preferences that you might have set at the account and organization level. If the preference is applied in the latest recommendation refresh, an object with a valid source value appears in the response. If the preference isn't applied to the recommendations already, then this object doesn't appear in the response. To validate whether the preference is applied to your last generated set of recommendations, review the effectiveRecommendationPreferences value in the response of the GetEC2InstanceRecommendations actions. For more information, see Enhanced infrastructure metrics in the Compute Optimizer User Guide.
    */
  var externalMetricsPreference: js.UndefOr[ExternalMetricsPreference] = js.undefined
}
object GetEffectiveRecommendationPreferencesResponse {
  
  inline def apply(): GetEffectiveRecommendationPreferencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEffectiveRecommendationPreferencesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEffectiveRecommendationPreferencesResponse] (val x: Self) extends AnyVal {
    
    inline def setEnhancedInfrastructureMetrics(value: EnhancedInfrastructureMetrics): Self = StObject.set(x, "enhancedInfrastructureMetrics", value.asInstanceOf[js.Any])
    
    inline def setEnhancedInfrastructureMetricsUndefined: Self = StObject.set(x, "enhancedInfrastructureMetrics", js.undefined)
    
    inline def setExternalMetricsPreference(value: ExternalMetricsPreference): Self = StObject.set(x, "externalMetricsPreference", value.asInstanceOf[js.Any])
    
    inline def setExternalMetricsPreferenceUndefined: Self = StObject.set(x, "externalMetricsPreference", js.undefined)
  }
}
