package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProvisioningArtifactsForServiceActionOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * An array of objects with information about product views and provisioning artifacts.
    */
  var ProvisioningArtifactViews: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisioningArtifactViews] = js.native
}

object ListProvisioningArtifactsForServiceActionOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, ProvisioningArtifactViews: ProvisioningArtifactViews = null): ListProvisioningArtifactsForServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (ProvisioningArtifactViews != null) __obj.updateDynamic("ProvisioningArtifactViews")(ProvisioningArtifactViews.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProvisioningArtifactsForServiceActionOutput]
  }
}

