package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageResult extends js.Object {
  /**
    * The delivery status of the message. Possible values are:  DUPLICATE - The endpoint address is a duplicate of another endpoint address. Amazon Pinpoint won't attempt to send the message again.   OPT_OUT - The user who's associated with the endpoint address has opted out of receiving messages from you. Amazon Pinpoint won't attempt to send the message again. PERMANENT_FAILURE - An error occurred when delivering the message to the endpoint address. Amazon Pinpoint won't attempt to send the message again.   SUCCESSFUL - The message was successfully delivered to the endpoint address. TEMPORARY_FAILURE - A temporary error occurred. Amazon Pinpoint will attempt to deliver the message again later. THROTTLED - Amazon Pinpoint throttled the operation to send the message to the endpoint address. TIMEOUT - The message couldn't be sent within the timeout period. UNKNOWN_FAILURE - An unknown error occurred.
    */
  var DeliveryStatus: awsDashSdkLib.clientsPinpointMod.DeliveryStatus
  /**
    * The unique identifier for the message that was sent.
    */
  var MessageId: js.UndefOr[__string] = js.undefined
  /**
    * The downstream service status code for delivering the message.
    */
  var StatusCode: __integer
  /**
    * The status message for delivering the message.
    */
  var StatusMessage: js.UndefOr[__string] = js.undefined
  /**
    * For push notifications that are sent through the GCM channel, specifies whether the token was updated as part of delivering the message.
    */
  var UpdatedToken: js.UndefOr[__string] = js.undefined
}

object MessageResult {
  @scala.inline
  def apply(
    DeliveryStatus: DeliveryStatus,
    StatusCode: __integer,
    MessageId: __string = null,
    StatusMessage: __string = null,
    UpdatedToken: __string = null
  ): MessageResult = {
    val __obj = js.Dynamic.literal(DeliveryStatus = DeliveryStatus.asInstanceOf[js.Any], StatusCode = StatusCode)
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId)
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (UpdatedToken != null) __obj.updateDynamic("UpdatedToken")(UpdatedToken)
    __obj.asInstanceOf[MessageResult]
  }
}

