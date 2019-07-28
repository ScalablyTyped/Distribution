package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateRecommendationDetail extends js.Object {
  /**
    *  The currency code that Amazon Web Services used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.undefined
  /**
    *  Estimated savings resulting from modification, on a monthly basis.
    */
  var EstimatedMonthlySavings: js.UndefOr[GenericString] = js.undefined
}

object TerminateRecommendationDetail {
  @scala.inline
  def apply(CurrencyCode: GenericString = null, EstimatedMonthlySavings: GenericString = null): TerminateRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode)
    if (EstimatedMonthlySavings != null) __obj.updateDynamic("EstimatedMonthlySavings")(EstimatedMonthlySavings)
    __obj.asInstanceOf[TerminateRecommendationDetail]
  }
}

