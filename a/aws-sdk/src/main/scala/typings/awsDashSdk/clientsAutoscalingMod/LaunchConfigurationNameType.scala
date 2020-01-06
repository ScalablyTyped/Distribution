package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchConfigurationNameType extends js.Object {
  /**
    * The name of the launch configuration.
    */
  var LaunchConfigurationName: ResourceName = js.native
}

object LaunchConfigurationNameType {
  @scala.inline
  def apply(LaunchConfigurationName: ResourceName): LaunchConfigurationNameType = {
    val __obj = js.Dynamic.literal(LaunchConfigurationName = LaunchConfigurationName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LaunchConfigurationNameType]
  }
}

