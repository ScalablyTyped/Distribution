package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRobotApplicationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the the robot application.
    */
  var application: Arn = js.native
  /**
    * The version of the robot application to delete.
    */
  var applicationVersion: js.UndefOr[Version] = js.native
}

object DeleteRobotApplicationRequest {
  @scala.inline
  def apply(application: Arn, applicationVersion: Version = null): DeleteRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRobotApplicationRequest]
  }
}

