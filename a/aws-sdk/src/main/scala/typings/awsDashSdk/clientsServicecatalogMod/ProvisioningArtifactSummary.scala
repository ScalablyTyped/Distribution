package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningArtifactSummary extends js.Object {
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime] = js.undefined
  /**
    * The description of the provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined
  /**
    * The identifier of the provisioning artifact.
    */
  var Id: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Id] = js.undefined
  /**
    * The name of the provisioning artifact.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
  /**
    * The metadata for the provisioning artifact. This is used with AWS Marketplace products.
    */
  var ProvisioningArtifactMetadata: js.UndefOr[ProvisioningArtifactInfo] = js.undefined
}

object ProvisioningArtifactSummary {
  @scala.inline
  def apply(
    CreatedTime: ProvisioningArtifactCreatedTime = null,
    Description: ProvisioningArtifactDescription = null,
    Id: Id = null,
    Name: ProvisioningArtifactName = null,
    ProvisioningArtifactMetadata: ProvisioningArtifactInfo = null
  ): ProvisioningArtifactSummary = {
    val __obj = js.Dynamic.literal()
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ProvisioningArtifactMetadata != null) __obj.updateDynamic("ProvisioningArtifactMetadata")(ProvisioningArtifactMetadata)
    __obj.asInstanceOf[ProvisioningArtifactSummary]
  }
}

