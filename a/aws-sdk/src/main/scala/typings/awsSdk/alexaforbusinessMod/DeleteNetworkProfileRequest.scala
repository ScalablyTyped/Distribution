package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNetworkProfileRequest extends js.Object {
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: Arn = js.native
}

object DeleteNetworkProfileRequest {
  @scala.inline
  def apply(NetworkProfileArn: Arn): DeleteNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(NetworkProfileArn = NetworkProfileArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteNetworkProfileRequest]
  }
}

