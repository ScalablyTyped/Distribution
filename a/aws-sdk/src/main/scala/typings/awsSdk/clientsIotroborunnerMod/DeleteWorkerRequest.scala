package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkerRequest extends StObject {
  
  var id: WorkerGenericIdentifier
}
object DeleteWorkerRequest {
  
  inline def apply(id: WorkerGenericIdentifier): DeleteWorkerRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteWorkerRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: WorkerGenericIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
