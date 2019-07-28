package typings.awsDashSdk.clientsMarketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeterUsageRequest extends js.Object {
  /**
    * Checks whether you have the permissions required for the action, but does not make the request. If you have the permissions, the request returns DryRunOperation; otherwise, it returns UnauthorizedException. Defaults to false if not specified.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as the one used during the publishing of a new product.
    */
  var ProductCode: typings.awsDashSdk.clientsMarketplacemeteringMod.ProductCode
  /**
    * Timestamp, in UTC, for which the usage is being reported. Your application can meter usage for up to one hour in the past. Make sure the timestamp value is not before the start of the software usage.
    */
  var Timestamp: typings.awsDashSdk.clientsMarketplacemeteringMod.Timestamp
  /**
    * It will be one of the fcp dimension name provided during the publishing of the product.
    */
  var UsageDimension: typings.awsDashSdk.clientsMarketplacemeteringMod.UsageDimension
  /**
    * Consumption value for the hour. Defaults to 0 if not specified.
    */
  var UsageQuantity: js.UndefOr[typings.awsDashSdk.clientsMarketplacemeteringMod.UsageQuantity] = js.undefined
}

object MeterUsageRequest {
  @scala.inline
  def apply(
    ProductCode: ProductCode,
    Timestamp: Timestamp,
    UsageDimension: UsageDimension,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    UsageQuantity: js.UndefOr[UsageQuantity] = js.undefined
  ): MeterUsageRequest = {
    val __obj = js.Dynamic.literal(ProductCode = ProductCode, Timestamp = Timestamp, UsageDimension = UsageDimension)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(UsageQuantity)) __obj.updateDynamic("UsageQuantity")(UsageQuantity)
    __obj.asInstanceOf[MeterUsageRequest]
  }
}

