package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApproveSkillRequest extends js.Object {
  /**
    * The unique identifier of the skill.
    */
  var SkillId: typings.awsDashSdk.clientsAlexaforbusinessMod.SkillId
}

object ApproveSkillRequest {
  @scala.inline
  def apply(SkillId: SkillId): ApproveSkillRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId)
  
    __obj.asInstanceOf[ApproveSkillRequest]
  }
}

