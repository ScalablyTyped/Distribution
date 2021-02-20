package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSkillAuthorizationRequest extends StObject {
  
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
  implicit class PutSkillAuthorizationRequestMutableBuilder[Self <: PutSkillAuthorizationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationResult(value: AuthorizationResult): Self = StObject.set(x, "AuthorizationResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    @scala.inline
    def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
  }
}
