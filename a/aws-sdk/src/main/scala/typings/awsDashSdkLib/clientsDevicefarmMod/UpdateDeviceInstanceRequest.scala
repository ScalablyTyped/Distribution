package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDeviceInstanceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the device instance.
    */
  var arn: AmazonResourceName
  /**
    * An array of strings that you want to associate with the device instance.
    */
  var labels: js.UndefOr[InstanceLabels] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the profile that you want to associate with the device instance.
    */
  var profileArn: js.UndefOr[AmazonResourceName] = js.undefined
}

object UpdateDeviceInstanceRequest {
  @scala.inline
  def apply(arn: AmazonResourceName, labels: InstanceLabels = null, profileArn: AmazonResourceName = null): UpdateDeviceInstanceRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (profileArn != null) __obj.updateDynamic("profileArn")(profileArn)
    __obj.asInstanceOf[UpdateDeviceInstanceRequest]
  }
}

