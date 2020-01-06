package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationConformancePackStatus extends js.Object {
  /**
    * An error code that is returned when organization conformance pack creation or deletion has failed in a member account. 
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    * An error message indicating that organization conformance pack creation or deletion failed due to an error. 
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The timestamp of the last update.
    */
  var LastUpdateTime: js.UndefOr[_Date] = js.native
  /**
    * The name that you assign to organization conformance pack.
    */
  var OrganizationConformancePackName: typings.awsDashSdk.clientsConfigserviceMod.OrganizationConformancePackName = js.native
  /**
    * Indicates deployment status of an organization conformance pack. When master account calls PutOrganizationConformancePack for the first time, conformance pack status is created in all the member accounts. When master account calls PutOrganizationConformancePack for the second time, conformance pack status is updated in all the member accounts. Additionally, conformance pack status is updated when one or more member accounts join or leave an organization. Conformance pack status is deleted when the master account deletes OrganizationConformancePack in all the member accounts and disables service access for config-multiaccountsetup.amazonaws.com. AWS Config sets the state of the conformance pack to:    CREATE_SUCCESSFUL when an organization conformance pack has been successfully created in all the member accounts.     CREATE_IN_PROGRESS when an organization conformance pack creation is in progress.    CREATE_FAILED when an organization conformance pack creation failed in one or more member accounts within that organization.    DELETE_FAILED when an organization conformance pack deletion failed in one or more member accounts within that organization.    DELETE_IN_PROGRESS when an organization conformance pack deletion is in progress.    DELETE_SUCCESSFUL when an organization conformance pack has been successfully deleted from all the member accounts.    UPDATE_SUCCESSFUL when an organization conformance pack has been successfully updated in all the member accounts.    UPDATE_IN_PROGRESS when an organization conformance pack update is in progress.    UPDATE_FAILED when an organization conformance pack update failed in one or more member accounts within that organization.  
    */
  var Status: OrganizationResourceStatus = js.native
}

object OrganizationConformancePackStatus {
  @scala.inline
  def apply(
    OrganizationConformancePackName: OrganizationConformancePackName,
    Status: OrganizationResourceStatus,
    ErrorCode: String = null,
    ErrorMessage: String = null,
    LastUpdateTime: _Date = null
  ): OrganizationConformancePackStatus = {
    val __obj = js.Dynamic.literal(OrganizationConformancePackName = OrganizationConformancePackName.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (LastUpdateTime != null) __obj.updateDynamic("LastUpdateTime")(LastUpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConformancePackStatus]
  }
}

