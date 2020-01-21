package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSkillsStoreSkillsByCategoryRequest extends js.Object {
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
  def apply(CategoryId: CategoryId, MaxResults: Int | Double = null, NextToken: NextToken = null): ListSkillsStoreSkillsByCategoryRequest = {
    val __obj = js.Dynamic.literal(CategoryId = CategoryId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSkillsStoreSkillsByCategoryRequest]
  }
}

