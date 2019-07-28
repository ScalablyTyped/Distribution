package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateSkillFromSkillGroupRequest extends js.Object {
  /**
    * The unique identifier of a skill. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * The ARN of a skill group to associate to a skill.
    */
  var SkillId: typings.awsDashSdk.clientsAlexaforbusinessMod.SkillId
}

object DisassociateSkillFromSkillGroupRequest {
  @scala.inline
  def apply(SkillId: SkillId, SkillGroupArn: Arn = null): DisassociateSkillFromSkillGroupRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId)
    if (SkillGroupArn != null) __obj.updateDynamic("SkillGroupArn")(SkillGroupArn)
    __obj.asInstanceOf[DisassociateSkillFromSkillGroupRequest]
  }
}

