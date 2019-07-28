package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProductAsAdminOutput extends js.Object {
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Budgets] = js.undefined
  /**
    * Information about the product view.
    */
  var ProductViewDetail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProductViewDetail] = js.undefined
  /**
    * Information about the provisioning artifacts (also known as versions) for the specified product.
    */
  var ProvisioningArtifactSummaries: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisioningArtifactSummaries] = js.undefined
  /**
    * Information about the TagOptions associated with the product.
    */
  var TagOptions: js.UndefOr[TagOptionDetails] = js.undefined
  /**
    * Information about the tags associated with the product.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Tags] = js.undefined
}

object DescribeProductAsAdminOutput {
  @scala.inline
  def apply(
    Budgets: Budgets = null,
    ProductViewDetail: ProductViewDetail = null,
    ProvisioningArtifactSummaries: ProvisioningArtifactSummaries = null,
    TagOptions: TagOptionDetails = null,
    Tags: Tags = null
  ): DescribeProductAsAdminOutput = {
    val __obj = js.Dynamic.literal()
    if (Budgets != null) __obj.updateDynamic("Budgets")(Budgets)
    if (ProductViewDetail != null) __obj.updateDynamic("ProductViewDetail")(ProductViewDetail)
    if (ProvisioningArtifactSummaries != null) __obj.updateDynamic("ProvisioningArtifactSummaries")(ProvisioningArtifactSummaries)
    if (TagOptions != null) __obj.updateDynamic("TagOptions")(TagOptions)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[DescribeProductAsAdminOutput]
  }
}

