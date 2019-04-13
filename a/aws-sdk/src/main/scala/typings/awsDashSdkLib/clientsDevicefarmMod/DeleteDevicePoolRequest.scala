package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDevicePoolRequest extends js.Object {
  /**
    * Represents the Amazon Resource Name (ARN) of the Device Farm device pool you wish to delete.
    */
  var arn: AmazonResourceName
}

object DeleteDevicePoolRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteDevicePoolRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[DeleteDevicePoolRequest]
  }
}

