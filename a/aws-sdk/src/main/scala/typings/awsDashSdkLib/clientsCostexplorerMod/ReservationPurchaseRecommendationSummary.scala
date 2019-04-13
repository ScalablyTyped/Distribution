package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservationPurchaseRecommendationSummary extends js.Object {
  /**
    * The currency code used for this recommendation.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.undefined
  /**
    * The total amount that AWS estimates that this recommendation could save you in a month.
    */
  var TotalEstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.undefined
  /**
    * The total amount that AWS estimates that this recommendation could save you in a month, as a percentage of your costs.
    */
  var TotalEstimatedMonthlySavingsPercentage: js.UndefOr[GenericString] = js.undefined
}

object ReservationPurchaseRecommendationSummary {
  @scala.inline
  def apply(
    CurrencyCode: GenericString = null,
    TotalEstimatedMonthlySavingsAmount: GenericString = null,
    TotalEstimatedMonthlySavingsPercentage: GenericString = null
  ): ReservationPurchaseRecommendationSummary = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode)
    if (TotalEstimatedMonthlySavingsAmount != null) __obj.updateDynamic("TotalEstimatedMonthlySavingsAmount")(TotalEstimatedMonthlySavingsAmount)
    if (TotalEstimatedMonthlySavingsPercentage != null) __obj.updateDynamic("TotalEstimatedMonthlySavingsPercentage")(TotalEstimatedMonthlySavingsPercentage)
    __obj.asInstanceOf[ReservationPurchaseRecommendationSummary]
  }
}

