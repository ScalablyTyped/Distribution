package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFleetResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the fleet was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.undefined
  /**
    * The name of the fleet.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The list of all tags added to the fleet.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}

object CreateFleetResponse {
  @scala.inline
  def apply(arn: Arn = null, createdAt: CreatedAt = null, name: Name = null, tags: TagMap = null): CreateFleetResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateFleetResponse]
  }
}

