package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRoomResponse extends StObject {
  
  /**
    * The ARN of the newly created room in the response.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
}
object CreateRoomResponse {
  
  @scala.inline
  def apply(): CreateRoomResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRoomResponse]
  }
  
  @scala.inline
  implicit class CreateRoomResponseMutableBuilder[Self <: CreateRoomResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
  }
}
