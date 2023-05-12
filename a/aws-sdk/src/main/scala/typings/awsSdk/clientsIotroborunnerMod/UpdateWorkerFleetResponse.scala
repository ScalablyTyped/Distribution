package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkerFleetResponse extends StObject {
  
  var additionalFixedProperties: js.UndefOr[WorkerFleetAdditionalFixedProperties] = js.undefined
  
  var arn: WorkerFleetArn
  
  var id: WorkerFleetId
  
  var name: Name
  
  var updatedAt: js.Date
}
object UpdateWorkerFleetResponse {
  
  inline def apply(arn: WorkerFleetArn, id: WorkerFleetId, name: Name, updatedAt: js.Date): UpdateWorkerFleetResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkerFleetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorkerFleetResponse] (val x: Self) extends AnyVal {
    
    inline def setAdditionalFixedProperties(value: WorkerFleetAdditionalFixedProperties): Self = StObject.set(x, "additionalFixedProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFixedPropertiesUndefined: Self = StObject.set(x, "additionalFixedProperties", js.undefined)
    
    inline def setArn(value: WorkerFleetArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setId(value: WorkerFleetId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
