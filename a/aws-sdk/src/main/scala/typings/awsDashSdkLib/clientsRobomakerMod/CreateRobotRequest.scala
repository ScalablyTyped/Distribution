package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRobotRequest extends js.Object {
  /**
    * The target architecture of the robot.
    */
  var architecture: Architecture
  /**
    * The Greengrass group id.
    */
  var greengrassGroupId: Id
  /**
    * The name for the robot.
    */
  var name: Name
  /**
    * A map that contains tag keys and tag values that are attached to the robot.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}

object CreateRobotRequest {
  @scala.inline
  def apply(architecture: Architecture, greengrassGroupId: Id, name: Name, tags: TagMap = null): CreateRobotRequest = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], greengrassGroupId = greengrassGroupId, name = name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateRobotRequest]
  }
}

