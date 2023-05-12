package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartGUISessionRequest extends StObject {
  
  /**
    * The resource name.
    */
  var resourceName: ResourceName
}
object StartGUISessionRequest {
  
  inline def apply(resourceName: ResourceName): StartGUISessionRequest = {
    val __obj = js.Dynamic.literal(resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartGUISessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartGUISessionRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
  }
}
