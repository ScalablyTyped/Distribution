package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkillGroup extends js.Object {
  /**
    * The description of a skill group.
    */
  var Description: js.UndefOr[SkillGroupDescription] = js.undefined
  /**
    * The ARN of a skill group.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of a skill group.
    */
  var SkillGroupName: js.UndefOr[SkillGroupName] = js.undefined
}

object SkillGroup {
  @scala.inline
  def apply(
    Description: SkillGroupDescription = null,
    SkillGroupArn: Arn = null,
    SkillGroupName: SkillGroupName = null
  ): SkillGroup = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (SkillGroupArn != null) __obj.updateDynamic("SkillGroupArn")(SkillGroupArn)
    if (SkillGroupName != null) __obj.updateDynamic("SkillGroupName")(SkillGroupName)
    __obj.asInstanceOf[SkillGroup]
  }
}

