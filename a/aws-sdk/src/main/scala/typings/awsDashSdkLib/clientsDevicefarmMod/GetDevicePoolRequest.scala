package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDevicePoolRequest extends js.Object {
  /**
    * The device pool's ARN.
    */
  var arn: AmazonResourceName
}

object GetDevicePoolRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetDevicePoolRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[GetDevicePoolRequest]
  }
}

