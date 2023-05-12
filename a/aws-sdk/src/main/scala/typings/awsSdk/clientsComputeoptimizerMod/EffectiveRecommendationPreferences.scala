package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectiveRecommendationPreferences extends StObject {
  
  /**
    * Describes the CPU vendor and architecture for an instance or Auto Scaling group recommendations. For example, when you specify AWS_ARM64 with:   A GetEC2InstanceRecommendations or GetAutoScalingGroupRecommendations request, Compute Optimizer returns recommendations that consist of Graviton2 instance types only.   A GetEC2RecommendationProjectedMetrics request, Compute Optimizer returns projected utilization metrics for Graviton2 instance type recommendations only.   A ExportEC2InstanceRecommendations or ExportAutoScalingGroupRecommendations request, Compute Optimizer exports recommendations that consist of Graviton2 instance types only.  
    */
  var cpuVendorArchitectures: js.UndefOr[CpuVendorArchitectures] = js.undefined
  
  /**
    * Describes the activation status of the enhanced infrastructure metrics preference. A status of Active confirms that the preference is applied in the latest recommendation refresh, and a status of Inactive confirms that it's not yet applied to recommendations. For more information, see Enhanced infrastructure metrics in the Compute Optimizer User Guide.
    */
  var enhancedInfrastructureMetrics: js.UndefOr[EnhancedInfrastructureMetrics] = js.undefined
  
  /**
    *  An object that describes the external metrics recommendation preference.   If the preference is applied in the latest recommendation refresh, an object with a valid source value appears in the response. If the preference isn't applied to the recommendations already, then this object doesn't appear in the response. 
    */
  var externalMetricsPreference: js.UndefOr[ExternalMetricsPreference] = js.undefined
  
  /**
    * Describes the activation status of the inferred workload types preference. A status of Active confirms that the preference is applied in the latest recommendation refresh. A status of Inactive confirms that it's not yet applied to recommendations.
    */
  var inferredWorkloadTypes: js.UndefOr[InferredWorkloadTypesPreference] = js.undefined
}
object EffectiveRecommendationPreferences {
  
  inline def apply(): EffectiveRecommendationPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectiveRecommendationPreferences]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EffectiveRecommendationPreferences] (val x: Self) extends AnyVal {
    
    inline def setCpuVendorArchitectures(value: CpuVendorArchitectures): Self = StObject.set(x, "cpuVendorArchitectures", value.asInstanceOf[js.Any])
    
    inline def setCpuVendorArchitecturesUndefined: Self = StObject.set(x, "cpuVendorArchitectures", js.undefined)
    
    inline def setCpuVendorArchitecturesVarargs(value: CpuVendorArchitecture*): Self = StObject.set(x, "cpuVendorArchitectures", js.Array(value*))
    
    inline def setEnhancedInfrastructureMetrics(value: EnhancedInfrastructureMetrics): Self = StObject.set(x, "enhancedInfrastructureMetrics", value.asInstanceOf[js.Any])
    
    inline def setEnhancedInfrastructureMetricsUndefined: Self = StObject.set(x, "enhancedInfrastructureMetrics", js.undefined)
    
    inline def setExternalMetricsPreference(value: ExternalMetricsPreference): Self = StObject.set(x, "externalMetricsPreference", value.asInstanceOf[js.Any])
    
    inline def setExternalMetricsPreferenceUndefined: Self = StObject.set(x, "externalMetricsPreference", js.undefined)
    
    inline def setInferredWorkloadTypes(value: InferredWorkloadTypesPreference): Self = StObject.set(x, "inferredWorkloadTypes", value.asInstanceOf[js.Any])
    
    inline def setInferredWorkloadTypesUndefined: Self = StObject.set(x, "inferredWorkloadTypes", js.undefined)
  }
}
