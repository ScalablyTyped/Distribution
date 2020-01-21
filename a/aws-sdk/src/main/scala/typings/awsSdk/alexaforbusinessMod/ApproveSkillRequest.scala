package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApproveSkillRequest extends js.Object {
  /**
    * The unique identifier of the skill.
    */
  var SkillId: typings.awsSdk.alexaforbusinessMod.SkillId = js.native
}

object ApproveSkillRequest {
  @scala.inline
  def apply(SkillId: SkillId): ApproveSkillRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApproveSkillRequest]
  }
}

