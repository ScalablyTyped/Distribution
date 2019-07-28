package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRightsizingRecommendationRequest extends js.Object {
  var Filter: js.UndefOr[Expression] = js.undefined
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextPageToken: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  /**
    * The number of recommendations that you want returned in a single response object.
    */
  var PageSize: js.UndefOr[NonNegativeInteger] = js.undefined
  /**
    * The specific service that you want recommendations for.
    */
  var Service: GenericString
}

object GetRightsizingRecommendationRequest {
  @scala.inline
  def apply(
    Service: GenericString,
    Filter: Expression = null,
    NextPageToken: NextPageToken = null,
    PageSize: js.UndefOr[NonNegativeInteger] = js.undefined
  ): GetRightsizingRecommendationRequest = {
    val __obj = js.Dynamic.literal(Service = Service)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    __obj.asInstanceOf[GetRightsizingRecommendationRequest]
  }
}

