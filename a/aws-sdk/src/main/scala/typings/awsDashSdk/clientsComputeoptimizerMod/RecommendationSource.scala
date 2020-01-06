package typings.awsDashSdk.clientsComputeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecommendationSource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the recommendation source.
    */
  var recommendationSourceArn: js.UndefOr[RecommendationSourceArn] = js.native
  /**
    * The resource type of the recommendation source.
    */
  var recommendationSourceType: js.UndefOr[RecommendationSourceType] = js.native
}

object RecommendationSource {
  @scala.inline
  def apply(
    recommendationSourceArn: RecommendationSourceArn = null,
    recommendationSourceType: RecommendationSourceType = null
  ): RecommendationSource = {
    val __obj = js.Dynamic.literal()
    if (recommendationSourceArn != null) __obj.updateDynamic("recommendationSourceArn")(recommendationSourceArn.asInstanceOf[js.Any])
    if (recommendationSourceType != null) __obj.updateDynamic("recommendationSourceType")(recommendationSourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationSource]
  }
}

