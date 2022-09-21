package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSkillsStoreCategoriesResponse extends StObject {
  
  /**
    * The list of categories.
    */
  var CategoryList: js.UndefOr[typings.awsSdk.alexaforbusinessMod.CategoryList] = js.undefined
  
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.undefined
}
object ListSkillsStoreCategoriesResponse {
  
  inline def apply(): ListSkillsStoreCategoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSkillsStoreCategoriesResponse]
  }
  
  extension [Self <: ListSkillsStoreCategoriesResponse](x: Self) {
    
    inline def setCategoryList(value: CategoryList): Self = StObject.set(x, "CategoryList", value.asInstanceOf[js.Any])
    
    inline def setCategoryListUndefined: Self = StObject.set(x, "CategoryList", js.undefined)
    
    inline def setCategoryListVarargs(value: Category*): Self = StObject.set(x, "CategoryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
