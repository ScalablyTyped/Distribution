package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationRequest extends js.Object {
  /**
    *  When set to true, creates opsItems for any problems detected on an application. 
    */
  var OpsCenterEnabled: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.OpsCenterEnabled] = js.undefined
  /**
    *  The SNS topic provided to Application Insights that is associated to the created opsItem. Allows you to receive notifications for updates to the opsItem. 
    */
  var OpsItemSNSTopicArn: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.OpsItemSNSTopicArn] = js.undefined
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsDashSdk.clientsApplicationinsightsMod.ResourceGroupName
}

object CreateApplicationRequest {
  @scala.inline
  def apply(
    ResourceGroupName: ResourceGroupName,
    OpsCenterEnabled: js.UndefOr[Boolean] = js.undefined,
    OpsItemSNSTopicArn: OpsItemSNSTopicArn = null
  ): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(ResourceGroupName = ResourceGroupName)
    if (!js.isUndefined(OpsCenterEnabled)) __obj.updateDynamic("OpsCenterEnabled")(OpsCenterEnabled)
    if (OpsItemSNSTopicArn != null) __obj.updateDynamic("OpsItemSNSTopicArn")(OpsItemSNSTopicArn)
    __obj.asInstanceOf[CreateApplicationRequest]
  }
}

