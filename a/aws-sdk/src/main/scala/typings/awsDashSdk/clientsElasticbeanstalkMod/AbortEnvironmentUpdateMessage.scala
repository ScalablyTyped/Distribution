package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortEnvironmentUpdateMessage extends js.Object {
  /**
    * This specifies the ID of the environment with the in-progress update that you want to cancel.
    */
  var EnvironmentId: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentId] = js.undefined
  /**
    * This specifies the name of the environment with the in-progress update that you want to cancel.
    */
  var EnvironmentName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
}

object AbortEnvironmentUpdateMessage {
  @scala.inline
  def apply(EnvironmentId: EnvironmentId = null, EnvironmentName: EnvironmentName = null): AbortEnvironmentUpdateMessage = {
    val __obj = js.Dynamic.literal()
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    __obj.asInstanceOf[AbortEnvironmentUpdateMessage]
  }
}

