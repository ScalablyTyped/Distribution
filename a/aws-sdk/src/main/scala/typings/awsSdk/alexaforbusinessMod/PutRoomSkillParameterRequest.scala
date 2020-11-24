package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRoomSkillParameterRequest extends js.Object {
  
  /**
    * The ARN of the room associated with the room skill parameter. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  
  /**
    * The updated room skill parameter. Required.
    */
  var RoomSkillParameter: typings.awsSdk.alexaforbusinessMod.RoomSkillParameter = js.native
  
  /**
    * The ARN of the skill associated with the room skill parameter. Required.
    */
  var SkillId: typings.awsSdk.alexaforbusinessMod.SkillId = js.native
}
object PutRoomSkillParameterRequest {
  
  @scala.inline
  def apply(RoomSkillParameter: RoomSkillParameter, SkillId: SkillId): PutRoomSkillParameterRequest = {
    val __obj = js.Dynamic.literal(RoomSkillParameter = RoomSkillParameter.asInstanceOf[js.Any], SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRoomSkillParameterRequest]
  }
  
  @scala.inline
  implicit class PutRoomSkillParameterRequestOps[Self <: PutRoomSkillParameterRequest] (val x: Self) extends AnyVal {
    
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
    def setRoomSkillParameter(value: RoomSkillParameter): Self = this.set("RoomSkillParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillId(value: SkillId): Self = this.set("SkillId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArn(value: Arn): Self = this.set("RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomArn: Self = this.set("RoomArn", js.undefined)
  }
}
