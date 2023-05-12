package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkerFleetResponse extends StObject {
  
  var arn: WorkerFleetArn
  
  var createdAt: js.Date
  
  var id: WorkerFleetId
  
  var updatedAt: js.Date
}
object CreateWorkerFleetResponse {
  
  inline def apply(arn: WorkerFleetArn, createdAt: js.Date, id: WorkerFleetId, updatedAt: js.Date): CreateWorkerFleetResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkerFleetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorkerFleetResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: WorkerFleetArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setId(value: WorkerFleetId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
