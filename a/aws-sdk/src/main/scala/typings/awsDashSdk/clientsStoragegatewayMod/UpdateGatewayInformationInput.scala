package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGatewayInformationInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that you want to use to monitor and log events in the gateway.  For more information, see What Is Amazon CloudWatch Logs?.
    */
  var CloudWatchLogGroupARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.CloudWatchLogGroupARN] = js.native
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN = js.native
  var GatewayName: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayName] = js.native
  /**
    * A value that indicates the time zone of the gateway.
    */
  var GatewayTimezone: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayTimezone] = js.native
}

object UpdateGatewayInformationInput {
  @scala.inline
  def apply(
    GatewayARN: GatewayARN,
    CloudWatchLogGroupARN: CloudWatchLogGroupARN = null,
    GatewayName: GatewayName = null,
    GatewayTimezone: GatewayTimezone = null
  ): UpdateGatewayInformationInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    if (CloudWatchLogGroupARN != null) __obj.updateDynamic("CloudWatchLogGroupARN")(CloudWatchLogGroupARN.asInstanceOf[js.Any])
    if (GatewayName != null) __obj.updateDynamic("GatewayName")(GatewayName.asInstanceOf[js.Any])
    if (GatewayTimezone != null) __obj.updateDynamic("GatewayTimezone")(GatewayTimezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayInformationInput]
  }
}

