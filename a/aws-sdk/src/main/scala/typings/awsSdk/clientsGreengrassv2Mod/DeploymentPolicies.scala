package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentPolicies extends StObject {
  
  /**
    * The component update policy for the configuration deployment. This policy defines when it's safe to deploy the configuration to devices.
    */
  var componentUpdatePolicy: js.UndefOr[DeploymentComponentUpdatePolicy] = js.undefined
  
  /**
    * The configuration validation policy for the configuration deployment. This policy defines how long each component has to validate its configure updates.
    */
  var configurationValidationPolicy: js.UndefOr[DeploymentConfigurationValidationPolicy] = js.undefined
  
  /**
    * The failure handling policy for the configuration deployment. This policy defines what to do if the deployment fails. Default: ROLLBACK 
    */
  var failureHandlingPolicy: js.UndefOr[DeploymentFailureHandlingPolicy] = js.undefined
}
object DeploymentPolicies {
  
  inline def apply(): DeploymentPolicies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentPolicies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentPolicies] (val x: Self) extends AnyVal {
    
    inline def setComponentUpdatePolicy(value: DeploymentComponentUpdatePolicy): Self = StObject.set(x, "componentUpdatePolicy", value.asInstanceOf[js.Any])
    
    inline def setComponentUpdatePolicyUndefined: Self = StObject.set(x, "componentUpdatePolicy", js.undefined)
    
    inline def setConfigurationValidationPolicy(value: DeploymentConfigurationValidationPolicy): Self = StObject.set(x, "configurationValidationPolicy", value.asInstanceOf[js.Any])
    
    inline def setConfigurationValidationPolicyUndefined: Self = StObject.set(x, "configurationValidationPolicy", js.undefined)
    
    inline def setFailureHandlingPolicy(value: DeploymentFailureHandlingPolicy): Self = StObject.set(x, "failureHandlingPolicy", value.asInstanceOf[js.Any])
    
    inline def setFailureHandlingPolicyUndefined: Self = StObject.set(x, "failureHandlingPolicy", js.undefined)
  }
}
