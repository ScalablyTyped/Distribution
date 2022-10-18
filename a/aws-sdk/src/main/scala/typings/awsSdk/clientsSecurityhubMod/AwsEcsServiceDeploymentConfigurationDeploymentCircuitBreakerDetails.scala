package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsServiceDeploymentConfigurationDeploymentCircuitBreakerDetails extends StObject {
  
  /**
    * Whether to enable the deployment circuit breaker logic for the service.
    */
  var Enable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to roll back the service if a service deployment fails. If rollback is enabled, when a service deployment fails, the service is rolled back to the last deployment that completed successfully.
    */
  var Rollback: js.UndefOr[Boolean] = js.undefined
}
object AwsEcsServiceDeploymentConfigurationDeploymentCircuitBreakerDetails {
  
  inline def apply(): AwsEcsServiceDeploymentConfigurationDeploymentCircuitBreakerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsServiceDeploymentConfigurationDeploymentCircuitBreakerDetails]
  }
  
  extension [Self <: AwsEcsServiceDeploymentConfigurationDeploymentCircuitBreakerDetails](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "Enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "Enable", js.undefined)
    
    inline def setRollback(value: Boolean): Self = StObject.set(x, "Rollback", value.asInstanceOf[js.Any])
    
    inline def setRollbackUndefined: Self = StObject.set(x, "Rollback", js.undefined)
  }
}
