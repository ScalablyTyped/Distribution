package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateContainerAgentResponse extends js.Object {
  /**
    * The container instance for which the container agent was updated.
    */
  var containerInstance: js.UndefOr[ContainerInstance] = js.undefined
}

object UpdateContainerAgentResponse {
  @scala.inline
  def apply(containerInstance: ContainerInstance = null): UpdateContainerAgentResponse = {
    val __obj = js.Dynamic.literal()
    if (containerInstance != null) __obj.updateDynamic("containerInstance")(containerInstance)
    __obj.asInstanceOf[UpdateContainerAgentResponse]
  }
}

