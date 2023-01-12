package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventIntegrationRequest extends StObject {
  
  /**
    * The name of the event integration.
    */
  var Name: typings.awsSdk.clientsAppintegrationsMod.Name
}
object DeleteEventIntegrationRequest {
  
  inline def apply(Name: Name): DeleteEventIntegrationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventIntegrationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEventIntegrationRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
