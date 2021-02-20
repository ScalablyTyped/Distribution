package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateDeviceWithRoomRequest extends StObject {
  
  /**
    * The ARN of the device to associate to a room. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ARN of the room with which to associate the device. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
}
object AssociateDeviceWithRoomRequest {
  
  @scala.inline
  def apply(): AssociateDeviceWithRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateDeviceWithRoomRequest]
  }
  
  @scala.inline
  implicit class AssociateDeviceWithRoomRequestMutableBuilder[Self <: AssociateDeviceWithRoomRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceArnUndefined: Self = StObject.set(x, "DeviceArn", js.undefined)
    
    @scala.inline
    def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
  }
}
