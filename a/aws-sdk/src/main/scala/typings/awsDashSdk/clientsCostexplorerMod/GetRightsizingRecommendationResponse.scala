package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRightsizingRecommendationResponse extends js.Object {
  /**
    * Information regarding this specific recommendation set.
    */
  var Metadata: js.UndefOr[RightsizingRecommendationMetadata] = js.undefined
  /**
    * The token to retrieve the next set of results.
    */
  var NextPageToken: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  /**
    * Recommendations to rightsize resources.
    */
  var RightsizingRecommendations: js.UndefOr[RightsizingRecommendationList] = js.undefined
  /**
    * Summary of this recommendation set.
    */
  var Summary: js.UndefOr[RightsizingRecommendationSummary] = js.undefined
}

object GetRightsizingRecommendationResponse {
  @scala.inline
  def apply(
    Metadata: RightsizingRecommendationMetadata = null,
    NextPageToken: NextPageToken = null,
    RightsizingRecommendations: RightsizingRecommendationList = null,
    Summary: RightsizingRecommendationSummary = null
  ): GetRightsizingRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata)
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (RightsizingRecommendations != null) __obj.updateDynamic("RightsizingRecommendations")(RightsizingRecommendations)
    if (Summary != null) __obj.updateDynamic("Summary")(Summary)
    __obj.asInstanceOf[GetRightsizingRecommendationResponse]
  }
}

