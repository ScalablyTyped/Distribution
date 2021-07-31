package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSkillsStoreSkillsByCategoryResponse extends StObject {
  
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.undefined
  
  /**
    * The skill store skills.
    */
  var SkillsStoreSkills: js.UndefOr[SkillsStoreSkillList] = js.undefined
}
object ListSkillsStoreSkillsByCategoryResponse {
  
  @scala.inline
  def apply(): ListSkillsStoreSkillsByCategoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSkillsStoreSkillsByCategoryResponse]
  }
  
  @scala.inline
  implicit class ListSkillsStoreSkillsByCategoryResponseMutableBuilder[Self <: ListSkillsStoreSkillsByCategoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSkillsStoreSkills(value: SkillsStoreSkillList): Self = StObject.set(x, "SkillsStoreSkills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillsStoreSkillsUndefined: Self = StObject.set(x, "SkillsStoreSkills", js.undefined)
    
    @scala.inline
    def setSkillsStoreSkillsVarargs(value: SkillsStoreSkill*): Self = StObject.set(x, "SkillsStoreSkills", js.Array(value :_*))
  }
}
