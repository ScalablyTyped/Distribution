package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProductOutput extends js.Object {
  /**
    * Summary information about the product view.
    */
  var ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined
  /**
    * Information about the provisioning artifacts for the specified product.
    */
  var ProvisioningArtifacts: js.UndefOr[ProvisioningArtifacts] = js.undefined
}

object DescribeProductOutput {
  @scala.inline
  def apply(ProductViewSummary: ProductViewSummary = null, ProvisioningArtifacts: ProvisioningArtifacts = null): DescribeProductOutput = {
    val __obj = js.Dynamic.literal()
    if (ProductViewSummary != null) __obj.updateDynamic("ProductViewSummary")(ProductViewSummary)
    if (ProvisioningArtifacts != null) __obj.updateDynamic("ProvisioningArtifacts")(ProvisioningArtifacts)
    __obj.asInstanceOf[DescribeProductOutput]
  }
}

