package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInstanceRequest extends js.Object {
  /**
    * Whether to delete the instance Elastic IP address.
    */
  var DeleteElasticIp: js.UndefOr[Boolean] = js.native
  /**
    * Whether to delete the instance's Amazon EBS volumes.
    */
  var DeleteVolumes: js.UndefOr[Boolean] = js.native
  /**
    * The instance ID.
    */
  var InstanceId: String = js.native
}

object DeleteInstanceRequest {
  @scala.inline
  def apply(
    InstanceId: String,
    DeleteElasticIp: js.UndefOr[scala.Boolean] = js.undefined,
    DeleteVolumes: js.UndefOr[scala.Boolean] = js.undefined
  ): DeleteInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(DeleteElasticIp)) __obj.updateDynamic("DeleteElasticIp")(DeleteElasticIp.asInstanceOf[js.Any])
    if (!js.isUndefined(DeleteVolumes)) __obj.updateDynamic("DeleteVolumes")(DeleteVolumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstanceRequest]
  }
}

