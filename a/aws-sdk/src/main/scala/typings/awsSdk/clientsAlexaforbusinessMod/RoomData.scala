package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomData extends StObject {
  
  /**
    * The description of a room.
    */
  var Description: js.UndefOr[RoomDescription] = js.undefined
  
  /**
    * The profile ARN of a room.
    */
  var ProfileArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The profile name of a room.
    */
  var ProfileName: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.ProfileName] = js.undefined
  
  /**
    * The provider calendar ARN of a room.
    */
  var ProviderCalendarId: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.ProviderCalendarId] = js.undefined
  
  /**
    * The ARN of a room.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of a room.
    */
  var RoomName: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.RoomName] = js.undefined
}
object RoomData {
  
  inline def apply(): RoomData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomData]
  }
  
  extension [Self <: RoomData](x: Self) {
    
    inline def setDescription(value: RoomDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setProfileArn(value: Arn): Self = StObject.set(x, "ProfileArn", value.asInstanceOf[js.Any])
    
    inline def setProfileArnUndefined: Self = StObject.set(x, "ProfileArn", js.undefined)
    
    inline def setProfileName(value: ProfileName): Self = StObject.set(x, "ProfileName", value.asInstanceOf[js.Any])
    
    inline def setProfileNameUndefined: Self = StObject.set(x, "ProfileName", js.undefined)
    
    inline def setProviderCalendarId(value: ProviderCalendarId): Self = StObject.set(x, "ProviderCalendarId", value.asInstanceOf[js.Any])
    
    inline def setProviderCalendarIdUndefined: Self = StObject.set(x, "ProviderCalendarId", js.undefined)
    
    inline def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    inline def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    inline def setRoomName(value: RoomName): Self = StObject.set(x, "RoomName", value.asInstanceOf[js.Any])
    
    inline def setRoomNameUndefined: Self = StObject.set(x, "RoomName", js.undefined)
  }
}
