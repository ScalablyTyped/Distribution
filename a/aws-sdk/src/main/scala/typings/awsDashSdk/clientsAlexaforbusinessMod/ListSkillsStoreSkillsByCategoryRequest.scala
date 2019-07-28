package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSkillsStoreSkillsByCategoryRequest extends js.Object {
  /**
    * The category ID for which the skills are being retrieved from the skill store.
    */
  var CategoryId: typings.awsDashSdk.clientsAlexaforbusinessMod.CategoryId
  /**
    * The maximum number of skills returned per paginated calls.
    */
  var MaxResults: js.UndefOr[SkillListMaxResults] = js.undefined
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
}

object ListSkillsStoreSkillsByCategoryRequest {
  @scala.inline
  def apply(
    CategoryId: CategoryId,
    MaxResults: js.UndefOr[SkillListMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListSkillsStoreSkillsByCategoryRequest = {
    val __obj = js.Dynamic.literal(CategoryId = CategoryId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListSkillsStoreSkillsByCategoryRequest]
  }
}

