package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationInfo extends js.Object {
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
  implicit class ApplicationInfoOps[Self <: ApplicationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCWEMonitorEnabled(value: CWEMonitorEnabled): Self = this.set("CWEMonitorEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCWEMonitorEnabled: Self = this.set("CWEMonitorEnabled", js.undefined)
    @scala.inline
    def setLifeCycle(value: LifeCycle): Self = this.set("LifeCycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifeCycle: Self = this.set("LifeCycle", js.undefined)
    @scala.inline
    def setOpsCenterEnabled(value: OpsCenterEnabled): Self = this.set("OpsCenterEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpsCenterEnabled: Self = this.set("OpsCenterEnabled", js.undefined)
    @scala.inline
    def setOpsItemSNSTopicArn(value: OpsItemSNSTopicArn): Self = this.set("OpsItemSNSTopicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpsItemSNSTopicArn: Self = this.set("OpsItemSNSTopicArn", js.undefined)
    @scala.inline
    def setRemarks(value: Remarks): Self = this.set("Remarks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemarks: Self = this.set("Remarks", js.undefined)
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = this.set("ResourceGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceGroupName: Self = this.set("ResourceGroupName", js.undefined)
  }
  
}

