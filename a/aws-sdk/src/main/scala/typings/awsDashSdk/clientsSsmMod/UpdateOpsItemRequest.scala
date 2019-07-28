package typings.awsDashSdk.clientsSsmMod

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
    * Add new keys or edit existing key-value pairs of the OperationalData map in the OpsItem object. Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB.  Operational data keys can't begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.  You can choose to make the data searchable by other users in the account or you can restrict search access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the DescribeOpsItems API action) can view and search on the specified data. Operational data that is not searchable is only viewable by users who have access to the OpsItem (as provided by the GetOpsItem API action). Use the /aws/resources key in OperationalData to specify a related resource in the request. Use the /aws/automations key in OperationalData to associate an Automation runbook with the OpsItem. To view AWS CLI example commands that use these keys, see Creating OpsItems Manually in the AWS Systems Manager User Guide.
    */
  var OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined
  /**
    * Keys that you want to remove from the OperationalData map.
    */
  var OperationalDataToDelete: js.UndefOr[OpsItemOpsDataKeysList] = js.undefined
  /**
    * The ID of the OpsItem.
    */
  var OpsItemId: typings.awsDashSdk.clientsSsmMod.OpsItemId
  /**
    * The importance of this OpsItem in relation to other OpsItems in the system.
    */
  var Priority: js.UndefOr[OpsItemPriority] = js.undefined
  /**
    * One or more OpsItems that share something in common with the current OpsItems. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
    */
  var RelatedOpsItems: js.UndefOr[typings.awsDashSdk.clientsSsmMod.RelatedOpsItems] = js.undefined
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

