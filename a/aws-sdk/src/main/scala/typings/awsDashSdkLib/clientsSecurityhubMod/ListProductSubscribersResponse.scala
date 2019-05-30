package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProductSubscribersResponse extends js.Object {
  /**
    * The token that is required for pagination.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of account IDs that are subscribed to the product.
    */
  var ProductSubscribers: js.UndefOr[ProductSubscribersList] = js.undefined
}

object ListProductSubscribersResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, ProductSubscribers: ProductSubscribersList = null): ListProductSubscribersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ProductSubscribers != null) __obj.updateDynamic("ProductSubscribers")(ProductSubscribers)
    __obj.asInstanceOf[ListProductSubscribersResponse]
  }
}

