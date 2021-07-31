package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectSkillRequest extends StObject {
  
  /**
    * The unique identifier of the skill.
    */
  var SkillId: typings.awsSdk.alexaforbusinessMod.SkillId
}
object RejectSkillRequest {
  
  @scala.inline
  def apply(SkillId: SkillId): RejectSkillRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectSkillRequest]
  }
  
  @scala.inline
  implicit class RejectSkillRequestMutableBuilder[Self <: RejectSkillRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
  }
}
