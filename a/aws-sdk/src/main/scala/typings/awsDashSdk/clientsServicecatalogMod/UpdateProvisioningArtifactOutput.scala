package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProvisioningArtifactOutput extends js.Object {
  /**
    * The URL of the CloudFormation template in Amazon S3.
    */
  var Info: js.UndefOr[ProvisioningArtifactInfo] = js.undefined
  /**
    * Information about the provisioning artifact.
    */
  var ProvisioningArtifactDetail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisioningArtifactDetail] = js.undefined
  /**
    * The status of the current request.
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Status] = js.undefined
}

object UpdateProvisioningArtifactOutput {
  @scala.inline
  def apply(
    Info: ProvisioningArtifactInfo = null,
    ProvisioningArtifactDetail: ProvisioningArtifactDetail = null,
    Status: Status = null
  ): UpdateProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    if (Info != null) __obj.updateDynamic("Info")(Info)
    if (ProvisioningArtifactDetail != null) __obj.updateDynamic("ProvisioningArtifactDetail")(ProvisioningArtifactDetail)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProvisioningArtifactOutput]
  }
}

