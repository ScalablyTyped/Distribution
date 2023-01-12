package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteContainerServiceRequest extends StObject {
  
  /**
    * The name of the container service to delete.
    */
  var serviceName: ContainerServiceName
}
object DeleteContainerServiceRequest {
  
  inline def apply(serviceName: ContainerServiceName): DeleteContainerServiceRequest = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContainerServiceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteContainerServiceRequest] (val x: Self) extends AnyVal {
    
    inline def setServiceName(value: ContainerServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
