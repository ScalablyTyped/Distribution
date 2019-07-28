package typings.awsDashSdk.clientsEc2instanceconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendSSHPublicKeyRequest extends js.Object {
  /**
    * The availability zone the EC2 instance was launched in.
    */
  var AvailabilityZone: typings.awsDashSdk.clientsEc2instanceconnectMod.AvailabilityZone
  /**
    * The EC2 instance you wish to publish the SSH key to.
    */
  var InstanceId: typings.awsDashSdk.clientsEc2instanceconnectMod.InstanceId
  /**
    * The OS user on the EC2 instance whom the key may be used to authenticate as.
    */
  var InstanceOSUser: typings.awsDashSdk.clientsEc2instanceconnectMod.InstanceOSUser
  /**
    * The public key to be published to the instance. To use it after publication you must have the matching private key.
    */
  var SSHPublicKey: typings.awsDashSdk.clientsEc2instanceconnectMod.SSHPublicKey
}

object SendSSHPublicKeyRequest {
  @scala.inline
  def apply(
    AvailabilityZone: AvailabilityZone,
    InstanceId: InstanceId,
    InstanceOSUser: InstanceOSUser,
    SSHPublicKey: SSHPublicKey
  ): SendSSHPublicKeyRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone, InstanceId = InstanceId, InstanceOSUser = InstanceOSUser, SSHPublicKey = SSHPublicKey)
  
    __obj.asInstanceOf[SendSSHPublicKeyRequest]
  }
}

