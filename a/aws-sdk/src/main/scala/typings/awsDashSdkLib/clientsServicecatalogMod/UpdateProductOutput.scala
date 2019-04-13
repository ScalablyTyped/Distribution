package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProductOutput extends js.Object {
  /**
    * Information about the product view.
    */
  var ProductViewDetail: js.UndefOr[ProductViewDetail] = js.undefined
  /**
    * Information about the tags associated with the product.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
}

object UpdateProductOutput {
  @scala.inline
  def apply(ProductViewDetail: ProductViewDetail = null, Tags: Tags = null): UpdateProductOutput = {
    val __obj = js.Dynamic.literal()
    if (ProductViewDetail != null) __obj.updateDynamic("ProductViewDetail")(ProductViewDetail)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[UpdateProductOutput]
  }
}

