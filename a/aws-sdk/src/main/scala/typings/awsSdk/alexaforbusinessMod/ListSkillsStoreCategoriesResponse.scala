package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSkillsStoreCategoriesResponse extends js.Object {
  
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
  implicit class ListSkillsStoreCategoriesResponseOps[Self <: ListSkillsStoreCategoriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCategoryListVarargs(value: Category*): Self = this.set("CategoryList", js.Array(value :_*))
    
    @scala.inline
    def setCategoryList(value: CategoryList): Self = this.set("CategoryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryList: Self = this.set("CategoryList", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
