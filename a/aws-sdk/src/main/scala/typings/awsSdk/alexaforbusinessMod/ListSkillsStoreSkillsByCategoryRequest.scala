package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSkillsStoreSkillsByCategoryRequest extends StObject {
  
  /**
    * The category ID for which the skills are being retrieved from the skill store.
    */
  var CategoryId: typings.awsSdk.alexaforbusinessMod.CategoryId = js.native
  
  /**
    * The maximum number of skills returned per paginated calls.
    */
  var MaxResults: js.UndefOr[SkillListMaxResults] = js.native
  
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
}
object ListSkillsStoreSkillsByCategoryRequest {
  
  @scala.inline
  def apply(CategoryId: CategoryId): ListSkillsStoreSkillsByCategoryRequest = {
    val __obj = js.Dynamic.literal(CategoryId = CategoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSkillsStoreSkillsByCategoryRequest]
  }
  
  @scala.inline
  implicit class ListSkillsStoreSkillsByCategoryRequestMutableBuilder[Self <: ListSkillsStoreSkillsByCategoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryId(value: CategoryId): Self = StObject.set(x, "CategoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: SkillListMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
