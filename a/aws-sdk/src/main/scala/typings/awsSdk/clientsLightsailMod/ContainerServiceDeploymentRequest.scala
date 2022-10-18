package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerServiceDeploymentRequest extends StObject {
  
  /**
    * An object that describes the configuration for the containers of the deployment.
    */
  var containers: js.UndefOr[ContainerMap] = js.undefined
  
  /**
    * An object that describes the endpoint of the deployment.
    */
  var publicEndpoint: js.UndefOr[EndpointRequest] = js.undefined
}
object ContainerServiceDeploymentRequest {
  
  inline def apply(): ContainerServiceDeploymentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServiceDeploymentRequest]
  }
  
  extension [Self <: ContainerServiceDeploymentRequest](x: Self) {
    
    inline def setContainers(value: ContainerMap): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setPublicEndpoint(value: EndpointRequest): Self = StObject.set(x, "publicEndpoint", value.asInstanceOf[js.Any])
    
    inline def setPublicEndpointUndefined: Self = StObject.set(x, "publicEndpoint", js.undefined)
  }
}
