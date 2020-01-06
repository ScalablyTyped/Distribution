package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOrganizationalUnitResponse extends js.Object {
  /**
    * A structure that contains details about the newly created OU.
    */
  var OrganizationalUnit: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.OrganizationalUnit] = js.native
}

object CreateOrganizationalUnitResponse {
  @scala.inline
  def apply(OrganizationalUnit: OrganizationalUnit = null): CreateOrganizationalUnitResponse = {
    val __obj = js.Dynamic.literal()
    if (OrganizationalUnit != null) __obj.updateDynamic("OrganizationalUnit")(OrganizationalUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOrganizationalUnitResponse]
  }
}

