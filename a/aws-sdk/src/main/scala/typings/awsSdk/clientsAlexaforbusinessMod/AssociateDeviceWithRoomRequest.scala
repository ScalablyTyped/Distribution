package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateDeviceWithRoomRequest extends StObject {
  
  /**
    * The ARN of the device to associate to a room. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the room with which to associate the device. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
}
object AssociateDeviceWithRoomRequest {
  
  inline def apply(): AssociateDeviceWithRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateDeviceWithRoomRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateDeviceWithRoomRequest] (val x: Self) extends AnyVal {
    
    inline def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceArnUndefined: Self = StObject.set(x, "DeviceArn", js.undefined)
    
    inline def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    inline def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
  }
}
