package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkProfileRequest extends js.Object {
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: Arn = js.native
}

object GetNetworkProfileRequest {
  @scala.inline
  def apply(NetworkProfileArn: Arn): GetNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(NetworkProfileArn = NetworkProfileArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetNetworkProfileRequest]
  }
}

