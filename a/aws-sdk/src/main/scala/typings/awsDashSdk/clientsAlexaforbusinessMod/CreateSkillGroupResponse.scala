package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSkillGroupResponse extends js.Object {
  /**
    * The ARN of the newly created skill group in the response.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
}

object CreateSkillGroupResponse {
  @scala.inline
  def apply(SkillGroupArn: Arn = null): CreateSkillGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (SkillGroupArn != null) __obj.updateDynamic("SkillGroupArn")(SkillGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSkillGroupResponse]
  }
}

