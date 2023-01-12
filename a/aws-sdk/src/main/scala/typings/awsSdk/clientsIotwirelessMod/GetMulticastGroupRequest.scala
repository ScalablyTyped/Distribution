package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMulticastGroupRequest extends StObject {
  
  var Id: MulticastGroupId
}
object GetMulticastGroupRequest {
  
  inline def apply(Id: MulticastGroupId): GetMulticastGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMulticastGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMulticastGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: MulticastGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
