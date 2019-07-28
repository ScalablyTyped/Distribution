package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateSkillWithUsersRequest extends js.Object {
  /**
    * The private skill ID you want to make available to enrolled users.
    */
  var SkillId: typings.awsDashSdk.clientsAlexaforbusinessMod.SkillId
}

object AssociateSkillWithUsersRequest {
  @scala.inline
  def apply(SkillId: SkillId): AssociateSkillWithUsersRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId)
  
    __obj.asInstanceOf[AssociateSkillWithUsersRequest]
  }
}

