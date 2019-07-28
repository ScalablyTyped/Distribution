package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeviceInstanceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the instance you're requesting information about.
    */
  var arn: AmazonResourceName
}

object GetDeviceInstanceRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetDeviceInstanceRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[GetDeviceInstanceRequest]
  }
}

