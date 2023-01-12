package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRoomSkillParameterResponse extends StObject {
  
  /**
    * The details of the room skill parameter requested. Required.
    */
  var RoomSkillParameter: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.RoomSkillParameter] = js.undefined
}
object GetRoomSkillParameterResponse {
  
  inline def apply(): GetRoomSkillParameterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRoomSkillParameterResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRoomSkillParameterResponse] (val x: Self) extends AnyVal {
    
    inline def setRoomSkillParameter(value: RoomSkillParameter): Self = StObject.set(x, "RoomSkillParameter", value.asInstanceOf[js.Any])
    
    inline def setRoomSkillParameterUndefined: Self = StObject.set(x, "RoomSkillParameter", js.undefined)
  }
}
