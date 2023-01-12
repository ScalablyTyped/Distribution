package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMulticastGroupSessionRequest extends StObject {
  
  var Id: MulticastGroupId
}
object GetMulticastGroupSessionRequest {
  
  inline def apply(Id: MulticastGroupId): GetMulticastGroupSessionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMulticastGroupSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMulticastGroupSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: MulticastGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
