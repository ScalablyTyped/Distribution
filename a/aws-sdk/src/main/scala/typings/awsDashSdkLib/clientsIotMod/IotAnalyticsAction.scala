package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IotAnalyticsAction extends js.Object {
  /**
    * (deprecated) The ARN of the IoT Analytics channel to which message data will be sent.
    */
  var channelArn: js.UndefOr[AwsArn] = js.undefined
  /**
    * The name of the IoT Analytics channel to which message data will be sent.
    */
  var channelName: js.UndefOr[ChannelName] = js.undefined
  /**
    * The ARN of the role which has a policy that grants IoT Analytics permission to send message data via IoT Analytics (iotanalytics:BatchPutMessage).
    */
  var roleArn: js.UndefOr[AwsArn] = js.undefined
}

object IotAnalyticsAction {
  @scala.inline
  def apply(channelArn: AwsArn = null, channelName: ChannelName = null, roleArn: AwsArn = null): IotAnalyticsAction = {
    val __obj = js.Dynamic.literal()
    if (channelArn != null) __obj.updateDynamic("channelArn")(channelArn)
    if (channelName != null) __obj.updateDynamic("channelName")(channelName)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[IotAnalyticsAction]
  }
}

