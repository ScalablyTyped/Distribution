package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkerFleetRequest extends StObject {
  
  var additionalFixedProperties: js.UndefOr[WorkerFleetAdditionalFixedProperties] = js.undefined
  
  var id: WorkerFleetGenericIdentifier
  
  var name: js.UndefOr[Name] = js.undefined
}
object UpdateWorkerFleetRequest {
  
  inline def apply(id: WorkerFleetGenericIdentifier): UpdateWorkerFleetRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkerFleetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorkerFleetRequest] (val x: Self) extends AnyVal {
    
    inline def setAdditionalFixedProperties(value: WorkerFleetAdditionalFixedProperties): Self = StObject.set(x, "additionalFixedProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFixedPropertiesUndefined: Self = StObject.set(x, "additionalFixedProperties", js.undefined)
    
    inline def setId(value: WorkerFleetGenericIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
