package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateRecommendationDetail extends js.Object {
  /**
    *  The currency code that Amazon Web Services used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    *  Estimated savings resulting from modification, on a monthly basis.
    */
  var EstimatedMonthlySavings: js.UndefOr[GenericString] = js.native
}

object TerminateRecommendationDetail {
  @scala.inline
  def apply(CurrencyCode: GenericString = null, EstimatedMonthlySavings: GenericString = null): TerminateRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (EstimatedMonthlySavings != null) __obj.updateDynamic("EstimatedMonthlySavings")(EstimatedMonthlySavings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateRecommendationDetail]
  }
}

