package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncAwsOrganizationsSource extends js.Object {
  /**
    * If an AWS Organization is present, this is either OrganizationalUnits or EntireOrganization. For OrganizationalUnits, the data is aggregated from a set of organization units. For EntireOrganization, the data is aggregated from the entire AWS Organization. 
    */
  var OrganizationSourceType: ResourceDataSyncOrganizationSourceType = js.native
  /**
    * The AWS Organizations organization units included in the sync.
    */
  var OrganizationalUnits: js.UndefOr[ResourceDataSyncOrganizationalUnitList] = js.native
}

object ResourceDataSyncAwsOrganizationsSource {
  @scala.inline
  def apply(
    OrganizationSourceType: ResourceDataSyncOrganizationSourceType,
    OrganizationalUnits: ResourceDataSyncOrganizationalUnitList = null
  ): ResourceDataSyncAwsOrganizationsSource = {
    val __obj = js.Dynamic.literal(OrganizationSourceType = OrganizationSourceType.asInstanceOf[js.Any])
    if (OrganizationalUnits != null) __obj.updateDynamic("OrganizationalUnits")(OrganizationalUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncAwsOrganizationsSource]
  }
}

