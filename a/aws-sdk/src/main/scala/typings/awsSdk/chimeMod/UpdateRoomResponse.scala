package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoomResponse extends StObject {
  
  /**
    * The room details.
    */
  var Room: js.UndefOr[typings.awsSdk.chimeMod.Room] = js.undefined
}
object UpdateRoomResponse {
  
  @scala.inline
  def apply(): UpdateRoomResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoomResponse]
  }
  
  @scala.inline
  implicit class UpdateRoomResponseMutableBuilder[Self <: UpdateRoomResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoom(value: Room): Self = StObject.set(x, "Room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomUndefined: Self = StObject.set(x, "Room", js.undefined)
  }
}
