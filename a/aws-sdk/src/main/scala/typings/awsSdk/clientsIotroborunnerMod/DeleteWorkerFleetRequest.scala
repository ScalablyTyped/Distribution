package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkerFleetRequest extends StObject {
  
  var id: WorkerFleetGenericIdentifier
}
object DeleteWorkerFleetRequest {
  
  inline def apply(id: WorkerFleetGenericIdentifier): DeleteWorkerFleetRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkerFleetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteWorkerFleetRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: WorkerFleetGenericIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
