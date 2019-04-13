package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProvisioningArtifactsOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * Information about the provisioning artifacts.
    */
  var ProvisioningArtifactDetails: js.UndefOr[ProvisioningArtifactDetails] = js.undefined
}

object ListProvisioningArtifactsOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, ProvisioningArtifactDetails: ProvisioningArtifactDetails = null): ListProvisioningArtifactsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (ProvisioningArtifactDetails != null) __obj.updateDynamic("ProvisioningArtifactDetails")(ProvisioningArtifactDetails)
    __obj.asInstanceOf[ListProvisioningArtifactsOutput]
  }
}

