package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationRequest extends StObject {
  
  /**
    *  Turns auto-configuration on or off. 
    */
  var AutoConfigEnabled: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.AutoConfigEnabled] = js.undefined
  
  /**
    *  Indicates whether Application Insights can listen to CloudWatch events for the application resources, such as instance terminated, failed deployment, and others. 
    */
  var CWEMonitorEnabled: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.CWEMonitorEnabled] = js.undefined
  
  /**
    *  When set to true, creates opsItems for any problems detected on an application. 
    */
  var OpsCenterEnabled: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.OpsCenterEnabled] = js.undefined
  
  /**
    *  The SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to receive notifications for updates to the opsItem.
    */
  var OpsItemSNSTopicArn: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.OpsItemSNSTopicArn] = js.undefined
  
  /**
    *  Disassociates the SNS topic from the opsItem created for detected problems.
    */
  var RemoveSNSTopic: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.RemoveSNSTopic] = js.undefined
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.clientsApplicationinsightsMod.ResourceGroupName
}
object UpdateApplicationRequest {
  
  inline def apply(ResourceGroupName: ResourceGroupName): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setAutoConfigEnabled(value: AutoConfigEnabled): Self = StObject.set(x, "AutoConfigEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoConfigEnabledUndefined: Self = StObject.set(x, "AutoConfigEnabled", js.undefined)
    
    inline def setCWEMonitorEnabled(value: CWEMonitorEnabled): Self = StObject.set(x, "CWEMonitorEnabled", value.asInstanceOf[js.Any])
    
    inline def setCWEMonitorEnabledUndefined: Self = StObject.set(x, "CWEMonitorEnabled", js.undefined)
    
    inline def setOpsCenterEnabled(value: OpsCenterEnabled): Self = StObject.set(x, "OpsCenterEnabled", value.asInstanceOf[js.Any])
    
    inline def setOpsCenterEnabledUndefined: Self = StObject.set(x, "OpsCenterEnabled", js.undefined)
    
    inline def setOpsItemSNSTopicArn(value: OpsItemSNSTopicArn): Self = StObject.set(x, "OpsItemSNSTopicArn", value.asInstanceOf[js.Any])
    
    inline def setOpsItemSNSTopicArnUndefined: Self = StObject.set(x, "OpsItemSNSTopicArn", js.undefined)
    
    inline def setRemoveSNSTopic(value: RemoveSNSTopic): Self = StObject.set(x, "RemoveSNSTopic", value.asInstanceOf[js.Any])
    
    inline def setRemoveSNSTopicUndefined: Self = StObject.set(x, "RemoveSNSTopic", js.undefined)
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
  }
}
