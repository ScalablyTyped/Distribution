package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProvisioningArtifactOutput extends js.Object {
  /**
    * The URL of the CloudFormation template in Amazon S3.
    */
  var Info: js.UndefOr[ProvisioningArtifactInfo] = js.native
  /**
    * Information about the provisioning artifact.
    */
  var ProvisioningArtifactDetail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisioningArtifactDetail] = js.native
  /**
    * The status of the current request.
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Status] = js.native
}

object DescribeProvisioningArtifactOutput {
  @scala.inline
  def apply(
    Info: ProvisioningArtifactInfo = null,
    ProvisioningArtifactDetail: ProvisioningArtifactDetail = null,
    Status: Status = null
  ): DescribeProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    if (Info != null) __obj.updateDynamic("Info")(Info.asInstanceOf[js.Any])
    if (ProvisioningArtifactDetail != null) __obj.updateDynamic("ProvisioningArtifactDetail")(ProvisioningArtifactDetail.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProvisioningArtifactOutput]
  }
}

