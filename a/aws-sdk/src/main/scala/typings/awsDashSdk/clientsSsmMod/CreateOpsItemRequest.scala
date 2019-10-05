package typings.awsDashSdk.clientsSsmMod

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
    * Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB.  Operational data keys can't begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.  You can choose to make the data searchable by other users in the account or you can restrict search access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the DescribeOpsItems API action) can view and search on the specified data. Operational data that is not searchable is only viewable by users who have access to the OpsItem (as provided by the GetOpsItem API action). Use the /aws/resources key in OperationalData to specify a related resource in the request. Use the /aws/automations key in OperationalData to associate an Automation runbook with the OpsItem. To view AWS CLI example commands that use these keys, see Creating OpsItems Manually in the AWS Systems Manager User Guide.
    */
  var OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined
  /**
    * The importance of this OpsItem in relation to other OpsItems in the system.
    */
  var Priority: js.UndefOr[OpsItemPriority] = js.undefined
  /**
    * One or more OpsItems that share something in common with the current OpsItems. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
    */
  var RelatedOpsItems: js.UndefOr[typings.awsDashSdk.clientsSsmMod.RelatedOpsItems] = js.undefined
  /**
    * The origin of the OpsItem, such as Amazon EC2 or AWS Systems Manager.
    */
  var Source: OpsItemSource
  /**
    * Optional metadata that you assign to a resource. You can restrict access to OpsItems by using an inline IAM policy that specifies tags. For more information, see Getting Started with OpsCenter in the AWS Systems Manager User Guide. Tags use a key-value pair. For example:  Key=Department,Value=Finance   To add tags to an existing OpsItem, use the AddTagsToResource action. 
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
    Priority: Int | Double = null,
    RelatedOpsItems: RelatedOpsItems = null,
    Tags: TagList = null
  ): CreateOpsItemRequest = {
    val __obj = js.Dynamic.literal(Description = Description, Source = Source, Title = Title)
    if (Notifications != null) __obj.updateDynamic("Notifications")(Notifications)
    if (OperationalData != null) __obj.updateDynamic("OperationalData")(OperationalData)
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (RelatedOpsItems != null) __obj.updateDynamic("RelatedOpsItems")(RelatedOpsItems)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateOpsItemRequest]
  }
}

