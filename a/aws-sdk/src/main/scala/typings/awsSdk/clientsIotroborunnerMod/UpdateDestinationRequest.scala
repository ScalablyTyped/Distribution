package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDestinationRequest extends StObject {
  
  var additionalFixedProperties: js.UndefOr[DestinationAdditionalFixedProperties] = js.undefined
  
  var id: DestinationGenericIdentifier
  
  var name: js.UndefOr[Name] = js.undefined
  
  var state: js.UndefOr[DestinationState] = js.undefined
}
object UpdateDestinationRequest {
  
  inline def apply(id: DestinationGenericIdentifier): UpdateDestinationRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDestinationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDestinationRequest] (val x: Self) extends AnyVal {
    
    inline def setAdditionalFixedProperties(value: DestinationAdditionalFixedProperties): Self = StObject.set(x, "additionalFixedProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFixedPropertiesUndefined: Self = StObject.set(x, "additionalFixedProperties", js.undefined)
    
    inline def setId(value: DestinationGenericIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: DestinationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
