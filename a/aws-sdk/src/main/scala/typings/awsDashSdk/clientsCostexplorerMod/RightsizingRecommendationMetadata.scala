package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RightsizingRecommendationMetadata extends js.Object {
  /**
    *  The time stamp for when Amazon Web Services made this recommendation.
    */
  var GenerationTimestamp: js.UndefOr[GenericString] = js.undefined
  /**
    *  How many days of previous usage that Amazon Web Services considers when making this recommendation.
    */
  var LookbackPeriodInDays: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.LookbackPeriodInDays] = js.undefined
  /**
    *  The ID for this specific recommendation.
    */
  var RecommendationId: js.UndefOr[GenericString] = js.undefined
}

object RightsizingRecommendationMetadata {
  @scala.inline
  def apply(
    GenerationTimestamp: GenericString = null,
    LookbackPeriodInDays: LookbackPeriodInDays = null,
    RecommendationId: GenericString = null
  ): RightsizingRecommendationMetadata = {
    val __obj = js.Dynamic.literal()
    if (GenerationTimestamp != null) __obj.updateDynamic("GenerationTimestamp")(GenerationTimestamp)
    if (LookbackPeriodInDays != null) __obj.updateDynamic("LookbackPeriodInDays")(LookbackPeriodInDays.asInstanceOf[js.Any])
    if (RecommendationId != null) __obj.updateDynamic("RecommendationId")(RecommendationId)
    __obj.asInstanceOf[RightsizingRecommendationMetadata]
  }
}

