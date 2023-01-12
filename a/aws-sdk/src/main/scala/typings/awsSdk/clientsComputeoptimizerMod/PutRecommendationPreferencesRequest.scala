package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRecommendationPreferencesRequest extends StObject {
  
  /**
    * The status of the enhanced infrastructure metrics recommendation preference to create or update. Specify the Active status to activate the preference, or specify Inactive to deactivate the preference. For more information, see Enhanced infrastructure metrics in the Compute Optimizer User Guide.
    */
  var enhancedInfrastructureMetrics: js.UndefOr[EnhancedInfrastructureMetrics] = js.undefined
  
  /**
    * The status of the inferred workload types recommendation preference to create or update.  The inferred workload type feature is active by default. To deactivate it, create a recommendation preference.  Specify the Inactive status to deactivate the feature, or specify Active to activate it. For more information, see Inferred workload types in the Compute Optimizer User Guide.
    */
  var inferredWorkloadTypes: js.UndefOr[InferredWorkloadTypesPreference] = js.undefined
  
  /**
    * The target resource type of the recommendation preference to create. The Ec2Instance option encompasses standalone instances and instances that are part of Auto Scaling groups. The AutoScalingGroup option encompasses only instances that are part of an Auto Scaling group.  The valid values for this parameter are Ec2Instance and AutoScalingGroup. 
    */
  var resourceType: ResourceType
  
  /**
    * An object that describes the scope of the recommendation preference to create. You can create recommendation preferences at the organization level (for management accounts of an organization only), account level, and resource level. For more information, see Activating enhanced infrastructure metrics in the Compute Optimizer User Guide.  You cannot create recommendation preferences for Auto Scaling groups at the organization and account levels. You can create recommendation preferences for Auto Scaling groups only at the resource level by specifying a scope name of ResourceArn and a scope value of the Auto Scaling group Amazon Resource Name (ARN). This will configure the preference for all instances that are part of the specified Auto Scaling group. You also cannot create recommendation preferences at the resource level for instances that are part of an Auto Scaling group. You can create recommendation preferences at the resource level only for standalone instances. 
    */
  var scope: js.UndefOr[Scope] = js.undefined
}
object PutRecommendationPreferencesRequest {
  
  inline def apply(resourceType: ResourceType): PutRecommendationPreferencesRequest = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecommendationPreferencesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRecommendationPreferencesRequest] (val x: Self) extends AnyVal {
    
    inline def setEnhancedInfrastructureMetrics(value: EnhancedInfrastructureMetrics): Self = StObject.set(x, "enhancedInfrastructureMetrics", value.asInstanceOf[js.Any])
    
    inline def setEnhancedInfrastructureMetricsUndefined: Self = StObject.set(x, "enhancedInfrastructureMetrics", js.undefined)
    
    inline def setInferredWorkloadTypes(value: InferredWorkloadTypesPreference): Self = StObject.set(x, "inferredWorkloadTypes", value.asInstanceOf[js.Any])
    
    inline def setInferredWorkloadTypesUndefined: Self = StObject.set(x, "inferredWorkloadTypes", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
