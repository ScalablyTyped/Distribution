package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRobotApplicationRequest extends js.Object {
  /**
    * The application information for the robot application.
    */
  var application: Arn
  /**
    * The revision id for the robot application.
    */
  var currentRevisionId: js.UndefOr[RevisionId] = js.undefined
  /**
    * The robot software suite used by the robot application.
    */
  var robotSoftwareSuite: RobotSoftwareSuite
  /**
    * The sources of the robot application.
    */
  var sources: SourceConfigs
}

object UpdateRobotApplicationRequest {
  @scala.inline
  def apply(
    application: Arn,
    robotSoftwareSuite: RobotSoftwareSuite,
    sources: SourceConfigs,
    currentRevisionId: RevisionId = null
  ): UpdateRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application, robotSoftwareSuite = robotSoftwareSuite, sources = sources)
    if (currentRevisionId != null) __obj.updateDynamic("currentRevisionId")(currentRevisionId)
    __obj.asInstanceOf[UpdateRobotApplicationRequest]
  }
}

