package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRoomResponse extends StObject {
  
  /**
    * The room details.
    */
  var Room: js.UndefOr[typings.awsSdk.chimeMod.Room] = js.undefined
}
object CreateRoomResponse {
  
  inline def apply(): CreateRoomResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRoomResponse]
  }
  
  extension [Self <: CreateRoomResponse](x: Self) {
    
    inline def setRoom(value: Room): Self = StObject.set(x, "Room", value.asInstanceOf[js.Any])
    
    inline def setRoomUndefined: Self = StObject.set(x, "Room", js.undefined)
  }
}
