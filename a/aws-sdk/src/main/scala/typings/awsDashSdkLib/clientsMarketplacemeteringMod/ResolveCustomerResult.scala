package typings
package awsDashSdkLib.clientsMarketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveCustomerResult extends js.Object {
  /**
    * The CustomerIdentifier is used to identify an individual customer in your application. Calls to BatchMeterUsage require CustomerIdentifiers for each UsageRecord.
    */
  var CustomerIdentifier: js.UndefOr[CustomerIdentifier] = js.undefined
  /**
    * The product code is returned to confirm that the buyer is registering for your product. Subsequent BatchMeterUsage calls should be made using this product code.
    */
  var ProductCode: js.UndefOr[ProductCode] = js.undefined
}

object ResolveCustomerResult {
  @scala.inline
  def apply(CustomerIdentifier: CustomerIdentifier = null, ProductCode: ProductCode = null): ResolveCustomerResult = {
    val __obj = js.Dynamic.literal()
    if (CustomerIdentifier != null) __obj.updateDynamic("CustomerIdentifier")(CustomerIdentifier)
    if (ProductCode != null) __obj.updateDynamic("ProductCode")(ProductCode)
    __obj.asInstanceOf[ResolveCustomerResult]
  }
}

