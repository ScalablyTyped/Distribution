package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateContainerAgentRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that your container instance is running on. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  /**
    * The container instance ID or full ARN entries for the container instance on which you would like to update the Amazon ECS container agent.
    */
  var containerInstance: String
}

object UpdateContainerAgentRequest {
  @scala.inline
  def apply(containerInstance: String, cluster: String = null): UpdateContainerAgentRequest = {
    val __obj = js.Dynamic.literal(containerInstance = containerInstance)
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    __obj.asInstanceOf[UpdateContainerAgentRequest]
  }
}

