package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendAnnouncementRequest extends StObject {
  
  /**
    * The unique, user-specified identifier for the request that ensures idempotency.
    */
  var ClientRequestToken: typings.awsSdk.clientsAlexaforbusinessMod.ClientRequestToken
  
  /**
    * The announcement content. This can contain only one of the three possible announcement types (text, SSML or audio).
    */
  var Content: typings.awsSdk.clientsAlexaforbusinessMod.Content
  
  /**
    * The filters to use to send an announcement to a specified list of rooms. The supported filter keys are RoomName, ProfileName, RoomArn, and ProfileArn. To send to all rooms, specify an empty RoomFilters list.
    */
  var RoomFilters: FilterList
  
  /**
    * The time to live for an announcement. Default is 300. If delivery doesn't occur within this time, the announcement is not delivered.
    */
  var TimeToLiveInSeconds: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.TimeToLiveInSeconds] = js.undefined
}
object SendAnnouncementRequest {
  
  inline def apply(ClientRequestToken: ClientRequestToken, Content: Content, RoomFilters: FilterList): SendAnnouncementRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], RoomFilters = RoomFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAnnouncementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendAnnouncementRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Content): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setRoomFilters(value: FilterList): Self = StObject.set(x, "RoomFilters", value.asInstanceOf[js.Any])
    
    inline def setRoomFiltersVarargs(value: Filter*): Self = StObject.set(x, "RoomFilters", js.Array(value*))
    
    inline def setTimeToLiveInSeconds(value: TimeToLiveInSeconds): Self = StObject.set(x, "TimeToLiveInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveInSecondsUndefined: Self = StObject.set(x, "TimeToLiveInSeconds", js.undefined)
  }
}
