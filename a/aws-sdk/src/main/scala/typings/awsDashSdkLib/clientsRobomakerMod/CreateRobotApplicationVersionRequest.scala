package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRobotApplicationVersionRequest extends js.Object {
  /**
    * The application information for the robot application.
    */
  var application: Arn
  /**
    * The current revision id for the robot application. If you provide a value and it matches the latest revision ID, a new version will be created.
    */
  var currentRevisionId: js.UndefOr[RevisionId] = js.undefined
}

object CreateRobotApplicationVersionRequest {
  @scala.inline
  def apply(application: Arn, currentRevisionId: RevisionId = null): CreateRobotApplicationVersionRequest = {
    val __obj = js.Dynamic.literal(application = application)
    if (currentRevisionId != null) __obj.updateDynamic("currentRevisionId")(currentRevisionId)
    __obj.asInstanceOf[CreateRobotApplicationVersionRequest]
  }
}

