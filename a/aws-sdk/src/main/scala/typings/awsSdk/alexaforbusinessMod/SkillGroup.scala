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
  
  inline def apply(): SkillGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkillGroup]
  }
  
  extension [Self <: SkillGroup](x: Self) {
    
    inline def setDescription(value: SkillGroupDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setSkillGroupArn(value: Arn): Self = StObject.set(x, "SkillGroupArn", value.asInstanceOf[js.Any])
    
    inline def setSkillGroupArnUndefined: Self = StObject.set(x, "SkillGroupArn", js.undefined)
    
    inline def setSkillGroupName(value: SkillGroupName): Self = StObject.set(x, "SkillGroupName", value.asInstanceOf[js.Any])
    
    inline def setSkillGroupNameUndefined: Self = StObject.set(x, "SkillGroupName", js.undefined)
  }
}
