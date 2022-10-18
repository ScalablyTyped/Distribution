package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMulticastGroupRequest extends StObject {
  
  var Id: MulticastGroupId
}
object DeleteMulticastGroupRequest {
  
  inline def apply(Id: MulticastGroupId): DeleteMulticastGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMulticastGroupRequest]
  }
  
  extension [Self <: DeleteMulticastGroupRequest](x: Self) {
    
    inline def setId(value: MulticastGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
