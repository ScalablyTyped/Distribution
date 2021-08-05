package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoomRequest extends StObject {
  
  /**
    * The updated description for the room.
    */
  var Description: js.UndefOr[RoomDescription] = js.undefined
  
  /**
    * The updated profile ARN for the room.
    */
  var ProfileArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The updated provider calendar ARN for the room.
    */
  var ProviderCalendarId: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ProviderCalendarId] = js.undefined
  
  /**
    * The ARN of the room to update. 
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The updated name for the room.
    */
  var RoomName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.RoomName] = js.undefined
}
object UpdateRoomRequest {
  
  inline def apply(): UpdateRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoomRequest]
  }
  
  extension [Self <: UpdateRoomRequest](x: Self) {
    
    inline def setDescription(value: RoomDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setProfileArn(value: Arn): Self = StObject.set(x, "ProfileArn", value.asInstanceOf[js.Any])
    
    inline def setProfileArnUndefined: Self = StObject.set(x, "ProfileArn", js.undefined)
    
    inline def setProviderCalendarId(value: ProviderCalendarId): Self = StObject.set(x, "ProviderCalendarId", value.asInstanceOf[js.Any])
    
    inline def setProviderCalendarIdUndefined: Self = StObject.set(x, "ProviderCalendarId", js.undefined)
    
    inline def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    inline def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    inline def setRoomName(value: RoomName): Self = StObject.set(x, "RoomName", value.asInstanceOf[js.Any])
    
    inline def setRoomNameUndefined: Self = StObject.set(x, "RoomName", js.undefined)
  }
}
