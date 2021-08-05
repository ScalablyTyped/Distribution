package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRoomResponse extends StObject {
  
  /**
    * The room details.
    */
  var Room: js.UndefOr[typings.awsSdk.chimeMod.Room] = js.undefined
}
object GetRoomResponse {
  
  inline def apply(): GetRoomResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRoomResponse]
  }
  
  extension [Self <: GetRoomResponse](x: Self) {
    
    inline def setRoom(value: Room): Self = StObject.set(x, "Room", value.asInstanceOf[js.Any])
    
    inline def setRoomUndefined: Self = StObject.set(x, "Room", js.undefined)
  }
}
