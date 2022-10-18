package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableAddOnRequest extends StObject {
  
  /**
    * An array of strings representing the add-on to enable or modify.
    */
  var addOnRequest: AddOnRequest
  
  /**
    * The name of the source resource for which to enable or modify the add-on.
    */
  var resourceName: ResourceName
}
object EnableAddOnRequest {
  
  inline def apply(addOnRequest: AddOnRequest, resourceName: ResourceName): EnableAddOnRequest = {
    val __obj = js.Dynamic.literal(addOnRequest = addOnRequest.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableAddOnRequest]
  }
  
  extension [Self <: EnableAddOnRequest](x: Self) {
    
    inline def setAddOnRequest(value: AddOnRequest): Self = StObject.set(x, "addOnRequest", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
  }
}
