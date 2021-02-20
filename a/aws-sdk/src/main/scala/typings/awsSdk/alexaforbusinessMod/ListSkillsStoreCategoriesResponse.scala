package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSkillsStoreCategoriesResponse extends StObject {
  
  /**
    * The list of categories.
    */
  var CategoryList: js.UndefOr[typings.awsSdk.alexaforbusinessMod.CategoryList] = js.native
  
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
}
object ListSkillsStoreCategoriesResponse {
  
  @scala.inline
  def apply(): ListSkillsStoreCategoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSkillsStoreCategoriesResponse]
  }
  
  @scala.inline
  implicit class ListSkillsStoreCategoriesResponseMutableBuilder[Self <: ListSkillsStoreCategoriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryList(value: CategoryList): Self = StObject.set(x, "CategoryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryListUndefined: Self = StObject.set(x, "CategoryList", js.undefined)
    
    @scala.inline
    def setCategoryListVarargs(value: Category*): Self = StObject.set(x, "CategoryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
