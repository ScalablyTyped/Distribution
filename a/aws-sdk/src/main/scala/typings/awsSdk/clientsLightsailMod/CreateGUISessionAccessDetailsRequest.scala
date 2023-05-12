package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGUISessionAccessDetailsRequest extends StObject {
  
  /**
    * The resource name.
    */
  var resourceName: ResourceName
}
object CreateGUISessionAccessDetailsRequest {
  
  inline def apply(resourceName: ResourceName): CreateGUISessionAccessDetailsRequest = {
    val __obj = js.Dynamic.literal(resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGUISessionAccessDetailsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGUISessionAccessDetailsRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
  }
}
