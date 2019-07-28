package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchConfiguration extends js.Object {
  /**
    * The name of the launch configuration.
    */
  var Name: js.UndefOr[ResourceId] = js.undefined
}

object LaunchConfiguration {
  @scala.inline
  def apply(Name: ResourceId = null): LaunchConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[LaunchConfiguration]
  }
}

