package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplate extends js.Object {
  /**
    * The ID of the launch template.
    */
  var Id: js.UndefOr[ResourceId] = js.native
}

object LaunchTemplate {
  @scala.inline
  def apply(Id: ResourceId = null): LaunchTemplate = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplate]
  }
}

