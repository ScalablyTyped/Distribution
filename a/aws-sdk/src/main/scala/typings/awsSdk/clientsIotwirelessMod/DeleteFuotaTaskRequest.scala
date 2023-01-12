package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFuotaTaskRequest extends StObject {
  
  var Id: FuotaTaskId
}
object DeleteFuotaTaskRequest {
  
  inline def apply(Id: FuotaTaskId): DeleteFuotaTaskRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFuotaTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFuotaTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: FuotaTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
