package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProductViewOutput extends js.Object {
  /**
    * Summary information about the product.
    */
  var ProductViewSummary: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProductViewSummary] = js.undefined
  /**
    * Information about the provisioning artifacts for the product.
    */
  var ProvisioningArtifacts: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisioningArtifacts] = js.undefined
}

object DescribeProductViewOutput {
  @scala.inline
  def apply(ProductViewSummary: ProductViewSummary = null, ProvisioningArtifacts: ProvisioningArtifacts = null): DescribeProductViewOutput = {
    val __obj = js.Dynamic.literal()
    if (ProductViewSummary != null) __obj.updateDynamic("ProductViewSummary")(ProductViewSummary)
    if (ProvisioningArtifacts != null) __obj.updateDynamic("ProvisioningArtifacts")(ProvisioningArtifacts)
    __obj.asInstanceOf[DescribeProductViewOutput]
  }
}

