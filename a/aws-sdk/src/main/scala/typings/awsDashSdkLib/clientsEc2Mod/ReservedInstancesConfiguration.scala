package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedInstancesConfiguration extends js.Object {
  /**
    * The Availability Zone for the modified Reserved Instances.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The number of modified Reserved Instances.  This is a required field for a request. 
    */
  var InstanceCount: js.UndefOr[Integer] = js.undefined
  /**
    * The instance type for the modified Reserved Instances.
    */
  var InstanceType: js.UndefOr[InstanceType] = js.undefined
  /**
    * The network platform of the modified Reserved Instances, which is either EC2-Classic or EC2-VPC.
    */
  var Platform: js.UndefOr[String] = js.undefined
  /**
    * Whether the Reserved Instance is applied to instances in a Region or instances in a specific Availability Zone.
    */
  var Scope: js.UndefOr[scope] = js.undefined
}

object ReservedInstancesConfiguration {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    InstanceCount: js.UndefOr[Integer] = js.undefined,
    InstanceType: InstanceType = null,
    Platform: String = null,
    Scope: scope = null
  ): ReservedInstancesConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (!js.isUndefined(InstanceCount)) __obj.updateDynamic("InstanceCount")(InstanceCount)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform)
    if (Scope != null) __obj.updateDynamic("Scope")(Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedInstancesConfiguration]
  }
}

