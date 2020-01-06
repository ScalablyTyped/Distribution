package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeviceInstanceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the device instance.
    */
  var arn: AmazonResourceName = js.native
  /**
    * An array of strings that you want to associate with the device instance.
    */
  var labels: js.UndefOr[InstanceLabels] = js.native
  /**
    * The ARN of the profile that you want to associate with the device instance.
    */
  var profileArn: js.UndefOr[AmazonResourceName] = js.native
}

object UpdateDeviceInstanceRequest {
  @scala.inline
  def apply(arn: AmazonResourceName, labels: InstanceLabels = null, profileArn: AmazonResourceName = null): UpdateDeviceInstanceRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (profileArn != null) __obj.updateDynamic("profileArn")(profileArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceInstanceRequest]
  }
}

