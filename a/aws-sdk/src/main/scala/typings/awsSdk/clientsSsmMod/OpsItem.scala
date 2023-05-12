package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsItem extends StObject {
  
  /**
    * The time a runbook workflow ended. Currently reported only for the OpsItem type /aws/changerequest.
    */
  var ActualEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time a runbook workflow started. Currently reported only for the OpsItem type /aws/changerequest.
    */
  var ActualStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An OpsItem category. Category options include: Availability, Cost, Performance, Recovery, Security.
    */
  var Category: js.UndefOr[OpsItemCategory] = js.undefined
  
  /**
    * The ARN of the Amazon Web Services account that created the OpsItem.
    */
  var CreatedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time the OpsItem was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The OpsItem description.
    */
  var Description: js.UndefOr[OpsItemDescription] = js.undefined
  
  /**
    * The ARN of the Amazon Web Services account that last updated the OpsItem.
    */
  var LastModifiedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time the OpsItem was last updated.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon Simple Notification Service (Amazon SNS) topic where notifications are sent when this OpsItem is edited or changed.
    */
  var Notifications: js.UndefOr[OpsItemNotifications] = js.undefined
  
  /**
    * Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB.  Operational data keys can't begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.  You can choose to make the data searchable by other users in the account or you can restrict search access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the DescribeOpsItems API operation) can view and search on the specified data. Operational data that isn't searchable is only viewable by users who have access to the OpsItem (as provided by the GetOpsItem API operation). Use the /aws/resources key in OperationalData to specify a related resource in the request. Use the /aws/automations key in OperationalData to associate an Automation runbook with the OpsItem. To view Amazon Web Services CLI example commands that use these keys, see Creating OpsItems manually in the Amazon Web Services Systems Manager User Guide.
    */
  var OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined
  
  /**
    * The OpsItem Amazon Resource Name (ARN).
    */
  var OpsItemArn: js.UndefOr[typings.awsSdk.clientsSsmMod.OpsItemArn] = js.undefined
  
  /**
    * The ID of the OpsItem.
    */
  var OpsItemId: js.UndefOr[typings.awsSdk.clientsSsmMod.OpsItemId] = js.undefined
  
  /**
    * The type of OpsItem. Systems Manager supports the following types of OpsItems:    /aws/issue  This type of OpsItem is used for default OpsItems created by OpsCenter.     /aws/changerequest  This type of OpsItem is used by Change Manager for reviewing and approving or rejecting change requests.     /aws/insights  This type of OpsItem is used by OpsCenter for aggregating and reporting on duplicate OpsItems.   
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
    * One or more OpsItems that share something in common with the current OpsItem. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
    */
  var RelatedOpsItems: js.UndefOr[typings.awsSdk.clientsSsmMod.RelatedOpsItems] = js.undefined
  
  /**
    * The severity of the OpsItem. Severity options range from 1 to 4.
    */
  var Severity: js.UndefOr[OpsItemSeverity] = js.undefined
  
  /**
    * The origin of the OpsItem, such as Amazon EC2 or Systems Manager. The impacted resource is a subset of source.
    */
  var Source: js.UndefOr[OpsItemSource] = js.undefined
  
  /**
    * The OpsItem status. Status can be Open, In Progress, or Resolved. For more information, see Editing OpsItem details in the Amazon Web Services Systems Manager User Guide.
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
  
  inline def apply(): OpsItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpsItem] (val x: Self) extends AnyVal {
    
    inline def setActualEndTime(value: js.Date): Self = StObject.set(x, "ActualEndTime", value.asInstanceOf[js.Any])
    
    inline def setActualEndTimeUndefined: Self = StObject.set(x, "ActualEndTime", js.undefined)
    
    inline def setActualStartTime(value: js.Date): Self = StObject.set(x, "ActualStartTime", value.asInstanceOf[js.Any])
    
    inline def setActualStartTimeUndefined: Self = StObject.set(x, "ActualStartTime", js.undefined)
    
    inline def setCategory(value: OpsItemCategory): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDescription(value: OpsItemDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastModifiedBy(value: String): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setNotifications(value: OpsItemNotifications): Self = StObject.set(x, "Notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsUndefined: Self = StObject.set(x, "Notifications", js.undefined)
    
    inline def setNotificationsVarargs(value: OpsItemNotification*): Self = StObject.set(x, "Notifications", js.Array(value*))
    
    inline def setOperationalData(value: OpsItemOperationalData): Self = StObject.set(x, "OperationalData", value.asInstanceOf[js.Any])
    
    inline def setOperationalDataUndefined: Self = StObject.set(x, "OperationalData", js.undefined)
    
    inline def setOpsItemArn(value: OpsItemArn): Self = StObject.set(x, "OpsItemArn", value.asInstanceOf[js.Any])
    
    inline def setOpsItemArnUndefined: Self = StObject.set(x, "OpsItemArn", js.undefined)
    
    inline def setOpsItemId(value: OpsItemId): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
    
    inline def setOpsItemIdUndefined: Self = StObject.set(x, "OpsItemId", js.undefined)
    
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
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setStatus(value: OpsItemStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTitle(value: OpsItemTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
