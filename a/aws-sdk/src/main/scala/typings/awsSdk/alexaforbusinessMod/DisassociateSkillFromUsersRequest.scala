package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateSkillFromUsersRequest extends js.Object {
  /**
    *  The private skill ID you want to make unavailable for enrolled users.
    */
  var SkillId: typings.awsSdk.alexaforbusinessMod.SkillId = js.native
}

object DisassociateSkillFromUsersRequest {
  @scala.inline
  def apply(SkillId: SkillId): DisassociateSkillFromUsersRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateSkillFromUsersRequest]
  }
}

