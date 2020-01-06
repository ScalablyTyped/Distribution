package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReservationPurchaseRecommendationRequest extends js.Object {
  /**
    * The account ID that is associated with the recommendation. 
    */
  var AccountId: js.UndefOr[GenericString] = js.native
  /**
    * The account scope that you want recommendations for. PAYER means that AWS includes the master account and any member accounts when it calculates its recommendations. LINKED means that AWS includes only member accounts when it calculates its recommendations. Valid values are PAYER and LINKED.
    */
  var AccountScope: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.AccountScope] = js.native
  /**
    * The number of previous days that you want AWS to consider when it calculates your recommendations.
    */
  var LookbackPeriodInDays: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.LookbackPeriodInDays] = js.native
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextPageToken: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.NextPageToken] = js.native
  /**
    * The number of recommendations that you want returned in a single response object.
    */
  var PageSize: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The reservation purchase option that you want recommendations for.
    */
  var PaymentOption: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.PaymentOption] = js.native
  /**
    * The specific service that you want recommendations for.
    */
  var Service: GenericString = js.native
  /**
    * The hardware specifications for the service instances that you want recommendations for, such as standard or convertible Amazon EC2 instances.
    */
  var ServiceSpecification: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.ServiceSpecification] = js.native
  /**
    * The reservation term that you want recommendations for.
    */
  var TermInYears: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.TermInYears] = js.native
}

object GetReservationPurchaseRecommendationRequest {
  @scala.inline
  def apply(
    Service: GenericString,
    AccountId: GenericString = null,
    AccountScope: AccountScope = null,
    LookbackPeriodInDays: LookbackPeriodInDays = null,
    NextPageToken: NextPageToken = null,
    PageSize: Int | Double = null,
    PaymentOption: PaymentOption = null,
    ServiceSpecification: ServiceSpecification = null,
    TermInYears: TermInYears = null
  ): GetReservationPurchaseRecommendationRequest = {
    val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (AccountScope != null) __obj.updateDynamic("AccountScope")(AccountScope.asInstanceOf[js.Any])
    if (LookbackPeriodInDays != null) __obj.updateDynamic("LookbackPeriodInDays")(LookbackPeriodInDays.asInstanceOf[js.Any])
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (PaymentOption != null) __obj.updateDynamic("PaymentOption")(PaymentOption.asInstanceOf[js.Any])
    if (ServiceSpecification != null) __obj.updateDynamic("ServiceSpecification")(ServiceSpecification.asInstanceOf[js.Any])
    if (TermInYears != null) __obj.updateDynamic("TermInYears")(TermInYears.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservationPurchaseRecommendationRequest]
  }
}

