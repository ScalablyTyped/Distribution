package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRoomSkillParameterRequest extends StObject {
  
  /**
    * The room skill parameter key for which to remove details.
    */
  var ParameterKey: RoomSkillParameterKey = js.native
  
  /**
    * The ARN of the room from which to remove the room skill parameter details.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ID of the skill from which to remove the room skill parameter details.
    */
  var SkillId: typings.awsSdk.alexaforbusinessMod.SkillId = js.native
}
object DeleteRoomSkillParameterRequest {
  
  @scala.inline
  def apply(ParameterKey: RoomSkillParameterKey, SkillId: SkillId): DeleteRoomSkillParameterRequest = {
    val __obj = js.Dynamic.literal(ParameterKey = ParameterKey.asInstanceOf[js.Any], SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRoomSkillParameterRequest]
  }
  
  @scala.inline
  implicit class DeleteRoomSkillParameterRequestMutableBuilder[Self <: DeleteRoomSkillParameterRequest] (val x: Self) extends AnyVal {
    
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
