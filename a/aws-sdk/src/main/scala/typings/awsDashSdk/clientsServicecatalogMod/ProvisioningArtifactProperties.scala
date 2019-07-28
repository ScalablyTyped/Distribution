package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningArtifactProperties extends js.Object {
  /**
    * The description of the provisioning artifact, including how it differs from the previous provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined
  /**
    * If set to true, AWS Service Catalog stops validating the specified provisioning artifact even if it is invalid.
    */
  var DisableTemplateValidation: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.DisableTemplateValidation] = js.undefined
  /**
    * The URL of the CloudFormation template in Amazon S3. Specify the URL in JSON format as follows:  "LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..." 
    */
  var Info: ProvisioningArtifactInfo
  /**
    * The name of the provisioning artifact (for example, v1 v2beta). No spaces are allowed.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
  /**
    * The type of provisioning artifact.    CLOUD_FORMATION_TEMPLATE - AWS CloudFormation template    MARKETPLACE_AMI - AWS Marketplace AMI    MARKETPLACE_CAR - AWS Marketplace Clusters and AWS Resources  
    */
  var Type: js.UndefOr[ProvisioningArtifactType] = js.undefined
}

object ProvisioningArtifactProperties {
  @scala.inline
  def apply(
    Info: ProvisioningArtifactInfo,
    Description: ProvisioningArtifactDescription = null,
    DisableTemplateValidation: js.UndefOr[DisableTemplateValidation] = js.undefined,
    Name: ProvisioningArtifactName = null,
    Type: ProvisioningArtifactType = null
  ): ProvisioningArtifactProperties = {
    val __obj = js.Dynamic.literal(Info = Info)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DisableTemplateValidation)) __obj.updateDynamic("DisableTemplateValidation")(DisableTemplateValidation)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningArtifactProperties]
  }
}

