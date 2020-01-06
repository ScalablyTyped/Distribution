package typings.awsDashSdk.clientsComputeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecommendationSummary extends js.Object {
  /**
    * The AWS account ID of the recommendation summary.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  /**
    * The resource type of the recommendation.
    */
  var recommendationResourceType: js.UndefOr[RecommendationSourceType] = js.native
  /**
    * An array of objects that describe a recommendation summary.
    */
  var summaries: js.UndefOr[Summaries] = js.native
}

object RecommendationSummary {
  @scala.inline
  def apply(
    accountId: AccountId = null,
    recommendationResourceType: RecommendationSourceType = null,
    summaries: Summaries = null
  ): RecommendationSummary = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (recommendationResourceType != null) __obj.updateDynamic("recommendationResourceType")(recommendationResourceType.asInstanceOf[js.Any])
    if (summaries != null) __obj.updateDynamic("summaries")(summaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationSummary]
  }
}

