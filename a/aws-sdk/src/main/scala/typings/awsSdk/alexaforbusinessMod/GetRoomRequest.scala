package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRoomRequest extends StObject {
  
  /**
    * The ARN of the room for which to request details. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
}
object GetRoomRequest {
  
  @scala.inline
  def apply(): GetRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRoomRequest]
  }
  
  @scala.inline
  implicit class GetRoomRequestMutableBuilder[Self <: GetRoomRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
  }
}
