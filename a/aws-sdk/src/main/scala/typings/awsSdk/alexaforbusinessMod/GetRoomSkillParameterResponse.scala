package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRoomSkillParameterResponse extends StObject {
  
  /**
    * The details of the room skill parameter requested. Required.
    */
  var RoomSkillParameter: js.UndefOr[typings.awsSdk.alexaforbusinessMod.RoomSkillParameter] = js.undefined
}
object GetRoomSkillParameterResponse {
  
  inline def apply(): GetRoomSkillParameterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRoomSkillParameterResponse]
  }
  
  extension [Self <: GetRoomSkillParameterResponse](x: Self) {
    
    inline def setRoomSkillParameter(value: RoomSkillParameter): Self = StObject.set(x, "RoomSkillParameter", value.asInstanceOf[js.Any])
    
    inline def setRoomSkillParameterUndefined: Self = StObject.set(x, "RoomSkillParameter", js.undefined)
  }
}
