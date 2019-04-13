package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageResult extends js.Object {
  /**
    * The delivery status of the message. Possible values:
  SUCCESS - The message was successfully delivered to the endpoint.
  TRANSIENT_FAILURE - A temporary error occurred. Amazon Pinpoint will attempt to deliver the message again later.
  FAILURE_PERMANENT - An error occurred when delivering the message to the endpoint. Amazon Pinpoint won't attempt to send the message again.
  TIMEOUT - The message couldn't be sent within the timeout period.
  QUIET_TIME - The local time for the endpoint was within the QuietTime for the campaign or app.
  DAILY_CAP - The endpoint has received the maximum number of messages it can receive within a 24-hour period.
  HOLDOUT - The endpoint was in a hold out treatment for the campaign.
  THROTTLED - Amazon Pinpoint throttled sending to this endpoint.
  EXPIRED - The endpoint address is expired.
  CAMPAIGN_CAP - The endpoint received the maximum number of messages allowed by the campaign.
  SERVICE_FAILURE - A service-level failure prevented Amazon Pinpoint from delivering the message.
  UNKNOWN - An unknown error occurred.
    */
  var DeliveryStatus: js.UndefOr[DeliveryStatus] = js.undefined
  /**
    * Unique message identifier associated with the message that was sent.
    */
  var MessageId: js.UndefOr[__string] = js.undefined
  /**
    * Downstream service status code.
    */
  var StatusCode: js.UndefOr[__integer] = js.undefined
  /**
    * Status message for message delivery.
    */
  var StatusMessage: js.UndefOr[__string] = js.undefined
  /**
    * If token was updated as part of delivery. (This is GCM Specific)
    */
  var UpdatedToken: js.UndefOr[__string] = js.undefined
}

object MessageResult {
  @scala.inline
  def apply(
    DeliveryStatus: DeliveryStatus = null,
    MessageId: __string = null,
    StatusCode: js.UndefOr[__integer] = js.undefined,
    StatusMessage: __string = null,
    UpdatedToken: __string = null
  ): MessageResult = {
    val __obj = js.Dynamic.literal()
    if (DeliveryStatus != null) __obj.updateDynamic("DeliveryStatus")(DeliveryStatus.asInstanceOf[js.Any])
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId)
    if (!js.isUndefined(StatusCode)) __obj.updateDynamic("StatusCode")(StatusCode)
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (UpdatedToken != null) __obj.updateDynamic("UpdatedToken")(UpdatedToken)
    __obj.asInstanceOf[MessageResult]
  }
}

