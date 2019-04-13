package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeviceRequest extends js.Object {
  /**
    * The device type's ARN.
    */
  var arn: AmazonResourceName
}

object GetDeviceRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetDeviceRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[GetDeviceRequest]
  }
}

