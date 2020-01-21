package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateSkillFromSkillGroupRequest extends js.Object {
  /**
    * The unique identifier of a skill. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of a skill group to associate to a skill.
    */
  var SkillId: typings.awsSdk.alexaforbusinessMod.SkillId = js.native
}

object DisassociateSkillFromSkillGroupRequest {
  @scala.inline
  def apply(SkillId: SkillId, SkillGroupArn: Arn = null): DisassociateSkillFromSkillGroupRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
    if (SkillGroupArn != null) __obj.updateDynamic("SkillGroupArn")(SkillGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateSkillFromSkillGroupRequest]
  }
}

