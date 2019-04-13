package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutSkillAuthorizationRequest extends js.Object {
  /**
    * The authorization result specific to OAUTH code grant output. "Code” must be populated in the AuthorizationResult map to establish the authorization.
    */
  var AuthorizationResult: awsDashSdkLib.clientsAlexaforbusinessMod.AuthorizationResult
  /**
    * The room that the skill is authorized for.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  /**
    * The unique identifier of a skill.
    */
  var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.SkillId
}

object PutSkillAuthorizationRequest {
  @scala.inline
  def apply(AuthorizationResult: AuthorizationResult, SkillId: SkillId, RoomArn: Arn = null): PutSkillAuthorizationRequest = {
    val __obj = js.Dynamic.literal(AuthorizationResult = AuthorizationResult, SkillId = SkillId)
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn)
    __obj.asInstanceOf[PutSkillAuthorizationRequest]
  }
}

