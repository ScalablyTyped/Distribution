package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSkillsStoreCategoriesResponse extends js.Object {
  /**
    * The list of categories.
    */
  var CategoryList: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.CategoryList] = js.undefined
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
}

object ListSkillsStoreCategoriesResponse {
  @scala.inline
  def apply(CategoryList: CategoryList = null, NextToken: NextToken = null): ListSkillsStoreCategoriesResponse = {
    val __obj = js.Dynamic.literal()
    if (CategoryList != null) __obj.updateDynamic("CategoryList")(CategoryList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListSkillsStoreCategoriesResponse]
  }
}

