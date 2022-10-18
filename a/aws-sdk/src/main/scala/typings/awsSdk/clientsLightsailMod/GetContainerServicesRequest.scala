package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerServicesRequest extends StObject {
  
  /**
    * The name of the container service for which to return information. When omitted, the response includes all of your container services in the Amazon Web Services Region where the request is made.
    */
  var serviceName: js.UndefOr[ContainerServiceName] = js.undefined
}
object GetContainerServicesRequest {
  
  inline def apply(): GetContainerServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerServicesRequest]
  }
  
  extension [Self <: GetContainerServicesRequest](x: Self) {
    
    inline def setServiceName(value: ContainerServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
