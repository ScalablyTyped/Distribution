package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAWSOrganizationsAccessStatusOutput extends js.Object {
  /**
    * The status of the portfolio share feature.
    */
  var AccessStatus: js.UndefOr[AccessStatus] = js.undefined
}

object GetAWSOrganizationsAccessStatusOutput {
  @scala.inline
  def apply(AccessStatus: AccessStatus = null): GetAWSOrganizationsAccessStatusOutput = {
    val __obj = js.Dynamic.literal()
    if (AccessStatus != null) __obj.updateDynamic("AccessStatus")(AccessStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAWSOrganizationsAccessStatusOutput]
  }
}

