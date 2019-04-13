package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSimulationApplicationRequest extends js.Object {
  /**
    * The application information for the simulation application.
    */
  var application: Arn
  /**
    * The version of the simulation application to describe.
    */
  var applicationVersion: js.UndefOr[Version] = js.undefined
}

object DescribeSimulationApplicationRequest {
  @scala.inline
  def apply(application: Arn, applicationVersion: Version = null): DescribeSimulationApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application)
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion)
    __obj.asInstanceOf[DescribeSimulationApplicationRequest]
  }
}

