package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceInstanceOutput extends StObject {
  
  /**
    * The service instance summary data that's returned by Proton.
    */
  var serviceInstance: ServiceInstance
}
object UpdateServiceInstanceOutput {
  
  inline def apply(serviceInstance: ServiceInstance): UpdateServiceInstanceOutput = {
    val __obj = js.Dynamic.literal(serviceInstance = serviceInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceInstanceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateServiceInstanceOutput] (val x: Self) extends AnyVal {
    
    inline def setServiceInstance(value: ServiceInstance): Self = StObject.set(x, "serviceInstance", value.asInstanceOf[js.Any])
  }
}
