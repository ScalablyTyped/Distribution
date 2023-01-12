package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoomResponse extends StObject {
  
  /**
    * The room details.
    */
  var Room: js.UndefOr[typings.awsSdk.clientsChimeMod.Room] = js.undefined
}
object UpdateRoomResponse {
  
  inline def apply(): UpdateRoomResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoomResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRoomResponse] (val x: Self) extends AnyVal {
    
    inline def setRoom(value: Room): Self = StObject.set(x, "Room", value.asInstanceOf[js.Any])
    
    inline def setRoomUndefined: Self = StObject.set(x, "Room", js.undefined)
  }
}
