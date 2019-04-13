package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSkillGroupRequest extends js.Object {
  /**
    * The updated description for the skill group.
    */
  var Description: js.UndefOr[SkillGroupDescription] = js.undefined
  /**
    * The ARN of the skill group to update. 
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * The updated name for the skill group.
    */
  var SkillGroupName: js.UndefOr[SkillGroupName] = js.undefined
}

object UpdateSkillGroupRequest {
  @scala.inline
  def apply(
    Description: SkillGroupDescription = null,
    SkillGroupArn: Arn = null,
    SkillGroupName: SkillGroupName = null
  ): UpdateSkillGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (SkillGroupArn != null) __obj.updateDynamic("SkillGroupArn")(SkillGroupArn)
    if (SkillGroupName != null) __obj.updateDynamic("SkillGroupName")(SkillGroupName)
    __obj.asInstanceOf[UpdateSkillGroupRequest]
  }
}

