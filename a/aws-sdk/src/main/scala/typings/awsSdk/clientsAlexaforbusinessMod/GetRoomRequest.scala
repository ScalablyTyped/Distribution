package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRoomRequest extends StObject {
  
  /**
    * The ARN of the room for which to request details. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
}
object GetRoomRequest {
  
  inline def apply(): GetRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRoomRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRoomRequest] (val x: Self) extends AnyVal {
    
    inline def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    inline def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
  }
}
