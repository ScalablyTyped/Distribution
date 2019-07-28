package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRemoteAccessSessionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the remote access session about which you want to get session information.
    */
  var arn: AmazonResourceName
}

object GetRemoteAccessSessionRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetRemoteAccessSessionRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[GetRemoteAccessSessionRequest]
  }
}

