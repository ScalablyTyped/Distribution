package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSkillGroupRequest extends StObject {
  
  /**
    * A unique, user-specified identifier for this request that ensures idempotency. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.native
  
  /**
    * The description for the skill group.
    */
  var Description: js.UndefOr[SkillGroupDescription] = js.native
  
  /**
    * The name for the skill group.
    */
  var SkillGroupName: typings.awsSdk.alexaforbusinessMod.SkillGroupName = js.native
  
  /**
    * The tags for the skill group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateSkillGroupRequest {
  
  @scala.inline
  def apply(SkillGroupName: SkillGroupName): CreateSkillGroupRequest = {
    val __obj = js.Dynamic.literal(SkillGroupName = SkillGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSkillGroupRequest]
  }
  
  @scala.inline
  implicit class CreateSkillGroupRequestMutableBuilder[Self <: CreateSkillGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setDescription(value: SkillGroupDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setSkillGroupName(value: SkillGroupName): Self = StObject.set(x, "SkillGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
