package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEventIntegrationRequest extends StObject {
  
  /**
    * The description of the event inegration.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.Description] = js.undefined
  
  /**
    * The name of the event integration.
    */
  var Name: typings.awsSdk.clientsAppintegrationsMod.Name
}
object UpdateEventIntegrationRequest {
  
  inline def apply(Name: Name): UpdateEventIntegrationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEventIntegrationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEventIntegrationRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
