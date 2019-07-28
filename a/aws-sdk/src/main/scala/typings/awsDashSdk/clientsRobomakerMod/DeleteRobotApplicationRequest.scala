package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRobotApplicationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the the robot application.
    */
  var application: Arn
  /**
    * The version of the robot application to delete.
    */
  var applicationVersion: js.UndefOr[Version] = js.undefined
}

object DeleteRobotApplicationRequest {
  @scala.inline
  def apply(application: Arn, applicationVersion: Version = null): DeleteRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application)
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion)
    __obj.asInstanceOf[DeleteRobotApplicationRequest]
  }
}

