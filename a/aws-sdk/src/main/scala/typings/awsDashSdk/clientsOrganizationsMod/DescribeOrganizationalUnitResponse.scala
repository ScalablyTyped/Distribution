package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOrganizationalUnitResponse extends js.Object {
  /**
    * A structure that contains details about the specified OU.
    */
  var OrganizationalUnit: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.OrganizationalUnit] = js.undefined
}

object DescribeOrganizationalUnitResponse {
  @scala.inline
  def apply(OrganizationalUnit: OrganizationalUnit = null): DescribeOrganizationalUnitResponse = {
    val __obj = js.Dynamic.literal()
    if (OrganizationalUnit != null) __obj.updateDynamic("OrganizationalUnit")(OrganizationalUnit)
    __obj.asInstanceOf[DescribeOrganizationalUnitResponse]
  }
}

