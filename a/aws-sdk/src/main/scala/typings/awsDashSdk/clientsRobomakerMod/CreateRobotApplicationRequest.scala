package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRobotApplicationRequest extends js.Object {
  /**
    * The name of the robot application.
    */
  var name: Name
  /**
    * The robot software suite used by the robot application.
    */
  var robotSoftwareSuite: RobotSoftwareSuite
  /**
    * The sources of the robot application.
    */
  var sources: SourceConfigs
  /**
    * A map that contains tag keys and tag values that are attached to the robot application.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}

object CreateRobotApplicationRequest {
  @scala.inline
  def apply(name: Name, robotSoftwareSuite: RobotSoftwareSuite, sources: SourceConfigs, tags: TagMap = null): CreateRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(name = name, robotSoftwareSuite = robotSoftwareSuite, sources = sources)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateRobotApplicationRequest]
  }
}

