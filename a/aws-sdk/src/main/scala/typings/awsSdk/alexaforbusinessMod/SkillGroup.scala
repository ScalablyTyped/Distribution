package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkillGroup extends StObject {
  
  /**
    * The description of a skill group.
    */
  var Description: js.UndefOr[SkillGroupDescription] = js.undefined
  
  /**
    * The ARN of a skill group.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of a skill group.
    */
  var SkillGroupName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SkillGroupName] = js.undefined
}
object SkillGroup {
  
  @scala.inline
  def apply(): SkillGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkillGroup]
  }
  
  @scala.inline
  implicit class SkillGroupMutableBuilder[Self <: SkillGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: SkillGroupDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setSkillGroupArn(value: Arn): Self = StObject.set(x, "SkillGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillGroupArnUndefined: Self = StObject.set(x, "SkillGroupArn", js.undefined)
    
    @scala.inline
    def setSkillGroupName(value: SkillGroupName): Self = StObject.set(x, "SkillGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillGroupNameUndefined: Self = StObject.set(x, "SkillGroupName", js.undefined)
  }
}
