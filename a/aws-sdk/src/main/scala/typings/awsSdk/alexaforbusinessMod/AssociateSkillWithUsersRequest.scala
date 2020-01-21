package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateSkillWithUsersRequest extends js.Object {
  /**
    * The private skill ID you want to make available to enrolled users.
    */
  var SkillId: typings.awsSdk.alexaforbusinessMod.SkillId = js.native
}

object AssociateSkillWithUsersRequest {
  @scala.inline
  def apply(SkillId: SkillId): AssociateSkillWithUsersRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateSkillWithUsersRequest]
  }
}

