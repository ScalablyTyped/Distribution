package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkerFleetRequest extends StObject {
  
  var id: WorkerFleetGenericIdentifier
}
object GetWorkerFleetRequest {
  
  inline def apply(id: WorkerFleetGenericIdentifier): GetWorkerFleetRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkerFleetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWorkerFleetRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: WorkerFleetGenericIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
