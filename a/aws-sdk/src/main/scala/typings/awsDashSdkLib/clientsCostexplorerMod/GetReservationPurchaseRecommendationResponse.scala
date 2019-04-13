package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReservationPurchaseRecommendationResponse extends js.Object {
  /**
    * Information about this specific recommendation call, such as the time stamp for when Cost Explorer generated this recommendation.
    */
  var Metadata: js.UndefOr[ReservationPurchaseRecommendationMetadata] = js.undefined
  /**
    * The pagination token for the next set of retrievable results.
    */
  var NextPageToken: js.UndefOr[NextPageToken] = js.undefined
  /**
    * Recommendations for reservations to purchase.
    */
  var Recommendations: js.UndefOr[ReservationPurchaseRecommendations] = js.undefined
}

object GetReservationPurchaseRecommendationResponse {
  @scala.inline
  def apply(
    Metadata: ReservationPurchaseRecommendationMetadata = null,
    NextPageToken: NextPageToken = null,
    Recommendations: ReservationPurchaseRecommendations = null
  ): GetReservationPurchaseRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata)
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (Recommendations != null) __obj.updateDynamic("Recommendations")(Recommendations)
    __obj.asInstanceOf[GetReservationPurchaseRecommendationResponse]
  }
}

