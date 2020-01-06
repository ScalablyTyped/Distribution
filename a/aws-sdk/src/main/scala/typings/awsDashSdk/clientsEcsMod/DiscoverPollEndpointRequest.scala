package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoverPollEndpointRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster to which the container instance belongs.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * The container instance ID or full ARN of the container instance. The ARN contains the arn:aws:ecs namespace, followed by the Region of the container instance, the AWS account ID of the container instance owner, the container-instance namespace, and then the container instance ID. For example, arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID.
    */
  var containerInstance: js.UndefOr[String] = js.native
}

object DiscoverPollEndpointRequest {
  @scala.inline
  def apply(cluster: String = null, containerInstance: String = null): DiscoverPollEndpointRequest = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (containerInstance != null) __obj.updateDynamic("containerInstance")(containerInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverPollEndpointRequest]
  }
}

