package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOpsItemRequest extends StObject {
  
  /**
    * The time a runbook workflow ended. Currently reported only for the OpsItem type /aws/changerequest.
    */
  var ActualEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time a runbook workflow started. Currently reported only for the OpsItem type /aws/changerequest.
    */
  var ActualStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specify a category to assign to an OpsItem. 
    */
  var Category: js.UndefOr[OpsItemCategory] = js.undefined
  
  /**
    * Information about the OpsItem. 
    */
  var Description: OpsItemDescription
  
  /**
    * The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.
    */
  var Notifications: js.UndefOr[OpsItemNotifications] = js.undefined
  
  /**
    * Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB.  Operational data keys can't begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.  You can choose to make the data searchable by other users in the account or you can restrict search access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the DescribeOpsItems API operation) can view and search on the specified data. Operational data that isn't searchable is only viewable by users who have access to the OpsItem (as provided by the GetOpsItem API operation). Use the /aws/resources key in OperationalData to specify a related resource in the request. Use the /aws/automations key in OperationalData to associate an Automation runbook with the OpsItem. To view Amazon Web Services CLI example commands that use these keys, see Creating OpsItems manually in the Amazon Web Services Systems Manager User Guide.
    */
  var OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined
  
  /**
    * The type of OpsItem to create. Currently, the only valid values are /aws/changerequest and /aws/issue.
    */
  var OpsItemType: js.UndefOr[typings.awsSdk.clientsSsmMod.OpsItemType] = js.undefined
  
  /**
    * The time specified in a change request for a runbook workflow to end. Currently supported only for the OpsItem type /aws/changerequest.
    */
  var PlannedEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time specified in a change request for a runbook workflow to start. Currently supported only for the OpsItem type /aws/changerequest.
    */
  var PlannedStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The importance of this OpsItem in relation to other OpsItems in the system.
    */
  var Priority: js.UndefOr[OpsItemPriority] = js.undefined
  
  /**
    * One or more OpsItems that share something in common with the current OpsItems. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
    */
  var RelatedOpsItems: js.UndefOr[typings.awsSdk.clientsSsmMod.RelatedOpsItems] = js.undefined
  
  /**
    * Specify a severity to assign to an OpsItem.
    */
  var Severity: js.UndefOr[OpsItemSeverity] = js.undefined
  
  /**
    * The origin of the OpsItem, such as Amazon EC2 or Systems Manager.  The source name can't contain the following strings: aws, amazon, and amzn.  
    */
  var Source: OpsItemSource
  
  /**
    * Optional metadata that you assign to a resource. You can restrict access to OpsItems by using an inline IAM policy that specifies tags. For more information, see Getting started with OpsCenter in the Amazon Web Services Systems Manager User Guide. Tags use a key-value pair. For example:  Key=Department,Value=Finance   To add tags to a new OpsItem, a user must have IAM permissions for both the ssm:CreateOpsItems operation and the ssm:AddTagsToResource operation. To add tags to an existing OpsItem, use the AddTagsToResource operation. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A short heading that describes the nature of the OpsItem and the impacted resource.
    */
  var Title: OpsItemTitle
}
object CreateOpsItemRequest {
  
  inline def apply(Description: OpsItemDescription, Source: OpsItemSource, Title: OpsItemTitle): CreateOpsItemRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOpsItemRequest]
  }
  
  extension [Self <: CreateOpsItemRequest](x: Self) {
    
    inline def setActualEndTime(value: js.Date): Self = StObject.set(x, "ActualEndTime", value.asInstanceOf[js.Any])
    
    inline def setActualEndTimeUndefined: Self = StObject.set(x, "ActualEndTime", js.undefined)
    
    inline def setActualStartTime(value: js.Date): Self = StObject.set(x, "ActualStartTime", value.asInstanceOf[js.Any])
    
    inline def setActualStartTimeUndefined: Self = StObject.set(x, "ActualStartTime", js.undefined)
    
    inline def setCategory(value: OpsItemCategory): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setDescription(value: OpsItemDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setNotifications(value: OpsItemNotifications): Self = StObject.set(x, "Notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsUndefined: Self = StObject.set(x, "Notifications", js.undefined)
    
    inline def setNotificationsVarargs(value: OpsItemNotification*): Self = StObject.set(x, "Notifications", js.Array(value*))
    
    inline def setOperationalData(value: OpsItemOperationalData): Self = StObject.set(x, "OperationalData", value.asInstanceOf[js.Any])
    
    inline def setOperationalDataUndefined: Self = StObject.set(x, "OperationalData", js.undefined)
    
    inline def setOpsItemType(value: OpsItemType): Self = StObject.set(x, "OpsItemType", value.asInstanceOf[js.Any])
    
    inline def setOpsItemTypeUndefined: Self = StObject.set(x, "OpsItemType", js.undefined)
    
    inline def setPlannedEndTime(value: js.Date): Self = StObject.set(x, "PlannedEndTime", value.asInstanceOf[js.Any])
    
    inline def setPlannedEndTimeUndefined: Self = StObject.set(x, "PlannedEndTime", js.undefined)
    
    inline def setPlannedStartTime(value: js.Date): Self = StObject.set(x, "PlannedStartTime", value.asInstanceOf[js.Any])
    
    inline def setPlannedStartTimeUndefined: Self = StObject.set(x, "PlannedStartTime", js.undefined)
    
    inline def setPriority(value: OpsItemPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setRelatedOpsItems(value: RelatedOpsItems): Self = StObject.set(x, "RelatedOpsItems", value.asInstanceOf[js.Any])
    
    inline def setRelatedOpsItemsUndefined: Self = StObject.set(x, "RelatedOpsItems", js.undefined)
    
    inline def setRelatedOpsItemsVarargs(value: RelatedOpsItem*): Self = StObject.set(x, "RelatedOpsItems", js.Array(value*))
    
    inline def setSeverity(value: OpsItemSeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    inline def setSource(value: OpsItemSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTitle(value: OpsItemTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
