package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualServiceStatus extends StObject {
  
  /**
    * The current status of the virtual service.
    */
  var status: VirtualServiceStatusCode
}
object VirtualServiceStatus {
  
  inline def apply(status: VirtualServiceStatusCode): VirtualServiceStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualServiceStatus] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: VirtualServiceStatusCode): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
