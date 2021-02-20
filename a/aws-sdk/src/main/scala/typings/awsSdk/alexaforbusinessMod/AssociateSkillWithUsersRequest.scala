package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateSkillWithUsersRequest extends StObject {
  
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
  implicit class AssociateSkillWithUsersRequestMutableBuilder[Self <: AssociateSkillWithUsersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
  }
}
