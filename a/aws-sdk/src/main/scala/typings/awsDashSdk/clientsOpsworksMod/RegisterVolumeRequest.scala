package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterVolumeRequest extends js.Object {
  /**
    * The Amazon EBS volume ID.
    */
  var Ec2VolumeId: js.UndefOr[String] = js.undefined
  /**
    * The stack ID.
    */
  var StackId: String
}

object RegisterVolumeRequest {
  @scala.inline
  def apply(StackId: String, Ec2VolumeId: String = null): RegisterVolumeRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId)
    if (Ec2VolumeId != null) __obj.updateDynamic("Ec2VolumeId")(Ec2VolumeId)
    __obj.asInstanceOf[RegisterVolumeRequest]
  }
}

