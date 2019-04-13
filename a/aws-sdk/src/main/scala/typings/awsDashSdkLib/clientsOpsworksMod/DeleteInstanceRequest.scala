package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteInstanceRequest extends js.Object {
  /**
    * Whether to delete the instance Elastic IP address.
    */
  var DeleteElasticIp: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to delete the instance's Amazon EBS volumes.
    */
  var DeleteVolumes: js.UndefOr[Boolean] = js.undefined
  /**
    * The instance ID.
    */
  var InstanceId: String
}

object DeleteInstanceRequest {
  @scala.inline
  def apply(
    InstanceId: String,
    DeleteElasticIp: js.UndefOr[Boolean] = js.undefined,
    DeleteVolumes: js.UndefOr[Boolean] = js.undefined
  ): DeleteInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
    if (!js.isUndefined(DeleteElasticIp)) __obj.updateDynamic("DeleteElasticIp")(DeleteElasticIp)
    if (!js.isUndefined(DeleteVolumes)) __obj.updateDynamic("DeleteVolumes")(DeleteVolumes)
    __obj.asInstanceOf[DeleteInstanceRequest]
  }
}

