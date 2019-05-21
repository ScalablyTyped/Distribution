package typings
package awsDashSdkLib.clientsMarketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageRecord extends js.Object {
  /**
    * The CustomerIdentifier is obtained through the ResolveCustomer operation and represents an individual buyer in your application.
    */
  var CustomerIdentifier: awsDashSdkLib.clientsMarketplacemeteringMod.CustomerIdentifier
  /**
    * During the process of registering a product on AWS Marketplace, up to eight dimensions are specified. These represent different units of value in your application.
    */
  var Dimension: UsageDimension
  /**
    * The quantity of usage consumed by the customer for the given dimension and time. Defaults to 0 if not specified.
    */
  var Quantity: js.UndefOr[UsageQuantity] = js.undefined
  /**
    * Timestamp, in UTC, for which the usage is being reported. Your application can meter usage for up to one hour in the past. Make sure the timestamp value is not before the start of the software usage.
    */
  var Timestamp: awsDashSdkLib.clientsMarketplacemeteringMod.Timestamp
}

object UsageRecord {
  @scala.inline
  def apply(
    CustomerIdentifier: CustomerIdentifier,
    Dimension: UsageDimension,
    Timestamp: Timestamp,
    Quantity: js.UndefOr[UsageQuantity] = js.undefined
  ): UsageRecord = {
    val __obj = js.Dynamic.literal(CustomerIdentifier = CustomerIdentifier, Dimension = Dimension, Timestamp = Timestamp)
    if (!js.isUndefined(Quantity)) __obj.updateDynamic("Quantity")(Quantity)
    __obj.asInstanceOf[UsageRecord]
  }
}

