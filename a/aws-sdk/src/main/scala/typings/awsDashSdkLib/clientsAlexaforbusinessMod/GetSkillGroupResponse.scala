package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSkillGroupResponse extends js.Object {
  /**
    * The details of the skill group requested. Required.
    */
  var SkillGroup: js.UndefOr[SkillGroup] = js.undefined
}

object GetSkillGroupResponse {
  @scala.inline
  def apply(SkillGroup: SkillGroup = null): GetSkillGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (SkillGroup != null) __obj.updateDynamic("SkillGroup")(SkillGroup)
    __obj.asInstanceOf[GetSkillGroupResponse]
  }
}

