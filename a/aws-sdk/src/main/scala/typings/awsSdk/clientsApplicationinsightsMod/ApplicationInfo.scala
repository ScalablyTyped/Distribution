package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationInfo extends StObject {
  
  /**
    *  Indicates whether auto-configuration is turned on for this application. 
    */
  var AutoConfigEnabled: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.AutoConfigEnabled] = js.undefined
  
  /**
    *  Indicates whether Application Insights can listen to CloudWatch events for the application resources, such as instance terminated, failed deployment, and others. 
    */
  var CWEMonitorEnabled: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.CWEMonitorEnabled] = js.undefined
  
  /**
    *  The method used by Application Insights to onboard your resources. 
    */
  var DiscoveryType: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.DiscoveryType] = js.undefined
  
  /**
    * The lifecycle of the application. 
    */
  var LifeCycle: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.LifeCycle] = js.undefined
  
  /**
    *  Indicates whether Application Insights will create opsItems for any problem detected by Application Insights for an application. 
    */
  var OpsCenterEnabled: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.OpsCenterEnabled] = js.undefined
  
  /**
    *  The SNS topic provided to Application Insights that is associated to the created opsItems to receive SNS notifications for opsItem updates. 
    */
  var OpsItemSNSTopicArn: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.OpsItemSNSTopicArn] = js.undefined
  
  /**
    * The issues on the user side that block Application Insights from successfully monitoring an application. Example remarks include:   “Configuring application, detected 1 Errors, 3 Warnings”   “Configuring application, detected 1 Unconfigured Components”  
    */
  var Remarks: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.Remarks] = js.undefined
  
  /**
    * The name of the resource group used for the application.
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.ResourceGroupName] = js.undefined
}
object ApplicationInfo {
  
  inline def apply(): ApplicationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationInfo] (val x: Self) extends AnyVal {
    
    inline def setAutoConfigEnabled(value: AutoConfigEnabled): Self = StObject.set(x, "AutoConfigEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoConfigEnabledUndefined: Self = StObject.set(x, "AutoConfigEnabled", js.undefined)
    
    inline def setCWEMonitorEnabled(value: CWEMonitorEnabled): Self = StObject.set(x, "CWEMonitorEnabled", value.asInstanceOf[js.Any])
    
    inline def setCWEMonitorEnabledUndefined: Self = StObject.set(x, "CWEMonitorEnabled", js.undefined)
    
    inline def setDiscoveryType(value: DiscoveryType): Self = StObject.set(x, "DiscoveryType", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryTypeUndefined: Self = StObject.set(x, "DiscoveryType", js.undefined)
    
    inline def setLifeCycle(value: LifeCycle): Self = StObject.set(x, "LifeCycle", value.asInstanceOf[js.Any])
    
    inline def setLifeCycleUndefined: Self = StObject.set(x, "LifeCycle", js.undefined)
    
    inline def setOpsCenterEnabled(value: OpsCenterEnabled): Self = StObject.set(x, "OpsCenterEnabled", value.asInstanceOf[js.Any])
    
    inline def setOpsCenterEnabledUndefined: Self = StObject.set(x, "OpsCenterEnabled", js.undefined)
    
    inline def setOpsItemSNSTopicArn(value: OpsItemSNSTopicArn): Self = StObject.set(x, "OpsItemSNSTopicArn", value.asInstanceOf[js.Any])
    
    inline def setOpsItemSNSTopicArnUndefined: Self = StObject.set(x, "OpsItemSNSTopicArn", js.undefined)
    
    inline def setRemarks(value: Remarks): Self = StObject.set(x, "Remarks", value.asInstanceOf[js.Any])
    
    inline def setRemarksUndefined: Self = StObject.set(x, "Remarks", js.undefined)
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupNameUndefined: Self = StObject.set(x, "ResourceGroupName", js.undefined)
  }
}
