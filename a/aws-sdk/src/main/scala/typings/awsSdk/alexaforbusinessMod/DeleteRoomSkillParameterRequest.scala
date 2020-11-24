package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRoomSkillParameterRequest extends js.Object {
  
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
  implicit class DeleteRoomSkillParameterRequestOps[Self <: DeleteRoomSkillParameterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameterKey(value: RoomSkillParameterKey): Self = this.set("ParameterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillId(value: SkillId): Self = this.set("SkillId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArn(value: Arn): Self = this.set("RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomArn: Self = this.set("RoomArn", js.undefined)
  }
}
