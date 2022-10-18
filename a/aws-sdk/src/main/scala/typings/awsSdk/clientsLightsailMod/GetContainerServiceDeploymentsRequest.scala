package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerServiceDeploymentsRequest extends StObject {
  
  /**
    * The name of the container service for which to return deployments.
    */
  var serviceName: ContainerServiceName
}
object GetContainerServiceDeploymentsRequest {
  
  inline def apply(serviceName: ContainerServiceName): GetContainerServiceDeploymentsRequest = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerServiceDeploymentsRequest]
  }
  
  extension [Self <: GetContainerServiceDeploymentsRequest](x: Self) {
    
    inline def setServiceName(value: ContainerServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
