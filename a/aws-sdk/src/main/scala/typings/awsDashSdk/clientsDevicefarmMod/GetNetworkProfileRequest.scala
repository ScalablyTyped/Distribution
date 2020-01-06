package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkProfileRequest extends js.Object {
  /**
    * The ARN of the network profile to return information about.
    */
  var arn: AmazonResourceName = js.native
}

object GetNetworkProfileRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetNetworkProfileRequest]
  }
}

