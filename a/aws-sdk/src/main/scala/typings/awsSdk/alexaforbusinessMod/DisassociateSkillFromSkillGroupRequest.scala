package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateSkillFromSkillGroupRequest extends StObject {
  
  /**
    * The unique identifier of a skill. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of a skill group to associate to a skill.
    */
  var SkillId: typings.awsSdk.alexaforbusinessMod.SkillId
}
object DisassociateSkillFromSkillGroupRequest {
  
  @scala.inline
  def apply(SkillId: SkillId): DisassociateSkillFromSkillGroupRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateSkillFromSkillGroupRequest]
  }
  
  @scala.inline
  implicit class DisassociateSkillFromSkillGroupRequestMutableBuilder[Self <: DisassociateSkillFromSkillGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkillGroupArn(value: Arn): Self = StObject.set(x, "SkillGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillGroupArnUndefined: Self = StObject.set(x, "SkillGroupArn", js.undefined)
    
    @scala.inline
    def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
  }
}
