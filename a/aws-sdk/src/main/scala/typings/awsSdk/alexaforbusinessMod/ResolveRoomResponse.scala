package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveRoomResponse extends StObject {
  
  /**
    * The ARN of the room from which the skill request was invoked.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the room from which the skill request was invoked.
    */
  var RoomName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.RoomName] = js.undefined
  
  /**
    * Response to get the room profile request. Required.
    */
  var RoomSkillParameters: js.UndefOr[typings.awsSdk.alexaforbusinessMod.RoomSkillParameters] = js.undefined
}
object ResolveRoomResponse {
  
  inline def apply(): ResolveRoomResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveRoomResponse]
  }
  
  extension [Self <: ResolveRoomResponse](x: Self) {
    
    inline def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    inline def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    inline def setRoomName(value: RoomName): Self = StObject.set(x, "RoomName", value.asInstanceOf[js.Any])
    
    inline def setRoomNameUndefined: Self = StObject.set(x, "RoomName", js.undefined)
    
    inline def setRoomSkillParameters(value: RoomSkillParameters): Self = StObject.set(x, "RoomSkillParameters", value.asInstanceOf[js.Any])
    
    inline def setRoomSkillParametersUndefined: Self = StObject.set(x, "RoomSkillParameters", js.undefined)
    
    inline def setRoomSkillParametersVarargs(value: RoomSkillParameter*): Self = StObject.set(x, "RoomSkillParameters", js.Array(value*))
  }
}
