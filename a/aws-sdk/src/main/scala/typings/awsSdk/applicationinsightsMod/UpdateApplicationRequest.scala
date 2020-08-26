package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationRequest extends js.Object {
  /**
    *  Indicates whether Application Insights can listen to CloudWatch events for the application resources, such as instance terminated, failed deployment, and others. 
    */
  var CWEMonitorEnabled: js.UndefOr[typings.awsSdk.applicationinsightsMod.CWEMonitorEnabled] = js.native
  /**
    *  When set to true, creates opsItems for any problems detected on an application. 
    */
  var OpsCenterEnabled: js.UndefOr[typings.awsSdk.applicationinsightsMod.OpsCenterEnabled] = js.native
  /**
    *  The SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to receive notifications for updates to the opsItem.
    */
  var OpsItemSNSTopicArn: js.UndefOr[typings.awsSdk.applicationinsightsMod.OpsItemSNSTopicArn] = js.native
  /**
    *  Disassociates the SNS topic from the opsItem created for detected problems.
    */
  var RemoveSNSTopic: js.UndefOr[typings.awsSdk.applicationinsightsMod.RemoveSNSTopic] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.applicationinsightsMod.ResourceGroupName = js.native
}

object UpdateApplicationRequest {
  @scala.inline
  def apply(ResourceGroupName: ResourceGroupName): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  @scala.inline
  implicit class UpdateApplicationRequestOps[Self <: UpdateApplicationRequest] (val x: Self) extends AnyVal {
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
    def setResourceGroupName(value: ResourceGroupName): Self = this.set("ResourceGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCWEMonitorEnabled(value: CWEMonitorEnabled): Self = this.set("CWEMonitorEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCWEMonitorEnabled: Self = this.set("CWEMonitorEnabled", js.undefined)
    @scala.inline
    def setOpsCenterEnabled(value: OpsCenterEnabled): Self = this.set("OpsCenterEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpsCenterEnabled: Self = this.set("OpsCenterEnabled", js.undefined)
    @scala.inline
    def setOpsItemSNSTopicArn(value: OpsItemSNSTopicArn): Self = this.set("OpsItemSNSTopicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpsItemSNSTopicArn: Self = this.set("OpsItemSNSTopicArn", js.undefined)
    @scala.inline
    def setRemoveSNSTopic(value: RemoveSNSTopic): Self = this.set("RemoveSNSTopic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveSNSTopic: Self = this.set("RemoveSNSTopic", js.undefined)
  }
  
}

