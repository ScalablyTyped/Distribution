package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkerRequest extends StObject {
  
  var id: WorkerGenericIdentifier
}
object GetWorkerRequest {
  
  inline def apply(id: WorkerGenericIdentifier): GetWorkerRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWorkerRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: WorkerGenericIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
