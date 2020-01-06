package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSkillGroupResponse extends js.Object {
  /**
    * The details of the skill group requested. Required.
    */
  var SkillGroup: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.SkillGroup] = js.native
}

object GetSkillGroupResponse {
  @scala.inline
  def apply(SkillGroup: SkillGroup = null): GetSkillGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (SkillGroup != null) __obj.updateDynamic("SkillGroup")(SkillGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSkillGroupResponse]
  }
}

