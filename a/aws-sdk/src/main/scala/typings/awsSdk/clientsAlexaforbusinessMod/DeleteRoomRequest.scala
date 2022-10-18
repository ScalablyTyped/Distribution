package typings.awsSdk.clientsAlexaforbusinessMod

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
  
  inline def apply(): DeleteRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRoomRequest]
  }
  
  extension [Self <: DeleteRoomRequest](x: Self) {
    
    inline def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    inline def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
  }
}
