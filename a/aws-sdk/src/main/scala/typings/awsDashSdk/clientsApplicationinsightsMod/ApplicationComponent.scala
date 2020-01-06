package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationComponent extends js.Object {
  /**
    * The name of the component.
    */
  var ComponentName: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ComponentName] = js.native
  /**
    * Indicates whether the application component is monitored. 
    */
  var Monitor: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.Monitor] = js.native
  /**
    * The resource type. Supported resource types include EC2 instances, Auto Scaling group, Classic ELB, Application ELB, and SQS Queue.
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ResourceType] = js.native
  /**
    * The stack tier of the application component.
    */
  var Tier: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.Tier] = js.native
}

object ApplicationComponent {
  @scala.inline
  def apply(
    ComponentName: ComponentName = null,
    Monitor: js.UndefOr[Boolean] = js.undefined,
    ResourceType: ResourceType = null,
    Tier: Tier = null
  ): ApplicationComponent = {
    val __obj = js.Dynamic.literal()
    if (ComponentName != null) __obj.updateDynamic("ComponentName")(ComponentName.asInstanceOf[js.Any])
    if (!js.isUndefined(Monitor)) __obj.updateDynamic("Monitor")(Monitor.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationComponent]
  }
}

