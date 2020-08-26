package typings.awsSdk.alexaforbusinessMod

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
  var SkillId: typings.awsSdk.alexaforbusinessMod.SkillId = js.native
}

object AssociateSkillWithSkillGroupRequest {
  @scala.inline
  def apply(SkillId: SkillId): AssociateSkillWithSkillGroupRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateSkillWithSkillGroupRequest]
  }
  @scala.inline
  implicit class AssociateSkillWithSkillGroupRequestOps[Self <: AssociateSkillWithSkillGroupRequest] (val x: Self) extends AnyVal {
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
    def setSkillId(value: SkillId): Self = this.set("SkillId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkillGroupArn(value: Arn): Self = this.set("SkillGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkillGroupArn: Self = this.set("SkillGroupArn", js.undefined)
  }
  
}

