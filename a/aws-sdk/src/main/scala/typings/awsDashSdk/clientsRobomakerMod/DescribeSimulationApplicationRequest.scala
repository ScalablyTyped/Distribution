package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSimulationApplicationRequest extends js.Object {
  /**
    * The application information for the simulation application.
    */
  var application: Arn = js.native
  /**
    * The version of the simulation application to describe.
    */
  var applicationVersion: js.UndefOr[Version] = js.native
}

object DescribeSimulationApplicationRequest {
  @scala.inline
  def apply(application: Arn, applicationVersion: Version = null): DescribeSimulationApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSimulationApplicationRequest]
  }
}

