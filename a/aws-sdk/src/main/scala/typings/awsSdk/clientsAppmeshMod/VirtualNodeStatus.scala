package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeStatus extends StObject {
  
  /**
    * The current status of the virtual node.
    */
  var status: VirtualNodeStatusCode
}
object VirtualNodeStatus {
  
  inline def apply(status: VirtualNodeStatusCode): VirtualNodeStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualNodeStatus] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: VirtualNodeStatusCode): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
