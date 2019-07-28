package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRemoteAccessSessionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the session for which you want to delete remote access.
    */
  var arn: AmazonResourceName
}

object DeleteRemoteAccessSessionRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteRemoteAccessSessionRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[DeleteRemoteAccessSessionRequest]
  }
}

