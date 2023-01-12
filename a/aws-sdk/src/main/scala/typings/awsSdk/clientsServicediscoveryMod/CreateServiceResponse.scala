package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceResponse extends StObject {
  
  /**
    * A complex type that contains information about the new service.
    */
  var Service: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.Service] = js.undefined
}
object CreateServiceResponse {
  
  inline def apply(): CreateServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateServiceResponse] (val x: Self) extends AnyVal {
    
    inline def setService(value: Service): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "Service", js.undefined)
  }
}
