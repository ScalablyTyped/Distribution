package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMSMessage extends js.Object {
  /**
    * The body of the SMS message.
    */
  var Body: js.UndefOr[__string] = js.undefined
  /**
    * The SMS program name that you provided to AWS Support when you requested your dedicated number.
    */
  var Keyword: js.UndefOr[__string] = js.undefined
  /**
    * The SMS message type. Valid values are: TRANSACTIONAL, the message is critical or time-sensitive, such as a one-time password that supports a customer transaction; and, PROMOTIONAL, the message is not critical or time-sensitive, such as a marketing message.
    */
  var MessageType: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.MessageType] = js.undefined
  /**
    * The number that the SMS message originates from. This should be one of the dedicated long codes or short codes that you requested from AWS Support and is assigned to your AWS account. If you don't specify a long or short code, Amazon Pinpoint assigns a random long code to the SMS message.
    */
  var OriginationNumber: js.UndefOr[__string] = js.undefined
  /**
    * The sender ID to display as the sender of the message on a recipient's device. Support for sender IDs varies by country or region.
    */
  var SenderId: js.UndefOr[__string] = js.undefined
  /**
    * The message variables to use in the SMS message. You can override the default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
}

object SMSMessage {
  @scala.inline
  def apply(
    Body: __string = null,
    Keyword: __string = null,
    MessageType: MessageType = null,
    OriginationNumber: __string = null,
    SenderId: __string = null,
    Substitutions: MapOfListOf__string = null
  ): SMSMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (Keyword != null) __obj.updateDynamic("Keyword")(Keyword)
    if (MessageType != null) __obj.updateDynamic("MessageType")(MessageType.asInstanceOf[js.Any])
    if (OriginationNumber != null) __obj.updateDynamic("OriginationNumber")(OriginationNumber)
    if (SenderId != null) __obj.updateDynamic("SenderId")(SenderId)
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions)
    __obj.asInstanceOf[SMSMessage]
  }
}

