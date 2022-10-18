package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableAddOnRequest extends StObject {
  
  /**
    * The add-on type to disable.
    */
  var addOnType: AddOnType
  
  /**
    * The name of the source resource for which to disable the add-on.
    */
  var resourceName: ResourceName
}
object DisableAddOnRequest {
  
  inline def apply(addOnType: AddOnType, resourceName: ResourceName): DisableAddOnRequest = {
    val __obj = js.Dynamic.literal(addOnType = addOnType.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableAddOnRequest]
  }
  
  extension [Self <: DisableAddOnRequest](x: Self) {
    
    inline def setAddOnType(value: AddOnType): Self = StObject.set(x, "addOnType", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
  }
}
