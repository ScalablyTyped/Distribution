package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationInfo extends js.Object {
  /**
    * The lifecycle of the application. 
    */
  var LifeCycle: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.LifeCycle] = js.undefined
  /**
    *  Indicates whether Application Insights will create opsItems for any problem detected by Application Insights for an application. 
    */
  var OpsCenterEnabled: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.OpsCenterEnabled] = js.undefined
  /**
    *  The SNS topic provided to Application Insights that is associated to the created opsItems to receive SNS notifications for opsItem updates. 
    */
  var OpsItemSNSTopicArn: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.OpsItemSNSTopicArn] = js.undefined
  /**
    * The issues on the user side that block Application Insights from successfully monitoring an application.
    */
  var Remarks: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.Remarks] = js.undefined
  /**
    * The name of the resource group used for the application.
    */
  var ResourceGroupName: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ResourceGroupName] = js.undefined
}

object ApplicationInfo {
  @scala.inline
  def apply(
    LifeCycle: LifeCycle = null,
    OpsCenterEnabled: js.UndefOr[Boolean] = js.undefined,
    OpsItemSNSTopicArn: OpsItemSNSTopicArn = null,
    Remarks: Remarks = null,
    ResourceGroupName: ResourceGroupName = null
  ): ApplicationInfo = {
    val __obj = js.Dynamic.literal()
    if (LifeCycle != null) __obj.updateDynamic("LifeCycle")(LifeCycle)
    if (!js.isUndefined(OpsCenterEnabled)) __obj.updateDynamic("OpsCenterEnabled")(OpsCenterEnabled)
    if (OpsItemSNSTopicArn != null) __obj.updateDynamic("OpsItemSNSTopicArn")(OpsItemSNSTopicArn)
    if (Remarks != null) __obj.updateDynamic("Remarks")(Remarks)
    if (ResourceGroupName != null) __obj.updateDynamic("ResourceGroupName")(ResourceGroupName)
    __obj.asInstanceOf[ApplicationInfo]
  }
}

