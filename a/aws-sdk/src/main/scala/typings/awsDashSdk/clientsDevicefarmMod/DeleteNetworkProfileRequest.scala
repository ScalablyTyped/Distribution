package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNetworkProfileRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the network profile you want to delete.
    */
  var arn: AmazonResourceName
}

object DeleteNetworkProfileRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[DeleteNetworkProfileRequest]
  }
}

