package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSkillAuthorizationRequest extends js.Object {
  /**
    * The room that the skill is authorized for.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The unique identifier of a skill.
    */
  var SkillId: typings.awsDashSdk.clientsAlexaforbusinessMod.SkillId = js.native
}

object DeleteSkillAuthorizationRequest {
  @scala.inline
  def apply(SkillId: SkillId, RoomArn: Arn = null): DeleteSkillAuthorizationRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSkillAuthorizationRequest]
  }
}

