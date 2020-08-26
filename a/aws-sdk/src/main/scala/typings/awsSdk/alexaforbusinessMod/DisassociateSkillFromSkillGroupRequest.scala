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
  def apply(SkillId: SkillId): DisassociateSkillFromSkillGroupRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateSkillFromSkillGroupRequest]
  }
  @scala.inline
  implicit class DisassociateSkillFromSkillGroupRequestOps[Self <: DisassociateSkillFromSkillGroupRequest] (val x: Self) extends AnyVal {
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

