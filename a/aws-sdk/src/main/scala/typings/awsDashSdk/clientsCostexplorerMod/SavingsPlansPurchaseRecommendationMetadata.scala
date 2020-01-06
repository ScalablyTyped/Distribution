package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansPurchaseRecommendationMetadata extends js.Object {
  /**
    * The timestamp showing when the recommendations were generated.
    */
  var GenerationTimestamp: js.UndefOr[GenericString] = js.native
  /**
    * The unique identifier for the recommendation set.
    */
  var RecommendationId: js.UndefOr[GenericString] = js.native
}

object SavingsPlansPurchaseRecommendationMetadata {
  @scala.inline
  def apply(GenerationTimestamp: GenericString = null, RecommendationId: GenericString = null): SavingsPlansPurchaseRecommendationMetadata = {
    val __obj = js.Dynamic.literal()
    if (GenerationTimestamp != null) __obj.updateDynamic("GenerationTimestamp")(GenerationTimestamp.asInstanceOf[js.Any])
    if (RecommendationId != null) __obj.updateDynamic("RecommendationId")(RecommendationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlansPurchaseRecommendationMetadata]
  }
}

