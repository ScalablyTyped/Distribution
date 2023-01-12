package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEventIntegrationRequest extends StObject {
  
  /**
    * The name of the event integration. 
    */
  var Name: typings.awsSdk.clientsAppintegrationsMod.Name
}
object GetEventIntegrationRequest {
  
  inline def apply(Name: Name): GetEventIntegrationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventIntegrationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEventIntegrationRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
