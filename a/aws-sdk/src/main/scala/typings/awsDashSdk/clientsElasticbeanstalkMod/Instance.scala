package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  /**
    * The ID of the Amazon EC2 instance.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
}

object Instance {
  @scala.inline
  def apply(Id: ResourceId = null): Instance = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[Instance]
  }
}

