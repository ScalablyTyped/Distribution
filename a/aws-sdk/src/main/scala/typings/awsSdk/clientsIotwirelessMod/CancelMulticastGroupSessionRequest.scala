package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelMulticastGroupSessionRequest extends StObject {
  
  var Id: MulticastGroupId
}
object CancelMulticastGroupSessionRequest {
  
  inline def apply(Id: MulticastGroupId): CancelMulticastGroupSessionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelMulticastGroupSessionRequest]
  }
  
  extension [Self <: CancelMulticastGroupSessionRequest](x: Self) {
    
    inline def setId(value: MulticastGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
