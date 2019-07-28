package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApplicationMessage extends js.Object {
  /**
    * The name of the application to delete.
    */
  var ApplicationName: typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName
  /**
    * When set to true, running environments will be terminated before deleting the application.
    */
  var TerminateEnvByForce: js.UndefOr[TerminateEnvForce] = js.undefined
}

object DeleteApplicationMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    TerminateEnvByForce: js.UndefOr[TerminateEnvForce] = js.undefined
  ): DeleteApplicationMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName)
    if (!js.isUndefined(TerminateEnvByForce)) __obj.updateDynamic("TerminateEnvByForce")(TerminateEnvByForce)
    __obj.asInstanceOf[DeleteApplicationMessage]
  }
}

