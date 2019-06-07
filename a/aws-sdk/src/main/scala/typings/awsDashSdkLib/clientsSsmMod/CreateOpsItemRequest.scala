package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOpsItemRequest extends js.Object {
  /**
    * Information about the OpsItem. 
    */
  var Description: OpsItemDescription
  /**
    * The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.
    */
  var Notifications: js.UndefOr[OpsItemNotifications] = js.undefined
  /**
    * Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB. This custom data is searchable, but with restrictions. For the Searchable operational data feature, all users with access to the OpsItem Overview page (as provided by the DescribeOpsItems API action) can view and search on the specified data. For the Private operational data feature, the data is only viewable by users who have access to the OpsItem (as provided by the GetOpsItem API action).
    */
  var OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined
  /**
    * The importance of this OpsItem in relation to other OpsItems in the system.
    */
  var Priority: js.UndefOr[OpsItemPriority] = js.undefined
  /**
    * One or more OpsItems that share something in common with the current OpsItems. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
    */
  var RelatedOpsItems: js.UndefOr[RelatedOpsItems] = js.undefined
  /**
    * The origin of the OpsItem, such as Amazon EC2 or AWS Systems Manager.
    */
  var Source: OpsItemSource
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag an OpsItem to identify the AWS resource or the type of issue. In this case, you could specify the following key name/value pairs:    Key=source,Value=EC2-instance     Key=status,Value=stopped     To add tags to an existing OpsItem, use the AddTagsToResource action. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * A short heading that describes the nature of the OpsItem and the impacted resource.
    */
  var Title: OpsItemTitle
}

object CreateOpsItemRequest {
  @scala.inline
  def apply(
    Description: OpsItemDescription,
    Source: OpsItemSource,
    Title: OpsItemTitle,
    Notifications: OpsItemNotifications = null,
    OperationalData: OpsItemOperationalData = null,
    Priority: js.UndefOr[OpsItemPriority] = js.undefined,
    RelatedOpsItems: RelatedOpsItems = null,
    Tags: TagList = null
  ): CreateOpsItemRequest = {
    val __obj = js.Dynamic.literal(Description = Description, Source = Source, Title = Title)
    if (Notifications != null) __obj.updateDynamic("Notifications")(Notifications)
    if (OperationalData != null) __obj.updateDynamic("OperationalData")(OperationalData)
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority)
    if (RelatedOpsItems != null) __obj.updateDynamic("RelatedOpsItems")(RelatedOpsItems)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateOpsItemRequest]
  }
}

