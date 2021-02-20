package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationInfo extends StObject {
  
  /**
    *  Indicates whether Application Insights can listen to CloudWatch events for the application resources, such as instance terminated, failed deployment, and others. 
    */
  var CWEMonitorEnabled: js.UndefOr[typings.awsSdk.applicationinsightsMod.CWEMonitorEnabled] = js.native
  
  /**
    * The lifecycle of the application. 
    */
  var LifeCycle: js.UndefOr[typings.awsSdk.applicationinsightsMod.LifeCycle] = js.native
  
  /**
    *  Indicates whether Application Insights will create opsItems for any problem detected by Application Insights for an application. 
    */
  var OpsCenterEnabled: js.UndefOr[typings.awsSdk.applicationinsightsMod.OpsCenterEnabled] = js.native
  
  /**
    *  The SNS topic provided to Application Insights that is associated to the created opsItems to receive SNS notifications for opsItem updates. 
    */
  var OpsItemSNSTopicArn: js.UndefOr[typings.awsSdk.applicationinsightsMod.OpsItemSNSTopicArn] = js.native
  
  /**
    * The issues on the user side that block Application Insights from successfully monitoring an application. Example remarks include:   “Configuring application, detected 1 Errors, 3 Warnings”   “Configuring application, detected 1 Unconfigured Components”  
    */
  var Remarks: js.UndefOr[typings.awsSdk.applicationinsightsMod.Remarks] = js.native
  
  /**
    * The name of the resource group used for the application.
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
}
object ApplicationInfo {
  
  @scala.inline
  def apply(): ApplicationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationInfo]
  }
  
  @scala.inline
  implicit class ApplicationInfoMutableBuilder[Self <: ApplicationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCWEMonitorEnabled(value: CWEMonitorEnabled): Self = StObject.set(x, "CWEMonitorEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCWEMonitorEnabledUndefined: Self = StObject.set(x, "CWEMonitorEnabled", js.undefined)
    
    @scala.inline
    def setLifeCycle(value: LifeCycle): Self = StObject.set(x, "LifeCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifeCycleUndefined: Self = StObject.set(x, "LifeCycle", js.undefined)
    
    @scala.inline
    def setOpsCenterEnabled(value: OpsCenterEnabled): Self = StObject.set(x, "OpsCenterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsCenterEnabledUndefined: Self = StObject.set(x, "OpsCenterEnabled", js.undefined)
    
    @scala.inline
    def setOpsItemSNSTopicArn(value: OpsItemSNSTopicArn): Self = StObject.set(x, "OpsItemSNSTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsItemSNSTopicArnUndefined: Self = StObject.set(x, "OpsItemSNSTopicArn", js.undefined)
    
    @scala.inline
    def setRemarks(value: Remarks): Self = StObject.set(x, "Remarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarksUndefined: Self = StObject.set(x, "Remarks", js.undefined)
    
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupNameUndefined: Self = StObject.set(x, "ResourceGroupName", js.undefined)
  }
}
