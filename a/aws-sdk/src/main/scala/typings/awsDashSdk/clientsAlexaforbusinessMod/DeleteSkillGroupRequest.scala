package typings.awsDashSdk.clientsAlexaforbusinessMod

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
  def apply(SkillGroupArn: Arn = null): DeleteSkillGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (SkillGroupArn != null) __obj.updateDynamic("SkillGroupArn")(SkillGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSkillGroupRequest]
  }
}

