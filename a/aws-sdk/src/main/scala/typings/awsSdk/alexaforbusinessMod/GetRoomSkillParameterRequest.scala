package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRoomSkillParameterRequest extends StObject {
  
  /**
    * The room skill parameter key for which to get details. Required.
    */
  var ParameterKey: RoomSkillParameterKey = js.native
  
  /**
    * The ARN of the room from which to get the room skill parameter details. 
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ARN of the skill from which to get the room skill parameter details. Required.
    */
  var SkillId: typings.awsSdk.alexaforbusinessMod.SkillId = js.native
}
object GetRoomSkillParameterRequest {
  
  @scala.inline
  def apply(ParameterKey: RoomSkillParameterKey, SkillId: SkillId): GetRoomSkillParameterRequest = {
    val __obj = js.Dynamic.literal(ParameterKey = ParameterKey.asInstanceOf[js.Any], SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoomSkillParameterRequest]
  }
  
  @scala.inline
  implicit class GetRoomSkillParameterRequestMutableBuilder[Self <: GetRoomSkillParameterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterKey(value: RoomSkillParameterKey): Self = StObject.set(x, "ParameterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    @scala.inline
    def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
  }
}
