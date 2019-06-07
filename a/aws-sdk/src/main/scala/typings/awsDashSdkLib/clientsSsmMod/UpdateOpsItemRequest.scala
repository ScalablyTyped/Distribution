package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOpsItemRequest extends js.Object {
  /**
    * Update the information about the OpsItem. Provide enough information so that users reading this OpsItem for the first time understand the issue. 
    */
  var Description: js.UndefOr[OpsItemDescription] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.
    */
  var Notifications: js.UndefOr[OpsItemNotifications] = js.undefined
  /**
    * Add new keys or edit existing key-value pairs of the OperationalData map in the OpsItem object. Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB. This custom data is searchable, but with restrictions. For the Searchable operational data feature, all users with access to the OpsItem Overview page (as provided by the DescribeOpsItems API action) can view and search on the specified data. For the Private operational data feature, the data is only viewable by users who have access to the OpsItem (as provided by the GetOpsItem API action).
    */
  var OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined
  /**
    * Keys that you want to remove from the OperationalData map.
    */
  var OperationalDataToDelete: js.UndefOr[OpsItemOpsDataKeysList] = js.undefined
  /**
    * The ID of the OpsItem.
    */
  var OpsItemId: awsDashSdkLib.clientsSsmMod.OpsItemId
  /**
    * The importance of this OpsItem in relation to other OpsItems in the system.
    */
  var Priority: js.UndefOr[OpsItemPriority] = js.undefined
  /**
    * One or more OpsItems that share something in common with the current OpsItems. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
    */
  var RelatedOpsItems: js.UndefOr[RelatedOpsItems] = js.undefined
  /**
    * The OpsItem status. Status can be Open, In Progress, or Resolved. For more information, see Editing OpsItem Details in the AWS Systems Manager User Guide.
    */
  var Status: js.UndefOr[OpsItemStatus] = js.undefined
  /**
    * A short heading that describes the nature of the OpsItem and the impacted resource.
    */
  var Title: js.UndefOr[OpsItemTitle] = js.undefined
}

object UpdateOpsItemRequest {
  @scala.inline
  def apply(
    OpsItemId: OpsItemId,
    Description: OpsItemDescription = null,
    Notifications: OpsItemNotifications = null,
    OperationalData: OpsItemOperationalData = null,
    OperationalDataToDelete: OpsItemOpsDataKeysList = null,
    Priority: js.UndefOr[OpsItemPriority] = js.undefined,
    RelatedOpsItems: RelatedOpsItems = null,
    Status: OpsItemStatus = null,
    Title: OpsItemTitle = null
  ): UpdateOpsItemRequest = {
    val __obj = js.Dynamic.literal(OpsItemId = OpsItemId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Notifications != null) __obj.updateDynamic("Notifications")(Notifications)
    if (OperationalData != null) __obj.updateDynamic("OperationalData")(OperationalData)
    if (OperationalDataToDelete != null) __obj.updateDynamic("OperationalDataToDelete")(OperationalDataToDelete)
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority)
    if (RelatedOpsItems != null) __obj.updateDynamic("RelatedOpsItems")(RelatedOpsItems)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title)
    __obj.asInstanceOf[UpdateOpsItemRequest]
  }
}

