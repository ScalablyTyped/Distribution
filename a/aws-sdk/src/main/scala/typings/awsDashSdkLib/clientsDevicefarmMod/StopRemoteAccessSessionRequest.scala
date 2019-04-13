package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopRemoteAccessSessionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the remote access session you wish to stop.
    */
  var arn: AmazonResourceName
}

object StopRemoteAccessSessionRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): StopRemoteAccessSessionRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[StopRemoteAccessSessionRequest]
  }
}

