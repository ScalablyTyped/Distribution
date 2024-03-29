package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerImagesRequest extends StObject {
  
  /**
    * The name of the container service for which to return registered container images.
    */
  var serviceName: ContainerServiceName
}
object GetContainerImagesRequest {
  
  inline def apply(serviceName: ContainerServiceName): GetContainerImagesRequest = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerImagesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetContainerImagesRequest] (val x: Self) extends AnyVal {
    
    inline def setServiceName(value: ContainerServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
