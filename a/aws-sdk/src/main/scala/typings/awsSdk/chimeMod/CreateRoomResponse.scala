package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRoomResponse extends StObject {
  
  /**
    * The room details.
    */
  var Room: js.UndefOr[typings.awsSdk.chimeMod.Room] = js.native
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
    def setRoom(value: Room): Self = StObject.set(x, "Room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomUndefined: Self = StObject.set(x, "Room", js.undefined)
  }
}
