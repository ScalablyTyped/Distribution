package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOrganizationalUnitResponse extends js.Object {
  /**
    * A structure that contains the details about the specified OU, including its new name.
    */
  var OrganizationalUnit: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.OrganizationalUnit] = js.undefined
}

object UpdateOrganizationalUnitResponse {
  @scala.inline
  def apply(OrganizationalUnit: OrganizationalUnit = null): UpdateOrganizationalUnitResponse = {
    val __obj = js.Dynamic.literal()
    if (OrganizationalUnit != null) __obj.updateDynamic("OrganizationalUnit")(OrganizationalUnit)
    __obj.asInstanceOf[UpdateOrganizationalUnitResponse]
  }
}

