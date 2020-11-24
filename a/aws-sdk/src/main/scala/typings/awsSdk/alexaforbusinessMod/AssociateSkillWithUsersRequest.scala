package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class AssociateSkillWithUsersRequestOps[Self <: AssociateSkillWithUsersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSkillId(value: SkillId): Self = this.set("SkillId", value.asInstanceOf[js.Any])
  }
}
