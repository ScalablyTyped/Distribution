package typings.awsDashSdk.clientsMarketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageRecord extends js.Object {
  /**
    * The CustomerIdentifier is obtained through the ResolveCustomer operation and represents an individual buyer in your application.
    */
  var CustomerIdentifier: typings.awsDashSdk.clientsMarketplacemeteringMod.CustomerIdentifier = js.native
  /**
    * During the process of registering a product on AWS Marketplace, up to eight dimensions are specified. These represent different units of value in your application.
    */
  var Dimension: UsageDimension = js.native
  /**
    * The quantity of usage consumed by the customer for the given dimension and time. Defaults to 0 if not specified.
    */
  var Quantity: js.UndefOr[UsageQuantity] = js.native
  /**
    * Timestamp, in UTC, for which the usage is being reported. Your application can meter usage for up to one hour in the past. Make sure the timestamp value is not before the start of the software usage.
    */
  var Timestamp: typings.awsDashSdk.clientsMarketplacemeteringMod.Timestamp = js.native
}

object UsageRecord {
  @scala.inline
  def apply(
    CustomerIdentifier: CustomerIdentifier,
    Dimension: UsageDimension,
    Timestamp: Timestamp,
    Quantity: Int | Double = null
  ): UsageRecord = {
    val __obj = js.Dynamic.literal(CustomerIdentifier = CustomerIdentifier.asInstanceOf[js.Any], Dimension = Dimension.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    if (Quantity != null) __obj.updateDynamic("Quantity")(Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageRecord]
  }
}

