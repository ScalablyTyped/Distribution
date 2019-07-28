package typings.awsDashSdk.clientsPersonalizeruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRecommendationsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.
    */
  var campaignArn: Arn
  /**
    * The item ID to provide recommendations for. Required for RELATED_ITEMS recipe type.
    */
  var itemId: js.UndefOr[ItemID] = js.undefined
  /**
    * The number of results to return. The default is 25. The maximum is 100.
    */
  var numResults: js.UndefOr[NumResults] = js.undefined
  /**
    * The user ID to provide recommendations for. Required for USER_PERSONALIZATION recipe type.
    */
  var userId: js.UndefOr[UserID] = js.undefined
}

object GetRecommendationsRequest {
  @scala.inline
  def apply(
    campaignArn: Arn,
    itemId: ItemID = null,
    numResults: js.UndefOr[NumResults] = js.undefined,
    userId: UserID = null
  ): GetRecommendationsRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn)
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (!js.isUndefined(numResults)) __obj.updateDynamic("numResults")(numResults)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[GetRecommendationsRequest]
  }
}

