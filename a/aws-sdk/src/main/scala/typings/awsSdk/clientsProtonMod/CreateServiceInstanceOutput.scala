package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceInstanceOutput extends StObject {
  
  /**
    * The detailed data of the service instance being created.
    */
  var serviceInstance: ServiceInstance
}
object CreateServiceInstanceOutput {
  
  inline def apply(serviceInstance: ServiceInstance): CreateServiceInstanceOutput = {
    val __obj = js.Dynamic.literal(serviceInstance = serviceInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceInstanceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateServiceInstanceOutput] (val x: Self) extends AnyVal {
    
    inline def setServiceInstance(value: ServiceInstance): Self = StObject.set(x, "serviceInstance", value.asInstanceOf[js.Any])
  }
}
