package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * The ID of the Amazon EC2 instance.
    */
  var Id: js.UndefOr[ResourceId] = js.native
}

object Instance {
  @scala.inline
  def apply(Id: ResourceId = null): Instance = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

