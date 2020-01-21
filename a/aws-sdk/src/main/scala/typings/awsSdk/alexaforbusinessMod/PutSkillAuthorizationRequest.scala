package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(AuthorizationResult: AuthorizationResult, SkillId: SkillId, RoomArn: Arn = null): PutSkillAuthorizationRequest = {
    val __obj = js.Dynamic.literal(AuthorizationResult = AuthorizationResult.asInstanceOf[js.Any], SkillId = SkillId.asInstanceOf[js.Any])
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSkillAuthorizationRequest]
  }
}

