package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceRequest extends StObject {
  
  /**
    * The ID of the service that you want to get settings for.
    */
  var Id: ResourceId
}
object GetServiceRequest {
  
  inline def apply(Id: ResourceId): GetServiceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceRequest]
  }
  
  extension [Self <: GetServiceRequest](x: Self) {
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
