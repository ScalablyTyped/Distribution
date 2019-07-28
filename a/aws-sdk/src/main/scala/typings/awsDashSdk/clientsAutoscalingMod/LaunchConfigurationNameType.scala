package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchConfigurationNameType extends js.Object {
  /**
    * The name of the launch configuration.
    */
  var LaunchConfigurationName: ResourceName
}

object LaunchConfigurationNameType {
  @scala.inline
  def apply(LaunchConfigurationName: ResourceName): LaunchConfigurationNameType = {
    val __obj = js.Dynamic.literal(LaunchConfigurationName = LaunchConfigurationName)
  
    __obj.asInstanceOf[LaunchConfigurationNameType]
  }
}

