package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningArtifactDetail extends js.Object {
  /**
    * Indicates whether the product version is active.
    */
  var Active: js.UndefOr[ProvisioningArtifactActive] = js.undefined
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[CreationTime] = js.undefined
  /**
    * The description of the provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactName] = js.undefined
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
  /**
    * The type of provisioning artifact.    CLOUD_FORMATION_TEMPLATE - AWS CloudFormation template    MARKETPLACE_AMI - AWS Marketplace AMI    MARKETPLACE_CAR - AWS Marketplace Clusters and AWS Resources  
    */
  var Type: js.UndefOr[ProvisioningArtifactType] = js.undefined
}

object ProvisioningArtifactDetail {
  @scala.inline
  def apply(
    Active: js.UndefOr[Boolean] = js.undefined,
    CreatedTime: CreationTime = null,
    Description: ProvisioningArtifactName = null,
    Guidance: ProvisioningArtifactGuidance = null,
    Id: Id = null,
    Name: ProvisioningArtifactName = null,
    Type: ProvisioningArtifactType = null
  ): ProvisioningArtifactDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Active)) __obj.updateDynamic("Active")(Active)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Guidance != null) __obj.updateDynamic("Guidance")(Guidance.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningArtifactDetail]
  }
}

