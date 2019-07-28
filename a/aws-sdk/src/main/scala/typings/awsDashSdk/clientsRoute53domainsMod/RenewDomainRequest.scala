package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenewDomainRequest extends js.Object {
  /**
    * The year when the registration for the domain is set to expire. This value must match the current expiration date for the domain.
    */
  var CurrentExpiryYear: typings.awsDashSdk.clientsRoute53domainsMod.CurrentExpiryYear
  /**
    * The name of the domain that you want to renew.
    */
  var DomainName: typings.awsDashSdk.clientsRoute53domainsMod.DomainName
  /**
    * The number of years that you want to renew the domain for. The maximum number of years depends on the top-level domain. For the range of valid values for your domain, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide. Default: 1
    */
  var DurationInYears: js.UndefOr[typings.awsDashSdk.clientsRoute53domainsMod.DurationInYears] = js.undefined
}

object RenewDomainRequest {
  @scala.inline
  def apply(
    CurrentExpiryYear: CurrentExpiryYear,
    DomainName: DomainName,
    DurationInYears: js.UndefOr[DurationInYears] = js.undefined
  ): RenewDomainRequest = {
    val __obj = js.Dynamic.literal(CurrentExpiryYear = CurrentExpiryYear, DomainName = DomainName)
    if (!js.isUndefined(DurationInYears)) __obj.updateDynamic("DurationInYears")(DurationInYears)
    __obj.asInstanceOf[RenewDomainRequest]
  }
}

