package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProductOutput extends js.Object {
  /**
    * Information about the product view.
    */
  var ProductViewDetail: js.UndefOr[ProductViewDetail] = js.undefined
  /**
    * Information about the provisioning artifact.
    */
  var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail] = js.undefined
  /**
    * Information about the tags associated with the product.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
}

object CreateProductOutput {
  @scala.inline
  def apply(
    ProductViewDetail: ProductViewDetail = null,
    ProvisioningArtifactDetail: ProvisioningArtifactDetail = null,
    Tags: Tags = null
  ): CreateProductOutput = {
    val __obj = js.Dynamic.literal()
    if (ProductViewDetail != null) __obj.updateDynamic("ProductViewDetail")(ProductViewDetail)
    if (ProvisioningArtifactDetail != null) __obj.updateDynamic("ProvisioningArtifactDetail")(ProvisioningArtifactDetail)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateProductOutput]
  }
}

