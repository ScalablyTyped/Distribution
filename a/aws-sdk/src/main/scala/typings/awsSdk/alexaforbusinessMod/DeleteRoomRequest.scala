package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRoomRequest extends StObject {
  
  /**
    * The ARN of the room to delete. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
}
object DeleteRoomRequest {
  
  @scala.inline
  def apply(): DeleteRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRoomRequest]
  }
  
  @scala.inline
  implicit class DeleteRoomRequestMutableBuilder[Self <: DeleteRoomRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
  }
}
