package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSkillAuthorizationRequest extends StObject {
  
  /**
    * The room that the skill is authorized for.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The unique identifier of a skill.
    */
  var SkillId: typings.awsSdk.alexaforbusinessMod.SkillId
}
object DeleteSkillAuthorizationRequest {
  
  @scala.inline
  def apply(SkillId: SkillId): DeleteSkillAuthorizationRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSkillAuthorizationRequest]
  }
  
  @scala.inline
  implicit class DeleteSkillAuthorizationRequestMutableBuilder[Self <: DeleteSkillAuthorizationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    @scala.inline
    def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
  }
}
