package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSkillAuthorizationRequest extends js.Object {
  
  /**
    * The authorization result specific to OAUTH code grant output. "Code” must be populated in the AuthorizationResult map to establish the authorization.
    */
  var AuthorizationResult: typings.awsSdk.alexaforbusinessMod.AuthorizationResult = js.native
  
  /**
    * The room that the skill is authorized for.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  
  /**
    * The unique identifier of a skill.
    */
  var SkillId: typings.awsSdk.alexaforbusinessMod.SkillId = js.native
}
object PutSkillAuthorizationRequest {
  
  @scala.inline
  def apply(AuthorizationResult: AuthorizationResult, SkillId: SkillId): PutSkillAuthorizationRequest = {
    val __obj = js.Dynamic.literal(AuthorizationResult = AuthorizationResult.asInstanceOf[js.Any], SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSkillAuthorizationRequest]
  }
  
  @scala.inline
  implicit class PutSkillAuthorizationRequestOps[Self <: PutSkillAuthorizationRequest] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationResult(value: AuthorizationResult): Self = this.set("AuthorizationResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillId(value: SkillId): Self = this.set("SkillId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArn(value: Arn): Self = this.set("RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomArn: Self = this.set("RoomArn", js.undefined)
  }
}
