package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerServiceEndpoint extends StObject {
  
  /**
    * The name of the container entry of the deployment that the endpoint configuration applies to.
    */
  var containerName: js.UndefOr[String] = js.undefined
  
  /**
    * The port of the specified container to which traffic is forwarded to.
    */
  var containerPort: js.UndefOr[integer] = js.undefined
  
  /**
    * An object that describes the health check configuration of the container.
    */
  var healthCheck: js.UndefOr[ContainerServiceHealthCheckConfig] = js.undefined
}
object ContainerServiceEndpoint {
  
  inline def apply(): ContainerServiceEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServiceEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerServiceEndpoint] (val x: Self) extends AnyVal {
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setContainerPort(value: integer): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    inline def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
    
    inline def setHealthCheck(value: ContainerServiceHealthCheckConfig): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
  }
}
