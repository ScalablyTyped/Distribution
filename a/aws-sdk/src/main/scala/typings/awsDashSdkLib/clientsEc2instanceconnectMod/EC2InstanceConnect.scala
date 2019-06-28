package typings
package awsDashSdkLib.clientsEc2instanceconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2InstanceConnect
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_EC2InstanceConnect: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Pushes an SSH public key to a particular OS user on a given EC2 instance for 60 seconds.
    */
  def sendSSHPublicKey(): awsDashSdkLib.libRequestMod.Request[SendSSHPublicKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def sendSSHPublicKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SendSSHPublicKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SendSSHPublicKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Pushes an SSH public key to a particular OS user on a given EC2 instance for 60 seconds.
    */
  def sendSSHPublicKey(params: SendSSHPublicKeyRequest): awsDashSdkLib.libRequestMod.Request[SendSSHPublicKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def sendSSHPublicKey(
    params: SendSSHPublicKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SendSSHPublicKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SendSSHPublicKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

