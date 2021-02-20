package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayStatus extends StObject {
  
  /**
    * The current status.
    */
  var status: VirtualGatewayStatusCode = js.native
}
object VirtualGatewayStatus {
  
  @scala.inline
  def apply(status: VirtualGatewayStatusCode): VirtualGatewayStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayStatus]
  }
  
  @scala.inline
  implicit class VirtualGatewayStatusMutableBuilder[Self <: VirtualGatewayStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: VirtualGatewayStatusCode): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
