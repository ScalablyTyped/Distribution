package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplate extends js.Object {
  /**
    * The ID of the launch template.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
}

object LaunchTemplate {
  @scala.inline
  def apply(Id: ResourceId = null): LaunchTemplate = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[LaunchTemplate]
  }
}

