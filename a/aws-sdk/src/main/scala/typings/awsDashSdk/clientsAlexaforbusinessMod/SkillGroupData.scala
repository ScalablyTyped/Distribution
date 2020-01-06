package typings.awsDashSdk.clientsAlexaforbusinessMod

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
  var SkillGroupName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.SkillGroupName] = js.native
}

object SkillGroupData {
  @scala.inline
  def apply(
    Description: SkillGroupDescription = null,
    SkillGroupArn: Arn = null,
    SkillGroupName: SkillGroupName = null
  ): SkillGroupData = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (SkillGroupArn != null) __obj.updateDynamic("SkillGroupArn")(SkillGroupArn.asInstanceOf[js.Any])
    if (SkillGroupName != null) __obj.updateDynamic("SkillGroupName")(SkillGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkillGroupData]
  }
}

