package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProvisioningParametersOutput extends js.Object {
  /**
    * Information about the constraints used to provision the product.
    */
  var ConstraintSummaries: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ConstraintSummaries] = js.native
  /**
    * Information about the parameters used to provision the product.
    */
  var ProvisioningArtifactParameters: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisioningArtifactParameters] = js.native
  /**
    * An object that contains information about preferences, such as regions and accounts, for the provisioning artifact.
    */
  var ProvisioningArtifactPreferences: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisioningArtifactPreferences] = js.native
  /**
    * Information about the TagOptions associated with the resource.
    */
  var TagOptions: js.UndefOr[TagOptionSummaries] = js.native
  /**
    * Any additional metadata specifically related to the provisioning of the product. For example, see the Version field of the CloudFormation template.
    */
  var UsageInstructions: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.UsageInstructions] = js.native
}

object DescribeProvisioningParametersOutput {
  @scala.inline
  def apply(
    ConstraintSummaries: ConstraintSummaries = null,
    ProvisioningArtifactParameters: ProvisioningArtifactParameters = null,
    ProvisioningArtifactPreferences: ProvisioningArtifactPreferences = null,
    TagOptions: TagOptionSummaries = null,
    UsageInstructions: UsageInstructions = null
  ): DescribeProvisioningParametersOutput = {
    val __obj = js.Dynamic.literal()
    if (ConstraintSummaries != null) __obj.updateDynamic("ConstraintSummaries")(ConstraintSummaries.asInstanceOf[js.Any])
    if (ProvisioningArtifactParameters != null) __obj.updateDynamic("ProvisioningArtifactParameters")(ProvisioningArtifactParameters.asInstanceOf[js.Any])
    if (ProvisioningArtifactPreferences != null) __obj.updateDynamic("ProvisioningArtifactPreferences")(ProvisioningArtifactPreferences.asInstanceOf[js.Any])
    if (TagOptions != null) __obj.updateDynamic("TagOptions")(TagOptions.asInstanceOf[js.Any])
    if (UsageInstructions != null) __obj.updateDynamic("UsageInstructions")(UsageInstructions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProvisioningParametersOutput]
  }
}

