package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAWSOrganizationsAccessStatusOutput extends js.Object {
  /**
    * The status of the portfolio share feature.
    */
  var AccessStatus: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AccessStatus] = js.native
}

object GetAWSOrganizationsAccessStatusOutput {
  @scala.inline
  def apply(AccessStatus: AccessStatus = null): GetAWSOrganizationsAccessStatusOutput = {
    val __obj = js.Dynamic.literal()
    if (AccessStatus != null) __obj.updateDynamic("AccessStatus")(AccessStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAWSOrganizationsAccessStatusOutput]
  }
}

