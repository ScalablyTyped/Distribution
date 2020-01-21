package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSkillGroupRequest extends js.Object {
  /**
    * The updated description for the skill group.
    */
  var Description: js.UndefOr[SkillGroupDescription] = js.native
  /**
    * The ARN of the skill group to update. 
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The updated name for the skill group.
    */
  var SkillGroupName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SkillGroupName] = js.native
}

object UpdateSkillGroupRequest {
  @scala.inline
  def apply(
    Description: SkillGroupDescription = null,
    SkillGroupArn: Arn = null,
    SkillGroupName: SkillGroupName = null
  ): UpdateSkillGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (SkillGroupArn != null) __obj.updateDynamic("SkillGroupArn")(SkillGroupArn.asInstanceOf[js.Any])
    if (SkillGroupName != null) __obj.updateDynamic("SkillGroupName")(SkillGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSkillGroupRequest]
  }
}

