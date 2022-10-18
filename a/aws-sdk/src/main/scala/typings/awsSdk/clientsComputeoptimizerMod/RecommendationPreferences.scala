package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationPreferences extends StObject {
  
  /**
    * Specifies the CPU vendor and architecture for Amazon EC2 instance and Auto Scaling group recommendations. For example, when you specify AWS_ARM64 with:   A GetEC2InstanceRecommendations or GetAutoScalingGroupRecommendations request, Compute Optimizer returns recommendations that consist of Graviton2 instance types only.   A GetEC2RecommendationProjectedMetrics request, Compute Optimizer returns projected utilization metrics for Graviton2 instance type recommendations only.   A ExportEC2InstanceRecommendations or ExportAutoScalingGroupRecommendations request, Compute Optimizer exports recommendations that consist of Graviton2 instance types only.  
    */
  var cpuVendorArchitectures: js.UndefOr[CpuVendorArchitectures] = js.undefined
}
object RecommendationPreferences {
  
  inline def apply(): RecommendationPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationPreferences]
  }
  
  extension [Self <: RecommendationPreferences](x: Self) {
    
    inline def setCpuVendorArchitectures(value: CpuVendorArchitectures): Self = StObject.set(x, "cpuVendorArchitectures", value.asInstanceOf[js.Any])
    
    inline def setCpuVendorArchitecturesUndefined: Self = StObject.set(x, "cpuVendorArchitectures", js.undefined)
    
    inline def setCpuVendorArchitecturesVarargs(value: CpuVendorArchitecture*): Self = StObject.set(x, "cpuVendorArchitectures", js.Array(value*))
  }
}
