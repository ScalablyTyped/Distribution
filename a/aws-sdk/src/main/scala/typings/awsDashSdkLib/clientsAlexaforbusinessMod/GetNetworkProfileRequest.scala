package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkProfileRequest extends js.Object {
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: Arn
}

object GetNetworkProfileRequest {
  @scala.inline
  def apply(NetworkProfileArn: Arn): GetNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(NetworkProfileArn = NetworkProfileArn)
  
    __obj.asInstanceOf[GetNetworkProfileRequest]
  }
}

