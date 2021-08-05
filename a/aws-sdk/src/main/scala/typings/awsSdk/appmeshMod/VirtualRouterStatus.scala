package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualRouterStatus extends StObject {
  
  /**
    * The current status of the virtual router.
    */
  var status: VirtualRouterStatusCode
}
object VirtualRouterStatus {
  
  inline def apply(status: VirtualRouterStatusCode): VirtualRouterStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterStatus]
  }
  
  extension [Self <: VirtualRouterStatus](x: Self) {
    
    inline def setStatus(value: VirtualRouterStatusCode): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
