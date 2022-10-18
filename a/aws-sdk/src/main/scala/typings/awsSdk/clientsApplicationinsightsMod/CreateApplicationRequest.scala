package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationRequest extends StObject {
  
  /**
    *  Indicates whether Application Insights automatically configures unmonitored resources in the resource group. 
    */
  var AutoConfigEnabled: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.AutoConfigEnabled] = js.undefined
  
  /**
    *  Configures all of the resources in the resource group by applying the recommended configurations. 
    */
  var AutoCreate: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.AutoCreate] = js.undefined
  
  /**
    *  Indicates whether Application Insights can listen to CloudWatch events for the application resources, such as instance terminated, failed deployment, and others. 
    */
  var CWEMonitorEnabled: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.CWEMonitorEnabled] = js.undefined
  
  /**
    * Application Insights can create applications based on a resource group or on an account. To create an account-based application using all of the resources in the account, set this parameter to ACCOUNT_BASED. 
    */
  var GroupingType: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.GroupingType] = js.undefined
  
  /**
    *  When set to true, creates opsItems for any problems detected on an application. 
    */
  var OpsCenterEnabled: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.OpsCenterEnabled] = js.undefined
  
  /**
    *  The SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to receive notifications for updates to the opsItem. 
    */
  var OpsItemSNSTopicArn: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.OpsItemSNSTopicArn] = js.undefined
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.ResourceGroupName] = js.undefined
  
  /**
    * List of tags to add to the application. tag key (Key) and an associated tag value (Value). The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateApplicationRequest {
  
  inline def apply(): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationRequest]
  }
  
  extension [Self <: CreateApplicationRequest](x: Self) {
    
    inline def setAutoConfigEnabled(value: AutoConfigEnabled): Self = StObject.set(x, "AutoConfigEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoConfigEnabledUndefined: Self = StObject.set(x, "AutoConfigEnabled", js.undefined)
    
    inline def setAutoCreate(value: AutoCreate): Self = StObject.set(x, "AutoCreate", value.asInstanceOf[js.Any])
    
    inline def setAutoCreateUndefined: Self = StObject.set(x, "AutoCreate", js.undefined)
    
    inline def setCWEMonitorEnabled(value: CWEMonitorEnabled): Self = StObject.set(x, "CWEMonitorEnabled", value.asInstanceOf[js.Any])
    
    inline def setCWEMonitorEnabledUndefined: Self = StObject.set(x, "CWEMonitorEnabled", js.undefined)
    
    inline def setGroupingType(value: GroupingType): Self = StObject.set(x, "GroupingType", value.asInstanceOf[js.Any])
    
    inline def setGroupingTypeUndefined: Self = StObject.set(x, "GroupingType", js.undefined)
    
    inline def setOpsCenterEnabled(value: OpsCenterEnabled): Self = StObject.set(x, "OpsCenterEnabled", value.asInstanceOf[js.Any])
    
    inline def setOpsCenterEnabledUndefined: Self = StObject.set(x, "OpsCenterEnabled", js.undefined)
    
    inline def setOpsItemSNSTopicArn(value: OpsItemSNSTopicArn): Self = StObject.set(x, "OpsItemSNSTopicArn", value.asInstanceOf[js.Any])
    
    inline def setOpsItemSNSTopicArnUndefined: Self = StObject.set(x, "OpsItemSNSTopicArn", js.undefined)
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupNameUndefined: Self = StObject.set(x, "ResourceGroupName", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
