package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFleetRequest extends js.Object {
  /**
    * The name of the fleet.
    */
  var name: Name
  /**
    * A map that contains tag keys and tag values that are attached to the fleet.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}

object CreateFleetRequest {
  @scala.inline
  def apply(name: Name, tags: TagMap = null): CreateFleetRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateFleetRequest]
  }
}

