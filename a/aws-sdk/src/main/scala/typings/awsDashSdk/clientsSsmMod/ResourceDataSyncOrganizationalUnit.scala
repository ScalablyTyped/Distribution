package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncOrganizationalUnit extends js.Object {
  /**
    * The AWS Organization unit ID data source for the sync.
    */
  var OrganizationalUnitId: js.UndefOr[ResourceDataSyncOrganizationalUnitId] = js.native
}

object ResourceDataSyncOrganizationalUnit {
  @scala.inline
  def apply(OrganizationalUnitId: ResourceDataSyncOrganizationalUnitId = null): ResourceDataSyncOrganizationalUnit = {
    val __obj = js.Dynamic.literal()
    if (OrganizationalUnitId != null) __obj.updateDynamic("OrganizationalUnitId")(OrganizationalUnitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncOrganizationalUnit]
  }
}

