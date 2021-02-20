package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateSkillWithSkillGroupRequest extends StObject {
  
  /**
    * The ARN of the skill group to associate the skill to. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
  
  /**
    * The unique identifier of the skill.
    */
  var SkillId: typings.awsSdk.alexaforbusinessMod.SkillId = js.native
}
object AssociateSkillWithSkillGroupRequest {
  
  @scala.inline
  def apply(SkillId: SkillId): AssociateSkillWithSkillGroupRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateSkillWithSkillGroupRequest]
  }
  
  @scala.inline
  implicit class AssociateSkillWithSkillGroupRequestMutableBuilder[Self <: AssociateSkillWithSkillGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkillGroupArn(value: Arn): Self = StObject.set(x, "SkillGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillGroupArnUndefined: Self = StObject.set(x, "SkillGroupArn", js.undefined)
    
    @scala.inline
    def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
  }
}
