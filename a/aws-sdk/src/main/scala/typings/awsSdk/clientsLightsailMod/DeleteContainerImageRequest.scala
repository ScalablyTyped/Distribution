package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteContainerImageRequest extends StObject {
  
  /**
    * The name of the container image to delete from the container service. Use the GetContainerImages action to get the name of the container images that are registered to a container service.  Container images sourced from your Lightsail container service, that are registered and stored on your service, start with a colon (:). For example, :container-service-1.mystaticwebsite.1. Container images sourced from a public registry like Docker Hub don't start with a colon. For example, nginx:latest or nginx. 
    */
  var image: String
  
  /**
    * The name of the container service for which to delete a registered container image.
    */
  var serviceName: ContainerServiceName
}
object DeleteContainerImageRequest {
  
  inline def apply(image: String, serviceName: ContainerServiceName): DeleteContainerImageRequest = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContainerImageRequest]
  }
  
  extension [Self <: DeleteContainerImageRequest](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ContainerServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
