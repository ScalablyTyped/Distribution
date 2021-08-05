package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationRequest extends StObject {
  
  /**
    *  Indicates whether Application Insights can listen to CloudWatch events for the application resources, such as instance terminated, failed deployment, and others. 
    */
  var CWEMonitorEnabled: js.UndefOr[typings.awsSdk.applicationinsightsMod.CWEMonitorEnabled] = js.undefined
  
  /**
    *  When set to true, creates opsItems for any problems detected on an application. 
    */
  var OpsCenterEnabled: js.UndefOr[typings.awsSdk.applicationinsightsMod.OpsCenterEnabled] = js.undefined
  
  /**
    *  The SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to receive notifications for updates to the opsItem. 
    */
  var OpsItemSNSTopicArn: js.UndefOr[typings.awsSdk.applicationinsightsMod.OpsItemSNSTopicArn] = js.undefined
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.applicationinsightsMod.ResourceGroupName
  
  /**
    * List of tags to add to the application. tag key (Key) and an associated tag value (Value). The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateApplicationRequest {
  
  inline def apply(ResourceGroupName: ResourceGroupName): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
  
  extension [Self <: CreateApplicationRequest](x: Self) {
    
    inline def setCWEMonitorEnabled(value: CWEMonitorEnabled): Self = StObject.set(x, "CWEMonitorEnabled", value.asInstanceOf[js.Any])
    
    inline def setCWEMonitorEnabledUndefined: Self = StObject.set(x, "CWEMonitorEnabled", js.undefined)
    
    inline def setOpsCenterEnabled(value: OpsCenterEnabled): Self = StObject.set(x, "OpsCenterEnabled", value.asInstanceOf[js.Any])
    
    inline def setOpsCenterEnabledUndefined: Self = StObject.set(x, "OpsCenterEnabled", js.undefined)
    
    inline def setOpsItemSNSTopicArn(value: OpsItemSNSTopicArn): Self = StObject.set(x, "OpsItemSNSTopicArn", value.asInstanceOf[js.Any])
    
    inline def setOpsItemSNSTopicArnUndefined: Self = StObject.set(x, "OpsItemSNSTopicArn", js.undefined)
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
