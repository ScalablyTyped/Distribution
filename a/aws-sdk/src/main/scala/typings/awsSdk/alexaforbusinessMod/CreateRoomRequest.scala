package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRoomRequest extends StObject {
  
  /**
    * A unique, user-specified identifier for this request that ensures idempotency. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.undefined
  
  /**
    * The description for the room.
    */
  var Description: js.UndefOr[RoomDescription] = js.undefined
  
  /**
    * The profile ARN for the room. This is required.
    */
  var ProfileArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The calendar ARN for the room.
    */
  var ProviderCalendarId: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ProviderCalendarId] = js.undefined
  
  /**
    * The name for the room.
    */
  var RoomName: typings.awsSdk.alexaforbusinessMod.RoomName
  
  /**
    * The tags for the room.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateRoomRequest {
  
  @scala.inline
  def apply(RoomName: RoomName): CreateRoomRequest = {
    val __obj = js.Dynamic.literal(RoomName = RoomName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoomRequest]
  }
  
  @scala.inline
  implicit class CreateRoomRequestMutableBuilder[Self <: CreateRoomRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
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
    def setRoomName(value: RoomName): Self = StObject.set(x, "RoomName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
