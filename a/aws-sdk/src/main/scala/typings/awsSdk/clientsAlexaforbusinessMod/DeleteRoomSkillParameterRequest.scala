package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRoomSkillParameterRequest extends StObject {
  
  /**
    * The room skill parameter key for which to remove details.
    */
  var ParameterKey: RoomSkillParameterKey
  
  /**
    * The ARN of the room from which to remove the room skill parameter details.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the skill from which to remove the room skill parameter details.
    */
  var SkillId: typings.awsSdk.clientsAlexaforbusinessMod.SkillId
}
object DeleteRoomSkillParameterRequest {
  
  inline def apply(ParameterKey: RoomSkillParameterKey, SkillId: SkillId): DeleteRoomSkillParameterRequest = {
    val __obj = js.Dynamic.literal(ParameterKey = ParameterKey.asInstanceOf[js.Any], SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRoomSkillParameterRequest]
  }
  
  extension [Self <: DeleteRoomSkillParameterRequest](x: Self) {
    
    inline def setParameterKey(value: RoomSkillParameterKey): Self = StObject.set(x, "ParameterKey", value.asInstanceOf[js.Any])
    
    inline def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    inline def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    inline def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
  }
}
