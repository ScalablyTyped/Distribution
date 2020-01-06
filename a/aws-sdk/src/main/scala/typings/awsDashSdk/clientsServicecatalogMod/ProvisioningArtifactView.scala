package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningArtifactView extends js.Object {
  /**
    * Summary information about a product view.
    */
  var ProductViewSummary: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProductViewSummary] = js.native
  /**
    * Information about a provisioning artifact. A provisioning artifact is also known as a product version.
    */
  var ProvisioningArtifact: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisioningArtifact] = js.native
}

object ProvisioningArtifactView {
  @scala.inline
  def apply(ProductViewSummary: ProductViewSummary = null, ProvisioningArtifact: ProvisioningArtifact = null): ProvisioningArtifactView = {
    val __obj = js.Dynamic.literal()
    if (ProductViewSummary != null) __obj.updateDynamic("ProductViewSummary")(ProductViewSummary.asInstanceOf[js.Any])
    if (ProvisioningArtifact != null) __obj.updateDynamic("ProvisioningArtifact")(ProvisioningArtifact.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningArtifactView]
  }
}

