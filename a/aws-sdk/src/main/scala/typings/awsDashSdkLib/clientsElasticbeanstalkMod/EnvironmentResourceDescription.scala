package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentResourceDescription extends js.Object {
  /**
    *  The AutoScalingGroups used by this environment. 
    */
  var AutoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.undefined
  /**
    * The name of the environment.
    */
  var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
  /**
    * The Amazon EC2 instances used by this environment.
    */
  var Instances: js.UndefOr[InstanceList] = js.undefined
  /**
    * The Auto Scaling launch configurations in use by this environment.
    */
  var LaunchConfigurations: js.UndefOr[LaunchConfigurationList] = js.undefined
  /**
    * The Amazon EC2 launch templates in use by this environment.
    */
  var LaunchTemplates: js.UndefOr[LaunchTemplateList] = js.undefined
  /**
    * The LoadBalancers in use by this environment.
    */
  var LoadBalancers: js.UndefOr[LoadBalancerList] = js.undefined
  /**
    * The queues used by this environment.
    */
  var Queues: js.UndefOr[QueueList] = js.undefined
  /**
    * The AutoScaling triggers in use by this environment. 
    */
  var Triggers: js.UndefOr[TriggerList] = js.undefined
}

object EnvironmentResourceDescription {
  @scala.inline
  def apply(
    AutoScalingGroups: AutoScalingGroupList = null,
    EnvironmentName: EnvironmentName = null,
    Instances: InstanceList = null,
    LaunchConfigurations: LaunchConfigurationList = null,
    LaunchTemplates: LaunchTemplateList = null,
    LoadBalancers: LoadBalancerList = null,
    Queues: QueueList = null,
    Triggers: TriggerList = null
  ): EnvironmentResourceDescription = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingGroups != null) __obj.updateDynamic("AutoScalingGroups")(AutoScalingGroups)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    if (Instances != null) __obj.updateDynamic("Instances")(Instances)
    if (LaunchConfigurations != null) __obj.updateDynamic("LaunchConfigurations")(LaunchConfigurations)
    if (LaunchTemplates != null) __obj.updateDynamic("LaunchTemplates")(LaunchTemplates)
    if (LoadBalancers != null) __obj.updateDynamic("LoadBalancers")(LoadBalancers)
    if (Queues != null) __obj.updateDynamic("Queues")(Queues)
    if (Triggers != null) __obj.updateDynamic("Triggers")(Triggers)
    __obj.asInstanceOf[EnvironmentResourceDescription]
  }
}

