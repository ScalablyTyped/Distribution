package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopBgpFailoverTestRequest extends StObject {
  
  /**
    * The ID of the virtual interface you no longer want to test.
    */
  var virtualInterfaceId: VirtualInterfaceId
}
object StopBgpFailoverTestRequest {
  
  inline def apply(virtualInterfaceId: VirtualInterfaceId): StopBgpFailoverTestRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopBgpFailoverTestRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopBgpFailoverTestRequest] (val x: Self) extends AnyVal {
    
    inline def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
  }
}
