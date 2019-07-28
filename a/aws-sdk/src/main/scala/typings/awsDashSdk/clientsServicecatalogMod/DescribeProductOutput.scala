package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProductOutput extends js.Object {
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Budgets] = js.undefined
  /**
    * Summary information about the product view.
    */
  var ProductViewSummary: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProductViewSummary] = js.undefined
  /**
    * Information about the provisioning artifacts for the specified product.
    */
  var ProvisioningArtifacts: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisioningArtifacts] = js.undefined
}

object DescribeProductOutput {
  @scala.inline
  def apply(
    Budgets: Budgets = null,
    ProductViewSummary: ProductViewSummary = null,
    ProvisioningArtifacts: ProvisioningArtifacts = null
  ): DescribeProductOutput = {
    val __obj = js.Dynamic.literal()
    if (Budgets != null) __obj.updateDynamic("Budgets")(Budgets)
    if (ProductViewSummary != null) __obj.updateDynamic("ProductViewSummary")(ProductViewSummary)
    if (ProvisioningArtifacts != null) __obj.updateDynamic("ProvisioningArtifacts")(ProvisioningArtifacts)
    __obj.asInstanceOf[DescribeProductOutput]
  }
}

