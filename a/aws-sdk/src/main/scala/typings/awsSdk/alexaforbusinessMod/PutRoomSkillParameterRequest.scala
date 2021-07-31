package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRoomSkillParameterRequest extends StObject {
  
  /**
    * The ARN of the room associated with the room skill parameter. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The updated room skill parameter. Required.
    */
  var RoomSkillParameter: typings.awsSdk.alexaforbusinessMod.RoomSkillParameter
  
  /**
    * The ARN of the skill associated with the room skill parameter. Required.
    */
  var SkillId: typings.awsSdk.alexaforbusinessMod.SkillId
}
object PutRoomSkillParameterRequest {
  
  @scala.inline
  def apply(RoomSkillParameter: RoomSkillParameter, SkillId: SkillId): PutRoomSkillParameterRequest = {
    val __obj = js.Dynamic.literal(RoomSkillParameter = RoomSkillParameter.asInstanceOf[js.Any], SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRoomSkillParameterRequest]
  }
  
  @scala.inline
  implicit class PutRoomSkillParameterRequestMutableBuilder[Self <: PutRoomSkillParameterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    @scala.inline
    def setRoomSkillParameter(value: RoomSkillParameter): Self = StObject.set(x, "RoomSkillParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
  }
}
