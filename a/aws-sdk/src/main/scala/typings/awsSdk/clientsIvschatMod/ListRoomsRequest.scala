package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRoomsRequest extends StObject {
  
  /**
    * Maximum number of rooms to return. Default: 50.
    */
  var maxResults: js.UndefOr[MaxRoomResults] = js.undefined
  
  /**
    * Filters the list to match the specified message review handler URI.
    */
  var messageReviewHandlerUri: js.UndefOr[LambdaArn] = js.undefined
  
  /**
    * Filters the list to match the specified room name.
    */
  var name: js.UndefOr[RoomName] = js.undefined
  
  /**
    * The first room to retrieve. This is used for pagination; see the nextToken response field.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListRoomsRequest {
  
  inline def apply(): ListRoomsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoomsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRoomsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxRoomResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMessageReviewHandlerUri(value: LambdaArn): Self = StObject.set(x, "messageReviewHandlerUri", value.asInstanceOf[js.Any])
    
    inline def setMessageReviewHandlerUriUndefined: Self = StObject.set(x, "messageReviewHandlerUri", js.undefined)
    
    inline def setName(value: RoomName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
