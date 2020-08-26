package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkillGroupData extends js.Object {
  /**
    * The description of a skill group.
    */
  var Description: js.UndefOr[SkillGroupDescription] = js.native
  /**
    * The skill group ARN of a skill group.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The skill group name of a skill group.
    */
  var SkillGroupName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SkillGroupName] = js.native
}

object SkillGroupData {
  @scala.inline
  def apply(): SkillGroupData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkillGroupData]
  }
  @scala.inline
  implicit class SkillGroupDataOps[Self <: SkillGroupData] (val x: Self) extends AnyVal {
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
    def setDescription(value: SkillGroupDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setSkillGroupArn(value: Arn): Self = this.set("SkillGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkillGroupArn: Self = this.set("SkillGroupArn", js.undefined)
    @scala.inline
    def setSkillGroupName(value: SkillGroupName): Self = this.set("SkillGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkillGroupName: Self = this.set("SkillGroupName", js.undefined)
  }
  
}

