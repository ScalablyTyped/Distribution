package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningArtifact extends js.Object {
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime] = js.undefined
  /**
    * The description of the provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined
  /**
    * Information set by the administrator to provide guidance to end users about which provisioning artifacts to use.
    */
  var Guidance: js.UndefOr[ProvisioningArtifactGuidance] = js.undefined
  /**
    * The identifier of the provisioning artifact.
    */
  var Id: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Id] = js.undefined
  /**
    * The name of the provisioning artifact.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
}

object ProvisioningArtifact {
  @scala.inline
  def apply(
    CreatedTime: ProvisioningArtifactCreatedTime = null,
    Description: ProvisioningArtifactDescription = null,
    Guidance: ProvisioningArtifactGuidance = null,
    Id: Id = null,
    Name: ProvisioningArtifactName = null
  ): ProvisioningArtifact = {
    val __obj = js.Dynamic.literal()
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Guidance != null) __obj.updateDynamic("Guidance")(Guidance.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[ProvisioningArtifact]
  }
}

