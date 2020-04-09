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
  def apply(
    ResourceGroupName: ResourceGroupName,
    CWEMonitorEnabled: js.UndefOr[Boolean] = js.undefined,
    OpsCenterEnabled: js.UndefOr[Boolean] = js.undefined,
    OpsItemSNSTopicArn: OpsItemSNSTopicArn = null,
    RemoveSNSTopic: js.UndefOr[Boolean] = js.undefined
  ): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    if (!js.isUndefined(CWEMonitorEnabled)) __obj.updateDynamic("CWEMonitorEnabled")(CWEMonitorEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(OpsCenterEnabled)) __obj.updateDynamic("OpsCenterEnabled")(OpsCenterEnabled.asInstanceOf[js.Any])
    if (OpsItemSNSTopicArn != null) __obj.updateDynamic("OpsItemSNSTopicArn")(OpsItemSNSTopicArn.asInstanceOf[js.Any])
    if (!js.isUndefined(RemoveSNSTopic)) __obj.updateDynamic("RemoveSNSTopic")(RemoveSNSTopic.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
}

