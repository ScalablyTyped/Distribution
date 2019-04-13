package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductViewDetail extends js.Object {
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[CreatedTime] = js.undefined
  /**
    * The ARN of the product.
    */
  var ProductARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * Summary information about the product view.
    */
  var ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined
  /**
    * The status of the product.    AVAILABLE - The product is ready for use.    CREATING - Product creation has started; the product is not ready for use.    FAILED - An action failed.  
    */
  var Status: js.UndefOr[Status] = js.undefined
}

object ProductViewDetail {
  @scala.inline
  def apply(
    CreatedTime: CreatedTime = null,
    ProductARN: ResourceARN = null,
    ProductViewSummary: ProductViewSummary = null,
    Status: Status = null
  ): ProductViewDetail = {
    val __obj = js.Dynamic.literal()
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (ProductARN != null) __obj.updateDynamic("ProductARN")(ProductARN)
    if (ProductViewSummary != null) __obj.updateDynamic("ProductViewSummary")(ProductViewSummary)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductViewDetail]
  }
}

