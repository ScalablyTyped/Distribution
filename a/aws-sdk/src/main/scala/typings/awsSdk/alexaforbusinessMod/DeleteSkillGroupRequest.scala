package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSkillGroupRequest extends js.Object {
  /**
    * The ARN of the skill group to delete. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
}

object DeleteSkillGroupRequest {
  @scala.inline
  def apply(): DeleteSkillGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSkillGroupRequest]
  }
  @scala.inline
  implicit class DeleteSkillGroupRequestOps[Self <: DeleteSkillGroupRequest] (val x: Self) extends AnyVal {
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
    def setSkillGroupArn(value: Arn): Self = this.set("SkillGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkillGroupArn: Self = this.set("SkillGroupArn", js.undefined)
  }
  
}

