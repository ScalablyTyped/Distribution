package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelServiceInstanceDeploymentOutput extends StObject {
  
  /**
    * The service instance summary data that's returned by Proton.
    */
  var serviceInstance: ServiceInstance
}
object CancelServiceInstanceDeploymentOutput {
  
  inline def apply(serviceInstance: ServiceInstance): CancelServiceInstanceDeploymentOutput = {
    val __obj = js.Dynamic.literal(serviceInstance = serviceInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelServiceInstanceDeploymentOutput]
  }
  
  extension [Self <: CancelServiceInstanceDeploymentOutput](x: Self) {
    
    inline def setServiceInstance(value: ServiceInstance): Self = StObject.set(x, "serviceInstance", value.asInstanceOf[js.Any])
  }
}
