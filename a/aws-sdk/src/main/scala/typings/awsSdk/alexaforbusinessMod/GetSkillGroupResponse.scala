package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSkillGroupResponse extends StObject {
  
  /**
    * The details of the skill group requested. Required.
    */
  var SkillGroup: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SkillGroup] = js.native
}
object GetSkillGroupResponse {
  
  @scala.inline
  def apply(): GetSkillGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSkillGroupResponse]
  }
  
  @scala.inline
  implicit class GetSkillGroupResponseMutableBuilder[Self <: GetSkillGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkillGroup(value: SkillGroup): Self = StObject.set(x, "SkillGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillGroupUndefined: Self = StObject.set(x, "SkillGroup", js.undefined)
  }
}
