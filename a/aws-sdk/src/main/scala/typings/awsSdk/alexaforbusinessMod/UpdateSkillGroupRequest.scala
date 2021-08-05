package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSkillGroupRequest extends StObject {
  
  /**
    * The updated description for the skill group.
    */
  var Description: js.UndefOr[SkillGroupDescription] = js.undefined
  
  /**
    * The ARN of the skill group to update. 
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The updated name for the skill group.
    */
  var SkillGroupName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SkillGroupName] = js.undefined
}
object UpdateSkillGroupRequest {
  
  inline def apply(): UpdateSkillGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSkillGroupRequest]
  }
  
  extension [Self <: UpdateSkillGroupRequest](x: Self) {
    
    inline def setDescription(value: SkillGroupDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setSkillGroupArn(value: Arn): Self = StObject.set(x, "SkillGroupArn", value.asInstanceOf[js.Any])
    
    inline def setSkillGroupArnUndefined: Self = StObject.set(x, "SkillGroupArn", js.undefined)
    
    inline def setSkillGroupName(value: SkillGroupName): Self = StObject.set(x, "SkillGroupName", value.asInstanceOf[js.Any])
    
    inline def setSkillGroupNameUndefined: Self = StObject.set(x, "SkillGroupName", js.undefined)
  }
}
