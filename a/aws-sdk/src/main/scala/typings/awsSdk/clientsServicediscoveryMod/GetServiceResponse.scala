package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceResponse extends StObject {
  
  /**
    * A complex type that contains information about the service.
    */
  var Service: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.Service] = js.undefined
}
object GetServiceResponse {
  
  inline def apply(): GetServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceResponse]
  }
  
  extension [Self <: GetServiceResponse](x: Self) {
    
    inline def setService(value: Service): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "Service", js.undefined)
  }
}
