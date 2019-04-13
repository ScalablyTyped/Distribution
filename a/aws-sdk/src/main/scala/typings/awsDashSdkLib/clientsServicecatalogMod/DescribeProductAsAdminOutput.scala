package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProductAsAdminOutput extends js.Object {
  /**
    * Information about the product view.
    */
  var ProductViewDetail: js.UndefOr[ProductViewDetail] = js.undefined
  /**
    * Information about the provisioning artifacts (also known as versions) for the specified product.
    */
  var ProvisioningArtifactSummaries: js.UndefOr[ProvisioningArtifactSummaries] = js.undefined
  /**
    * Information about the TagOptions associated with the product.
    */
  var TagOptions: js.UndefOr[TagOptionDetails] = js.undefined
  /**
    * Information about the tags associated with the product.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
}

object DescribeProductAsAdminOutput {
  @scala.inline
  def apply(
    ProductViewDetail: ProductViewDetail = null,
    ProvisioningArtifactSummaries: ProvisioningArtifactSummaries = null,
    TagOptions: TagOptionDetails = null,
    Tags: Tags = null
  ): DescribeProductAsAdminOutput = {
    val __obj = js.Dynamic.literal()
    if (ProductViewDetail != null) __obj.updateDynamic("ProductViewDetail")(ProductViewDetail)
    if (ProvisioningArtifactSummaries != null) __obj.updateDynamic("ProvisioningArtifactSummaries")(ProvisioningArtifactSummaries)
    if (TagOptions != null) __obj.updateDynamic("TagOptions")(TagOptions)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[DescribeProductAsAdminOutput]
  }
}

