package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeStatus extends StObject {
  
  /**
    * The current status of the virtual node.
    */
  var status: VirtualNodeStatusCode = js.native
}
object VirtualNodeStatus {
  
  @scala.inline
  def apply(status: VirtualNodeStatusCode): VirtualNodeStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeStatus]
  }
  
  @scala.inline
  implicit class VirtualNodeStatusMutableBuilder[Self <: VirtualNodeStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: VirtualNodeStatusCode): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
