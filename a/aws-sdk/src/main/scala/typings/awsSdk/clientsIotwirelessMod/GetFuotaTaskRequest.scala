package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFuotaTaskRequest extends StObject {
  
  var Id: FuotaTaskId
}
object GetFuotaTaskRequest {
  
  inline def apply(Id: FuotaTaskId): GetFuotaTaskRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFuotaTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFuotaTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: FuotaTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
