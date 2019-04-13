package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservationPurchaseRecommendationMetadata extends js.Object {
  /**
    * The time stamp for when AWS made this recommendation.
    */
  var GenerationTimestamp: js.UndefOr[GenericString] = js.undefined
  /**
    * The ID for this specific recommendation.
    */
  var RecommendationId: js.UndefOr[GenericString] = js.undefined
}

object ReservationPurchaseRecommendationMetadata {
  @scala.inline
  def apply(GenerationTimestamp: GenericString = null, RecommendationId: GenericString = null): ReservationPurchaseRecommendationMetadata = {
    val __obj = js.Dynamic.literal()
    if (GenerationTimestamp != null) __obj.updateDynamic("GenerationTimestamp")(GenerationTimestamp)
    if (RecommendationId != null) __obj.updateDynamic("RecommendationId")(RecommendationId)
    __obj.asInstanceOf[ReservationPurchaseRecommendationMetadata]
  }
}

