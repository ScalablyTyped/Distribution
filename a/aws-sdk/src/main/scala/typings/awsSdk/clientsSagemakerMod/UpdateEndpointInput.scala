package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointInput extends StObject {
  
  /**
    * The deployment configuration for an endpoint, which contains the desired deployment strategy and rollback configurations.
    */
  var DeploymentConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DeploymentConfig] = js.undefined
  
  /**
    * The name of the new endpoint configuration.
    */
  var EndpointConfigName: typings.awsSdk.clientsSagemakerMod.EndpointConfigName
  
  /**
    * The name of the endpoint whose configuration you want to update.
    */
  var EndpointName: typings.awsSdk.clientsSagemakerMod.EndpointName
  
  /**
    * When you are updating endpoint resources with UpdateEndpointInput$RetainAllVariantProperties, whose value is set to true, ExcludeRetainedVariantProperties specifies the list of type VariantProperty to override with the values provided by EndpointConfig. If you don't specify a value for ExcludeAllVariantProperties, no variant properties are overridden. 
    */
  var ExcludeRetainedVariantProperties: js.UndefOr[VariantPropertyList] = js.undefined
  
  /**
    * When updating endpoint resources, enables or disables the retention of variant properties, such as the instance count or the variant weight. To retain the variant properties of an endpoint when updating it, set RetainAllVariantProperties to true. To use the variant properties specified in a new EndpointConfig call when updating an endpoint, set RetainAllVariantProperties to false. The default is false.
    */
  var RetainAllVariantProperties: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to reuse the last deployment configuration. The default value is false (the configuration is not reused).
    */
  var RetainDeploymentConfig: js.UndefOr[Boolean] = js.undefined
}
object UpdateEndpointInput {
  
  inline def apply(EndpointConfigName: EndpointConfigName, EndpointName: EndpointName): UpdateEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEndpointInput] (val x: Self) extends AnyVal {
    
    inline def setDeploymentConfig(value: DeploymentConfig): Self = StObject.set(x, "DeploymentConfig", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigUndefined: Self = StObject.set(x, "DeploymentConfig", js.undefined)
    
    inline def setEndpointConfigName(value: EndpointConfigName): Self = StObject.set(x, "EndpointConfigName", value.asInstanceOf[js.Any])
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setExcludeRetainedVariantProperties(value: VariantPropertyList): Self = StObject.set(x, "ExcludeRetainedVariantProperties", value.asInstanceOf[js.Any])
    
    inline def setExcludeRetainedVariantPropertiesUndefined: Self = StObject.set(x, "ExcludeRetainedVariantProperties", js.undefined)
    
    inline def setExcludeRetainedVariantPropertiesVarargs(value: VariantProperty*): Self = StObject.set(x, "ExcludeRetainedVariantProperties", js.Array(value*))
    
    inline def setRetainAllVariantProperties(value: Boolean): Self = StObject.set(x, "RetainAllVariantProperties", value.asInstanceOf[js.Any])
    
    inline def setRetainAllVariantPropertiesUndefined: Self = StObject.set(x, "RetainAllVariantProperties", js.undefined)
    
    inline def setRetainDeploymentConfig(value: Boolean): Self = StObject.set(x, "RetainDeploymentConfig", value.asInstanceOf[js.Any])
    
    inline def setRetainDeploymentConfigUndefined: Self = StObject.set(x, "RetainDeploymentConfig", js.undefined)
  }
}
