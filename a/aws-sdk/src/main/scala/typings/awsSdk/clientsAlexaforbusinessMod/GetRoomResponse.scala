package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRoomResponse extends StObject {
  
  /**
    * The details of the room requested.
    */
  var Room: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.Room] = js.undefined
}
object GetRoomResponse {
  
  inline def apply(): GetRoomResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRoomResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRoomResponse] (val x: Self) extends AnyVal {
    
    inline def setRoom(value: Room): Self = StObject.set(x, "Room", value.asInstanceOf[js.Any])
    
    inline def setRoomUndefined: Self = StObject.set(x, "Room", js.undefined)
  }
}
