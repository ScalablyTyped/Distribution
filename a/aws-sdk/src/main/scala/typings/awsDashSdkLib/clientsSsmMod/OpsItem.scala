package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpsItem extends js.Object {
  /**
    * The ARN of the AWS account that created the OpsItem.
    */
  var CreatedBy: js.UndefOr[String] = js.undefined
  /**
    * The date and time the OpsItem was created.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The OpsItem description.
    */
  var Description: js.UndefOr[OpsItemDescription] = js.undefined
  /**
    * The ARN of the AWS account that last updated the OpsItem.
    */
  var LastModifiedBy: js.UndefOr[String] = js.undefined
  /**
    * The date and time the OpsItem was last updated.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.
    */
  var Notifications: js.UndefOr[OpsItemNotifications] = js.undefined
  /**
    * Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB. This custom data is searchable, but with restrictions. For the Searchable operational data feature, all users with access to the OpsItem Overview page (as provided by the DescribeOpsItems API action) can view and search on the specified data. For the Private operational data feature, the data is only viewable by users who have access to the OpsItem (as provided by the GetOpsItem API action).
    */
  var OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined
  /**
    * The ID of the OpsItem.
    */
  var OpsItemId: js.UndefOr[OpsItemId] = js.undefined
  /**
    * The importance of this OpsItem in relation to other OpsItems in the system.
    */
  var Priority: js.UndefOr[OpsItemPriority] = js.undefined
  /**
    * One or more OpsItems that share something in common with the current OpsItems. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
    */
  var RelatedOpsItems: js.UndefOr[RelatedOpsItems] = js.undefined
  /**
    * The origin of the OpsItem, such as Amazon EC2 or AWS Systems Manager. The impacted resource is a subset of source.
    */
  var Source: js.UndefOr[OpsItemSource] = js.undefined
  /**
    * The OpsItem status. Status can be Open, In Progress, or Resolved. For more information, see Editing OpsItem Details in the AWS Systems Manager User Guide.
    */
  var Status: js.UndefOr[OpsItemStatus] = js.undefined
  /**
    * A short heading that describes the nature of the OpsItem and the impacted resource.
    */
  var Title: js.UndefOr[OpsItemTitle] = js.undefined
  /**
    * The version of this OpsItem. Each time the OpsItem is edited the version number increments by one.
    */
  var Version: js.UndefOr[String] = js.undefined
}

object OpsItem {
  @scala.inline
  def apply(
    CreatedBy: String = null,
    CreatedTime: DateTime = null,
    Description: OpsItemDescription = null,
    LastModifiedBy: String = null,
    LastModifiedTime: DateTime = null,
    Notifications: OpsItemNotifications = null,
    OperationalData: OpsItemOperationalData = null,
    OpsItemId: OpsItemId = null,
    Priority: js.UndefOr[OpsItemPriority] = js.undefined,
    RelatedOpsItems: RelatedOpsItems = null,
    Source: OpsItemSource = null,
    Status: OpsItemStatus = null,
    Title: OpsItemTitle = null,
    Version: String = null
  ): OpsItem = {
    val __obj = js.Dynamic.literal()
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy)
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime)
    if (Notifications != null) __obj.updateDynamic("Notifications")(Notifications)
    if (OperationalData != null) __obj.updateDynamic("OperationalData")(OperationalData)
    if (OpsItemId != null) __obj.updateDynamic("OpsItemId")(OpsItemId)
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority)
    if (RelatedOpsItems != null) __obj.updateDynamic("RelatedOpsItems")(RelatedOpsItems)
    if (Source != null) __obj.updateDynamic("Source")(Source)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[OpsItem]
  }
}

