package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEnabledProductsForImportResponse extends js.Object {
  /**
    * The token that is required for pagination.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of ARNs for the resources that represent your subscriptions to products. 
    */
  var ProductSubscriptions: js.UndefOr[ProductSubscriptionArnList] = js.undefined
}

object ListEnabledProductsForImportResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, ProductSubscriptions: ProductSubscriptionArnList = null): ListEnabledProductsForImportResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ProductSubscriptions != null) __obj.updateDynamic("ProductSubscriptions")(ProductSubscriptions)
    __obj.asInstanceOf[ListEnabledProductsForImportResponse]
  }
}

