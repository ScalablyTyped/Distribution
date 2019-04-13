package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceInstance extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the device instance.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the device.
    */
  var deviceArn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * A object containing information about the instance profile.
    */
  var instanceProfile: js.UndefOr[InstanceProfile] = js.undefined
  /**
    * An array of strings describing the device instance.
    */
  var labels: js.UndefOr[InstanceLabels] = js.undefined
  /**
    * The status of the device instance. Valid values are listed below.
    */
  var status: js.UndefOr[InstanceStatus] = js.undefined
  /**
    * Unique device identifier for the device instance.
    */
  var udid: js.UndefOr[String] = js.undefined
}

object DeviceInstance {
  @scala.inline
  def apply(
    arn: AmazonResourceName = null,
    deviceArn: AmazonResourceName = null,
    instanceProfile: InstanceProfile = null,
    labels: InstanceLabels = null,
    status: InstanceStatus = null,
    udid: String = null
  ): DeviceInstance = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (deviceArn != null) __obj.updateDynamic("deviceArn")(deviceArn)
    if (instanceProfile != null) __obj.updateDynamic("instanceProfile")(instanceProfile)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (udid != null) __obj.updateDynamic("udid")(udid)
    __obj.asInstanceOf[DeviceInstance]
  }
}

