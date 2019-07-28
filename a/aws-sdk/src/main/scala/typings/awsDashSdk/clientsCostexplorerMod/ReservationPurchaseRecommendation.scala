package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservationPurchaseRecommendation extends js.Object {
  /**
    * The account scope that AWS recommends that you purchase this instance for. For example, you can purchase this reservation for an entire organization in AWS Organizations.
    */
  var AccountScope: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.AccountScope] = js.undefined
  /**
    * How many days of previous usage that AWS considers when making this recommendation.
    */
  var LookbackPeriodInDays: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.LookbackPeriodInDays] = js.undefined
  /**
    * The payment option for the reservation. For example, AllUpfront or NoUpfront.
    */
  var PaymentOption: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.PaymentOption] = js.undefined
  /**
    * Details about the recommended purchases.
    */
  var RecommendationDetails: js.UndefOr[ReservationPurchaseRecommendationDetails] = js.undefined
  /**
    * A summary about the recommended purchase.
    */
  var RecommendationSummary: js.UndefOr[ReservationPurchaseRecommendationSummary] = js.undefined
  /**
    * Hardware specifications for the service that you want recommendations for.
    */
  var ServiceSpecification: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.ServiceSpecification] = js.undefined
  /**
    * The term of the reservation that you want recommendations for, in years.
    */
  var TermInYears: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.TermInYears] = js.undefined
}

object ReservationPurchaseRecommendation {
  @scala.inline
  def apply(
    AccountScope: AccountScope = null,
    LookbackPeriodInDays: LookbackPeriodInDays = null,
    PaymentOption: PaymentOption = null,
    RecommendationDetails: ReservationPurchaseRecommendationDetails = null,
    RecommendationSummary: ReservationPurchaseRecommendationSummary = null,
    ServiceSpecification: ServiceSpecification = null,
    TermInYears: TermInYears = null
  ): ReservationPurchaseRecommendation = {
    val __obj = js.Dynamic.literal()
    if (AccountScope != null) __obj.updateDynamic("AccountScope")(AccountScope.asInstanceOf[js.Any])
    if (LookbackPeriodInDays != null) __obj.updateDynamic("LookbackPeriodInDays")(LookbackPeriodInDays.asInstanceOf[js.Any])
    if (PaymentOption != null) __obj.updateDynamic("PaymentOption")(PaymentOption.asInstanceOf[js.Any])
    if (RecommendationDetails != null) __obj.updateDynamic("RecommendationDetails")(RecommendationDetails)
    if (RecommendationSummary != null) __obj.updateDynamic("RecommendationSummary")(RecommendationSummary)
    if (ServiceSpecification != null) __obj.updateDynamic("ServiceSpecification")(ServiceSpecification)
    if (TermInYears != null) __obj.updateDynamic("TermInYears")(TermInYears.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservationPurchaseRecommendation]
  }
}

