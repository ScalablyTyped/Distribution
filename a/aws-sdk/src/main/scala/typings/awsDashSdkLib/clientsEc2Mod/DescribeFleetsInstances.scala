package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFleetsInstances extends js.Object {
  /**
    * The IDs of the instances.
    */
  var InstanceIds: js.UndefOr[InstanceIdsSet] = js.undefined
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[InstanceType] = js.undefined
  /**
    * The launch templates and overrides that were used for launching the instances. Any parameters that you specify in the Overrides override the same parameters in the launch template.
    */
  var LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse] = js.undefined
  /**
    * Indicates if the instance that was launched is a Spot Instance or On-Demand Instance.
    */
  var Lifecycle: js.UndefOr[InstanceLifecycle] = js.undefined
  /**
    * The value is Windows for Windows instances; otherwise blank.
    */
  var Platform: js.UndefOr[PlatformValues] = js.undefined
}

object DescribeFleetsInstances {
  @scala.inline
  def apply(
    InstanceIds: InstanceIdsSet = null,
    InstanceType: InstanceType = null,
    LaunchTemplateAndOverrides: LaunchTemplateAndOverridesResponse = null,
    Lifecycle: InstanceLifecycle = null,
    Platform: PlatformValues = null
  ): DescribeFleetsInstances = {
    val __obj = js.Dynamic.literal()
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (LaunchTemplateAndOverrides != null) __obj.updateDynamic("LaunchTemplateAndOverrides")(LaunchTemplateAndOverrides)
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetsInstances]
  }
}

