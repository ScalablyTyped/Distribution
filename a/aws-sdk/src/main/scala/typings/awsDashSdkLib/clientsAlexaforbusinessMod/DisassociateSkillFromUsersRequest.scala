package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateSkillFromUsersRequest extends js.Object {
  /**
    *  The private skill ID you want to make unavailable for enrolled users.
    */
  var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.SkillId
}

object DisassociateSkillFromUsersRequest {
  @scala.inline
  def apply(SkillId: SkillId): DisassociateSkillFromUsersRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId)
  
    __obj.asInstanceOf[DisassociateSkillFromUsersRequest]
  }
}

