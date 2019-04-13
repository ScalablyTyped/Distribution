package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRobotApplicationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the robot application.
    */
  var application: Arn
  /**
    * The version of the robot application to describe.
    */
  var applicationVersion: js.UndefOr[Version] = js.undefined
}

object DescribeRobotApplicationRequest {
  @scala.inline
  def apply(application: Arn, applicationVersion: Version = null): DescribeRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application)
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion)
    __obj.asInstanceOf[DescribeRobotApplicationRequest]
  }
}

