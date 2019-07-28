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
    * The issues on the user side that are blocking Application Insights from fully monitoring the application.
    */
  var Remarks: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.Remarks] = js.undefined
  /**
    * The name of the resource group used for the application.
    */
  var ResourceGroupName: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ResourceGroupName] = js.undefined
}

object ApplicationInfo {
  @scala.inline
  def apply(LifeCycle: LifeCycle = null, Remarks: Remarks = null, ResourceGroupName: ResourceGroupName = null): ApplicationInfo = {
    val __obj = js.Dynamic.literal()
    if (LifeCycle != null) __obj.updateDynamic("LifeCycle")(LifeCycle)
    if (Remarks != null) __obj.updateDynamic("Remarks")(Remarks)
    if (ResourceGroupName != null) __obj.updateDynamic("ResourceGroupName")(ResourceGroupName)
    __obj.asInstanceOf[ApplicationInfo]
  }
}

