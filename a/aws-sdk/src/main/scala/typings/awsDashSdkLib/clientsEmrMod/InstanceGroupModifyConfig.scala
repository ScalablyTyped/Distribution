package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupModifyConfig extends js.Object {
  /**
    * A list of new or modified configurations to apply for an instance group.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.undefined
  /**
    * The EC2 InstanceIds to terminate. After you terminate the instances, the instance group will not return to its original requested size.
    */
  var EC2InstanceIdsToTerminate: js.UndefOr[EC2InstanceIdsToTerminateList] = js.undefined
  /**
    * Target size for the instance group.
    */
  var InstanceCount: js.UndefOr[Integer] = js.undefined
  /**
    * Unique ID of the instance group to expand or shrink.
    */
  var InstanceGroupId: XmlStringMaxLen256
  /**
    * Policy for customizing shrink operations.
    */
  var ShrinkPolicy: js.UndefOr[ShrinkPolicy] = js.undefined
}

object InstanceGroupModifyConfig {
  @scala.inline
  def apply(
    InstanceGroupId: XmlStringMaxLen256,
    Configurations: ConfigurationList = null,
    EC2InstanceIdsToTerminate: EC2InstanceIdsToTerminateList = null,
    InstanceCount: js.UndefOr[Integer] = js.undefined,
    ShrinkPolicy: ShrinkPolicy = null
  ): InstanceGroupModifyConfig = {
    val __obj = js.Dynamic.literal(InstanceGroupId = InstanceGroupId)
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations)
    if (EC2InstanceIdsToTerminate != null) __obj.updateDynamic("EC2InstanceIdsToTerminate")(EC2InstanceIdsToTerminate)
    if (!js.isUndefined(InstanceCount)) __obj.updateDynamic("InstanceCount")(InstanceCount)
    if (ShrinkPolicy != null) __obj.updateDynamic("ShrinkPolicy")(ShrinkPolicy)
    __obj.asInstanceOf[InstanceGroupModifyConfig]
  }
}

