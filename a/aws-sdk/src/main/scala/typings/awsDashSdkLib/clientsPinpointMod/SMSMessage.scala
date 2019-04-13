package typings
package awsDashSdkLib.clientsPinpointMod

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
    * Is this a transaction priority message or lower priority.
    */
  var MessageType: js.UndefOr[MessageType] = js.undefined
  /**
    * The phone number that the SMS message originates from. Specify one of the dedicated long codes or short codes that you requested from AWS Support and that is assigned to your account. If this attribute is not specified, Amazon Pinpoint randomly assigns a long code.
    */
  var OriginationNumber: js.UndefOr[__string] = js.undefined
  /**
    * The sender ID that is shown as the message sender on the recipient's device. Support for sender IDs varies by country or region.
    */
  var SenderId: js.UndefOr[__string] = js.undefined
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
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

