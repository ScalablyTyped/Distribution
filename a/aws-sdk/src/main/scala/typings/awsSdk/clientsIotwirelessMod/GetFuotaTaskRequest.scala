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
  
  extension [Self <: GetFuotaTaskRequest](x: Self) {
    
    inline def setId(value: FuotaTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
