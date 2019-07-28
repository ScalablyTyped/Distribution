package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSimulationApplicationRequest extends js.Object {
  /**
    * The application information for the simulation application to delete.
    */
  var application: Arn
  /**
    * The version of the simulation application to delete.
    */
  var applicationVersion: js.UndefOr[Version] = js.undefined
}

object DeleteSimulationApplicationRequest {
  @scala.inline
  def apply(application: Arn, applicationVersion: Version = null): DeleteSimulationApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application)
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion)
    __obj.asInstanceOf[DeleteSimulationApplicationRequest]
  }
}

