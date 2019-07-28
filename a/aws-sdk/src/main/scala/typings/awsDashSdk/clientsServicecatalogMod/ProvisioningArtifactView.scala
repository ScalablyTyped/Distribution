package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningArtifactView extends js.Object {
  /**
    * Summary information about a product view.
    */
  var ProductViewSummary: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProductViewSummary] = js.undefined
  /**
    * Information about a provisioning artifact. A provisioning artifact is also known as a product version.
    */
  var ProvisioningArtifact: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisioningArtifact] = js.undefined
}

object ProvisioningArtifactView {
  @scala.inline
  def apply(ProductViewSummary: ProductViewSummary = null, ProvisioningArtifact: ProvisioningArtifact = null): ProvisioningArtifactView = {
    val __obj = js.Dynamic.literal()
    if (ProductViewSummary != null) __obj.updateDynamic("ProductViewSummary")(ProductViewSummary)
    if (ProvisioningArtifact != null) __obj.updateDynamic("ProvisioningArtifact")(ProvisioningArtifact)
    __obj.asInstanceOf[ProvisioningArtifactView]
  }
}

