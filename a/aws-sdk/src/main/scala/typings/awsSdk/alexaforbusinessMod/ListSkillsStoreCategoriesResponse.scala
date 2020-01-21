package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(CategoryList: CategoryList = null, NextToken: NextToken = null): ListSkillsStoreCategoriesResponse = {
    val __obj = js.Dynamic.literal()
    if (CategoryList != null) __obj.updateDynamic("CategoryList")(CategoryList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSkillsStoreCategoriesResponse]
  }
}

