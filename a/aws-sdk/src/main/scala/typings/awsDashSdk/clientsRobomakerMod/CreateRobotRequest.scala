package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRobotRequest extends js.Object {
  /**
    * The target architecture of the robot.
    */
  var architecture: Architecture = js.native
  /**
    * The Greengrass group id.
    */
  var greengrassGroupId: Id = js.native
  /**
    * The name for the robot.
    */
  var name: Name = js.native
  /**
    * A map that contains tag keys and tag values that are attached to the robot.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateRobotRequest {
  @scala.inline
  def apply(architecture: Architecture, greengrassGroupId: Id, name: Name, tags: TagMap = null): CreateRobotRequest = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], greengrassGroupId = greengrassGroupId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRobotRequest]
  }
}

