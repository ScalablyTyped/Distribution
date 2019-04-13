package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReservationPurchaseRecommendationRequest extends js.Object {
  /**
    * The account ID that is associated with the recommendation. 
    */
  var AccountId: js.UndefOr[GenericString] = js.undefined
  /**
    * The account scope that you want recommendations for. PAYER means that AWS includes the master account and any member accounts when it calculates its recommendations. LINKED means that AWS includes only member accounts when it calculates its recommendations. Valid values are PAYER and LINKED.
    */
  var AccountScope: js.UndefOr[AccountScope] = js.undefined
  /**
    * The number of previous days that you want AWS to consider when it calculates your recommendations.
    */
  var LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays] = js.undefined
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextPageToken: js.UndefOr[NextPageToken] = js.undefined
  /**
    * The number of recommendations that you want returned in a single response object.
    */
  var PageSize: js.UndefOr[NonNegativeInteger] = js.undefined
  /**
    * The reservation purchase option that you want recommendations for.
    */
  var PaymentOption: js.UndefOr[PaymentOption] = js.undefined
  /**
    * The specific service that you want recommendations for.
    */
  var Service: GenericString
  /**
    * The hardware specifications for the service instances that you want recommendations for, such as standard or convertible Amazon EC2 instances.
    */
  var ServiceSpecification: js.UndefOr[ServiceSpecification] = js.undefined
  /**
    * The reservation term that you want recommendations for.
    */
  var TermInYears: js.UndefOr[TermInYears] = js.undefined
}

object GetReservationPurchaseRecommendationRequest {
  @scala.inline
  def apply(
    Service: GenericString,
    AccountId: GenericString = null,
    AccountScope: AccountScope = null,
    LookbackPeriodInDays: LookbackPeriodInDays = null,
    NextPageToken: NextPageToken = null,
    PageSize: js.UndefOr[NonNegativeInteger] = js.undefined,
    PaymentOption: PaymentOption = null,
    ServiceSpecification: ServiceSpecification = null,
    TermInYears: TermInYears = null
  ): GetReservationPurchaseRecommendationRequest = {
    val __obj = js.Dynamic.literal(Service = Service)
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (AccountScope != null) __obj.updateDynamic("AccountScope")(AccountScope.asInstanceOf[js.Any])
    if (LookbackPeriodInDays != null) __obj.updateDynamic("LookbackPeriodInDays")(LookbackPeriodInDays.asInstanceOf[js.Any])
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    if (PaymentOption != null) __obj.updateDynamic("PaymentOption")(PaymentOption.asInstanceOf[js.Any])
    if (ServiceSpecification != null) __obj.updateDynamic("ServiceSpecification")(ServiceSpecification)
    if (TermInYears != null) __obj.updateDynamic("TermInYears")(TermInYears.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservationPurchaseRecommendationRequest]
  }
}

