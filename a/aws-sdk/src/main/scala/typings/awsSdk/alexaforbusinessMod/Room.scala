package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Room extends StObject {
  
  /**
    * The description of a room.
    */
  var Description: js.UndefOr[RoomDescription] = js.undefined
  
  /**
    * The profile ARN of a room.
    */
  var ProfileArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The provider calendar ARN of a room.
    */
  var ProviderCalendarId: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ProviderCalendarId] = js.undefined
  
  /**
    * The ARN of a room.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of a room.
    */
  var RoomName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.RoomName] = js.undefined
}
object Room {
  
  @scala.inline
  def apply(): Room = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Room]
  }
  
  @scala.inline
  implicit class RoomMutableBuilder[Self <: Room] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: RoomDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setProfileArn(value: Arn): Self = StObject.set(x, "ProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileArnUndefined: Self = StObject.set(x, "ProfileArn", js.undefined)
    
    @scala.inline
    def setProviderCalendarId(value: ProviderCalendarId): Self = StObject.set(x, "ProviderCalendarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderCalendarIdUndefined: Self = StObject.set(x, "ProviderCalendarId", js.undefined)
    
    @scala.inline
    def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    @scala.inline
    def setRoomName(value: RoomName): Self = StObject.set(x, "RoomName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomNameUndefined: Self = StObject.set(x, "RoomName", js.undefined)
  }
}
