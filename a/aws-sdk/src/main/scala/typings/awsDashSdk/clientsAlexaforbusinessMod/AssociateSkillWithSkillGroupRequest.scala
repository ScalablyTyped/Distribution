package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateSkillWithSkillGroupRequest extends js.Object {
  /**
    * The ARN of the skill group to associate the skill to. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The unique identifier of the skill.
    */
  var SkillId: typings.awsDashSdk.clientsAlexaforbusinessMod.SkillId = js.native
}

object AssociateSkillWithSkillGroupRequest {
  @scala.inline
  def apply(SkillId: SkillId, SkillGroupArn: Arn = null): AssociateSkillWithSkillGroupRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
    if (SkillGroupArn != null) __obj.updateDynamic("SkillGroupArn")(SkillGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateSkillWithSkillGroupRequest]
  }
}

