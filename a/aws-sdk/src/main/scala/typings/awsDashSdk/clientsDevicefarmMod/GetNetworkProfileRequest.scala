package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkProfileRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the network profile you want to return information about.
    */
  var arn: AmazonResourceName
}

object GetNetworkProfileRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[GetNetworkProfileRequest]
  }
}

