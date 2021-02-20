package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSmartHomeApplianceDiscoveryRequest extends StObject {
  
  /**
    * The room where smart home appliance discovery was initiated.
    */
  var RoomArn: Arn = js.native
}
object StartSmartHomeApplianceDiscoveryRequest {
  
  @scala.inline
  def apply(RoomArn: Arn): StartSmartHomeApplianceDiscoveryRequest = {
    val __obj = js.Dynamic.literal(RoomArn = RoomArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSmartHomeApplianceDiscoveryRequest]
  }
  
  @scala.inline
  implicit class StartSmartHomeApplianceDiscoveryRequestMutableBuilder[Self <: StartSmartHomeApplianceDiscoveryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
  }
}
