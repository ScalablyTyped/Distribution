package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRoomSkillParameterRequest extends StObject {
  
  /**
    * The room skill parameter key for which to get details. Required.
    */
  var ParameterKey: RoomSkillParameterKey
  
  /**
    * The ARN of the room from which to get the room skill parameter details. 
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the skill from which to get the room skill parameter details. Required.
    */
  var SkillId: typings.awsSdk.clientsAlexaforbusinessMod.SkillId
}
object GetRoomSkillParameterRequest {
  
  inline def apply(ParameterKey: RoomSkillParameterKey, SkillId: SkillId): GetRoomSkillParameterRequest = {
    val __obj = js.Dynamic.literal(ParameterKey = ParameterKey.asInstanceOf[js.Any], SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoomSkillParameterRequest]
  }
  
  extension [Self <: GetRoomSkillParameterRequest](x: Self) {
    
    inline def setParameterKey(value: RoomSkillParameterKey): Self = StObject.set(x, "ParameterKey", value.asInstanceOf[js.Any])
    
    inline def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    inline def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    inline def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
  }
}
